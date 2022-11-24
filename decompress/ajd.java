// 
// Decompiled by Procyon v0.6.0
// 

public final class ajd extends pue implements ptb<vzv>
{
    public final tp7 F0;
    public final bjd$a G0;
    
    public ajd(final tp7 f0, final bjd$a g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(0);
    }
    
    public final Object invoke() {
        final tp7 f0 = this.F0;
        if (f0.g) {
            final wp7 i0 = this.G0.I0;
            if (i0 != null) {
                i0.e(f0);
            }
        }
        else {
            final txj txj = (txj)kr4.q(f0.h);
            final wp7 i2 = this.G0.I0;
            if (i2 != null) {
                long f2;
                if (txj != null) {
                    f2 = txj.F0;
                }
                else {
                    f2 = -1L;
                }
                i2.f(f2);
            }
        }
        return vzv.a;
    }
}
