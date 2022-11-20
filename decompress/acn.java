// 
// Decompiled by Procyon v0.6.0
// 

public final class acn extends ste implements qsb<jnn$a, fzv>
{
    public final ran D0;
    
    public acn(final ran d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jnn$a jnn$a = (jnn$a)o;
        if (jnn$a instanceof jnn$a$e) {
            final ran d0 = this.D0;
            final qt3 g = d0.G;
            if (g == null) {
                return fzv.a;
            }
            final co2 l = d0.l;
            final String b = d0.B;
            final String a = ((jnn$a$e)jnn$a).a;
            final String a2 = g.a();
            if (a2 == null) {
                return fzv.a;
            }
            l.t(b, a, a2).G((lj6)new ewi((qsb)ubn.D0, 18), (lj6)new qpl((qsb)vbn.D0, 14));
        }
        if (jnn$a instanceof jnn$a$f) {
            final ran d2 = this.D0;
            final qt3 g2 = d2.G;
            if (g2 != null) {
                if (((jnn$a$f)jnn$a).b) {
                    final co2 i = d2.l;
                    final String b2 = d2.B;
                    final String a3 = g2.a();
                    if (a3 != null) {
                        i.q(b2, a3).G((lj6)new ayi((qsb)wbn.D0, 12), (lj6)new irl((qsb)xbn.D0, 13));
                    }
                }
                else {
                    final co2 j = d2.l;
                    final String b3 = d2.B;
                    final String a4 = g2.a();
                    if (a4 != null) {
                        j.w(b3, a4).G((lj6)new gwi((qsb)ybn.D0, 17), (lj6)new bxi((qsb)zbn.D0, 14));
                    }
                }
            }
        }
        return fzv.a;
    }
}
