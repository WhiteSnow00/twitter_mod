// 
// Decompiled by Procyon v0.6.0
// 

public final class e1f extends pue implements hub<Float, Float, Boolean>
{
    public final boolean F0;
    public final iz6 G0;
    public final a1f H0;
    
    public e1f(final boolean f0, final iz6 g0, final a1f h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        float floatValue = ((Number)o).floatValue();
        final float floatValue2 = ((Number)o2).floatValue();
        if (this.F0) {
            floatValue = floatValue2;
        }
        ma7.D(this.G0, (yy6)null, 0, (hub)new d1f(this.H0, floatValue, null), 3);
        return Boolean.TRUE;
    }
}
