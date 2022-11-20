// 
// Decompiled by Procyon v0.6.0
// 

public final class f0c extends fo1<s8x>
{
    public final g0c E0;
    
    public f0c(final g0c e0) {
        this.E0 = e0;
    }
    
    public final void onNext(final Object o) {
        final int ordinal = ((Enum)o).ordinal();
        if (ordinal != 0) {
            if (ordinal == 4) {
                final g0c e0 = this.E0;
                e0.D0.I0.a((rmf$b)e0.F0);
            }
        }
        else {
            final g0c e2 = this.E0;
            e2.D0.I0.c((rmf$b)e2.F0);
        }
    }
}
