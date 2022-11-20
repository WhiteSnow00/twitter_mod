import java.net.UnknownHostException;
import java.net.InetAddress;
import java.util.List;
import okhttp3.Dns;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yav implements Dns
{
    public final Dns a;
    public final b49 b;
    public final d49 c;
    public volatile boolean d;
    
    public yav(final b49 b, final d49 c) {
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
        final b49 b = this.b;
        Object o;
        if (!b.a()) {
            b.b.clear();
            o = gdd.E0;
            final int a = c5j.a;
        }
        else {
            o = b.b.get((Object)s);
            if (o == null) {
                o = b.a.a.f(hmg.h("host.", s), (rlp)pkd.c);
                if (o == null) {
                    o = gdd.E0;
                    final int a2 = c5j.a;
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
