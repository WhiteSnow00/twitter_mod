import java.net.UnknownHostException;
import java.net.InetAddress;
import java.util.List;
import okhttp3.Dns;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbv implements Dns
{
    public final Dns a;
    public final i59 b;
    public final k59 c;
    public volatile boolean d;
    
    public nbv(final i59 b, final k59 c) {
        final Dns system = Dns.SYSTEM;
        this.d = false;
        this.a = system;
        this.b = b;
        this.c = c;
    }
    
    public final List<InetAddress> lookup(final String s) throws UnknownHostException {
        if (!this.d) {
            return this.a.lookup(s);
        }
        if (s == null) {
            throw new UnknownHostException("hostname == null");
        }
        final i59 b = this.b;
        Object o;
        if (!b.a()) {
            b.b.clear();
            o = ged.G0;
            final int a = o5j.a;
        }
        else {
            o = b.b.get((Object)s);
            if (o == null) {
                o = b.a.a.f(mqb.l("host.", s), (nmp)qld.c);
                if (o == null) {
                    o = ged.G0;
                    final int a2 = o5j.a;
                }
                else {
                    b.b.put((Object)s, o);
                }
            }
        }
        if (((List)o).isEmpty()) {
            return this.a.lookup(s);
        }
        this.c.a(s, (List<? extends InetAddress>)o);
        return (List<InetAddress>)o;
    }
}
