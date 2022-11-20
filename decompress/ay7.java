// 
// Decompiled by Procyon v0.6.0
// 

public final class ay7 extends ste implements qsb<ex7$h, fzv>
{
    public final nnl<u08> D0;
    
    public ay7(final nnl<u08> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ex7$h ex7$h = (ex7$h)o;
        czd.f((Object)ex7$h, "it");
        this.D0.onNext((Object)new u08$c(ex7$h));
        return fzv.a;
    }
}
