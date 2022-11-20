import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2f implements sso, oso
{
    public static final e2f.e2f$b Companion;
    public final sso a;
    public final hwj b;
    public final Set<Object> c;
    
    static {
        Companion = new e2f.e2f$b();
    }
    
    public e2f(sso a, final Map<String, ? extends List<?>> map) {
        a = uso.a((Map)map, (qsb)new e2f$a(a));
        this.a = a;
        this.b = (hwj)blz.Q(null);
        this.c = new LinkedHashSet();
    }
    
    public final boolean a(final Object o) {
        czd.f(o, "value");
        return this.a.a(o);
    }
    
    public final sso$a b(final String s, final nsb<?> nsb) {
        czd.f((Object)s, "key");
        return this.a.b(s, (nsb)nsb);
    }
    
    public final void c(final Object o) {
        czd.f(o, "key");
        final oso g = this.g();
        if (g != null) {
            g.c(o);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public final void d(final Object o, final ftb<? super x66, ? super Integer, fzv> ftb, x66 h, final int n) {
        czd.f(o, "key");
        czd.f((Object)ftb, "content");
        h = h.h(-697180401);
        final n96$b a = n96.a;
        final oso g = this.g();
        if (g != null) {
            g.d(o, (ftb)ftb, h, (n & 0x70) | 0x208);
            npe.c(o, (qsb)new e2f$c(this, o), h);
            final lxo k = h.k();
            if (k != null) {
                k.a((ftb)new e2f$d(this, o, (ftb)ftb, n));
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public final Map<String, List<Object>> e() {
        final oso g = this.g();
        if (g != null) {
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                g.c(iterator.next());
            }
        }
        return this.a.e();
    }
    
    public final Object f(final String s) {
        czd.f((Object)s, "key");
        return this.a.f(s);
    }
    
    public final oso g() {
        return (oso)this.b.getValue();
    }
}
