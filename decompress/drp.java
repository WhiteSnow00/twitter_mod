import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drp implements nm6
{
    public final String a;
    public final g80 b;
    public final List<g80> c;
    public final f80 d;
    public final i80 e;
    public final g80 f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;
    
    public drp(final String a, final g80 b, final List<g80> c, final f80 d, final i80 e, final g80 f, final Object g, final Object h, final float i, final boolean j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (int)g;
        this.h = (int)h;
        this.i = i;
        this.j = j;
    }
    
    public final jl6 a(final sdg sdg, final ym1 ym1) {
        return (jl6)new rkr(sdg, ym1, this);
    }
}
