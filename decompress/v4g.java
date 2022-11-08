import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v4g extends s4j<t4g>
{
    public static final v4g b;
    
    static {
        b = new v4g();
    }
    
    public v4g() {
        super(1);
    }
    
    public final Object d(final elp elp, final int n) {
        zzd.f((Object)elp, "input");
        final long a = elp.A();
        final String c = elp.C();
        zzd.e((Object)c, "input.readNotNullString()");
        final long a2 = elp.A();
        final long a3 = elp.A();
        if (n < 1) {
            elp.u();
        }
        final Object b = elp.B((alp)v4g.a.b);
        zzd.e(b, "input.readNotNullObject(MetadataSerializer)");
        final t4g$a t4g$a = (t4g$a)b;
        if (n < 1) {
            elp.A();
        }
        return new t4g(a, c, a2, a3, t4g$a);
    }
    
    public final void f(final flp flp, final Object o) {
        final t4g t4g = (t4g)o;
        zzd.f((Object)flp, "output");
        zzd.f((Object)t4g, "entry");
        flp.A(t4g.c).G(t4g.d).A(t4g.e).A(t4g.f).C((Object)t4g.g, (alp)a.b);
    }
    
    public static final class a extends s4j<t4g$a>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public a() {
            super(1);
        }
        
        public final Object d(final elp elp, int z) {
            zzd.f((Object)elp, "input");
            final long a = elp.A();
            final gk1 gk1 = (gk1)((s4j)gk1.f).a(elp);
            final String c = elp.C();
            zzd.e((Object)c, "input.readNotNullString()");
            if (z < 1) {
                elp.u();
                elp.u();
                elp.u();
                elp.z();
            }
            final Object a2 = ((s4j)jeu.I0).a(elp);
            zzd.c(a2);
            final jeu jeu = (jeu)a2;
            if (z < 1) {
                elp.I();
                ((s4j)kju.i).a(elp);
            }
            Object c2;
            if ((c2 = ((s4j)new xq4$a((alp)xxl.b)).a(elp)) == null) {
                c2 = v2a.C0;
            }
            final t4g$b$a companion = t4g$b.Companion;
            z = elp.z();
            Objects.requireNonNull(companion);
            t4g$b t4g$b;
            if (z != -1) {
                if (z != 0) {
                    if (z != 1) {
                        if (z != 2) {
                            throw new IllegalArgumentException(yk.y("Invalid status value: ", z));
                        }
                        t4g$b = t4g$b.G0;
                    }
                    else {
                        t4g$b = t4g$b.F0;
                    }
                }
                else {
                    t4g$b = t4g$b.E0;
                }
            }
            else {
                t4g$b = t4g$b.D0;
            }
            return new t4g$a(a, jeu, c, (List)c2, gk1, t4g$b, elp.z(), (j99)((s4j)j99.N0).a(elp), elp.I(), (nk1)((s4j)nk1.b).a(elp));
        }
        
        public final void f(final flp flp, final Object o) {
            final t4g$a t4g$a = (t4g$a)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)t4g$a, "metadata");
            flp.A(t4g$a.a);
            flp.C((Object)t4g$a.e, (alp)gk1.f);
            flp.G(t4g$a.c);
            flp.C((Object)t4g$a.b, (alp)jeu.I0);
            ((s4j)new xq4$a((alp)xxl.b)).c(flp, (Object)t4g$a.d);
            final int a = w4j.a;
            flp.z(t4g$a.f.C0);
            flp.z(t4g$a.g);
            flp.C((Object)t4g$a.h, (alp)j99.N0);
            flp.G(t4g$a.i);
            flp.C((Object)t4g$a.j, (alp)nk1.b);
        }
    }
}
