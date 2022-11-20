import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i4g extends y4j<g4g>
{
    public static final i4g b;
    
    static {
        b = new i4g();
    }
    
    public i4g() {
        super(1);
    }
    
    public final Object d(final vlp vlp, final int n) {
        czd.f((Object)vlp, "input");
        final long y = vlp.y();
        final String a = vlp.A();
        czd.e((Object)a, "input.readNotNullString()");
        final long y2 = vlp.y();
        final long y3 = vlp.y();
        if (n < 1) {
            vlp.s();
        }
        final Object z = vlp.z((rlp)i4g.a.b);
        czd.e(z, "input.readNotNullObject(MetadataSerializer)");
        final g4g$a g4g$a = (g4g$a)z;
        if (n < 1) {
            vlp.y();
        }
        return new g4g(y, a, y2, y3, g4g$a);
    }
    
    public final void f(final wlp wlp, final Object o) {
        final g4g g4g = (g4g)o;
        czd.f((Object)wlp, "output");
        czd.f((Object)g4g, "entry");
        wlp.y(g4g.c).E(g4g.d).y(g4g.e).y(g4g.f).A((Object)g4g.g, (rlp)a.b);
    }
    
    public static final class a extends y4j<g4g$a>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public a() {
            super(1);
        }
        
        public final Object d(final vlp vlp, int x) {
            czd.f((Object)vlp, "input");
            final long y = vlp.y();
            final ak1 ak1 = (ak1)((y4j)ak1.f).a(vlp);
            final String a = vlp.A();
            czd.e((Object)a, "input.readNotNullString()");
            if (x < 1) {
                vlp.s();
                vlp.s();
                vlp.s();
                vlp.x();
            }
            final Object a2 = ((y4j)cfu.J0).a(vlp);
            czd.c(a2);
            final cfu cfu = (cfu)a2;
            if (x < 1) {
                vlp.G();
                ((y4j)eku.i).a(vlp);
            }
            Object d0;
            if ((d0 = ((y4j)new vp4$a((rlp)lyl.b)).a(vlp)) == null) {
                d0 = f2a.D0;
            }
            final g4g$b$a companion = g4g$b.Companion;
            x = vlp.x();
            Objects.requireNonNull(companion);
            g4g$b g4g$b;
            if (x != -1) {
                if (x != 0) {
                    if (x != 1) {
                        if (x != 2) {
                            throw new IllegalArgumentException(udu.z("Invalid status value: ", x));
                        }
                        g4g$b = g4g$b.H0;
                    }
                    else {
                        g4g$b = g4g$b.G0;
                    }
                }
                else {
                    g4g$b = g4g$b.F0;
                }
            }
            else {
                g4g$b = g4g$b.E0;
            }
            return new g4g$a(y, cfu, a, (List)d0, ak1, g4g$b, vlp.x(), (r89)((y4j)r89.O0).a(vlp), vlp.G(), (hk1)((y4j)hk1.b).a(vlp));
        }
        
        public final void f(final wlp wlp, final Object o) {
            final g4g$a g4g$a = (g4g$a)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)g4g$a, "metadata");
            wlp.y(g4g$a.a);
            wlp.A((Object)g4g$a.e, (rlp)ak1.f);
            wlp.E(g4g$a.c);
            wlp.A((Object)g4g$a.b, (rlp)cfu.J0);
            ((y4j)new vp4$a((rlp)lyl.b)).c(wlp, (Object)g4g$a.d);
            final int a = c5j.a;
            wlp.x(g4g$a.f.D0);
            wlp.x(g4g$a.g);
            wlp.A((Object)g4g$a.h, (rlp)r89.O0);
            wlp.E(g4g$a.i);
            wlp.A((Object)g4g$a.j, (rlp)hk1.b);
        }
    }
}
