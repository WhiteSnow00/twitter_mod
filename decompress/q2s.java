// 
// Decompiled by Procyon v0.6.0
// 

public final class q2s extends ste implements nsb<Boolean>
{
    public final n2s D0;
    
    public q2s(final n2s d0) {
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final a2s a2s = (a2s)mq4.i0(this.D0.b);
        if (a2s != null) {
            final dtg a = a2s.a;
            if (a != null) {
                final Enum<dtg.c> t0 = a.T0;
                return t0 == dtg.c.F0 && !this.D0.b();
            }
        }
        final Enum<dtg.c> t0 = null;
        return t0 == dtg.c.F0 && !this.D0.b();
    }
}
