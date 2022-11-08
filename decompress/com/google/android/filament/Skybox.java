// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class Skybox
{
    private long mNativeObject;
    
    public Skybox(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderColor(final long p0, final float p1, final float p2, final float p3, final float p4);
    
    private static native void nBuilderEnvironment(final long p0, final long p1);
    
    private static native void nBuilderIntensity(final long p0, final float p1);
    
    private static native void nBuilderShowSun(final long p0, final boolean p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native float nGetIntensity(final long p0);
    
    private static native int nGetLayerMask(final long p0);
    
    private static native long nGetTexture(final long p0);
    
    private static native void nSetColor(final long p0, final float p1, final float p2, final float p3, final float p4);
    
    private static native void nSetLayerMask(final long p0, final int p1, final int p2);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public float getIntensity() {
        return nGetIntensity(this.getNativeObject());
    }
    
    public int getLayerMask() {
        return nGetLayerMask(this.getNativeObject());
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed Skybox");
    }
    
    public Texture getTexture() {
        final long nGetTexture = nGetTexture(this.getNativeObject());
        Texture texture;
        if (nGetTexture == 0L) {
            texture = null;
        }
        else {
            texture = new Texture(nGetTexture);
        }
        return texture;
    }
    
    public void setColor(final float n, final float n2, final float n3, final float n4) {
        nSetColor(this.getNativeObject(), n, n2, n3, n4);
    }
    
    public void setColor(final float[] array) {
        nSetColor(this.getNativeObject(), array[0], array[1], array[2], array[3]);
    }
    
    public void setLayerMask(final int n, final int n2) {
        nSetLayerMask(this.getNativeObject(), n & 0xFF, n2 & 0xFF);
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
        
        public Skybox build(final Engine engine) {
            final long access$500 = nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$500 != 0L) {
                return new Skybox(access$500);
            }
            throw new IllegalStateException("Couldn't create Skybox");
        }
        
        public Builder color(final float n, final float n2, final float n3, final float n4) {
            nBuilderColor(this.mNativeBuilder, n, n2, n3, n4);
            return this;
        }
        
        public Builder color(final float[] array) {
            nBuilderColor(this.mNativeBuilder, array[0], array[1], array[2], array[3]);
            return this;
        }
        
        public Builder environment(final Texture texture) {
            nBuilderEnvironment(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }
        
        public Builder intensity(final float n) {
            nBuilderIntensity(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder showSun(final boolean b) {
            nBuilderShowSun(this.mNativeBuilder, b);
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
