package io.grpc.android;

import android.net.LocalSocketAddress;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import javax.net.SocketFactory;

/* loaded from: classes12.dex */
class UdsSocketFactory extends SocketFactory {
    private final LocalSocketAddress localSocketAddress;

    public UdsSocketFactory(String path, LocalSocketAddress.Namespace namespace) {
        this.localSocketAddress = new LocalSocketAddress(path, namespace);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return create();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int port) throws IOException {
        return createAndConnect();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException {
        return createAndConnect();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int port) throws IOException {
        return createAndConnect();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
        return createAndConnect();
    }

    private Socket create() {
        return new UdsSocket(this.localSocketAddress);
    }

    private Socket createAndConnect() throws IOException {
        Socket socket = create();
        SocketAddress unusedAddress = new InetSocketAddress(0);
        socket.connect(unusedAddress);
        return socket;
    }
}
