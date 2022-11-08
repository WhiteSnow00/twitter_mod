import android.animation.TypeEvaluator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gs0 implements TypeEvaluator<Integer>
{
    public static final gs0 a;
    
    static {
        a = new gs0();
    }
    
    public final Integer a(float d, final Integer n, final Integer n2) {
        final int intValue = n;
        final float n3 = (intValue >> 24 & 0xFF) / 255.0f;
        final float n4 = (intValue >> 16 & 0xFF) / 255.0f;
        final float n5 = (intValue >> 8 & 0xFF) / 255.0f;
        final float n6 = (intValue & 0xFF) / 255.0f;
        final int intValue2 = n2;
        final float n7 = (intValue2 >> 24 & 0xFF) / 255.0f;
        final float n8 = (intValue2 >> 16 & 0xFF) / 255.0f;
        final float n9 = (intValue2 >> 8 & 0xFF) / 255.0f;
        final float n10 = (intValue2 & 0xFF) / 255.0f;
        final float n11 = (float)Math.pow(n4, 2.2);
        final float n12 = (float)Math.pow(n5, 2.2);
        final float n13 = (float)Math.pow(n6, 2.2);
        final float n14 = (float)Math.pow(n8, 2.2);
        final float n15 = (float)Math.pow(n9, 2.2);
        final float n16 = (float)Math.pow(n10, 2.2);
        final float d2 = xk0.d(n7, n3, d, n3);
        final float d3 = xk0.d(n14, n11, d, n11);
        final float d4 = xk0.d(n15, n12, d, n12);
        d = xk0.d(n16, n13, d, n13);
        final float n17 = (float)Math.pow(d3, 0.45454545454545453);
        final float n18 = (float)Math.pow(d4, 0.45454545454545453);
        d = (float)Math.pow(d, 0.45454545454545453);
        return Math.round(d * 255.0f) | (Math.round(n17 * 255.0f) << 16 | Math.round(d2 * 255.0f) << 24 | Math.round(n18 * 255.0f) << 8);
    }
}
