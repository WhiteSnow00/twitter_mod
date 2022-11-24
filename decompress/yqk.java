import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqk implements zm6
{
    public final String a;
    public final int b;
    public final f80 c;
    public final u80<PointF, PointF> d;
    public final f80 e;
    public final f80 f;
    public final f80 g;
    public final f80 h;
    public final f80 i;
    public final boolean j;
    
    public yqk(final String a, final Object b, final f80 c, final u80<PointF, PointF> d, final f80 e, final f80 f, final f80 g, final f80 h, final f80 i, final boolean j) {
        this.a = a;
        this.b = (int)b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final wl6 a(final ceg ceg, final ym1 ym1) {
        return (wl6)new xqk(ceg, ym1, this);
    }
}
