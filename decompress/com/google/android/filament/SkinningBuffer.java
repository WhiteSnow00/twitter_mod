// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.BufferOverflowException;
import java.nio.Buffer;

public class SkinningBuffer
{
    private long mNativeObject;
    
    private SkinningBuffer(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native void nBuilderBoneCount(final long p0, final int p1);
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderInitialize(final long p0, final boolean p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native int nGetBoneCount(final long p0);
    
    private static native int nSetBonesAsMatrices(final long p0, final long p1, final Buffer p2, final int p3, final int p4, final int p5);
    
    private static native int nSetBonesAsQuaternions(final long p0, final long p1, final Buffer p2, final int p3, final int p4, final int p5);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public int getBoneCount() {
        return nGetBoneCount(this.mNativeObject);
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }
    
    public void setBonesAsMatrices(final Engine engine, final Buffer buffer, final int n, final int n2) {
        if (nSetBonesAsMatrices(this.mNativeObject, engine.getNativeObject(), buffer, buffer.remaining(), n, n2) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }
    
    public void setBonesAsQuaternions(final Engine engine, final Buffer buffer, final int n, final int n2) {
        if (nSetBonesAsQuaternions(this.mNativeObject, engine.getNativeObject(), buffer, buffer.remaining(), n, n2) >= 0) {
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
        
        public Builder boneCount(final int n) {
            nBuilderBoneCount(this.mNativeBuilder, n);
            return this;
        }
        
        public SkinningBuffer build(final Engine engine) {
            final long access$300 = nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$300 != 0L) {
                return new SkinningBuffer(access$300, null);
            }
            throw new IllegalStateException("Couldn't create SkinningBuffer");
        }
        
        public Builder initialize(final boolean b) {
            nBuilderInitialize(this.mNativeBuilder, b);
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
}
