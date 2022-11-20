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

public final class igj extends EventListener
{
    public static final heg<String, String> a;
    public static final ConcurrentHashMap<String, String> b;
    
    static {
        a = new heg(20);
        b = new ConcurrentHashMap(20);
    }
    
    public final ggj a(final Call call) {
        return (ggj)call.request().tag();
    }
    
    public final boolean b(final Call call) {
        return call.request().tag() instanceof ggj;
    }
    
    public final void callStart(final Call call) {
        wk0.b().a();
    }
    
    public final void connectEnd(final Call call, final InetSocketAddress inetSocketAddress, final Proxy proxy, final Protocol protocol) {
        if (this.b(call)) {
            final ggj a = this.a(call);
            final bsc n = ((arc)a).n;
            final m4s a2 = hq1.a;
            n.l = (int)(System.currentTimeMillis() - ((arc)a).B);
            final bsc n2 = ((arc)a).n;
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
            final ggj a = this.a(call);
            Objects.requireNonNull(a);
            final m4s a2 = hq1.a;
            ((arc)a).B = System.currentTimeMillis();
            final InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                final String hostName = address.getHostName();
                final String hostAddress = address.getHostAddress();
                if (hostName != null && hostAddress != null && !hostAddress.equals(igj.b.put((Object)hostName, (Object)hostAddress))) {
                    ies.a((Class)igj.class);
                }
            }
        }
    }
    
    public final void dnsEnd(final Call call, final String s, final List<InetAddress> list) {
        if (this.b(call)) {
            final ggj a = this.a(call);
            final bsc n = ((arc)a).n;
            final m4s a2 = hq1.a;
            n.k = (int)(System.currentTimeMillis() - ((arc)a).z);
        }
    }
    
    public final void dnsStart(final Call call, final String s) {
        if (this.b(call)) {
            final ggj a = this.a(call);
            Objects.requireNonNull(a);
            final m4s a2 = hq1.a;
            ((arc)a).z = System.currentTimeMillis();
        }
    }
    
    public final void requestBodyEnd(Call h, final long i) {
        if (this.b(h)) {
            final ggj a = this.a(h);
            ((arc)a).n.i = i;
            h = (Call)((arc)a).h;
            synchronized (h) {
                if (!((List)((s5r)h).E0).isEmpty()) {
                    int size = ((List)((s5r)h).E0).size();
                    while (--size >= 0) {
                        ((xea)((List)((s5r)h).E0).get(size)).c((arc)a);
                    }
                }
            }
        }
    }
    
    public final void requestHeadersStart(final Call call) {
        super.requestHeadersStart(call);
        if (this.b(call)) {
            final ggj a = this.a(call);
            Objects.requireNonNull(a);
            final m4s a2 = hq1.a;
            ((arc)a).C = System.currentTimeMillis();
        }
    }
    
    public final void responseBodyEnd(final Call call, final long n) {
        super.responseBodyEnd(call, n);
        if (this.b(call)) {
            final ggj a = this.a(call);
            final bsc n2 = ((arc)a).n;
            final m4s a2 = hq1.a;
            n2.o = (int)(System.currentTimeMillis() - ((arc)a).C);
        }
    }
    
    public final void responseHeadersStart(final Call call) {
        super.responseHeadersStart(call);
        if (this.b(call)) {
            final ggj a = this.a(call);
            final bsc n = ((arc)a).n;
            final m4s a2 = hq1.a;
            n.n = (int)(System.currentTimeMillis() - ((arc)a).C);
        }
    }
    
    public final void secureConnectEnd(final Call call, final Handshake handshake) {
        if (this.b(call)) {
            final ggj a = this.a(call);
            final bsc n = ((arc)a).n;
            final m4s a2 = hq1.a;
            n.m = (int)(System.currentTimeMillis() - ((arc)a).A);
        }
    }
    
    public final void secureConnectStart(final Call call) {
        if (this.b(call)) {
            final ggj a = this.a(call);
            Objects.requireNonNull(a);
            final m4s a2 = hq1.a;
            ((arc)a).A = System.currentTimeMillis();
        }
    }
}
