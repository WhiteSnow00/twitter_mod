// 
// Decompiled by Procyon v0.6.0
// 

public final class zhq extends ste implements qsb<Object, fzv>
{
    public final qsb<Object, fzv> D0;
    public final qsb<Object, fzv> E0;
    
    public zhq(final qsb<Object, fzv> d0, final qsb<Object, fzv> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f(o, "state");
        this.D0.invoke(o);
        this.E0.invoke(o);
        return fzv.a;
    }
}
