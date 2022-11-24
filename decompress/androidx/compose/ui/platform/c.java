// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

public final class c extends pue implements hub<d86, Integer, vzv>
{
    public final WrappedComposition F0;
    public final hub<d86, Integer, vzv> G0;
    
    public c(final WrappedComposition f0, final hub<? super d86, ? super Integer, vzv> g0) {
        this.F0 = f0;
        this.G0 = (hub<d86, Integer, vzv>)g0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            z20.a(this.F0.F0, (hub)this.G0, d86, 8);
        }
        return vzv.a;
    }
}
