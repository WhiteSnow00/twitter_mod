import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6c implements zm6
{
    public final String a;
    public final int b;
    public final g80 c;
    public final h80 d;
    public final l80 e;
    public final l80 f;
    public final f80 g;
    public final int h;
    public final int i;
    public final float j;
    public final List<f80> k;
    public final f80 l;
    public final boolean m;
    
    public z6c(final String a, final Object b, final g80 c, final h80 d, final l80 e, final l80 f, final f80 g, final Object h, final Object i, final float j, final List<f80> k, final f80 l, final boolean m) {
        this.a = a;
        this.b = (int)b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = (int)h;
        this.i = (int)i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    @Override
    public final wl6 a(final ceg ceg, final ym1 ym1) {
        return (wl6)new a7c(ceg, ym1, this);
    }
}
