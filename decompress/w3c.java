import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import tv.periscope.model.b;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w3c
{
    public static final w3c l;
    public static final ThreadLocal<w3c.w3c$a> m;
    public final Map<String, nh0> a;
    @d5d
    public final Map<String, cgv> b;
    public final Map<String, roh> c;
    public final Map<String, bj3> d;
    public final Map<String, fpi> e;
    public final Map<String, qev> f;
    public final Map<String, dtg> g;
    public final Map<String, b> h;
    public final Map<String, jwd> i;
    public final Map<String, scv> j;
    public final Map<String, nj1> k;
    
    static {
        l = new w3c(Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap());
        m = new ThreadLocal<w3c.w3c$a>();
    }
    
    public w3c(final Map<String, nh0> map, final Map<String, cgv> map2, final Map<String, roh> c, final Map<String, bj3> d, final Map<String, fpi> e, final Map<String, qev> f, final Map<String, dtg> g, final Map<String, b> h, final Map<String, jwd> i, final Map<String, scv> j, final Map<String, nj1> k) {
        this.a = qjg.p((Map)map);
        this.b = qjg.p((Map)map2);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static List<String> a(final List<kiw> list, final boolean b) {
        final w3c.w3c$a d = d();
        final rif h = rif.H();
        final Iterator<kiw> iterator = list.iterator();
        while (iterator.hasNext()) {
            final cgv d2 = toe.d((kiw)iterator.next());
            if (b) {
                d.q(d2);
            }
            h.p((Object)d2.e());
        }
        return (List)((n4j)h).e();
    }
    
    public static w3c b() {
        return (w3c)((n4j)d()).e();
    }
    
    public static w3c.w3c$a d() {
        final w3c.w3c$a w3c$a = w3c.m.get();
        if (w3c$a != null) {
            return w3c$a;
        }
        throw new IllegalStateException("GlobalObjects isn't initialized yet.");
    }
    
    public static void g() {
        final ThreadLocal<w3c.w3c$a> m = w3c.m;
        if (m.get() == null) {
            m.set(new w3c.w3c$a());
            ies.a((Class)w3c.class);
            return;
        }
        throw new IllegalStateException("GlobalObjects is already initialized.");
    }
    
    public static void h() {
        w3c.m.remove();
    }
    
    public final nh0 c(final String s) {
        return this.a.get(s);
    }
    
    public final jwd e(final String s) {
        return this.i.get(s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        wk0.b().a();
        return super.equals(o);
    }
    
    public final cgv f(final String s) {
        return this.b.get(s);
    }
    
    @Override
    public final int hashCode() {
        wk0.b().a();
        return super.hashCode();
    }
}
