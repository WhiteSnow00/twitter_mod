// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.gltfio;

import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Engine;
import com.google.android.filament.VertexBuffer$VertexAttribute;

public class UbershaderLoader implements MaterialProvider
{
    private static final VertexBuffer$VertexAttribute[] sVertexAttributesValues;
    private long mNativeObject;
    
    static {
        sVertexAttributesValues = VertexBuffer$VertexAttribute.values();
    }
    
    public UbershaderLoader(final Engine engine) {
        this.mNativeObject = nCreateUbershaderLoader(engine.getNativeObject());
    }
    
    private static native long nCreateMaterialInstance(final long p0, final MaterialProvider$MaterialKey p1, final int[] p2, final String p3);
    
    private static native long nCreateUbershaderLoader(final long p0);
    
    private static native void nDestroyMaterials(final long p0);
    
    private static native void nDestroyUbershaderLoader(final long p0);
    
    private static native int nGetMaterialCount(final long p0);
    
    private static native void nGetMaterials(final long p0, final long[] p1);
    
    public MaterialInstance createMaterialInstance(final MaterialProvider$MaterialKey materialProvider$MaterialKey, final int[] array, final String s, final String s2) {
        final long nCreateMaterialInstance = nCreateMaterialInstance(this.mNativeObject, materialProvider$MaterialKey, array, s);
        MaterialInstance materialInstance = null;
        if (nCreateMaterialInstance != 0L) {
            materialInstance = new MaterialInstance((Engine)null, nCreateMaterialInstance);
        }
        return materialInstance;
    }
    
    public void destroy() {
        nDestroyUbershaderLoader(this.mNativeObject);
        this.mNativeObject = 0L;
    }
    
    public void destroyMaterials() {
        nDestroyMaterials(this.mNativeObject);
    }
    
    public Material[] getMaterials() {
        final int nGetMaterialCount = nGetMaterialCount(this.mNativeObject);
        final Material[] array = new Material[nGetMaterialCount];
        final long[] array2 = new long[nGetMaterialCount];
        nGetMaterials(this.mNativeObject, array2);
        for (int i = 0; i < nGetMaterialCount; ++i) {
            array[i] = new Material(array2[i]);
        }
        return array;
    }
    
    public long getNativeObject() {
        return this.mNativeObject;
    }
    
    public boolean needsDummyData(int n) {
        n = UbershaderLoader$1.$SwitchMap$com$google$android$filament$VertexBuffer$VertexAttribute[((Enum)UbershaderLoader.sVertexAttributesValues[n]).ordinal()];
        return n == 1 || n == 2 || n == 3;
    }
}
