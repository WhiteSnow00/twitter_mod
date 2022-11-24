// 
// Decompiled by Procyon v0.6.0
// 

public final class l30 extends pue implements hub<d86, Integer, vzv>
{
    public final l9r<hub<d86, Integer, vzv>> F0;
    
    public l30(final l9r<? extends hub<? super d86, ? super Integer, vzv>> f0) {
        this.F0 = (l9r<hub<d86, Integer, vzv>>)f0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            ((hub)this.F0.getValue()).invoke((Object)d86, (Object)0);
        }
        return vzv.a;
    }
}
