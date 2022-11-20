// 
// Decompiled by Procyon v0.6.0
// 

public final class kgt extends ste implements qsb<fzv, fzv>
{
    public final jgt D0;
    public final nsb<dgt> E0;
    
    public kgt(final jgt d0, final nsb<? extends dgt> e0) {
        this.D0 = d0;
        this.E0 = (nsb<dgt>)e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "it");
        this.D0.J0.onNext(this.E0.invoke());
        return fzv.a;
    }
}
