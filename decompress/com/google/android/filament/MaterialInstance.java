// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class MaterialInstance
{
    private Material mMaterial;
    private String mName;
    private long mNativeMaterial;
    private long mNativeObject;
    
    public MaterialInstance(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
        this.mNativeMaterial = nGetMaterial(mNativeObject);
    }
    
    public MaterialInstance(final Engine engine, final long mNativeObject) {
        this.mNativeObject = mNativeObject;
        this.mNativeMaterial = nGetMaterial(mNativeObject);
    }
    
    public MaterialInstance(final Material mMaterial, final long mNativeObject) {
        this.mMaterial = mMaterial;
        this.mNativeMaterial = mMaterial.getNativeObject();
        this.mNativeObject = mNativeObject;
    }
    
    public static MaterialInstance duplicate(final MaterialInstance materialInstance, final String s) {
        final long nDuplicate = nDuplicate(materialInstance.mNativeObject, s);
        if (nDuplicate != 0L) {
            return new MaterialInstance(materialInstance.getMaterial(), nDuplicate);
        }
        throw new IllegalStateException("Couldn't duplicate MaterialInstance");
    }
    
    private static native long nDuplicate(final long p0, final String p1);
    
    private static native long nGetMaterial(final long p0);
    
    private static native String nGetName(final long p0);
    
    private static native void nSetBooleanParameterArray(final long p0, final String p1, final int p2, final boolean[] p3, final int p4, final int p5);
    
    private static native void nSetColorWrite(final long p0, final boolean p1);
    
    private static native void nSetCullingMode(final long p0, final long p1);
    
    private static native void nSetDepthCulling(final long p0, final boolean p1);
    
    private static native void nSetDepthWrite(final long p0, final boolean p1);
    
    private static native void nSetDoubleSided(final long p0, final boolean p1);
    
    private static native void nSetFloatParameterArray(final long p0, final String p1, final int p2, final float[] p3, final int p4, final int p5);
    
    private static native void nSetIntParameterArray(final long p0, final String p1, final int p2, final int[] p3, final int p4, final int p5);
    
    private static native void nSetMaskThreshold(final long p0, final float p1);
    
    private static native void nSetParameterBool(final long p0, final String p1, final boolean p2);
    
    private static native void nSetParameterBool2(final long p0, final String p1, final boolean p2, final boolean p3);
    
    private static native void nSetParameterBool3(final long p0, final String p1, final boolean p2, final boolean p3, final boolean p4);
    
    private static native void nSetParameterBool4(final long p0, final String p1, final boolean p2, final boolean p3, final boolean p4, final boolean p5);
    
    private static native void nSetParameterFloat(final long p0, final String p1, final float p2);
    
    private static native void nSetParameterFloat2(final long p0, final String p1, final float p2, final float p3);
    
    private static native void nSetParameterFloat3(final long p0, final String p1, final float p2, final float p3, final float p4);
    
    private static native void nSetParameterFloat4(final long p0, final String p1, final float p2, final float p3, final float p4, final float p5);
    
    private static native void nSetParameterInt(final long p0, final String p1, final int p2);
    
    private static native void nSetParameterInt2(final long p0, final String p1, final int p2, final int p3);
    
    private static native void nSetParameterInt3(final long p0, final String p1, final int p2, final int p3, final int p4);
    
    private static native void nSetParameterInt4(final long p0, final String p1, final int p2, final int p3, final int p4, final int p5);
    
    private static native void nSetParameterTexture(final long p0, final String p1, final long p2, final int p3);
    
    private static native void nSetPolygonOffset(final long p0, final float p1, final float p2);
    
    private static native void nSetScissor(final long p0, final int p1, final int p2, final int p3, final int p4);
    
    private static native void nSetSpecularAntiAliasingThreshold(final long p0, final float p1);
    
    private static native void nSetSpecularAntiAliasingVariance(final long p0, final float p1);
    
    private static native void nUnsetScissor(final long p0);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public Material getMaterial() {
        if (this.mMaterial == null) {
            this.mMaterial = new Material(this.mNativeMaterial);
        }
        return this.mMaterial;
    }
    
    public String getName() {
        if (this.mName == null) {
            this.mName = nGetName(this.getNativeObject());
        }
        return this.mName;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed MaterialInstance");
    }
    
    public void setColorWrite(final boolean b) {
        nSetColorWrite(this.getNativeObject(), b);
    }
    
    public void setCullingMode(final Material.CullingMode cullingMode) {
        nSetCullingMode(this.getNativeObject(), cullingMode.ordinal());
    }
    
    public void setDepthCulling(final boolean b) {
        nSetDepthCulling(this.getNativeObject(), b);
    }
    
    public void setDepthWrite(final boolean b) {
        nSetDepthWrite(this.getNativeObject(), b);
    }
    
    public void setDoubleSided(final boolean b) {
        nSetDoubleSided(this.getNativeObject(), b);
    }
    
    public void setMaskThreshold(final float n) {
        nSetMaskThreshold(this.getNativeObject(), n);
    }
    
    public void setParameter(final String s, final float n) {
        nSetParameterFloat(this.getNativeObject(), s, n);
    }
    
    public void setParameter(final String s, final float n, final float n2) {
        nSetParameterFloat2(this.getNativeObject(), s, n, n2);
    }
    
    public void setParameter(final String s, final float n, final float n2, final float n3) {
        nSetParameterFloat3(this.getNativeObject(), s, n, n2, n3);
    }
    
    public void setParameter(final String s, final float n, final float n2, final float n3, final float n4) {
        nSetParameterFloat4(this.getNativeObject(), s, n, n2, n3, n4);
    }
    
    public void setParameter(final String s, final int n) {
        nSetParameterInt(this.getNativeObject(), s, n);
    }
    
    public void setParameter(final String s, final int n, final int n2) {
        nSetParameterInt2(this.getNativeObject(), s, n, n2);
    }
    
    public void setParameter(final String s, final int n, final int n2, final int n3) {
        nSetParameterInt3(this.getNativeObject(), s, n, n2, n3);
    }
    
    public void setParameter(final String s, final int n, final int n2, final int n3, final int n4) {
        nSetParameterInt4(this.getNativeObject(), s, n, n2, n3, n4);
    }
    
    public void setParameter(final String s, final Colors.RgbType rgbType, final float n, final float n2, final float n3) {
        final float[] linear = Colors.toLinear(rgbType, n, n2, n3);
        nSetParameterFloat3(this.getNativeObject(), s, linear[0], linear[1], linear[2]);
    }
    
    public void setParameter(final String s, final Colors.RgbaType rgbaType, final float n, final float n2, final float n3, final float n4) {
        final float[] linear = Colors.toLinear(rgbaType, n, n2, n3, n4);
        nSetParameterFloat4(this.getNativeObject(), s, linear[0], linear[1], linear[2], linear[3]);
    }
    
    public void setParameter(final String s, final BooleanElement booleanElement, final boolean[] array, final int n, final int n2) {
        nSetBooleanParameterArray(this.getNativeObject(), s, booleanElement.ordinal(), array, n, n2);
    }
    
    public void setParameter(final String s, final FloatElement floatElement, final float[] array, final int n, final int n2) {
        nSetFloatParameterArray(this.getNativeObject(), s, floatElement.ordinal(), array, n, n2);
    }
    
    public void setParameter(final String s, final IntElement intElement, final int[] array, final int n, final int n2) {
        nSetIntParameterArray(this.getNativeObject(), s, intElement.ordinal(), array, n, n2);
    }
    
    public void setParameter(final String s, final Texture texture, final TextureSampler textureSampler) {
        nSetParameterTexture(this.getNativeObject(), s, texture.getNativeObject(), textureSampler.mSampler);
    }
    
    public void setParameter(final String s, final boolean b) {
        nSetParameterBool(this.getNativeObject(), s, b);
    }
    
    public void setParameter(final String s, final boolean b, final boolean b2) {
        nSetParameterBool2(this.getNativeObject(), s, b, b2);
    }
    
    public void setParameter(final String s, final boolean b, final boolean b2, final boolean b3) {
        nSetParameterBool3(this.getNativeObject(), s, b, b2, b3);
    }
    
    public void setParameter(final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        nSetParameterBool4(this.getNativeObject(), s, b, b2, b3, b4);
    }
    
    public void setPolygonOffset(final float n, final float n2) {
        nSetPolygonOffset(this.getNativeObject(), n, n2);
    }
    
    public void setScissor(final int n, final int n2, final int n3, final int n4) {
        nSetScissor(this.getNativeObject(), n, n2, n3, n4);
    }
    
    public void setSpecularAntiAliasingThreshold(final float n) {
        nSetSpecularAntiAliasingThreshold(this.getNativeObject(), n);
    }
    
    public void setSpecularAntiAliasingVariance(final float n) {
        nSetSpecularAntiAliasingVariance(this.getNativeObject(), n);
    }
    
    public void unsetScissor() {
        nUnsetScissor(this.getNativeObject());
    }
    
    public enum BooleanElement
    {
        BOOL, 
        BOOL2, 
        BOOL3, 
        BOOL4;
    }
    
    public enum FloatElement
    {
        FLOAT, 
        FLOAT2, 
        FLOAT3, 
        FLOAT4, 
        MAT3, 
        MAT4;
    }
    
    public enum IntElement
    {
        INT, 
        INT2, 
        INT3, 
        INT4;
    }
}
