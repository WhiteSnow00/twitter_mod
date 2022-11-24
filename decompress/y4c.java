import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import tv.periscope.model.b;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y4c
{
    public static final y4c l;
    public static final ThreadLocal<y4c.y4c$a> m;
    public final Map<String, oh0> a;
    @d6d
    public final Map<String, qgv> b;
    public final Map<String, gph> c;
    public final Map<String, ck3> d;
    public final Map<String, wpi> e;
    public final Map<String, efv> f;
    public final Map<String, wtg> g;
    public final Map<String, b> h;
    public final Map<String, lxd> i;
    public final Map<String, gdv> j;
    public final Map<String, qj1> k;
    
    static {
        l = new y4c(Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap());
        m = new ThreadLocal<y4c.y4c$a>();
    }
    
    public y4c(final Map<String, oh0> map, final Map<String, qgv> map2, final Map<String, gph> c, final Map<String, ck3> d, final Map<String, wpi> e, final Map<String, efv> f, final Map<String, wtg> g, final Map<String, b> h, final Map<String, lxd> i, final Map<String, gdv> j, final Map<String, qj1> k) {
        this.a = kkg.p((Map)map);
        this.b = kkg.p((Map)map2);
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
    
    public static List<String> a(final List<ziw> list, final boolean b) {
        final y4c.y4c$a d = d();
        final ojf h = ojf.H();
        final Iterator<ziw> iterator = list.iterator();
        while (iterator.hasNext()) {
            final qgv b2 = dvc.b((ziw)iterator.next());
            if (b) {
                d.q(b2);
            }
            h.p((Object)b2.e());
        }
        return (List)((z4j)h).e();
    }
    
    public static y4c b() {
        return (y4c)((z4j)d()).e();
    }
    
    public static y4c.y4c$a d() {
        final y4c.y4c$a y4c$a = y4c.m.get();
        if (y4c$a != null) {
            return y4c$a;
        }
        throw new IllegalStateException("GlobalObjects isn't initialized yet.");
    }
    
    public static void g() {
        final ThreadLocal<y4c.y4c$a> m = y4c.m;
        if (m.get() == null) {
            m.set(new y4c.y4c$a());
            afs.a((Class)y4c.class);
            return;
        }
        throw new IllegalStateException("GlobalObjects is already initialized.");
    }
    
    public static void h() {
        y4c.m.remove();
    }
    
    public final oh0 c(final String s) {
        return this.a.get(s);
    }
    
    public final lxd e(final String s) {
        return this.i.get(s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        po.b().a();
        return super.equals(o);
    }
    
    public final qgv f(final String s) {
        return this.b.get(s);
    }
    
    @Override
    public final int hashCode() {
        po.b().a();
        return super.hashCode();
    }
}
