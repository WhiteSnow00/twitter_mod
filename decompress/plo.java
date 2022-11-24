import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plo extends Drawable
{
    public static final double a;
    
    static {
        a = Math.cos(Math.toRadians(45.0));
    }
    
    public static float a(final float n, final float n2, final boolean b) {
        float n3 = n;
        if (b) {
            n3 = (float)((1.0 - plo.a) * n2 + n);
        }
        return n3;
    }
    
    public static float b(final float n, final float n2, final boolean b) {
        if (b) {
            return (float)((1.0 - plo.a) * n2 + n * 1.5f);
        }
        return n * 1.5f;
    }
}
