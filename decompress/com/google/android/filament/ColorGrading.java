// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class ColorGrading
{
    public long mNativeObject;
    
    public ColorGrading(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderChannelMixer(final long p0, final float[] p1, final float[] p2, final float[] p3);
    
    private static native void nBuilderContrast(final long p0, final float p1);
    
    private static native void nBuilderCurves(final long p0, final float[] p1, final float[] p2, final float[] p3);
    
    private static native void nBuilderDimensions(final long p0, final int p1);
    
    private static native void nBuilderExposure(final long p0, final float p1);
    
    private static native void nBuilderFormat(final long p0, final int p1);
    
    private static native void nBuilderGamutMapping(final long p0, final boolean p1);
    
    private static native void nBuilderLuminanceScaling(final long p0, final boolean p1);
    
    private static native void nBuilderNightAdaptation(final long p0, final float p1);
    
    private static native void nBuilderQuality(final long p0, final int p1);
    
    private static native void nBuilderSaturation(final long p0, final float p1);
    
    private static native void nBuilderShadowsMidtonesHighlights(final long p0, final float[] p1, final float[] p2, final float[] p3, final float[] p4);
    
    private static native void nBuilderSlopeOffsetPower(final long p0, final float[] p1, final float[] p2, final float[] p3);
    
    private static native void nBuilderToneMapper(final long p0, final long p1);
    
    private static native void nBuilderToneMapping(final long p0, final int p1);
    
    private static native void nBuilderVibrance(final long p0, final float p1);
    
    private static native void nBuilderWhiteBalance(final long p0, final float p1, final float p2);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed ColorGrading");
    }
    
    public enum ToneMapping
    {
        ACES, 
        ACES_LEGACY, 
        DISPLAY_RANGE, 
        FILMIC, 
        LINEAR;
    }
}
