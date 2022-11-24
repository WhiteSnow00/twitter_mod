import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jdg implements Interpolator
{
    public final float[] a;
    public final float b;
    
    public jdg(final float[] a) {
        this.a = a;
        this.b = 1.0f / (a.length - 1);
    }
    
    public final float getInterpolation(float h) {
        if (h >= 1.0f) {
            return 1.0f;
        }
        if (h <= 0.0f) {
            return 0.0f;
        }
        final float[] a = this.a;
        final int min = Math.min((int)((a.length - 1) * h), a.length - 2);
        final float n = (float)min;
        final float b = this.b;
        h = j98.h(n, b, h, b);
        final float[] a2 = this.a;
        return va.d(a2[min + 1], a2[min], h, a2[min]);
    }
}
