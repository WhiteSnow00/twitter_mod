import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqp implements nm6
{
    public final String a;
    public final List<nm6> b;
    public final boolean c;
    
    public wqp(final String a, final List<nm6> b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final jl6 a(final sdg sdg, final ym1 ym1) {
        return (jl6)new tl6(sdg, ym1, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ShapeGroup{name='");
        g.append(this.a);
        g.append("' Shapes: ");
        g.append(Arrays.toString(this.b.toArray()));
        g.append('}');
        return g.toString();
    }
}
