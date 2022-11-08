import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ps4
{
    public static final dlo a;
    
    static {
        final ks0 a2 = ks0.a;
        final ks0$k d = ks0.d;
        final float n = 0;
        final k77$b companion = k77.Companion;
        Objects.requireNonNull(dx.Companion);
        a = (dlo)poa.y0(2, (nub)ps4$a.C0, n, companion.a((dx$b)dx$a.n));
    }
    
    public static final gqg a(final ks0$l ks0$l, final dx$b dx$b, final m76 m76) {
        zzd.f((Object)ks0$l, "verticalArrangement");
        m76.x(1089876336);
        final ea6$b a = ea6.a;
        m76.x(511388516);
        final boolean p3 = m76.P((Object)ks0$l);
        final boolean p4 = m76.P((Object)dx$b);
        final Object y = m76.y();
        Object o = null;
        Label_0157: {
            if (!(p3 | p4)) {
                Objects.requireNonNull(m76.Companion);
                if ((o = y) != m76$a.b) {
                    break Label_0157;
                }
            }
            final ks0 a2 = ks0.a;
            Object o2 = null;
            Label_0148: {
                if (zzd.a((Object)ks0$l, (Object)ks0.d)) {
                    Objects.requireNonNull(dx.Companion);
                    if (zzd.a((Object)dx$b, (Object)dx$a.n)) {
                        o2 = ps4.a;
                        break Label_0148;
                    }
                }
                o2 = poa.y0(2, (nub)new qs4(ks0$l), ks0$l.a(), k77.Companion.a(dx$b));
            }
            m76.p(o2);
            o = o2;
        }
        m76.O();
        final gqg gqg = (gqg)o;
        m76.O();
        return gqg;
    }
}
