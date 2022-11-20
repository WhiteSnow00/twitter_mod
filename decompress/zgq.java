// 
// Decompiled by Procyon v0.6.0
// 

public final class zgq extends ste implements ftb<x66, Integer, fzv>
{
    public final ftb<x66, Integer, fzv> D0;
    public final ftb<x66, Integer, fzv> E0;
    public final int F0;
    
    public zgq(final ftb<? super x66, ? super Integer, fzv> d0, final ftb<? super x66, ? super Integer, fzv> e0, final int f0) {
        this.D0 = (ftb<x66, Integer, fzv>)d0;
        this.E0 = (ftb<x66, Integer, fzv>)e0;
        this.F0 = f0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final x66 x66 = (x66)o;
        ((Number)o2).intValue();
        ehq.c((ftb)this.D0, (ftb)this.E0, x66, this.F0 | 0x1);
        return fzv.a;
    }
}
