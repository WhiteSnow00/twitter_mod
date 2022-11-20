// 
// Decompiled by Procyon v0.6.0
// 

public final class dhq extends ste implements ftb<x66, Integer, fzv>
{
    public final ftb<x66, Integer, fzv> D0;
    public final ftb<x66, Integer, fzv> E0;
    public final int F0;
    public final boolean G0;
    
    public dhq(final ftb<? super x66, ? super Integer, fzv> d0, final ftb<? super x66, ? super Integer, fzv> e0, final int f0, final boolean g0) {
        this.D0 = (ftb<x66, Integer, fzv>)d0;
        this.E0 = (ftb<x66, Integer, fzv>)e0;
        this.F0 = f0;
        this.G0 = g0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final x66 x66 = (x66)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
            x66.H();
        }
        else {
            final n96$b a = n96.a;
            ris.a(((wnv)x66.m((wd6)xnv.a)).j, (ftb<? super x66, ? super Integer, fzv>)io7.g(x66, 225114541, (Object)new chq(this.D0, this.E0, this.F0, this.G0)), x66, 48);
        }
        return fzv.a;
    }
}
