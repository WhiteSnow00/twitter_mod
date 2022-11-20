// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.BufferOverflowException;
import java.nio.Buffer;

public class BufferObject
{
    private long mNativeObject;
    
    private BufferObject(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    public BufferObject(final long n, final BufferObject$1 object) {
        this(n);
    }
    
    public static long access$000() {
        return nCreateBuilder();
    }
    
    public static void access$100(final long n, final int n2) {
        nBuilderSize(n, n2);
    }
    
    public static void access$200(final long n, final int n2) {
        nBuilderBindingType(n, n2);
    }
    
    public static long access$300(final long n, final long n2) {
        return nBuilderBuild(n, n2);
    }
    
    public static void access$500(final long n) {
        nDestroyBuilder(n);
    }
    
    private static native void nBuilderBindingType(final long p0, final int p1);
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderSize(final long p0, final int p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native int nGetByteCount(final long p0);
    
    private static native int nSetBuffer(final long p0, final long p1, final Buffer p2, final int p3, final int p4, final int p5, final Object p6, final Runnable p7);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public int getByteCount() {
        return nGetByteCount(this.getNativeObject());
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed BufferObject");
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
            final long access$000 = BufferObject.access$000();
            this.mNativeBuilder = access$000;
            this.mFinalizer = new BuilderFinalizer(access$000);
        }
        
        public Builder bindingType(final BindingType bindingType) {
            BufferObject.access$200(this.mNativeBuilder, bindingType.ordinal());
            return this;
        }
        
        public BufferObject build(final Engine engine) {
            final long access$300 = BufferObject.access$300(this.mNativeBuilder, engine.getNativeObject());
            if (access$300 != 0L) {
                return new BufferObject(access$300, null);
            }
            throw new IllegalStateException("Couldn't create BufferObject");
        }
        
        public Builder size(final int n) {
            BufferObject.access$100(this.mNativeBuilder, n);
            return this;
        }
        
        public enum BindingType
        {
            private static final BindingType[] $VALUES;
            
            VERTEX;
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
                        BufferObject.access$500(this.mNativeObject);
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
