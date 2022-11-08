// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class IndirectLight
{
    public long mNativeObject;
    
    public IndirectLight(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    public static float[] getColorEstimate(float[] assertFloat4, final float[] array, final float n, final float n2, final float n3) {
        if (array.length >= 27) {
            assertFloat4 = Asserts.assertFloat4(assertFloat4);
            nGetColorEstimateStatic(assertFloat4, array, n, n2, n3);
            return assertFloat4;
        }
        throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
    }
    
    public static float[] getDirectionEstimate(final float[] array, float[] assertFloat3) {
        if (array.length >= 27) {
            assertFloat3 = Asserts.assertFloat3(assertFloat3);
            nGetDirectionEstimateStatic(array, assertFloat3);
            return assertFloat3;
        }
        throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
    }
    
    private static native long nBuilderBuild(final long p0, final long p1);
    
    private static native void nBuilderReflections(final long p0, final long p1);
    
    private static native long nCreateBuilder();
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native void nGetColorEstimate(final long p0, final float[] p1, final float p2, final float p3, final float p4);
    
    private static native void nGetColorEstimateStatic(final float[] p0, final float[] p1, final float p2, final float p3, final float p4);
    
    private static native void nGetDirectionEstimate(final long p0, final float[] p1);
    
    private static native void nGetDirectionEstimateStatic(final float[] p0, final float[] p1);
    
    private static native float nGetIntensity(final long p0);
    
    private static native long nGetIrradianceTexture(final long p0);
    
    private static native long nGetReflectionsTexture(final long p0);
    
    private static native void nGetRotation(final long p0, final float[] p1);
    
    private static native void nIntensity(final long p0, final float p1);
    
    private static native void nIrradiance(final long p0, final int p1, final float[] p2);
    
    private static native void nIrradianceAsTexture(final long p0, final long p1);
    
    private static native void nRadiance(final long p0, final int p1, final float[] p2);
    
    private static native void nRotation(final long p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6, final float p7, final float p8, final float p9);
    
    private static native void nSetIntensity(final long p0, final float p1);
    
    private static native void nSetRotation(final long p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6, final float p7, final float p8, final float p9);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    @Deprecated
    public float[] getColorEstimate(float[] assertFloat4, final float n, final float n2, final float n3) {
        assertFloat4 = Asserts.assertFloat4(assertFloat4);
        nGetColorEstimate(this.getNativeObject(), assertFloat4, n, n2, n3);
        return assertFloat4;
    }
    
    @Deprecated
    public float[] getDirectionEstimate(float[] assertFloat3) {
        assertFloat3 = Asserts.assertFloat3(assertFloat3);
        nGetDirectionEstimate(this.getNativeObject(), assertFloat3);
        return assertFloat3;
    }
    
    public float getIntensity() {
        return nGetIntensity(this.getNativeObject());
    }
    
    public Texture getIrradianceTexture() {
        final long nGetIrradianceTexture = nGetIrradianceTexture(this.getNativeObject());
        Texture texture;
        if (nGetIrradianceTexture == 0L) {
            texture = null;
        }
        else {
            texture = new Texture(nGetIrradianceTexture);
        }
        return texture;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed IndirectLight");
    }
    
    public Texture getReflectionsTexture() {
        final long nGetReflectionsTexture = nGetReflectionsTexture(this.getNativeObject());
        Texture texture;
        if (nGetReflectionsTexture == 0L) {
            texture = null;
        }
        else {
            texture = new Texture(nGetReflectionsTexture);
        }
        return texture;
    }
    
    public float[] getRotation(float[] assertMat3f) {
        assertMat3f = Asserts.assertMat3f(assertMat3f);
        nGetRotation(this.getNativeObject(), assertMat3f);
        return assertMat3f;
    }
    
    public void setIntensity(final float n) {
        nSetIntensity(this.getNativeObject(), n);
    }
    
    public void setRotation(final float[] array) {
        Asserts.assertMat3fIn(array);
        nSetRotation(this.getNativeObject(), array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
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
        
        public IndirectLight build(final Engine engine) {
            final long access$700 = nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (access$700 != 0L) {
                return new IndirectLight(access$700);
            }
            throw new IllegalStateException("Couldn't create IndirectLight");
        }
        
        public Builder intensity(final float n) {
            nIntensity(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder irradiance(final int n, final float[] array) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                    if (array.length < 27) {
                        throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                    }
                }
                else if (array.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            }
            else if (array.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            nIrradiance(this.mNativeBuilder, n, array);
            return this;
        }
        
        public Builder irradiance(final Texture texture) {
            nIrradianceAsTexture(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }
        
        public Builder radiance(final int n, final float[] array) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                    if (array.length < 27) {
                        throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                    }
                }
                else if (array.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            }
            else if (array.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            nRadiance(this.mNativeBuilder, n, array);
            return this;
        }
        
        public Builder reflections(final Texture texture) {
            nBuilderReflections(this.mNativeBuilder, texture.getNativeObject());
            return this;
        }
        
        public Builder rotation(final float[] array) {
            nRotation(this.mNativeBuilder, array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
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
