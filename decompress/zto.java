import android.graphics.PointF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zto extends sre<cuo>
{
    public final cuo i;
    
    public zto(final List<rre<cuo>> list) {
        super(list);
        this.i = new cuo();
    }
    
    public final Object g(final rre rre, float d) {
        final Object b = rre.b;
        if (b != null) {
            final Object c = rre.c;
            if (c != null) {
                final cuo cuo = (cuo)b;
                final cuo cuo2 = (cuo)c;
                final ieg e = super.e;
                if (e != null) {
                    rre.h.floatValue();
                    this.e();
                    final cuo i = (cuo)e.d((Object)cuo, (Object)cuo2);
                    if (i != null) {
                        return i;
                    }
                }
                final cuo i = this.i;
                final float a = cuo.a;
                final float a2 = cuo2.a;
                final PointF a3 = jbh.a;
                final float d2 = xk0.d(a2, a, d, a);
                final float b2 = cuo.b;
                d = xk0.d(cuo2.b, b2, d, b2);
                i.a = d2;
                i.b = d;
                return i;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
