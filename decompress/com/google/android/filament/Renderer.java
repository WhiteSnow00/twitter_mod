// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;
import java.nio.Buffer;

public class Renderer
{
    public static final int MIRROR_FRAME_FLAG_CLEAR = 4;
    public static final int MIRROR_FRAME_FLAG_COMMIT = 1;
    public static final int MIRROR_FRAME_FLAG_SET_PRESENTATION_TIME = 2;
    private ClearOptions mClearOptions;
    private DisplayInfo mDisplayInfo;
    private final Engine mEngine;
    private FrameRateOptions mFrameRateOptions;
    private long mNativeObject;
    
    public Renderer(final Engine mEngine, final long mNativeObject) {
        this.mEngine = mEngine;
        this.mNativeObject = mNativeObject;
    }
    
    private static native boolean nBeginFrame(final long p0, final long p1, final long p2);
    
    private static native void nCopyFrame(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10);
    
    private static native void nEndFrame(final long p0);
    
    private static native double nGetUserTime(final long p0);
    
    private static native int nReadPixels(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final Buffer p6, final int p7, final int p8, final int p9, final int p10, final int p11, final int p12, final int p13, final Object p14, final Runnable p15);
    
    private static native int nReadPixelsEx(final long p0, final long p1, final long p2, final int p3, final int p4, final int p5, final int p6, final Buffer p7, final int p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int p14, final Object p15, final Runnable p16);
    
    private static native void nRender(final long p0, final long p1);
    
    private static native void nRenderStandaloneView(final long p0, final long p1);
    
    private static native void nResetUserTime(final long p0);
    
    private static native void nSetClearOptions(final long p0, final float p1, final float p2, final float p3, final float p4, final boolean p5, final boolean p6);
    
    private static native void nSetDisplayInfo(final long p0, final float p1, final long p2, final long p3);
    
    private static native void nSetFrameRateOptions(final long p0, final float p1, final float p2, final float p3, final int p4);
    
    public boolean beginFrame(final SwapChain swapChain, final long n) {
        return nBeginFrame(this.getNativeObject(), swapChain.getNativeObject(), n);
    }
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public void copyFrame(final SwapChain swapChain, final Viewport viewport, final Viewport viewport2, final int n) {
        nCopyFrame(this.getNativeObject(), swapChain.getNativeObject(), viewport.left, viewport.bottom, viewport.width, viewport.height, viewport2.left, viewport2.bottom, viewport2.width, viewport2.height, n);
    }
    
    public void endFrame() {
        nEndFrame(this.getNativeObject());
    }
    
    public ClearOptions getClearOptions() {
        if (this.mClearOptions == null) {
            this.mClearOptions = new ClearOptions();
        }
        return this.mClearOptions;
    }
    
    public DisplayInfo getDisplayInfo() {
        if (this.mDisplayInfo == null) {
            this.mDisplayInfo = new DisplayInfo();
        }
        return this.mDisplayInfo;
    }
    
    public Engine getEngine() {
        return this.mEngine;
    }
    
    public FrameRateOptions getFrameRateOptions() {
        if (this.mFrameRateOptions == null) {
            this.mFrameRateOptions = new FrameRateOptions();
        }
        return this.mFrameRateOptions;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed Renderer");
    }
    
    public double getUserTime() {
        return nGetUserTime(this.getNativeObject());
    }
    
    @Deprecated
    public void mirrorFrame(final SwapChain swapChain, final Viewport viewport, final Viewport viewport2, final int n) {
        this.copyFrame(swapChain, viewport, viewport2, n);
    }
    
    public void readPixels(final int n, final int n2, final int n3, final int n4, final Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        if (pixelBufferDescriptor.storage.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        final long nativeObject = this.getNativeObject();
        final long nativeObject2 = this.mEngine.getNativeObject();
        final Buffer storage = pixelBufferDescriptor.storage;
        if (nReadPixels(nativeObject, nativeObject2, n, n2, n3, n4, storage, storage.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, ((Enum)pixelBufferDescriptor.type).ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }
    
    public void readPixels(final RenderTarget renderTarget, final int n, final int n2, final int n3, final int n4, final Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        if (pixelBufferDescriptor.storage.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        final long nativeObject = this.getNativeObject();
        final long nativeObject2 = this.mEngine.getNativeObject();
        final long nativeObject3 = renderTarget.getNativeObject();
        final Buffer storage = pixelBufferDescriptor.storage;
        if (nReadPixelsEx(nativeObject, nativeObject2, nativeObject3, n, n2, n3, n4, storage, storage.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, ((Enum)pixelBufferDescriptor.type).ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }
    
    public void render(final View view) {
        nRender(this.getNativeObject(), view.getNativeObject());
    }
    
    public void renderStandaloneView(final View view) {
        nRenderStandaloneView(this.getNativeObject(), view.getNativeObject());
    }
    
    public void resetUserTime() {
        nResetUserTime(this.getNativeObject());
    }
    
    public void setClearOptions(final ClearOptions mClearOptions) {
        this.mClearOptions = mClearOptions;
        final long nativeObject = this.getNativeObject();
        final float[] clearColor = mClearOptions.clearColor;
        nSetClearOptions(nativeObject, clearColor[0], clearColor[1], clearColor[2], clearColor[3], mClearOptions.clear, mClearOptions.discard);
    }
    
    public void setDisplayInfo(final DisplayInfo mDisplayInfo) {
        this.mDisplayInfo = mDisplayInfo;
        nSetDisplayInfo(this.getNativeObject(), mDisplayInfo.refreshRate, mDisplayInfo.presentationDeadlineNanos, mDisplayInfo.vsyncOffsetNanos);
    }
    
    public void setFrameRateOptions(final FrameRateOptions mFrameRateOptions) {
        this.mFrameRateOptions = mFrameRateOptions;
        nSetFrameRateOptions(this.getNativeObject(), mFrameRateOptions.interval, mFrameRateOptions.headRoomRatio, mFrameRateOptions.scaleRate, mFrameRateOptions.history);
    }
    
    public static class ClearOptions
    {
        public boolean clear;
        public float[] clearColor;
        public boolean discard;
        
        public ClearOptions() {
            this.clearColor = new float[] { 0.0f, 0.0f, 0.0f, 0.0f };
            this.clear = false;
            this.discard = true;
        }
    }
    
    public static class DisplayInfo
    {
        public long presentationDeadlineNanos;
        public float refreshRate;
        public long vsyncOffsetNanos;
        
        public DisplayInfo() {
            this.refreshRate = 60.0f;
            this.presentationDeadlineNanos = 0L;
            this.vsyncOffsetNanos = 0L;
        }
    }
    
    public static class FrameRateOptions
    {
        public float headRoomRatio;
        public int history;
        public float interval;
        public float scaleRate;
        
        public FrameRateOptions() {
            this.interval = 0.016666668f;
            this.headRoomRatio = 0.0f;
            this.scaleRate = 0.06666667f;
            this.history = 15;
        }
    }
}
