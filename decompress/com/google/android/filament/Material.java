// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import com.google.android.filament.proguard.UsedByNative;
import java.util.Collections;
import java.util.EnumSet;
import java.util.ArrayList;
import java.util.List;
import java.nio.Buffer;
import java.util.Set;

public class Material
{
    private final MaterialInstance mDefaultInstance;
    private long mNativeObject;
    private Set<VertexBuffer$VertexAttribute> mRequiredAttributes;
    
    public Material(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
        this.mDefaultInstance = new MaterialInstance(this, nGetDefaultInstance(mNativeObject));
    }
    
    private static native long nBuilderBuild(final long p0, final Buffer p1, final int p2);
    
    private static native long nCreateInstance(final long p0);
    
    private static native long nCreateInstanceWithName(final long p0, final String p1);
    
    private static native int nGetBlendingMode(final long p0);
    
    private static native int nGetCullingMode(final long p0);
    
    private static native long nGetDefaultInstance(final long p0);
    
    private static native int nGetInterpolation(final long p0);
    
    private static native float nGetMaskThreshold(final long p0);
    
    private static native String nGetName(final long p0);
    
    private static native int nGetParameterCount(final long p0);
    
    private static native void nGetParameters(final long p0, final List<Parameter> p1, final int p2);
    
    private static native int nGetRefractionMode(final long p0);
    
    private static native int nGetRefractionType(final long p0);
    
    private static native int nGetRequiredAttributes(final long p0);
    
    private static native int nGetShading(final long p0);
    
    private static native float nGetSpecularAntiAliasingThreshold(final long p0);
    
    private static native float nGetSpecularAntiAliasingVariance(final long p0);
    
    private static native int nGetVertexDomain(final long p0);
    
    private static native boolean nHasParameter(final long p0, final String p1);
    
    private static native boolean nIsColorWriteEnabled(final long p0);
    
    private static native boolean nIsDepthCullingEnabled(final long p0);
    
    private static native boolean nIsDepthWriteEnabled(final long p0);
    
