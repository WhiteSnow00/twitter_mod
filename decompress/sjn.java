// 
// Decompiled by Procyon v0.6.0
// 

public final class sjn extends ste implements qsb<ckn, fzv>
{
    public final njn D0;
    
    public sjn(final njn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ckn ckn = (ckn)o;
        czd.f((Object)ckn, "$this$distinct");
        final int ordinal = ckn.f.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    final njn d0 = this.D0;
                    final njn$b companion = njn.Companion;
                    d0.b().setIsPending(true);
                }
            }
            else {
                final njn d2 = this.D0;
                final njn$b companion2 = njn.Companion;
                d2.b().setIsFollowing(true);
                this.D0.b().setIsPending(false);
            }
        }
        else {
            final njn d3 = this.D0;
            final njn$b companion3 = njn.Companion;
            d3.b().setIsFollowing(false);
            this.D0.b().setIsPending(false);
        }
        return fzv.a;
    }
}
