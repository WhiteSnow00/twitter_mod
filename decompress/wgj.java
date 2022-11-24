import okhttp3.Handshake;
import java.util.List;
import java.net.InetAddress;
import java.util.Objects;
import okhttp3.Protocol;
import java.net.Proxy;
import java.net.InetSocketAddress;
import okhttp3.Call;
import j$.util.concurrent.ConcurrentHashMap;
import okhttp3.EventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wgj extends EventListener
{
    public static final bfg<String, String> a;
    public static final ConcurrentHashMap<String, String> b;
    
    static {
        a = new bfg(20);
        b = new ConcurrentHashMap(20);
    }
    
    public final ugj a(final Call call) {
        return (ugj)call.request().tag();
    }
    
    public final boolean b(final Call call) {
        return call.request().tag() instanceof ugj;
    }
    
    public final void callStart(final Call call) {
        po.b().a();
    }
    
    public final void connectEnd(final Call call, final InetSocketAddress inetSocketAddress, final Proxy proxy, final Protocol protocol) {
        if (this.b(call)) {
            final ugj a = this.a(call);
            final btc n = ((asc)a).n;
            final g5s a2 = nq1.a;
            n.l = (int)(System.currentTimeMillis() - ((asc)a).B);
            final btc n2 = ((asc)a).n;
            final int l = n2.l;
            int m = n2.m;
            if (m <= 0) {
                m = 0;
            }
            n2.l = l - m;
        }
    }
    
    public final void connectStart(final Call call, final InetSocketAddress inetSocketAddress, final Proxy proxy) {
        if (this.b(call)) {
            final ugj a = this.a(call);
            Objects.requireNonNull(a);
            final g5s a2 = nq1.a;
            ((asc)a).B = System.currentTimeMillis();
            final InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                final String hostName = address.getHostName();
                final String hostAddress = address.getHostAddress();
                if (hostName != null && hostAddress != null && !hostAddress.equals(wgj.b.put((Object)hostName, (Object)hostAddress))) {
                    afs.a((Class)wgj.class);
                }
            }
        }
    }
    
    public final void dnsEnd(final Call call, final String s, final List<InetAddress> list) {
        if (this.b(call)) {
            final ugj a = this.a(call);
            final btc n = ((asc)a).n;
            final g5s a2 = nq1.a;
            n.k = (int)(System.currentTimeMillis() - ((asc)a).z);
        }
    }
    
    public final void dnsStart(final Call call, final String s) {
        if (this.b(call)) {
            final ugj a = this.a(call);
            Objects.requireNonNull(a);
            final g5s a2 = nq1.a;
            ((asc)a).z = System.currentTimeMillis();
        }
    }
    
    public final void requestBodyEnd(Call h, final long i) {
        if (this.b(h)) {
            final ugj a = this.a(h);
            ((asc)a).n.i = i;
            h = (Call)((asc)a).h;
            synchronized (h) {
                if (!((List)((dh3)h).F0).isEmpty()) {
                    int size = ((List)((dh3)h).F0).size();
                    while (--size >= 0) {
                        ((fga)((List)((dh3)h).F0).get(size)).c((asc)a);
                    }
                }
            }
        }
    }
    
    public final void requestHeadersStart(final Call call) {
        super.requestHeadersStart(call);
        if (this.b(call)) {
            final ugj a = this.a(call);
            Objects.requireNonNull(a);
            final g5s a2 = nq1.a;
            ((asc)a).C = System.currentTimeMillis();
        }
    }
    
    public final void responseBodyEnd(final Call call, final long n) {
        super.responseBodyEnd(call, n);
        if (this.b(call)) {
            final ugj a = this.a(call);
            final btc n2 = ((asc)a).n;
            final g5s a2 = nq1.a;
            n2.o = (int)(System.currentTimeMillis() - ((asc)a).C);
        }
    }
    
    public final void responseHeadersStart(final Call call) {
        super.responseHeadersStart(call);
        if (this.b(call)) {
            final ugj a = this.a(call);
            final btc n = ((asc)a).n;
            final g5s a2 = nq1.a;
            n.n = (int)(System.currentTimeMillis() - ((asc)a).C);
        }
    }
    
    public final void secureConnectEnd(final Call call, final Handshake handshake) {
        if (this.b(call)) {
            final ugj a = this.a(call);
            final btc n = ((asc)a).n;
            final g5s a2 = nq1.a;
            n.m = (int)(System.currentTimeMillis() - ((asc)a).A);
        }
    }
    
    public final void secureConnectStart(final Call call) {
        if (this.b(call)) {
            final ugj a = this.a(call);
            Objects.requireNonNull(a);
            final g5s a2 = nq1.a;
            ((asc)a).A = System.currentTimeMillis();
        }
    }
}
