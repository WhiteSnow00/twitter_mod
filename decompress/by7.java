// 
// Decompiled by Procyon v0.6.0
// 

public final class by7 extends ste implements qsb<ex7$h, fzv>
{
    public final nnl<mv7> D0;
    
    public by7(final nnl<mv7> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ex7$h ex7$h = (ex7$h)o;
        czd.f((Object)ex7$h, "it");
        this.D0.onNext((Object)new mv7$i(ex7$h));
        return fzv.a;
    }
}
