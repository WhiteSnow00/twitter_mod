import android.graphics.PointF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7b extends ase<Float>
{
    public o7b(final List<zre<Float>> list) {
        super((List)list);
    }
    
    public final Object g(final zre zre, final float n) {
        return this.m(zre, n);
    }
    
    public final float l() {
        return this.m(((wm1)this).b(), ((wm1)this).d());
    }
    
    public final float m(final zre<Float> zre, final float n) {
        if (zre.b != null && zre.c != null) {
            final seg e = ((wm1)this).e;
            if (e != null) {
                zre.h.floatValue();
                final Float b = zre.b;
                final Float c = zre.c;
                ((wm1)this).e();
                final Float n2 = (Float)e.d(b, c);
                if (n2 != null) {
                    return n2;
                }
            }
            if (zre.i == -3987645.8f) {
                zre.i = zre.b;
            }
            final float i = zre.i;
            if (zre.j == -3987645.8f) {
                zre.j = zre.c;
            }
            final float j = zre.j;
            final PointF a = bch.a;
            return va.d(j, i, n, i);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
