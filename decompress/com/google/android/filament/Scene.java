// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class Scene
{
    private IndirectLight mIndirectLight;
    private long mNativeObject;
    private Skybox mSkybox;
    
    public Scene(final long mNativeObject) {
        this.mNativeObject = mNativeObject;
    }
    
    private static native void nAddEntities(final long p0, final int[] p1);
    
    private static native void nAddEntity(final long p0, final int p1);
    
    private static native int nGetLightCount(final long p0);
    
    private static native int nGetRenderableCount(final long p0);
    
    private static native void nRemove(final long p0, final int p1);
    
    private static native void nRemoveEntities(final long p0, final int[] p1);
    
    private static native void nSetIndirectLight(final long p0, final long p1);
    
    private static native void nSetSkybox(final long p0, final long p1);
    
    public void addEntities(@Entity final int[] array) {
        nAddEntities(this.getNativeObject(), array);
    }
    
    public void addEntity(@Entity final int n) {
        nAddEntity(this.getNativeObject(), n);
    }
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public IndirectLight getIndirectLight() {
        return this.mIndirectLight;
    }
    
    public int getLightCount() {
        return nGetLightCount(this.getNativeObject());
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed Scene");
    }
    
    public int getRenderableCount() {
        return nGetRenderableCount(this.getNativeObject());
    }
    
    public Skybox getSkybox() {
        return this.mSkybox;
    }
    
    @Deprecated
    public void remove(@Entity final int n) {
        this.removeEntity(n);
    }
    
    public void removeEntities(@Entity final int[] array) {
        nRemoveEntities(this.getNativeObject(), array);
    }
    
    public void removeEntity(@Entity final int n) {
        nRemove(this.getNativeObject(), n);
    }
    
    public void setIndirectLight(IndirectLight mIndirectLight) {
        this.mIndirectLight = mIndirectLight;
        final long nativeObject = this.getNativeObject();
        mIndirectLight = this.mIndirectLight;
        long nativeObject2;
        if (mIndirectLight != null) {
            nativeObject2 = mIndirectLight.getNativeObject();
        }
        else {
            nativeObject2 = 0L;
        }
        nSetIndirectLight(nativeObject, nativeObject2);
    }
    
    public void setSkybox(Skybox mSkybox) {
        this.mSkybox = mSkybox;
        final long nativeObject = this.getNativeObject();
        mSkybox = this.mSkybox;
        long nativeObject2;
        if (mSkybox != null) {
            nativeObject2 = mSkybox.getNativeObject();
        }
        else {
            nativeObject2 = 0L;
        }
        nSetSkybox(nativeObject, nativeObject2);
    }
}