    private static native boolean nIsDoubleSided(final long p0);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public MaterialInstance createInstance() {
        final long nCreateInstance = nCreateInstance(this.getNativeObject());
        if (nCreateInstance != 0L) {
            return new MaterialInstance(this, nCreateInstance);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }
    
    public MaterialInstance createInstance(final String s) {
        final long nCreateInstanceWithName = nCreateInstanceWithName(this.getNativeObject(), s);
        if (nCreateInstanceWithName != 0L) {
            return new MaterialInstance(this, nCreateInstanceWithName);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }
    
    public BlendingMode getBlendingMode() {
        return EnumCache.sBlendingModeValues[nGetBlendingMode(this.getNativeObject())];
    }
    
    public CullingMode getCullingMode() {
        return EnumCache.sCullingModeValues[nGetCullingMode(this.getNativeObject())];
    }
    
    public MaterialInstance getDefaultInstance() {
        return this.mDefaultInstance;
    }
    
    public Interpolation getInterpolation() {
        return EnumCache.sInterpolationValues[nGetInterpolation(this.getNativeObject())];
    }
    
    public float getMaskThreshold() {
        return nGetMaskThreshold(this.getNativeObject());
    }
    
    public String getName() {
        return nGetName(this.getNativeObject());
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed Material");
    }
    
    public int getParameterCount() {
        return nGetParameterCount(this.getNativeObject());
    }
    
    public List<Parameter> getParameters() {
        final int parameterCount = this.getParameterCount();
        final ArrayList list = new ArrayList<Parameter>(parameterCount);
        if (parameterCount > 0) {
            nGetParameters(this.getNativeObject(), (List<Parameter>)list, parameterCount);
        }
        return (List<Parameter>)list;
    }
    
    public RefractionMode getRefractionMode() {
        return EnumCache.sRefractionModeValues[nGetRefractionMode(this.getNativeObject())];
    }
    
    public RefractionType getRefractionType() {
        return EnumCache.sRefractionTypeValues[nGetRefractionType(this.getNativeObject())];
    }
    
    public Set<VertexBuffer$VertexAttribute> getRequiredAttributes() {
        if (this.mRequiredAttributes == null) {
            final int nGetRequiredAttributes = nGetRequiredAttributes(this.getNativeObject());
            this.mRequiredAttributes = EnumSet.noneOf(VertexBuffer$VertexAttribute.class);
            final VertexBuffer$VertexAttribute[] sVertexAttributeValues = EnumCache.sVertexAttributeValues;
            for (int i = 0; i < sVertexAttributeValues.length; ++i) {
                if ((1 << i & nGetRequiredAttributes) != 0x0) {
                    this.mRequiredAttributes.add(sVertexAttributeValues[i]);
                }
            }
            this.mRequiredAttributes = Collections.unmodifiableSet((Set<? extends VertexBuffer$VertexAttribute>)this.mRequiredAttributes);
        }
        return this.mRequiredAttributes;
    }
    
    public int getRequiredAttributesAsInt() {
        return nGetRequiredAttributes(this.getNativeObject());
    }
    
    public Shading getShading() {
        return EnumCache.sShadingValues[nGetShading(this.getNativeObject())];
    }
    
    public float getSpecularAntiAliasingThreshold() {
        return nGetSpecularAntiAliasingThreshold(this.getNativeObject());
    }
    
    public float getSpecularAntiAliasingVariance() {
        return nGetSpecularAntiAliasingVariance(this.getNativeObject());
    }
    
    public VertexDomain getVertexDomain() {
        return EnumCache.sVertexDomainValues[nGetVertexDomain(this.getNativeObject())];
    }
    
    public boolean hasParameter(final String s) {
        return nHasParameter(this.getNativeObject(), s);
    }
    
    public boolean isColorWriteEnabled() {
        return nIsColorWriteEnabled(this.getNativeObject());
    }
    
    public boolean isDepthCullingEnabled() {
        return nIsDepthCullingEnabled(this.getNativeObject());
    }
    
    public boolean isDepthWriteEnabled() {
        return nIsDepthWriteEnabled(this.getNativeObject());
    }
    
    public boolean isDoubleSided() {
        return nIsDoubleSided(this.getNativeObject());
    }
    
    public void setDefaultParameter(final String s, final float n) {
        this.mDefaultInstance.setParameter(s, n);
    }
    
    public void setDefaultParameter(final String s, final float n, final float n2) {
        this.mDefaultInstance.setParameter(s, n, n2);
    }
    
    public void setDefaultParameter(final String s, final float n, final float n2, final float n3) {
        this.mDefaultInstance.setParameter(s, n, n2, n3);
    }
    
    public void setDefaultParameter(final String s, final float n, final float n2, final float n3, final float n4) {
        this.mDefaultInstance.setParameter(s, n, n2, n3, n4);
    }
    
    public void setDefaultParameter(final String s, final int n) {
        this.mDefaultInstance.setParameter(s, n);
    }
    
    public void setDefaultParameter(final String s, final int n, final int n2) {
        this.mDefaultInstance.setParameter(s, n, n2);
    }
    
    public void setDefaultParameter(final String s, final int n, final int n2, final int n3) {
        this.mDefaultInstance.setParameter(s, n, n2, n3);
    }
    
    public void setDefaultParameter(final String s, final int n, final int n2, final int n3, final int n4) {
        this.mDefaultInstance.setParameter(s, n, n2, n3, n4);
    }
    
    public void setDefaultParameter(final String s, final Colors.RgbType rgbType, final float n, final float n2, final float n3) {
        this.mDefaultInstance.setParameter(s, rgbType, n, n2, n3);
    }
    
    public void setDefaultParameter(final String s, final Colors.RgbaType rgbaType, final float n, final float n2, final float n3, final float n4) {
        this.mDefaultInstance.setParameter(s, rgbaType, n, n2, n3, n4);
    }
    
    public void setDefaultParameter(final String s, final MaterialInstance.BooleanElement booleanElement, final boolean[] array, final int n, final int n2) {
        this.mDefaultInstance.setParameter(s, booleanElement, array, n, n2);
    }
    
    public void setDefaultParameter(final String s, final MaterialInstance.FloatElement floatElement, final float[] array, final int n, final int n2) {
        this.mDefaultInstance.setParameter(s, floatElement, array, n, n2);
    }
    
    public void setDefaultParameter(final String s, final MaterialInstance.IntElement intElement, final int[] array, final int n, final int n2) {
        this.mDefaultInstance.setParameter(s, intElement, array, n, n2);
    }
    
    public void setDefaultParameter(final String s, final Texture texture, final TextureSampler textureSampler) {
        this.mDefaultInstance.setParameter(s, texture, textureSampler);
    }
    
    public void setDefaultParameter(final String s, final boolean b) {
        this.mDefaultInstance.setParameter(s, b);
    }
    
    public void setDefaultParameter(final String s, final boolean b, final boolean b2) {
        this.mDefaultInstance.setParameter(s, b, b2);
    }
    
    public void setDefaultParameter(final String s, final boolean b, final boolean b2, final boolean b3) {
        this.mDefaultInstance.setParameter(s, b, b2, b3);
    }
    
    public void setDefaultParameter(final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.mDefaultInstance.setParameter(s, b, b2, b3, b4);
    }
    
    public enum BlendingMode
    {
        ADD, 
        FADE, 
        MASKED, 
        MULTIPLY, 
        OPAQUE, 
        SCREEN, 
        TRANSPARENT;
    }
    
    public static class Builder
    {
        private Buffer mBuffer;
        private int mSize;
        
        public Material build(final Engine engine) {
            final long access$000 = nBuilderBuild(engine.getNativeObject(), this.mBuffer, this.mSize);
            if (access$000 != 0L) {
                return new Material(access$000);
            }
            throw new IllegalStateException("Couldn't create Material");
        }
        
        public Builder payload(final Buffer mBuffer, final int mSize) {
            this.mBuffer = mBuffer;
            this.mSize = mSize;
            return this;
        }
    }
    
    public enum CullingMode
    {
        BACK, 
        FRONT, 
        FRONT_AND_BACK, 
        NONE;
    }
    
    public static final class EnumCache
    {
        public static final BlendingMode[] sBlendingModeValues;
        public static final CullingMode[] sCullingModeValues;
        public static final Interpolation[] sInterpolationValues;
        public static final RefractionMode[] sRefractionModeValues;
        public static final RefractionType[] sRefractionTypeValues;
        public static final Shading[] sShadingValues;
        public static final VertexBuffer$VertexAttribute[] sVertexAttributeValues;
        public static final VertexDomain[] sVertexDomainValues;
        
        static {
            sShadingValues = Shading.values();
            sInterpolationValues = Interpolation.values();
            sBlendingModeValues = BlendingMode.values();
            sRefractionModeValues = RefractionMode.values();
            sRefractionTypeValues = RefractionType.values();
            sVertexDomainValues = VertexDomain.values();
            sCullingModeValues = CullingMode.values();
            sVertexAttributeValues = VertexBuffer$VertexAttribute.values();
        }
        
        private EnumCache() {
        }
    }
    
    public enum Interpolation
    {
        FLAT, 
        SMOOTH;
    }
    
    @UsedByNative("Material.cpp")
    public static class Parameter
    {
        @UsedByNative("Material.cpp")
        private static final int SAMPLER_OFFSET;
        @UsedByNative("Material.cpp")
        private static final int SUBPASS_OFFSET;
        private static final Type[] sTypeValues;
        public final int count;
        public final String name;
        public final Precision precision;
        public final Type type;
        
        static {
            sTypeValues = Type.values();
            SAMPLER_OFFSET = Type.MAT4.ordinal() + 1;
            SUBPASS_OFFSET = Type.SAMPLER_3D.ordinal() + 1;
        }
        
        private Parameter(final String name, final Type type, final Precision precision, final int count) {
            this.name = name;
            this.type = type;
            this.precision = precision;
            this.count = count;
        }
        
        @UsedByNative("Material.cpp")
        private static void add(final List<Parameter> list, final String s, final int n, final int n2, final int n3) {
            list.add(new Parameter(s, Parameter.sTypeValues[n], Precision.values()[n2], n3));
        }
        
        public enum Precision
        {
            DEFAULT, 
            HIGH, 
            LOW, 
            MEDIUM;
        }
        
        public enum Type
        {
            BOOL, 
            BOOL2, 
            BOOL3, 
            BOOL4, 
            FLOAT, 
            FLOAT2, 
            FLOAT3, 
            FLOAT4, 
            INT, 
            INT2, 
            INT3, 
            INT4, 
            MAT3, 
            MAT4, 
            SAMPLER_2D, 
            SAMPLER_2D_ARRAY, 
            SAMPLER_3D, 
            SAMPLER_CUBEMAP, 
            SAMPLER_EXTERNAL, 
            SUBPASS_INPUT, 
            UINT, 
            UINT2, 
            UINT3, 
            UINT4;
        }
    }
    
    public enum RefractionMode
    {
        CUBEMAP, 
        NONE, 
        SCREEN_SPACE;
    }
    
    public enum RefractionType
    {
        SOLID, 
        THIN;
    }
    
    public enum Shading
    {
        CLOTH, 
        LIT, 
        SPECULAR_GLOSSINESS, 
        SUBSURFACE, 
        UNLIT;
    }
    
    public enum VertexDomain
    {
        DEVICE, 
        OBJECT, 
        VIEW, 
        WORLD;
    }
}
