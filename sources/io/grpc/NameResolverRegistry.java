package io.grpc;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import io.grpc.NameResolver;
import io.grpc.ServiceProviders;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes12.dex */
public final class NameResolverRegistry {
    private static final String UNKNOWN_SCHEME = "unknown";
    private static NameResolverRegistry instance;
    private static final Logger logger = Logger.getLogger(NameResolverRegistry.class.getName());
    private final NameResolver.Factory factory = new NameResolverFactory();
    private String defaultScheme = "unknown";
    private final LinkedHashSet<NameResolverProvider> allProviders = new LinkedHashSet<>();
    private ImmutableMap<String, NameResolverProvider> effectiveProviders = ImmutableMap.of();

    public synchronized String getDefaultScheme() {
        return this.defaultScheme;
    }

    public NameResolverProvider getProviderForScheme(String scheme) {
        if (scheme == null) {
            return null;
        }
        return providers().get(scheme.toLowerCase(Locale.US));
    }

    public synchronized void register(NameResolverProvider provider) {
        addProvider(provider);
        refreshProviders();
    }

    private synchronized void addProvider(NameResolverProvider provider) {
        Preconditions.checkArgument(provider.isAvailable(), "isAvailable() returned false");
        this.allProviders.add(provider);
    }

    public synchronized void deregister(NameResolverProvider provider) {
        this.allProviders.remove(provider);
        refreshProviders();
    }

    private synchronized void refreshProviders() {
        Map<String, NameResolverProvider> refreshedProviders = new HashMap<>();
        int maxPriority = Integer.MIN_VALUE;
        String refreshedDefaultScheme = "unknown";
        Iterator<NameResolverProvider> it = this.allProviders.iterator();
        while (it.hasNext()) {
            NameResolverProvider provider = it.next();
            String scheme = provider.getScheme();
            NameResolverProvider existing = refreshedProviders.get(scheme);
            if (existing == null || existing.priority() < provider.priority()) {
                refreshedProviders.put(scheme, provider);
            }
            if (maxPriority < provider.priority()) {
                maxPriority = provider.priority();
                refreshedDefaultScheme = provider.getScheme();
            }
        }
        this.effectiveProviders = ImmutableMap.copyOf((Map) refreshedProviders);
        this.defaultScheme = refreshedDefaultScheme;
    }

    public static synchronized NameResolverRegistry getDefaultRegistry() {
        NameResolverRegistry nameResolverRegistry;
        synchronized (NameResolverRegistry.class) {
            if (instance == null) {
                List<NameResolverProvider> providerList = ServiceProviders.loadAll(NameResolverProvider.class, getHardCodedClasses(), NameResolverProvider.class.getClassLoader(), new NameResolverPriorityAccessor());
                if (providerList.isEmpty()) {
                    logger.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                instance = new NameResolverRegistry();
                for (NameResolverProvider provider : providerList) {
                    logger.fine("Service loader found " + provider);
                    instance.addProvider(provider);
                }
                instance.refreshProviders();
            }
            nameResolverRegistry = instance;
        }
        return nameResolverRegistry;
    }

    synchronized Map<String, NameResolverProvider> providers() {
        return this.effectiveProviders;
    }

    public NameResolver.Factory asFactory() {
        return this.factory;
    }

    static List<Class<?>> getHardCodedClasses() {
        ArrayList<Class<?>> list = new ArrayList<>();
        try {
            list.add(Class.forName("io.grpc.internal.DnsNameResolverProvider"));
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
        }
        return Collections.unmodifiableList(list);
    }

    /* loaded from: classes12.dex */
    private final class NameResolverFactory extends NameResolver.Factory {
        private NameResolverFactory() {
        }

        @Override // io.grpc.NameResolver.Factory
        @Nullable
        public NameResolver newNameResolver(URI targetUri, NameResolver.Args args) {
            NameResolverProvider provider = NameResolverRegistry.this.getProviderForScheme(targetUri.getScheme());
            if (provider == null) {
                return null;
            }
            return provider.newNameResolver(targetUri, args);
        }

        @Override // io.grpc.NameResolver.Factory
        public String getDefaultScheme() {
            return NameResolverRegistry.this.getDefaultScheme();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes12.dex */
    public static final class NameResolverPriorityAccessor implements ServiceProviders.PriorityAccessor<NameResolverProvider> {
        private NameResolverPriorityAccessor() {
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public boolean isAvailable(NameResolverProvider provider) {
            return provider.isAvailable();
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        public int getPriority(NameResolverProvider provider) {
            return provider.priority();
        }
    }
}
