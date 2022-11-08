// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class Fence
{
    public static final long WAIT_FOR_EVER = -1L;
    private long mNativeObject;
    
    public Fence(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native int nWait(final long p0, final int p1, final long p2);
    
    private static native int nWaitAndDestroy(final long p0, final int p1);
    
    public static FenceStatus waitAndDestroy(final Fence fence, final Mode mode) {
        final int nWaitAndDestroy = nWaitAndDestroy(fence.getNativeObject(), mode.ordinal());
        if (nWaitAndDestroy == -1) {
            return FenceStatus.ERROR;
        }
        if (nWaitAndDestroy != 0) {
            return FenceStatus.ERROR;
        }
        return FenceStatus.CONDITION_SATISFIED;
    }
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed Fence");
    }
    
    public FenceStatus wait(final Mode mode, final long n) {
        final int nWait = nWait(this.getNativeObject(), mode.ordinal(), n);
        if (nWait == -1) {
            return FenceStatus.ERROR;
        }
        if (nWait == 0) {
            return FenceStatus.CONDITION_SATISFIED;
        }
        if (nWait != 1) {
            return FenceStatus.ERROR;
        }
        return FenceStatus.TIMEOUT_EXPIRED;
    }
    
    public enum FenceStatus
    {
        CONDITION_SATISFIED, 
        ERROR, 
        TIMEOUT_EXPIRED;
    }
    
    public enum Mode
    {
        DONT_FLUSH, 
        FLUSH;
    }
}
