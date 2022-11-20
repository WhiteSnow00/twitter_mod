// 
// Decompiled by Procyon v0.6.0
// 

public final class lx7 extends ste implements qsb<ex7$a, fzv>
{
    public final nnl<ez7> D0;
    
    public lx7(final nnl<ez7> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ex7$a ex7$a = (ex7$a)o;
        czd.f((Object)ex7$a, "group");
        this.D0.onNext((Object)new ez7$c((ex7$e)ex7$a));
        return fzv.a;
    }
}
