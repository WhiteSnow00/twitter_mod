// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class Colors
{
    private Colors() {
    }
    
    public static float[] cct(final float n) {
        final float[] array = new float[3];
        nCct(n, array);
        return array;
    }
    
    public static float[] illuminantD(final float n) {
        final float[] array = new float[3];
        nIlluminantD(n, array);
        return array;
    }
    
    private static native void nCct(final float p0, final float[] p1);
    
    private static native void nIlluminantD(final float p0, final float[] p1);
    
    public static float[] toLinear(final Conversion conversion, final float[] array) {
        final int n = Colors$1.$SwitchMap$com$google$android$filament$Colors$Conversion[conversion.ordinal()];
        int i = 0;
        final int n2 = 0;
        if (n != 1) {
            int j = n2;
            if (n == 2) {
                while (j < 3) {
                    array[j] = (float)Math.sqrt(array[j]);
                    ++j;
                }
            }
        }
        else {
            while (i < 3) {
                float n3;
                if (array[i] <= 0.04045f) {
                    n3 = array[i] / 12.92f;
                }
                else {
                    n3 = (float)Math.pow((array[i] + 0.055f) / 1.055f, 2.4000000953674316);
                }
                array[i] = n3;
                ++i;
            }
        }
        return array;
    }
    
    public static float[] toLinear(final RgbType rgbType, final float n, final float n2, final float n3) {
        return toLinear(rgbType, new float[] { n, n2, n3 });
    }
    
    public static float[] toLinear(final RgbType rgbType, float[] linear) {
        if (rgbType != RgbType.LINEAR) {
            linear = toLinear(Conversion.ACCURATE, linear);
        }
        return linear;
    }
    
    public static float[] toLinear(final RgbaType rgbaType, final float n, final float n2, final float n3, final float n4) {
        return toLinear(rgbaType, new float[] { n, n2, n3, n4 });
    }
    
    public static float[] toLinear(final RgbaType rgbaType, final float[] array) {
        final int n = Colors$1.$SwitchMap$com$google$android$filament$Colors$RgbaType[rgbaType.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return array;
                }
                return toLinear(Conversion.ACCURATE, array);
            }
        }
        else {
            toLinear(Conversion.ACCURATE, array);
        }
        final float n2 = array[3];
        array[0] *= n2;
        array[1] *= n2;
        array[2] *= n2;
        return array;
    }
    
    public enum Conversion
    {
        ACCURATE, 
        FAST;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD })
    public @interface LinearColor {
    }
    
    public enum RgbType
    {
        LINEAR, 
        SRGB;
    }
    
    public enum RgbaType
    {
        LINEAR, 
        PREMULTIPLIED_LINEAR, 
        PREMULTIPLIED_SRGB, 
        SRGB;
    }
}
