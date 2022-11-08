import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t2f implements bso, xro
{
    public static final t2f.t2f$b Companion;
    public final bso a;
    public final cwj b;
    public final Set<Object> c;
    
    static {
        Companion = new t2f.t2f$b();
    }
    
    public t2f(bso a, final Map<String, ? extends List<?>> map) {
        a = dso.a((Map)map, (rtb)new t2f$a(a));
        this.a = a;
        this.b = (cwj)nkz.r((Object)null);
        this.c = new LinkedHashSet();
    }
    
    public final boolean a(final Object o) {
        zzd.f(o, "value");
        return this.a.a(o);
    }
    
    public final bso$a b(final String s, final otb<?> otb) {
        zzd.f((Object)s, "key");
        return this.a.b(s, (otb)otb);
    }
    
    public final void c(final Object o) {
        zzd.f(o, "key");
        final xro g = this.g();
        if (g != null) {
            g.c(o);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public final void d(final Object o, final gub<? super m76, ? super Integer, oyv> gub, m76 h, final int n) {
        zzd.f(o, "key");
        zzd.f((Object)gub, "content");
        h = h.h(-697180401);
        final ea6$b a = ea6.a;
        final xro g = this.g();
        if (g != null) {
            g.d(o, gub, h, (n & 0x70) | 0x208);
            jgw.c(o, (rtb)new t2f$c(this, o), h);
            final vwo k = h.k();
            if (k != null) {
                k.a((gub)new t2f$d(this, o, (gub)gub, n));
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public final Map<String, List<Object>> e() {
        final xro g = this.g();
        if (g != null) {
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                g.c(iterator.next());
            }
        }
        return this.a.e();
    }
    
    public final Object f(final String s) {
        zzd.f((Object)s, "key");
        return this.a.f(s);
    }
    
    public final xro g() {
        return (xro)((nhq)this.b).getValue();
    }
}
