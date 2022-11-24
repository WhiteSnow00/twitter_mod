import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psp implements zm6
{
    public final String a;
    public final f80 b;
    public final List<f80> c;
    public final e80 d;
    public final h80 e;
    public final f80 f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;
    
    public psp(final String a, final f80 b, final List<f80> c, final e80 d, final h80 e, final f80 f, final Object g, final Object h, final float i, final boolean j) {
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
    
    @Override
    public final wl6 a(final ceg ceg, final ym1 ym1) {
        return (wl6)new hmr(ceg, ym1, this);
    }
}
