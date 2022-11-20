// 
// Decompiled by Procyon v0.6.0
// 

public final class ow extends ste implements ftb<x66, Integer, fzv>
{
    public final ftb<x66, Integer, fzv> D0;
    public final int E0;
    
    public ow(final ftb<? super x66, ? super Integer, fzv> d0, final int e0) {
        this.D0 = (ftb<x66, Integer, fzv>)d0;
        this.E0 = e0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final x66 x66 = (x66)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
            x66.H();
        }
        else {
            final n96$b a = n96.a;
            ris.a(((wnv)x66.m((wd6)xnv.a)).g, this.D0, x66, this.E0 >> 3 & 0x70);
        }
        return fzv.a;
    }
}
