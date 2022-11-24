// 
// Decompiled by Procyon v0.6.0
// 

public final class x3f implements rtb
{
    public final y3f F0;
    public final String G0;
    public final String H0;
    
    public x3f(final y3f f0, final String g0, final String h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final Object apply(final Object o) {
        final y3f f0 = this.F0;
        final String g0 = this.G0;
        final String h0 = this.H0;
        final Long n = (Long)o;
        return f0.g(g0, h0);
    }
}
