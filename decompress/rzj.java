import android.graphics.Path;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rzj extends dre<PointF>
{
    public Path q;
    public final dre<PointF> r;
    
    public rzj(final adg adg, final dre<PointF> r) {
        super(adg, r.b, r.c, r.d, r.e, r.f, r.g, r.h);
        this.r = r;
        this.d();
    }
    
    public final void d() {
        final T c = (T)super.c;
        boolean b2 = false;
        Label_0058: {
            if (c != null) {
                final T b = (T)super.b;
                if (b != null && ((PointF)b).equals(((PointF)c).x, ((PointF)c).y)) {
                    b2 = true;
                    break Label_0058;
                }
            }
            b2 = false;
        }
        final T b3 = (T)super.b;
        if (b3 != null) {
            final T c2 = (T)super.c;
            if (c2 != null && !b2) {
                final PointF pointF = (PointF)b3;
                final PointF pointF2 = (PointF)c2;
                final dre<PointF> r = this.r;
                final PointF o = r.o;
                final PointF p = r.p;
                final hnw$a a = hnw.a;
                final Path q = new Path();
                q.moveTo(pointF.x, pointF.y);
                if (o != null && p != null && (o.length() != 0.0f || p.length() != 0.0f)) {
                    final float x = pointF.x;
                    final float x2 = o.x;
                    final float y = pointF.y;
                    final float y2 = o.y;
                    final float x3 = pointF2.x;
                    final float x4 = p.x;
                    final float y3 = pointF2.y;
                    q.cubicTo(x2 + x, y + y2, x3 + x4, y3 + p.y, x3, y3);
                }
                else {
                    q.lineTo(pointF2.x, pointF2.y);
                }
                this.q = q;
            }
        }
    }
}
