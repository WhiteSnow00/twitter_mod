// 
// Decompiled by Procyon v0.6.0
// 

public final class qx7 extends ste implements qsb<ex7, fzv>
{
    public final nnl<ez7> D0;
    
    public qx7(final nnl<ez7> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ex7 ex7 = (ex7)o;
        czd.f((Object)ex7, "withLink");
        this.D0.onNext((Object)new ez7$f((ex7$d)ex7));
        return fzv.a;
    }
}
