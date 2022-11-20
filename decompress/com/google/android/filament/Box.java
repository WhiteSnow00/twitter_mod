// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class Box
{
    private final float[] mCenter;
    private final float[] mHalfExtent;
    
    public Box() {
        this.mCenter = new float[3];
        this.mHalfExtent = new float[3];
    }
    
    public Box(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float[] mCenter = new float[3];
        this.mCenter = mCenter;
        final float[] mHalfExtent = new float[3];
        this.mHalfExtent = mHalfExtent;
        mCenter[0] = n;
        mCenter[1] = n2;
        mCenter[2] = n3;
        mHalfExtent[0] = n4;
        mHalfExtent[1] = n5;
        mHalfExtent[2] = n6;
    }
    
    public Box(final float[] array, final float[] array2) {
        final float[] mCenter = new float[3];
        this.mCenter = mCenter;
        final float[] mHalfExtent = new float[3];
        this.mHalfExtent = mHalfExtent;
        mCenter[0] = array[0];
        mCenter[1] = array[1];
        mCenter[2] = array[2];
        mHalfExtent[0] = array2[0];
        mHalfExtent[1] = array2[1];
        mHalfExtent[2] = array2[2];
    }
    
    public float[] getCenter() {
        return this.mCenter;
    }
    
    public float[] getHalfExtent() {
        return this.mHalfExtent;
    }
    
    public void setCenter(final float n, final float n2, final float n3) {
        final float[] mCenter = this.mCenter;
        mCenter[0] = n;
        mCenter[1] = n2;
        mCenter[2] = n3;
    }
    
    public void setHalfExtent(final float n, final float n2, final float n3) {
        final float[] mHalfExtent = this.mHalfExtent;
        mHalfExtent[0] = n;
        mHalfExtent[1] = n2;
        mHalfExtent[2] = n3;
    }
}
