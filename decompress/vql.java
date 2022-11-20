import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vql
{
    public static final zr2<vql, a> f;
    public static final Set<String> g;
    public final nqp a;
    public final String b;
    public final Map<String, String> c;
    public final mrl d;
    public final mrl e;
    
    static {
        vql.f = new vql.vql$b();
        g = dnp.t((Object)"notification_style_vibrate", (Object[])new String[] { "notification_style_ringtone", "notification_style_pulse_light" });
    }
    
    public vql(final nqp a, final String b, final Map<String, String> map) {
        this.a = a;
        this.b = b;
        this.d = new mrl((Map)map);
        final kdd$b d0 = kdd.D0;
        final int a2 = c5j.a;
        this.e = new mrl((Map)d0);
        final qjg t = qjg.t();
        final List c = a.c;
        Object o;
        if (c == null) {
            o = d0;
        }
        else {
            final qjg t2 = qjg.t();
            final Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                final List c2 = ((nqp$b)iterator.next()).c;
                if (c2 != null) {
                    for (final nqp$c nqp$c : c2) {
                        t2.w((Object)nqp$c.a, (Object)nqp$c.k);
                    }
                }
            }
            o = ((n4j)t2).e();
        }
        t.x((Map)o);
        final qjg t3 = qjg.t();
        t3.w((Object)"notification_style_vibrate", (Object)"notification_style_vibrate");
        t3.w((Object)"notification_style_ringtone", (Object)"notification_style_ringtone");
        t3.w((Object)"notification_style_pulse_light", (Object)"notification_style_pulse_light");
        t.x((Map)((n4j)t3).e());
        this.c = (Map)((n4j)t).e();
    }
    
    public vql(final a a) {
        final mrl d = a.d;
        jee.l((Object)d);
        this.d = d;
        final mrl e = a.e;
        jee.l((Object)e);
        this.e = e;
        final nqp a2 = a.a;
        jee.l((Object)a2);
        this.a = a2;
        String b;
        if ((b = a.b) == null) {
            b = "";
        }
        this.b = b;
        Object c;
        if ((c = a.c) == null) {
            c = k2a.D0;
        }
        this.c = (Map<String, String>)c;
    }
    
    public final Map<String, String> a() {
        final qjg t = qjg.t();
        t.x(this.d.b);
        t.x(this.e.b);
        return (Map)((n4j)t).e();
    }
    
    public final Map<String, String> b() {
        final mrl d = this.d;
        final qjg$a qjg$a = new qjg$a(d.a.size());
        ((qjg)qjg$a).x(d.a);
        ((qjg)qjg$a).x(d.b);
        return (Map)((n4j)qjg$a).e();
    }
    
    public final String c(final String s, final String s2) {
        if (vql.g.contains(s)) {
            return this.e.a(s, s2);
        }
        return this.d.a(s, s2);
    }
    
    public static final class a extends n4j<vql>
    {
        public nqp a;
        public String b;
        public Map<String, String> c;
        public mrl d;
        public mrl e;
        
        public final Object i() {
            return new vql(this);
        }
    }
}
