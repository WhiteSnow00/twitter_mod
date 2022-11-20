// 
// Decompiled by Procyon v0.6.0
// 

public final class oze extends ste implements ftb<x66, Integer, fzv>
{
    public final tze D0;
    public final int E0;
    
    public oze(final tze d0, final int e0) {
        this.D0 = d0;
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
            this.D0.e(this.E0, x66, 0);
        }
        return fzv.a;
    }
}
