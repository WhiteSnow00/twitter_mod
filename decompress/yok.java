import java.util.List;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yok extends ere<PointF>
{
    public final PointF i;
    
    public yok(final List<dre<PointF>> list) {
        super(list);
        this.i = new PointF();
    }
    
    @Override
    public final Object g(final dre dre, final float n) {
        return this.l(dre, n, n, n);
    }
    
    @Override
    public final /* bridge */ Object h(final dre dre, final float n, final float n2, final float n3) {
        return this.l(dre, n, n2, n3);
    }
    
    public final PointF l(final dre<PointF> dre, float n, float e, final float n2) {
        final PointF b = dre.b;
        if (b != null) {
            final PointF c = dre.c;
            if (c != null) {
                final PointF pointF = b;
                final PointF pointF2 = c;
                final ydg e2 = super.e;
                if (e2 != null) {
                    dre.h.floatValue();
                    this.e();
                    final PointF pointF3 = (PointF)e2.d(pointF, pointF2);
                    if (pointF3 != null) {
                        return pointF3;
                    }
                }
                final PointF i = this.i;
                n = pointF.x;
                e = k6e.e(pointF2.x, n, e, n);
                n = pointF.y;
                i.set(e, (pointF2.y - n) * n2 + n);
                return this.i;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
