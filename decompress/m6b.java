import android.graphics.PointF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m6b extends ere<Float>
{
    public m6b(final List<dre<Float>> list) {
        super(list);
    }
    
    @Override
    public final Object g(final dre dre, final float n) {
        return this.m(dre, n);
    }
    
    public final float l() {
        return this.m(((rm1<Float, A>)this).b(), this.d());
    }
    
    public final float m(final dre<Float> dre, final float n) {
        if (dre.b != null && dre.c != null) {
            final ydg e = super.e;
            if (e != null) {
                dre.h.floatValue();
                final Float b = dre.b;
                final Float c = dre.c;
                this.e();
                final Float n2 = (Float)e.d(b, c);
                if (n2 != null) {
                    return n2;
                }
            }
            if (dre.i == -3987645.8f) {
                dre.i = dre.b;
            }
            final float i = dre.i;
            if (dre.j == -3987645.8f) {
                dre.j = dre.c;
            }
            final float j = dre.j;
            final PointF a = lbh.a;
            return k6e.e(j, i, n, i);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
