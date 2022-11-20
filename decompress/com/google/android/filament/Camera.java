// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class Camera
{
    @Entity
    private final int mEntity;
    private long mNativeObject;
    
    public Camera(final long mNativeObject, @Entity final int mEntity) {
        this.mNativeObject = mNativeObject;
        this.mEntity = mEntity;
    }
    
    public static double computeEffectiveFocalLength(final double n, final double n2) {
        return nComputeEffectiveFocalLength(n, n2);
    }
    
    public static double computeEffectiveFov(final double n, final double n2) {
        return nComputeEffectiveFov(n, n2);
    }
    
    private static native double nComputeEffectiveFocalLength(final double p0, final double p1);
    
    private static native double nComputeEffectiveFov(final double p0, final double p1);
    
    private static native float nGetAperture(final long p0);
    
    private static native float nGetCullingFar(final long p0);
    
    private static native void nGetCullingProjectionMatrix(final long p0, final double[] p1);
    
    private static native double nGetFocalLength(final long p0);
    
    private static native float nGetFocusDistance(final long p0);
    
    private static native void nGetForwardVector(final long p0, final float[] p1);
    
    private static native void nGetLeftVector(final long p0, final float[] p1);
    
    private static native void nGetModelMatrix(final long p0, final float[] p1);
    
    private static native void nGetModelMatrixFp64(final long p0, final double[] p1);
    
    private static native float nGetNear(final long p0);
    
    private static native void nGetPosition(final long p0, final float[] p1);
    
    private static native void nGetProjectionMatrix(final long p0, final double[] p1);
    
    private static native void nGetScaling(final long p0, final double[] p1);
    
    private static native float nGetSensitivity(final long p0);
    
    private static native float nGetShutterSpeed(final long p0);
    
    private static native void nGetUpVector(final long p0, final float[] p1);
    
    private static native void nGetViewMatrix(final long p0, final float[] p1);
    
    private static native void nGetViewMatrixFp64(final long p0, final double[] p1);
    
    private static native void nLookAt(final long p0, final double p1, final double p2, final double p3, final double p4, final double p5, final double p6, final double p7, final double p8, final double p9);
    
    private static native void nSetCustomProjection(final long p0, final double[] p1, final double[] p2, final double p3, final double p4);
    
    private static native void nSetExposure(final long p0, final float p1, final float p2, final float p3);
    
    private static native void nSetFocusDistance(final long p0, final float p1);
    
    private static native void nSetLensProjection(final long p0, final double p1, final double p2, final double p3, final double p4);
    
    private static native void nSetModelMatrix(final long p0, final float[] p1);
    
    private static native void nSetModelMatrixFp64(final long p0, final double[] p1);
    
    private static native void nSetProjection(final long p0, final int p1, final double p2, final double p3, final double p4, final double p5, final double p6, final double p7);
    
    private static native void nSetProjectionFov(final long p0, final double p1, final double p2, final double p3, final double p4, final int p5);
    
    private static native void nSetScaling(final long p0, final double p1, final double p2);
    
    private static native void nSetShift(final long p0, final double p1, final double p2);
    
    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }
    
    public float getAperture() {
        return nGetAperture(this.getNativeObject());
    }
    
    public float getCullingFar() {
        return nGetCullingFar(this.getNativeObject());
    }
    
    public double[] getCullingProjectionMatrix(double[] assertMat4d) {
        assertMat4d = Asserts.assertMat4d(assertMat4d);
        nGetCullingProjectionMatrix(this.getNativeObject(), assertMat4d);
        return assertMat4d;
    }
    
    @Entity
    public int getEntity() {
        return this.mEntity;
    }
    
    public double getFocalLength() {
        return nGetFocalLength(this.getNativeObject());
    }
    
    public float getFocusDistance() {
        return nGetFocusDistance(this.getNativeObject());
    }
    
    public float[] getForwardVector(float[] assertFloat3) {
        assertFloat3 = Asserts.assertFloat3(assertFloat3);
        nGetForwardVector(this.getNativeObject(), assertFloat3);
        return assertFloat3;
    }
    
    public float[] getLeftVector(float[] assertFloat3) {
        assertFloat3 = Asserts.assertFloat3(assertFloat3);
        nGetLeftVector(this.getNativeObject(), assertFloat3);
        return assertFloat3;
    }
    
    public double[] getModelMatrix(double[] assertMat4) {
        assertMat4 = Asserts.assertMat4(assertMat4);
        nGetModelMatrixFp64(this.getNativeObject(), assertMat4);
        return assertMat4;
    }
    
    public float[] getModelMatrix(float[] assertMat4f) {
        assertMat4f = Asserts.assertMat4f(assertMat4f);
        nGetModelMatrix(this.getNativeObject(), assertMat4f);
        return assertMat4f;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed Camera");
    }
    
    public float getNear() {
        return nGetNear(this.getNativeObject());
    }
    
    public float[] getPosition(float[] assertFloat3) {
        assertFloat3 = Asserts.assertFloat3(assertFloat3);
        nGetPosition(this.getNativeObject(), assertFloat3);
        return assertFloat3;
    }
    
    public double[] getProjectionMatrix(double[] assertMat4d) {
        assertMat4d = Asserts.assertMat4d(assertMat4d);
        nGetProjectionMatrix(this.getNativeObject(), assertMat4d);
        return assertMat4d;
    }
    
    public double[] getScaling(double[] assertDouble4) {
        assertDouble4 = Asserts.assertDouble4(assertDouble4);
        nGetScaling(this.getNativeObject(), assertDouble4);
        return assertDouble4;
    }
    
    public float getSensitivity() {
        return nGetSensitivity(this.getNativeObject());
    }
    
    public float getShutterSpeed() {
        return nGetShutterSpeed(this.getNativeObject());
    }
    
    public float[] getUpVector(float[] assertFloat3) {
        assertFloat3 = Asserts.assertFloat3(assertFloat3);
        nGetUpVector(this.getNativeObject(), assertFloat3);
        return assertFloat3;
    }
    
    public double[] getViewMatrix(double[] assertMat4) {
        assertMat4 = Asserts.assertMat4(assertMat4);
        nGetViewMatrixFp64(this.getNativeObject(), assertMat4);
        return assertMat4;
    }
    
    public float[] getViewMatrix(float[] assertMat4f) {
        assertMat4f = Asserts.assertMat4f(assertMat4f);
        nGetViewMatrix(this.getNativeObject(), assertMat4f);
        return assertMat4f;
    }
    
    public void lookAt(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7, final double n8, final double n9) {
        nLookAt(this.getNativeObject(), n, n2, n3, n4, n5, n6, n7, n8, n9);
    }
    
    public void setCustomProjection(final double[] array, final double n, final double n2) {
        Asserts.assertMat4dIn(array);
        nSetCustomProjection(this.getNativeObject(), array, array, n, n2);
    }
    
    public void setCustomProjection(final double[] array, final double[] array2, final double n, final double n2) {
        Asserts.assertMat4dIn(array);
        Asserts.assertMat4dIn(array2);
        nSetCustomProjection(this.getNativeObject(), array, array2, n, n2);
    }
    
    public void setExposure(final float n) {
        this.setExposure(1.0f, 1.2f, 1.0f / n * 100.0f);
    }
    
    public void setExposure(final float n, final float n2, final float n3) {
        nSetExposure(this.getNativeObject(), n, n2, n3);
    }
    
    public void setFocusDistance(final float n) {
        nSetFocusDistance(this.getNativeObject(), n);
    }
    
    public void setLensProjection(final double n, final double n2, final double n3, final double n4) {
        nSetLensProjection(this.getNativeObject(), n, n2, n3, n4);
    }
    
    public void setModelMatrix(final double[] array) {
        Asserts.assertMat4In(array);
        nSetModelMatrixFp64(this.getNativeObject(), array);
    }
    
    public void setModelMatrix(final float[] array) {
        Asserts.assertMat4fIn(array);
        nSetModelMatrix(this.getNativeObject(), array);
    }
    
    public void setProjection(final double n, final double n2, final double n3, final double n4, final Fov fov) {
        nSetProjectionFov(this.getNativeObject(), n, n2, n3, n4, fov.ordinal());
    }
    
    public void setProjection(final Projection projection, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        nSetProjection(this.getNativeObject(), projection.ordinal(), n, n2, n3, n4, n5, n6);
    }
    
    public void setScaling(final double n, final double n2) {
        nSetScaling(this.getNativeObject(), n, n2);
    }
    
    @Deprecated
    public void setScaling(final double[] array) {
        Asserts.assertDouble4In(array);
        this.setScaling(array[0], array[1]);
    }
    
    public void setShift(final double n, final double n2) {
        nSetShift(this.getNativeObject(), n, n2);
    }
    
    public enum Fov
    {
        private static final Fov[] $VALUES;
        
        HORIZONTAL, 
        VERTICAL;
    }
    
    public enum Projection
    {
        private static final Projection[] $VALUES;
        
        ORTHO, 
        PERSPECTIVE;
    }
}
