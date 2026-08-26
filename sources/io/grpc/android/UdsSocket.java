package io.grpc.android;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;

/* loaded from: classes12.dex */
class UdsSocket extends Socket {
    private final LocalSocketAddress localSocketAddress;
    private boolean closed = false;
    private boolean inputShutdown = false;
    private boolean outputShutdown = false;
    private final LocalSocket localSocket = new LocalSocket();

    public UdsSocket(LocalSocketAddress localSocketAddress) {
        this.localSocketAddress = localSocketAddress;
    }

    @Override // java.net.Socket
    public void bind(SocketAddress bindpoint) {
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.closed) {
            return;
        }
        if (!this.inputShutdown) {
            shutdownInput();
        }
        if (!this.outputShutdown) {
            shutdownOutput();
        }
        this.localSocket.close();
        this.closed = true;
    }

    @Override // java.net.Socket
    public void connect(SocketAddress endpoint) throws IOException {
        this.localSocket.connect(this.localSocketAddress);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress endpoint, int timeout) throws IOException {
        this.localSocket.connect(this.localSocketAddress, timeout);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        throw new UnsupportedOperationException("getChannel() not supported");
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        throw new UnsupportedOperationException("getInetAddress() not supported");
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        return new FilterInputStream(this.localSocket.getInputStream()) { // from class: io.grpc.android.UdsSocket.1
            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                UdsSocket.this.close();
            }
        };
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() {
        throw new UnsupportedOperationException("Unsupported operation getKeepAlive()");
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        throw new UnsupportedOperationException("Unsupported operation getLocalAddress()");
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        throw new UnsupportedOperationException("Unsupported operation getLocalPort()");
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return new SocketAddress() { // from class: io.grpc.android.UdsSocket.2
        };
    }

    @Override // java.net.Socket
    public boolean getOOBInline() {
        throw new UnsupportedOperationException("Unsupported operation getOOBInline()");
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        return new FilterOutputStream(this.localSocket.getOutputStream()) { // from class: io.grpc.android.UdsSocket.3
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                UdsSocket.this.close();
            }
        };
    }

    @Override // java.net.Socket
    public int getPort() {
        throw new UnsupportedOperationException("Unsupported operation getPort()");
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() throws SocketException {
        try {
            return this.localSocket.getReceiveBufferSize();
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return new SocketAddress() { // from class: io.grpc.android.UdsSocket.4
        };
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() {
        throw new UnsupportedOperationException("Unsupported operation getReuseAddress()");
    }

    @Override // java.net.Socket
    public int getSendBufferSize() throws SocketException {
        try {
            return this.localSocket.getSendBufferSize();
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public int getSoLinger() {
        return -1;
    }

    @Override // java.net.Socket
    public int getSoTimeout() throws SocketException {
        try {
            return this.localSocket.getSoTimeout();
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() {
        return true;
    }

    @Override // java.net.Socket
    public int getTrafficClass() {
        throw new UnsupportedOperationException("Unsupported operation getTrafficClass()");
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.localSocket.isBound();
    }

    @Override // java.net.Socket
    public synchronized boolean isClosed() {
        return this.closed;
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.localSocket.isConnected();
    }

    @Override // java.net.Socket
    public synchronized boolean isInputShutdown() {
        return this.inputShutdown;
    }

    @Override // java.net.Socket
    public synchronized boolean isOutputShutdown() {
        return this.outputShutdown;
    }

    @Override // java.net.Socket
    public void sendUrgentData(int data) {
        throw new UnsupportedOperationException("Unsupported operation sendUrgentData()");
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean on) {
        throw new UnsupportedOperationException("Unsupported operation setKeepAlive()");
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean on) {
        throw new UnsupportedOperationException("Unsupported operation setOOBInline()");
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int connectionTime, int latency, int bandwidth) {
        throw new UnsupportedOperationException("Unsupported operation setPerformancePreferences()");
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int size) throws SocketException {
        try {
            this.localSocket.setReceiveBufferSize(size);
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean on) {
        throw new UnsupportedOperationException("Unsupported operation setReuseAddress()");
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int size) throws SocketException {
        try {
            this.localSocket.setSendBufferSize(size);
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean on, int linger) {
        throw new UnsupportedOperationException("Unsupported operation setSoLinger()");
    }

    @Override // java.net.Socket
    public void setSoTimeout(int timeout) throws SocketException {
        try {
            this.localSocket.setSoTimeout(timeout);
        } catch (IOException e) {
            throw toSocketException(e);
        }
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean on) {
    }

    @Override // java.net.Socket
    public void setTrafficClass(int tc) {
        throw new UnsupportedOperationException("Unsupported operation setTrafficClass()");
    }

    @Override // java.net.Socket
    public synchronized void shutdownInput() throws IOException {
        this.localSocket.shutdownInput();
        this.inputShutdown = true;
    }

    @Override // java.net.Socket
    public synchronized void shutdownOutput() throws IOException {
        this.localSocket.shutdownOutput();
        this.outputShutdown = true;
    }

    private static SocketException toSocketException(Throwable e) {
        SocketException se = new SocketException();
        se.initCause(e);
        return se;
    }
}
