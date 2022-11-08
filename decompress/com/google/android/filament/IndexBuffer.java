// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.BufferOverflowException;
import java.nio.Buffer;

public class IndexBuffer
{
    private long mNativeObject;
    
    private IndexBuffer(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native void nBuilderBufferType(final long p0, final int p1);
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderIndexCount(final long p0, final int p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native int nGetIndexCount(final long p0);
    
    private static native int nSetBuffer(final long p0, final long p1, final Buffer p2, final int p3, final int p4, final int p5, final Object p6, final Runnable p7);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public int getIndexCount() {
        return nGetIndexCount(this.getNativeObject());
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }
    
    public void setBuffer(final Engine engine, final Buffer buffer) {
        this.setBuffer(engine, buffer, 0, 0, null, null);
    }
    
    public void setBuffer(final Engine engine, final Buffer buffer, final int n, final int n2) {
        this.setBuffer(engine, buffer, n, n2, null, null);
    }
    
    public void setBuffer(final Engine engine, final Buffer buffer, final int n, int remaining, final Object o, final Runnable runnable) {
        final long nativeObject = this.getNativeObject();
        final long nativeObject2 = engine.getNativeObject();
        final int remaining2 = buffer.remaining();
        if (remaining == 0) {
            remaining = buffer.remaining();
        }
        if (nSetBuffer(nativeObject, nativeObject2, buffer, remaining2, n, remaining, o, runnable) >= 0) {
            return;
        }
        throw new BufferOverflowException();
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
        
        public Builder bufferType(final IndexType indexType) {
            nBuilderBufferType(this.mNativeBuilder, indexType.ordinal());
            return this;
        }
        
        public IndexBuffer build(final Engine engine) {
            final long access$300 = nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$300 != 0L) {
                return new IndexBuffer(access$300, null);
            }
            throw new IllegalStateException("Couldn't create IndexBuffer");
        }
        
        public Builder indexCount(final int n) {
            nBuilderIndexCount(this.mNativeBuilder, n);
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
        
        public enum IndexType
        {
            UINT, 
            USHORT;
        }
    }
}
