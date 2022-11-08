// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;
import java.nio.Buffer;

public class Stream
{
    private static final StreamType[] sStreamTypeValues;
    private long mNativeEngine;
    private long mNativeObject;
    
    static {
        sStreamTypeValues = StreamType.values();
    }
    
    public Stream(final long mNativeObject, final Engine engine) {
        this.mNativeObject = mNativeObject;
        this.mNativeEngine = engine.getNativeObject();
    }
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderHeight(final long p0, final int p1);
    
    private static native void nBuilderStream(final long p0, final long p1);
    
    private static native void nBuilderStreamSource(final long p0, final Object p1);
    
    private static native void nBuilderWidth(final long p0, final int p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native int nGetStreamType(final long p0);
    
    private static native long nGetTimestamp(final long p0);
    
    private static native int nReadPixels(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final Buffer p6, final int p7, final int p8, final int p9, final int p10, final int p11, final int p12, final int p13, final Object p14, final Runnable p15);
    
    private static native void nSetAcquiredImage(final long p0, final long p1, final Object p2, final Object p3, final Runnable p4);
    
    private static native void nSetDimensions(final long p0, final int p1, final int p2);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed Stream");
    }
    
    public StreamType getStreamType() {
        return Stream.sStreamTypeValues[nGetStreamType(this.getNativeObject())];
    }
    
    public long getTimestamp() {
        return nGetTimestamp(this.getNativeObject());
    }
    
    public void readPixels(final int n, final int n2, final int n3, final int n4, final Texture.PixelBufferDescriptor pixelBufferDescriptor) {
        if (pixelBufferDescriptor.storage.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        final long nativeObject = this.getNativeObject();
        final long mNativeEngine = this.mNativeEngine;
        final Buffer storage = pixelBufferDescriptor.storage;
        if (nReadPixels(nativeObject, mNativeEngine, n, n2, n3, n4, storage, storage.remaining(), pixelBufferDescriptor.left, pixelBufferDescriptor.top, ((Enum)pixelBufferDescriptor.type).ordinal(), pixelBufferDescriptor.alignment, pixelBufferDescriptor.stride, pixelBufferDescriptor.format.ordinal(), pixelBufferDescriptor.handler, pixelBufferDescriptor.callback) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }
    
    public void setAcquiredImage(final Object o, final Object o2, final Runnable runnable) {
        nSetAcquiredImage(this.getNativeObject(), this.mNativeEngine, o, o2, runnable);
    }
    
    public void setDimensions(final int n, final int n2) {
        nSetDimensions(this.getNativeObject(), n, n2);
    }
    
    public static class Builder
    {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        
        public Builder() {
            final long access$000 = nCreateBuilder();
            this.mNativeBuilder = access$000;
            this.mFinalizer = new BuilderFinalizer(access$000);
        }
        
        public Stream build(final Engine engine) {
            final long access$500 = nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$500 != 0L) {
                return new Stream(access$500, engine);
            }
            throw new IllegalStateException("Couldn't create Stream");
        }
        
        public Builder height(final int n) {
            nBuilderHeight(this.mNativeBuilder, n);
            return this;
        }
        
        @Deprecated
        public Builder stream(final long n) {
            nBuilderStream(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder stream(final Object o) {
            if (Platform.get().validateStreamSource(o)) {
                nBuilderStreamSource(this.mNativeBuilder, o);
                return this;
            }
            throw new IllegalArgumentException(t4a.j("Invalid stream source: ", o));
        }
        
        public Builder width(final int n) {
            nBuilderWidth(this.mNativeBuilder, n);
            return this;
        }
        
        public static class BuilderFinalizer
        {
            private final long mNativeObject;
            
            public BuilderFinalizer(final long mNativeObject) {
                this.mNativeObject = mNativeObject;
            }
            
            public void finalize() {
                while (true) {
                    try {
                        super.finalize();
                        nDestroyBuilder(this.mNativeObject);
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public enum StreamType
    {
        ACQUIRED, 
        NATIVE, 
        TEXTURE_ID;
    }
}
