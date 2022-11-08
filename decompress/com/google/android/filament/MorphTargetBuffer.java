// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.nio.BufferOverflowException;

public class MorphTargetBuffer
{
    private long mNativeObject;
    
    private MorphTargetBuffer(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderCount(final long p0, final int p1);
    
    private static native void nBuilderVertexCount(final long p0, final int p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native int nGetCount(final long p0);
    
    private static native int nGetVertexCount(final long p0);
    
    private static native int nSetPositionsAt(final long p0, final long p1, final int p2, final float[] p3, final int p4);
    
    private static native int nSetTangentsAt(final long p0, final long p1, final int p2, final short[] p3, final int p4);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public int getCount() {
        return nGetCount(this.mNativeObject);
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed MorphTargetBuffer");
    }
    
    public int getVertexCount() {
        return nGetVertexCount(this.mNativeObject);
    }
    
    public void setPositionsAt(final Engine engine, final int n, final float[] array, final int n2) {
        if (nSetPositionsAt(this.mNativeObject, engine.getNativeObject(), n, array, n2) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }
    
    public void setTangentsAt(final Engine engine, final int n, final short[] array, final int n2) {
        if (nSetTangentsAt(this.mNativeObject, engine.getNativeObject(), n, array, n2) >= 0) {
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
        
        public MorphTargetBuffer build(final Engine engine) {
            final long access$300 = nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$300 != 0L) {
                return new MorphTargetBuffer(access$300, null);
            }
            throw new IllegalStateException("Couldn't create MorphTargetBuffer");
        }
        
        public Builder count(final int n) {
            nBuilderCount(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder vertexCount(final int n) {
            nBuilderVertexCount(this.mNativeBuilder, n);
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
