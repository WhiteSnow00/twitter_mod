// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.net.SocketTimeoutException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.util.Objects;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramSocket;
import android.net.Uri;
import java.net.DatagramPacket;

public final class UdpDataSource extends nk1
{
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public boolean l;
    public int m;
    
    public UdpDataSource() {
        super(true);
        this.e = 8000;
        final byte[] f = new byte[2000];
        this.f = f;
        this.g = new DatagramPacket(f, 0, 2000);
    }
    
    public final long a(final b b) throws UdpDataSource.UdpDataSource$UdpDataSourceException {
        final Uri a = b.a;
        this.h = a;
        final String host = a.getHost();
        Objects.requireNonNull(host);
        final int port = this.h.getPort();
        this.r(b);
        try {
            this.k = InetAddress.getByName(host);
            final InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                (this.j = new MulticastSocket(inetSocketAddress)).joinGroup(this.k);
                this.i = this.j;
            }
            else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.e);
            this.l = true;
            this.s(b);
            return -1L;
        }
        catch (final IOException ex) {
            throw new UdpDataSource.UdpDataSource$UdpDataSourceException((Throwable)ex, 2001);
        }
        catch (final SecurityException ex2) {
            throw new UdpDataSource.UdpDataSource$UdpDataSourceException((Throwable)ex2, 2006);
        }
    }
    
    public final int b(final byte[] array, final int n, int min) throws UdpDataSource.UdpDataSource$UdpDataSourceException {
        if (min == 0) {
            return 0;
        }
        if (this.m == 0) {
            try {
                final DatagramSocket i = this.i;
                Objects.requireNonNull(i);
                i.receive(this.g);
                this.p(this.m = this.g.getLength());
            }
            catch (final IOException ex) {
                throw new UdpDataSource.UdpDataSource$UdpDataSourceException((Throwable)ex, 2001);
            }
            catch (final SocketTimeoutException ex2) {
                throw new UdpDataSource.UdpDataSource$UdpDataSourceException((Throwable)ex2, 2002);
            }
        }
        final int length = this.g.getLength();
        final int m = this.m;
        min = Math.min(m, min);
        System.arraycopy(this.f, length - m, array, n, min);
        this.m -= min;
        return min;
    }
    
    public final void close() {
        this.h = null;
        final MulticastSocket j = this.j;
        Label_0034: {
            if (j == null) {
                break Label_0034;
            }
            while (true) {
                try {
                    final InetAddress k = this.k;
                    Objects.requireNonNull(k);
                    j.leaveGroup(k);
                    this.j = null;
                    final DatagramSocket i = this.i;
                    if (i != null) {
                        i.close();
                        this.i = null;
                    }
                    this.k = null;
                    this.m = 0;
                    if (this.l) {
                        this.l = false;
                        this.q();
                    }
                }
                catch (final IOException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final Uri m() {
        return this.h;
    }
}
