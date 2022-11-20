// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

final class Asserts
{
    private Asserts() {
    }
    
    public static double[] assertDouble4(double[] array) {
        if (array == null) {
            array = new double[4];
        }
        else if (array.length < 4) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
        }
        return array;
    }
    
    public static void assertDouble4In(final double[] array) {
        if (array.length >= 4) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }
    
    public static float[] assertFloat3(float[] array) {
        if (array == null) {
            array = new float[3];
        }
        else if (array.length < 3) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
        }
        return array;
    }
    
    public static void assertFloat3In(final float[] array) {
        if (array.length >= 3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 3");
    }
    
    public static float[] assertFloat4(float[] array) {
        if (array == null) {
            array = new float[4];
        }
        else if (array.length < 4) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
        }
        return array;
    }
    
    public static void assertFloat4In(final float[] array) {
        if (array.length >= 4) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 4");
    }
    
    public static float[] assertMat3f(float[] array) {
        if (array == null) {
            array = new float[9];
        }
        else if (array.length < 9) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
        }
        return array;
    }
    
    public static void assertMat3fIn(final float[] array) {
        if (array.length >= 9) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 9");
    }
    
    public static double[] assertMat4(double[] array) {
        if (array == null) {
            array = new double[16];
        }
        else if (array.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
        return array;
    }
    
    public static void assertMat4In(final double[] array) {
        if (array.length >= 16) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }
    
    public static double[] assertMat4d(double[] array) {
        if (array == null) {
            array = new double[16];
        }
        else if (array.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
        return array;
    }
    
    public static void assertMat4dIn(final double[] array) {
        if (array.length >= 16) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }
    
    public static float[] assertMat4f(float[] array) {
        if (array == null) {
            array = new float[16];
        }
        else if (array.length < 16) {
            throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
        }
        return array;
    }
    
    public static void assertMat4fIn(final float[] array) {
        if (array.length >= 16) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Array length must be at least 16");
    }
}
