// 
// Decompiled by Procyon v0.6.0
// 

public final class o3r extends gue implements rtb<Double, Double>
{
    public final /* synthetic */ double C0;
    public final /* synthetic */ double D0;
    public final /* synthetic */ double E0;
    
    public o3r(final double c0, final double d0, final double e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final double doubleValue = ((Number)o).doubleValue();
        final double c0 = this.C0;
        final double d0 = this.D0;
        final double n = doubleValue * d0;
        return Math.exp(n) * (this.E0 * d0 + (1 + n) * c0);
    }
}
