import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hql
{
    public static final js2<hql, hql.hql$a> f;
    public static final Set<String> g;
    public final vpp a;
    public final String b;
    public final Map<String, String> c;
    public final xql d;
    public final xql e;
    
    static {
        hql.f = new hql.hql$b();
        g = nmp.t((Object)"notification_style_vibrate", (Object[])new String[] { "notification_style_ringtone", "notification_style_pulse_light" });
    }
    
    public hql(final hql.hql$a hql$a) {
        final xql d = hql$a.d;
        pf8.r(d);
        this.d = d;
        final xql e = hql$a.e;
        pf8.r(e);
        this.e = e;
        final vpp a = hql$a.a;
        pf8.r(a);
        this.a = a;
        String b;
        if ((b = hql$a.b) == null) {
            b = "";
        }
        this.b = b;
        Object c;
        if ((c = hql$a.c) == null) {
            c = a3a.C0;
        }
        this.c = (Map<String, String>)c;
    }
    
    public hql(final vpp a, final String b, final Map<String, String> map) {
        this.a = a;
        this.b = b;
        this.d = new xql((Map)map);
        final ged$b c0 = ged.C0;
        final int a2 = w4j.a;
        this.e = new xql((Map)c0);
        final sjg t = sjg.t();
        final List c2 = a.c;
        Object o;
        if (c2 == null) {
            o = c0;
        }
        else {
            final sjg t2 = sjg.t();
            final Iterator iterator = c2.iterator();
            while (iterator.hasNext()) {
                final List c3 = ((vpp$b)iterator.next()).c;
                if (c3 != null) {
                    for (final vpp$c vpp$c : c3) {
                        t2.w((Object)vpp$c.a, (Object)vpp$c.k);
                    }
                }
            }
            o = ((h4j)t2).e();
        }
        t.x((Map)o);
        final sjg t3 = sjg.t();
        t3.w((Object)"notification_style_vibrate", (Object)"notification_style_vibrate");
        t3.w((Object)"notification_style_ringtone", (Object)"notification_style_ringtone");
        t3.w((Object)"notification_style_pulse_light", (Object)"notification_style_pulse_light");
        t.x((Map)((h4j)t3).e());
        this.c = (Map)((h4j)t).e();
    }
    
    public final Map<String, String> a() {
        final sjg t = sjg.t();
        t.x(this.d.b);
        t.x(this.e.b);
        return (Map)((h4j)t).e();
    }
    
    public final Map<String, String> b() {
        final xql d = this.d;
        final sjg$a sjg$a = new sjg$a(d.a.size());
        ((sjg)sjg$a).x(d.a);
        ((sjg)sjg$a).x(d.b);
        return (Map)((h4j)sjg$a).e();
    }
    
    public final String c(final String s, final String s2) {
        if (hql.g.contains(s)) {
            return this.e.a(s, s2);
        }
        return this.d.a(s, s2);
    }
}
