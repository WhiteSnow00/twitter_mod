import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zhd extends ste implements nsb<fzv>
{
    public final qo7 D0;
    public final aid$a E0;
    
    public zhd(final qo7 d0, final aid$a e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final qo7 d0 = this.D0;
        if (d0.g) {
            final to7 g0 = this.E0.G0;
            if (g0 != null) {
                g0.e(d0);
            }
        }
        else {
            final exj exj = (exj)fq4.q((List)d0.h);
            final to7 g2 = this.E0.G0;
            if (g2 != null) {
                long d2;
                if (exj != null) {
                    d2 = exj.D0;
                }
                else {
                    d2 = -1L;
                }
                g2.f(d2);
            }
        }
        return fzv.a;
    }
}
