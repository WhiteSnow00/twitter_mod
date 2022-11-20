// 
// Decompiled by Procyon v0.6.0
// 

public final class yx7 extends ste implements qsb<ex7$g, fzv>
{
    public final nnl<mv7> D0;
    
    public yx7(final nnl<mv7> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ex7$g ex7$g = (ex7$g)o;
        czd.f((Object)ex7$g, "person");
        this.D0.onNext((Object)new mv7$c((ex7$c)ex7$g));
        return fzv.a;
    }
}
