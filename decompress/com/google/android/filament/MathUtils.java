// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public final class MathUtils
{
    private MathUtils() {
    }
    
    private static native void nPackTangentFrame(final float p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6, final float p7, final float p8, final float[] p9, final int p10);
    
    public static void packTangentFrame(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float[] array) {
        nPackTangentFrame(n, n2, n3, n4, n5, n6, n7, n8, n9, array, 0);
    }
    
    public static void packTangentFrame(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float[] array, final int n10) {
        nPackTangentFrame(n, n2, n3, n4, n5, n6, n7, n8, n9, array, n10);
    }
}
