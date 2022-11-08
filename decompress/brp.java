// 
// Decompiled by Procyon v0.6.0
// 

public final class brp implements nm6
{
    public final String a;
    public final int b;
    public final p80 c;
    public final boolean d;
    
    public brp(final String a, final int b, final p80 c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final jl6 a(final sdg sdg, final ym1 ym1) {
        return (jl6)new rqp(sdg, ym1, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ShapePath{name=");
        g.append(this.a);
        g.append(", index=");
        return y70.y(g, this.b, '}');
    }
}
