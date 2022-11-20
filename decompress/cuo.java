// 
// Decompiled by Procyon v0.6.0
// 

public final class cuo extends ste implements ftb<x66, Integer, fzv>
{
    public final ooa D0;
    public final ftb<x66, Integer, fzv> E0;
    public final int F0;
    
    public cuo(final ooa d0, final ftb<? super x66, ? super Integer, fzv> e0, final int f0) {
        this.D0 = d0;
        this.E0 = (ftb<x66, Integer, fzv>)e0;
        this.F0 = f0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final x66 x66 = (x66)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
            x66.H();
        }
        else {
            final n96$b a = n96.a;
            xd6.a(new bml[] { ((zll)yto.a).b((Object)this.D0) }, (ftb)this.E0, x66, (this.F0 >> 15 & 0x70) | 0x8);
        }
        return fzv.a;
    }
}
