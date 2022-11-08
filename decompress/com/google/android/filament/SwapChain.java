// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class SwapChain
{
    public static final long CONFIG_DEFAULT = 0L;
    public static final long CONFIG_ENABLE_XCB = 4L;
    public static final long CONFIG_READABLE = 2L;
    public static final long CONFIG_TRANSPARENT = 1L;
    private long mNativeObject;
    private final Object mSurface;
    
    public SwapChain(final long mNativeObject, final Object mSurface) {
        this.mNativeObject = mNativeObject;
        this.mSurface = mSurface;
    }
    
    private static native void nSetFrameCompletedCallback(final long p0, final Object p1, final Runnable p2);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed SwapChain");
    }
    
    public Object getNativeWindow() {
        return this.mSurface;
    }
    
    public void setFrameCompletedCallback(final Object o, final Runnable runnable) {
        nSetFrameCompletedCallback(this.getNativeObject(), o, runnable);
    }
}
