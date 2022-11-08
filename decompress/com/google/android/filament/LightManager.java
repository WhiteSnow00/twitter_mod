// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class LightManager
{
    public static final float EFFICIENCY_FLUORESCENT = 0.0878f;
    public static final float EFFICIENCY_HALOGEN = 0.0707f;
    public static final float EFFICIENCY_INCANDESCENT = 0.022f;
    public static final float EFFICIENCY_LED = 0.1171f;
    private static final Type[] sTypeValues;
    private long mNativeObject;
    
    static {
        sTypeValues = Type.values();
    }
    
    public LightManager(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native void nBuilderAngularRadius(final long p0, final float p1);
    
    private static native boolean nBuilderBuild(final long p0, final long p1, final int p2);
    
    private static native void nBuilderCastLight(final long p0, final boolean p1);
    
    private static native void nBuilderCastShadows(final long p0, final boolean p1);
    
    private static native void nBuilderColor(final long p0, final float p1, final float p2, final float p3);
    
    private static native void nBuilderDirection(final long p0, final float p1, final float p2, final float p3);
    
    private static native void nBuilderFalloff(final long p0, final float p1);
    
    private static native void nBuilderHaloFalloff(final long p0, final float p1);
    
    private static native void nBuilderHaloSize(final long p0, final float p1);
    
    private static native void nBuilderIntensity(final long p0, final float p1);
    
    private static native void nBuilderIntensity(final long p0, final float p1, final float p2);
    
    private static native void nBuilderIntensityCandela(final long p0, final float p1);
    
    private static native void nBuilderLightChannel(final long p0, final int p1, final boolean p2);
    
    private static native void nBuilderPosition(final long p0, final float p1, final float p2, final float p3);
    
    private static native void nBuilderShadowOptions(final long p0, final int p1, final int p2, final float[] p3, final float p4, final float p5, final float p6, final float p7, final float p8, final boolean p9, final float p10, final float p11, final boolean p12, final int p13, final float p14, final int p15, final float p16, final float p17);
    
    private static native void nBuilderSpotLightCone(final long p0, final float p1, final float p2);
    
    private static native void nComputeLogSplits(final float[] p0, final int p1, final float p2, final float p3);
    
    private static native void nComputePracticalSplits(final float[] p0, final int p1, final float p2, final float p3, final float p4);
    
    private static native void nComputeUniformSplits(final float[] p0, final int p1);
    
    private static native long nCreateBuilder(final int p0);
    
    private static native void nDestroy(final long p0, final int p1);
    
    private static native void nDestroyBuilder(final long p0);
    
    private static native void nGetColor(final long p0, final int p1, final float[] p2);
    
    private static native int nGetComponentCount(final long p0);
    
    private static native void nGetDirection(final long p0, final int p1, final float[] p2);
    
    private static native float nGetFalloff(final long p0, final int p1);
    
    private static native float nGetInnerConeAngle(final long p0, final int p1);
    
    private static native int nGetInstance(final long p0, final int p1);
    
    private static native float nGetIntensity(final long p0, final int p1);
    
    private static native boolean nGetLightChannel(final long p0, final int p1, final int p2);
    
    private static native float nGetOuterConeAngle(final long p0, final int p1);
    
    private static native void nGetPosition(final long p0, final int p1, final float[] p2);
    
    private static native float nGetSunAngularRadius(final long p0, final int p1);
    
    private static native float nGetSunHaloFalloff(final long p0, final int p1);
    
    private static native float nGetSunHaloSize(final long p0, final int p1);
    
    private static native int nGetType(final long p0, final int p1);
    
    private static native boolean nHasComponent(final long p0, final int p1);
    
    private static native boolean nIsShadowCaster(final long p0, final int p1);
    
    private static native void nSetColor(final long p0, final int p1, final float p2, final float p3, final float p4);
    
    private static native void nSetDirection(final long p0, final int p1, final float p2, final float p3, final float p4);
    
    private static native void nSetFalloff(final long p0, final int p1, final float p2);
    
    private static native void nSetIntensity(final long p0, final int p1, final float p2);
    
    private static native void nSetIntensity(final long p0, final int p1, final float p2, final float p3);
    
    private static native void nSetIntensityCandela(final long p0, final int p1, final float p2);
    
    private static native void nSetLightChannel(final long p0, final int p1, final int p2, final boolean p3);
    
    private static native void nSetPosition(final long p0, final int p1, final float p2, final float p3, final float p4);
    
    private static native void nSetShadowCaster(final long p0, final int p1, final boolean p2);
    
    private static native void nSetSpotLightCone(final long p0, final int p1, final float p2, final float p3);
    
    private static native void nSetSunAngularRadius(final long p0, final int p1, final float p2);
    
    private static native void nSetSunHaloFalloff(final long p0, final int p1, final float p2);
    
    private static native void nSetSunHaloSize(final long p0, final int p1, final float p2);
    
    public void destroy(@Entity final int n) {
        nDestroy(this.mNativeObject, n);
    }
    
    public float[] getColor(@EntityInstance final int n, float[] assertFloat3) {
        assertFloat3 = Asserts.assertFloat3(assertFloat3);
        nGetColor(this.mNativeObject, n, assertFloat3);
        return assertFloat3;
    }
    
    public int getComponentCount() {
        return nGetComponentCount(this.mNativeObject);
    }
    
    public float[] getDirection(@EntityInstance final int n, float[] assertFloat3) {
        assertFloat3 = Asserts.assertFloat3(assertFloat3);
        nGetDirection(this.mNativeObject, n, assertFloat3);
        return assertFloat3;
    }
    
    public float getFalloff(@EntityInstance final int n) {
        return nGetFalloff(this.mNativeObject, n);
    }
    
    public float getInnerConeAngle(@EntityInstance final int n) {
        return nGetInnerConeAngle(this.mNativeObject, n);
    }
    
    @EntityInstance
    public int getInstance(@Entity final int n) {
        return nGetInstance(this.mNativeObject, n);
    }
    
    public float getIntensity(@EntityInstance final int n) {
        return nGetIntensity(this.mNativeObject, n);
    }
    
    public boolean getLightChannel(@EntityInstance final int n, final int n2) {
        return nGetLightChannel(this.mNativeObject, n, n2);
    }
    
    public long getNativeObject() {
        return this.mNativeObject;
    }
    
    public float getOuterConeAngle(@EntityInstance final int n) {
        return nGetOuterConeAngle(this.mNativeObject, n);
    }
    
    public float[] getPosition(@EntityInstance final int n, float[] assertFloat3) {
        assertFloat3 = Asserts.assertFloat3(assertFloat3);
        nGetPosition(this.mNativeObject, n, assertFloat3);
        return assertFloat3;
    }
    
    public float getSunAngularRadius(@EntityInstance final int n) {
        return nGetSunAngularRadius(this.mNativeObject, n);
    }
    
    public float getSunHaloFalloff(@EntityInstance final int n) {
        return nGetSunHaloFalloff(this.mNativeObject, n);
    }
    
    public float getSunHaloSize(@EntityInstance final int n) {
        return nGetSunHaloSize(this.mNativeObject, n);
    }
    
    public Type getType(@EntityInstance final int n) {
        return LightManager.sTypeValues[nGetType(this.mNativeObject, n)];
    }
    
    public boolean hasComponent(@Entity final int n) {
        return nHasComponent(this.mNativeObject, n);
    }
    
    public boolean isDirectional(@EntityInstance final int n) {
        final Type type = this.getType(n);
        return type == Type.DIRECTIONAL || type == Type.SUN;
    }
    
    public boolean isPointLight(@EntityInstance final int n) {
        return this.getType(n) == Type.POINT;
    }
    
    public boolean isShadowCaster(@EntityInstance final int n) {
        return nIsShadowCaster(this.mNativeObject, n);
    }
    
    public boolean isSpotLight(@EntityInstance final int n) {
        final Type type = this.getType(n);
        return type == Type.SPOT || type == Type.FOCUSED_SPOT;
    }
    
    public void setColor(@EntityInstance final int n, final float n2, final float n3, final float n4) {
        nSetColor(this.mNativeObject, n, n2, n3, n4);
    }
    
    public void setDirection(@EntityInstance final int n, final float n2, final float n3, final float n4) {
        nSetDirection(this.mNativeObject, n, n2, n3, n4);
    }
    
    public void setFalloff(@EntityInstance final int n, final float n2) {
        nSetFalloff(this.mNativeObject, n, n2);
    }
    
    public void setIntensity(@EntityInstance final int n, final float n2) {
        nSetIntensity(this.mNativeObject, n, n2);
    }
    
    public void setIntensity(@EntityInstance final int n, final float n2, final float n3) {
        nSetIntensity(this.mNativeObject, n, n2, n3);
    }
    
    public void setIntensityCandela(@EntityInstance final int n, final float n2) {
        nSetIntensityCandela(this.mNativeObject, n, n2);
    }
    
    public void setLightChannel(@EntityInstance final int n, final int n2, final boolean b) {
        nSetLightChannel(this.mNativeObject, n, n2, b);
    }
    
    public void setPosition(@EntityInstance final int n, final float n2, final float n3, final float n4) {
        nSetPosition(this.mNativeObject, n, n2, n3, n4);
    }
    
    public void setShadowCaster(@EntityInstance final int n, final boolean b) {
        nSetShadowCaster(this.mNativeObject, n, b);
    }
    
    public void setSpotLightCone(@EntityInstance final int n, final float n2, final float n3) {
        nSetSpotLightCone(this.mNativeObject, n, n2, n3);
    }
    
    public void setSunAngularRadius(@EntityInstance final int n, final float n2) {
        nSetSunAngularRadius(this.mNativeObject, n, n2);
    }
    
    public void setSunHaloFalloff(@EntityInstance final int n, final float n2) {
        nSetSunHaloFalloff(this.mNativeObject, n, n2);
    }
    
    public void setSunHaloSize(@EntityInstance final int n, final float n2) {
        nSetSunHaloSize(this.mNativeObject, n, n2);
    }
    
    public static class Builder
    {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        
        public Builder(final Type type) {
            final long access$300 = nCreateBuilder(type.ordinal());
            this.mNativeBuilder = access$300;
            this.mFinalizer = new BuilderFinalizer(access$300);
        }
        
        public void build(final Engine engine, @Entity final int n) {
            if (nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), n)) {
                return;
            }
            throw new IllegalStateException(ffa.k("Couldn't create Light component for entity ", n, ", see log."));
        }
        
        public Builder castLight(final boolean b) {
            nBuilderCastLight(this.mNativeBuilder, b);
            return this;
        }
        
        public Builder castShadows(final boolean b) {
            nBuilderCastShadows(this.mNativeBuilder, b);
            return this;
        }
        
        public Builder color(final float n, final float n2, final float n3) {
            nBuilderColor(this.mNativeBuilder, n, n2, n3);
            return this;
        }
        
        public Builder direction(final float n, final float n2, final float n3) {
            nBuilderDirection(this.mNativeBuilder, n, n2, n3);
            return this;
        }
        
        public Builder falloff(final float n) {
            nBuilderFalloff(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder intensity(final float n) {
            nBuilderIntensity(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder intensity(final float n, final float n2) {
            nBuilderIntensity(this.mNativeBuilder, n, n2);
            return this;
        }
        
        public Builder intensityCandela(final float n) {
            nBuilderIntensityCandela(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder lightChannel(final int n, final boolean b) {
            nBuilderLightChannel(this.mNativeBuilder, n, b);
            return this;
        }
        
        public Builder position(final float n, final float n2, final float n3) {
            nBuilderPosition(this.mNativeBuilder, n, n2, n3);
            return this;
        }
        
        public Builder shadowOptions(final ShadowOptions shadowOptions) {
            nBuilderShadowOptions(this.mNativeBuilder, shadowOptions.mapSize, shadowOptions.shadowCascades, shadowOptions.cascadeSplitPositions, shadowOptions.constantBias, shadowOptions.normalBias, shadowOptions.shadowFar, shadowOptions.shadowNearHint, shadowOptions.shadowFarHint, shadowOptions.stable, shadowOptions.polygonOffsetConstant, shadowOptions.polygonOffsetSlope, shadowOptions.screenSpaceContactShadows, shadowOptions.stepCount, shadowOptions.maxShadowDistance, shadowOptions.vsmMsaaSamples, shadowOptions.blurWidth, shadowOptions.shadowBulbRadius);
            return this;
        }
        
        public Builder spotLightCone(final float n, final float n2) {
            nBuilderSpotLightCone(this.mNativeBuilder, n, n2);
            return this;
        }
        
        public Builder sunAngularRadius(final float n) {
            nBuilderAngularRadius(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder sunHaloFalloff(final float n) {
            nBuilderHaloFalloff(this.mNativeBuilder, n);
            return this;
        }
        
        public Builder sunHaloSize(final float n) {
            nBuilderHaloSize(this.mNativeBuilder, n);
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
    
    public static class ShadowCascades
    {
        public static void computeLogSplits(final float[] array, final int n, final float n2, final float n3) {
            final int length = array.length;
            final int n4 = n - 1;
            if (length >= n4) {
                nComputeLogSplits(array, n, n2, n3);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", n4));
        }
        
        public static void computePracticalSplits(final float[] array, final int n, final float n2, final float n3, final float n4) {
            final int length = array.length;
            final int n5 = n - 1;
            if (length >= n5) {
                nComputePracticalSplits(array, n, n2, n3, n4);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", n5));
        }
        
        public static void computeUniformSplits(final float[] array, final int n) {
            final int length = array.length;
            final int n2 = n - 1;
            if (length >= n2) {
                nComputeUniformSplits(array, n);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", n2));
        }
    }
    
    public static class ShadowOptions
    {
        public float blurWidth;
        public float[] cascadeSplitPositions;
        public float constantBias;
        public int mapSize;
        public float maxShadowDistance;
        public float normalBias;
        public float polygonOffsetConstant;
        public float polygonOffsetSlope;
        public boolean screenSpaceContactShadows;
        public float shadowBulbRadius;
        public int shadowCascades;
        public float shadowFar;
        public float shadowFarHint;
        public float shadowNearHint;
        public boolean stable;
        public int stepCount;
        public int vsmMsaaSamples;
        
        public ShadowOptions() {
            this.mapSize = 1024;
            this.shadowCascades = 1;
            this.cascadeSplitPositions = new float[] { 0.25f, 0.5f, 0.75f };
            this.constantBias = 0.001f;
            this.normalBias = 1.0f;
            this.shadowFar = 0.0f;
            this.shadowNearHint = 1.0f;
            this.shadowFarHint = 100.0f;
            this.stable = false;
            this.polygonOffsetConstant = 0.5f;
            this.polygonOffsetSlope = 2.0f;
            this.screenSpaceContactShadows = false;
            this.stepCount = 8;
            this.maxShadowDistance = 0.3f;
            this.vsmMsaaSamples = 1;
            this.blurWidth = 0.0f;
            this.shadowBulbRadius = 0.02f;
        }
    }
    
    public enum Type
    {
        DIRECTIONAL, 
        FOCUSED_SPOT, 
        POINT, 
        SPOT, 
        SUN;
    }
}
