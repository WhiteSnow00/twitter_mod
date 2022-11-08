// 
// Decompiled by Procyon v0.6.0
// 

public final class p3r extends gue implements rtb<Double, Double>
{
    public final /* synthetic */ double C0;
    public final /* synthetic */ double D0;
    public final /* synthetic */ double E0;
    public final /* synthetic */ double F0;
    public final /* synthetic */ double G0;
    
    public p3r(final double c0, final double d0, final double e0, final double f0, final double g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final double doubleValue = ((Number)o).doubleValue();
        return Math.exp(this.F0 * doubleValue) * this.E0 + Math.exp(this.D0 * doubleValue) * this.C0 + this.G0;
    }
}
