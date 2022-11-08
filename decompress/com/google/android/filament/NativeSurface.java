// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class NativeSurface
{
    private final int mHeight;
    private final long mNativeObject;
    private final int mWidth;
    
    public NativeSurface(final int mWidth, final int mHeight) {
        this.mWidth = mWidth;
        this.mHeight = mHeight;
        this.mNativeObject = nCreateSurface(mWidth, mHeight);
    }
    
    private static native long nCreateSurface(final int p0, final int p1);
    
    private static native void nDestroySurface(final long p0);
    
    public void dispose() {
        nDestroySurface(this.mNativeObject);
    }
    
    public int getHeight() {
        return this.mHeight;
    }
    
    public long getNativeObject() {
        return this.mNativeObject;
    }
    
    public int getWidth() {
        return this.mWidth;
    }
}
