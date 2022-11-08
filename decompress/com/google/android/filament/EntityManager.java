// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import com.google.android.filament.proguard.UsedByReflection;

public class EntityManager
{
    private long mNativeObject;
    
    private EntityManager() {
        this.mNativeObject = nGetEntityManager();
    }
    
    public EntityManager(final long mNativeObject) {
        nGetEntityManager();
        this.mNativeObject = mNativeObject;
    }
    
    public static EntityManager get() {
        return Holder.INSTANCE;
    }
    
    private static native int nCreate(final long p0);
    
    private static native void nCreateArray(final long p0, final int p1, final int[] p2);
    
    private static native void nDestroy(final long p0, final int p1);
    
    private static native void nDestroyArray(final long p0, final int p1, final int[] p2);
    
    private static native long nGetEntityManager();
    
    private static native boolean nIsAlive(final long p0, final int p1);
    
    @Entity
    public int create() {
        return nCreate(this.mNativeObject);
    }
    
    @Entity
    public int[] create(final int n) {
        if (n >= 1) {
            final int[] array = new int[n];
            nCreateArray(this.mNativeObject, n, array);
            return array;
        }
        throw new ArrayIndexOutOfBoundsException("n must be at least 1");
    }
    
    public int[] create(@Entity final int[] array) {
        nCreateArray(this.mNativeObject, array.length, array);
        return array;
    }
    
    public void destroy(@Entity final int n) {
        nDestroy(this.mNativeObject, n);
    }
    
    public void destroy(@Entity final int[] array) {
        nDestroyArray(this.mNativeObject, array.length, array);
    }
    
    @UsedByReflection("AssetLoader.java")
    public long getNativeObject() {
        return this.mNativeObject;
    }
    
    public boolean isAlive(@Entity final int n) {
        return nIsAlive(this.mNativeObject, n);
    }
    
    public static class Holder
    {
        public static final EntityManager INSTANCE;
        
        static {
            INSTANCE = new EntityManager(null);
        }
        
        private Holder() {
        }
    }
}
