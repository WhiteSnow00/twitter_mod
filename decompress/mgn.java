// 
// Decompiled by Procyon v0.6.0
// 

public final class mgn extends ste implements nsb<fzv>
{
    public final lgn D0;
    public final ggn E0;
    
    public mgn(final lgn d0, final ggn e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final nnl n0 = this.D0.N0;
        final ggn$b ggn$b = (ggn$b)this.E0;
        n0.onNext((Object)new jgn$k(ggn$b.a, ggn$b.b));
        return fzv.a;
    }
}
