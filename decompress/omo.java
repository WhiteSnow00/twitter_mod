import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class omo
{
    public static final lmo a;
    
    static {
        final gs0 a2 = gs0.a;
        final gs0$d b = (gs0$d)gs0.b;
        final float n = 0;
        final t77$b companion = t77.Companion;
        Objects.requireNonNull(ex.Companion);
        a = (lmo)tpz.Q(1, (oub)omo$a.F0, n, companion.b((ex$c)ex$a.k));
    }
    
    public static final zqg a(final gs0$d gs0$d, final ex$c ex$c, final d86 d86) {
        e0e.f((Object)gs0$d, "horizontalArrangement");
        d86.x(-837807694);
        final sa6$b a = sa6.a;
        d86.x(511388516);
        final boolean p3 = d86.P((Object)gs0$d);
        final boolean p4 = d86.P((Object)ex$c);
        final Object y = d86.y();
        zqg zqg = null;
        Label_0159: {
            if (!(p3 | p4)) {
                Objects.requireNonNull(d86.Companion);
                if ((zqg = (zqg)y) != d86$a.b) {
                    break Label_0159;
                }
            }
            final gs0 a2 = gs0.a;
            zqg zqg2 = null;
            Label_0149: {
                if (e0e.a((Object)gs0$d, (Object)gs0.b)) {
                    Objects.requireNonNull(ex.Companion);
                    if (e0e.a((Object)ex$c, (Object)ex$a.k)) {
                        zqg2 = omo.a;
                        break Label_0149;
                    }
                }
                zqg2 = tpz.Q(1, (oub)new pmo(gs0$d), gs0$d.a(), t77.Companion.b(ex$c));
            }
            d86.p((Object)zqg2);
            zqg = zqg2;
        }
        d86.O();
        final zqg zqg3 = zqg;
        d86.O();
        return zqg3;
    }
}
