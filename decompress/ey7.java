// 
// Decompiled by Procyon v0.6.0
// 

public final class ey7 extends ste implements qsb<ex7$b$a, fzv>
{
    public final nnl<ez7> D0;
    
    public ey7(final nnl<ez7> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ex7$b$a ex7$b$a = (ex7$b$a)o;
        czd.f((Object)ex7$b$a, "it");
        this.D0.onNext((Object)new ez7$e(ex7$b$a.a));
        return fzv.a;
    }
}
