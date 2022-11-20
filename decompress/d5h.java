// 
// Decompiled by Procyon v0.6.0
// 

public final class d5h extends ste implements ftb<x66, Integer, fzv>
{
    public final itb<wlo, x66, Integer, fzv> D0;
    public final wlo E0;
    public final int F0;
    public final int G0;
    
    public d5h(final itb<? super wlo, ? super x66, ? super Integer, fzv> d0, final wlo e0, final int f0, final int g0) {
        this.D0 = (itb<wlo, x66, Integer, fzv>)d0;
        this.E0 = e0;
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
            this.D0.h0((Object)this.E0, (Object)x66, (Object)((this.F0 & 0xE) | (this.G0 >> 12 & 0x70)));
        }
        return fzv.a;
    }
}
