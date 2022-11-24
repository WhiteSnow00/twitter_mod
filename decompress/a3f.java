import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a3f implements mto, ito
{
    public static final a3f.a3f$b Companion;
    public final mto a;
    public final wwj b;
    public final Set<Object> c;
    
    static {
        Companion = new a3f.a3f$b();
    }
    
    public a3f(mto a, final Map<String, ? extends List<?>> map) {
        a = oto.a((Map)map, (stb)new stb<Object, Boolean>(a) {
            public final mto F0;
            
            public final Object invoke(final Object o) {
                e0e.f(o, "it");
                final mto f0 = this.F0;
                return f0 == null || f0.a(o);
            }
        });
        this.a = a;
        this.b = (wwj)zzz.W((Object)null);
        this.c = new LinkedHashSet();
    }
    
    @Override
    public final boolean a(final Object o) {
        e0e.f(o, "value");
        return this.a.a(o);
    }
    
    @Override
    public final a b(final String s, final ptb<?> ptb) {
        e0e.f((Object)s, "key");
        return this.a.b(s, ptb);
    }
    
    public final void c(final Object o) {
        e0e.f(o, "key");
        final ito g = this.g();
        if (g != null) {
            g.c(o);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public final void d(final Object o, final hub<? super d86, ? super Integer, vzv> hub, d86 h, final int n) {
        e0e.f(o, "key");
        e0e.f((Object)hub, "content");
        h = h.h(-697180401);
        final sa6$b a = sa6.a;
        final ito g = this.g();
        if (g != null) {
            g.d(o, (hub)hub, h, (n & 0x70) | 0x208);
            shw.b(o, (stb)new stb<h39, g39>(this, o) {
                public final a3f F0;
                public final Object G0;
                
                public final Object invoke(final Object o) {
                    e0e.f((Object)o, "$this$DisposableEffect");
                    this.F0.c.remove(this.G0);
                    return new d3f(this.F0, this.G0);
                }
            }, h);
            final gyo k = h.k();
            if (k != null) {
                k.a((hub)new hub<d86, Integer, vzv>(this, o, hub, n) {
                    public final a3f F0;
                    public final Object G0;
                    public final hub<d86, Integer, vzv> H0;
                    public final int I0;
                    
                    public final Object invoke(final Object o, final Object o2) {
                        final d86 d86 = (d86)o;
                        ((Number)o2).intValue();
                        this.F0.d(this.G0, this.H0, d86, this.I0 | 0x1);
                        return vzv.a;
                    }
                });
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @Override
    public final Map<String, List<Object>> e() {
        final ito g = this.g();
        if (g != null) {
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                g.c(iterator.next());
            }
        }
        return this.a.e();
    }
    
    @Override
    public final Object f(final String s) {
        e0e.f((Object)s, "key");
        return this.a.f(s);
    }
    
    public final ito g() {
        return ((cjq<ito>)this.b).getValue();
    }
}
