import java.util.List;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpk extends ase<PointF>
{
    public final PointF i;
    
    public kpk(final List<zre<PointF>> list) {
        super((List)list);
        this.i = new PointF();
    }
    
    public final Object g(final zre zre, final float n) {
        return this.l(zre, n, n, n);
    }
    
    public final /* bridge */ Object h(final zre zre, final float n, final float n2, final float n3) {
        return this.l(zre, n, n2, n3);
    }
    
    public final PointF l(final zre<PointF> zre, float n, float d, final float n2) {
        final PointF b = zre.b;
        if (b != null) {
            final PointF c = zre.c;
            if (c != null) {
                final PointF pointF = b;
                final PointF pointF2 = c;
                final seg e = ((wm1)this).e;
                if (e != null) {
                    zre.h.floatValue();
                    ((wm1)this).e();
                    final PointF pointF3 = (PointF)e.d(pointF, pointF2);
                    if (pointF3 != null) {
                        return pointF3;
                    }
                }
                final PointF i = this.i;
                n = pointF.x;
                d = va.d(pointF2.x, n, d, n);
                n = pointF.y;
                i.set(d, (pointF2.y - n) * n2 + n);
                return this.i;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
