// 
// Decompiled by Procyon v0.6.0
// 

public final class chq extends ste implements ftb<x66, Integer, fzv>
{
    public final ftb<x66, Integer, fzv> D0;
    public final ftb<x66, Integer, fzv> E0;
    public final int F0;
    public final boolean G0;
    
    public chq(final ftb<? super x66, ? super Integer, fzv> d0, final ftb<? super x66, ? super Integer, fzv> e0, final int f0, final boolean g0) {
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
            if (this.D0 == null) {
                x66.x(59708346);
                ehq.e((ftb)this.E0, x66, this.F0 >> 21 & 0xE);
                x66.O();
            }
            else if (this.G0) {
                x66.x(59708411);
                final ftb<x66, Integer, fzv> e0 = this.E0;
                final ftb<x66, Integer, fzv> d0 = this.D0;
                final int f0 = this.F0;
                ehq.c((ftb)e0, (ftb)d0, x66, (f0 & 0x70) | (f0 >> 21 & 0xE));
                x66.O();
            }
            else {
                x66.x(59708478);
                final ftb<x66, Integer, fzv> e2 = this.E0;
                final ftb<x66, Integer, fzv> d2 = this.D0;
                final int f2 = this.F0;
                ehq.d((ftb)e2, (ftb)d2, x66, (f2 & 0x70) | (f2 >> 21 & 0xE));
                x66.O();
            }
        }
        return fzv.a;
    }
}
