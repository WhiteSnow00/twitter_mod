import android.graphics.Path$FillType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsp implements zm6
{
    public final boolean a;
    public final Path$FillType b;
    public final String c;
    public final e80 d;
    public final h80 e;
    public final boolean f;
    
    public gsp(final String c, final boolean a, final Path$FillType b, final e80 d, final h80 e, final boolean f) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final wl6 a(final ceg ceg, final ym1 ym1) {
        return (wl6)new wya(ceg, ym1, this);
    }
    
    @Override
    public final String toString() {
        return d10.D(ehk.f("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
