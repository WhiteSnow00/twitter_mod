import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gs4
{
    public static final ThreadLocal<double[]> a;
    
    static {
        a = new ThreadLocal<double[]>();
    }
    
    public static void a(final int n, final int n2, final int n3, final float[] array) {
        final float n4 = n / 255.0f;
        final float n5 = n2 / 255.0f;
        final float n6 = n3 / 255.0f;
        final float max = Math.max(n4, Math.max(n5, n6));
        final float min = Math.min(n4, Math.min(n5, n6));
        final float n7 = max - min;
        final float n8 = (max + min) / 2.0f;
        float n9;
        float n10;
        if (max == min) {
            n9 = 0.0f;
            n10 = 0.0f;
        }
        else {
            float n11;
            if (max == n4) {
                n11 = (n5 - n6) / n7 % 6.0f;
            }
            else if (max == n5) {
                n11 = (n6 - n4) / n7 + 2.0f;
            }
            else {
                n11 = 4.0f + (n4 - n5) / n7;
            }
            final float n12 = n7 / (1.0f - Math.abs(2.0f * n8 - 1.0f));
            n9 = n11;
            n10 = n12;
        }
        float n14;
        final float n13 = n14 = n9 * 60.0f % 360.0f;
        if (n13 < 0.0f) {
            n14 = n13 + 360.0f;
        }
        array[0] = i(n14, 360.0f);
        array[1] = i(n10, 1.0f);
        array[2] = i(n8, 1.0f);
    }
    
    public static int b(double n, double n2, double n3) {
        final double n4 = (-0.4986 * n3 + (-1.5372 * n2 + 3.2406 * n)) / 100.0;
        final double n5 = (0.0415 * n3 + (1.8758 * n2 + -0.9689 * n)) / 100.0;
        n3 = (1.057 * n3 + (-0.204 * n2 + 0.0557 * n)) / 100.0;
        if (n4 > 0.0031308) {
            n = Math.pow(n4, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n = n4 * 12.92;
        }
        if (n5 > 0.0031308) {
            n2 = Math.pow(n5, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n2 = n5 * 12.92;
        }
        if (n3 > 0.0031308) {
            n3 = Math.pow(n3, 0.4166666666666667) * 1.055 - 0.055;
        }
        else {
            n3 *= 12.92;
        }
        return Color.rgb(j((int)Math.round(n * 255.0)), j((int)Math.round(n2 * 255.0)), j((int)Math.round(n3 * 255.0)));
    }
    
    public static int c(final int n, final int n2, final float n3) {
        final float n4 = 1.0f - n3;
        return Color.argb((int)(Color.alpha(n2) * n3 + Color.alpha(n) * n4), (int)(Color.red(n2) * n3 + Color.red(n) * n4), (int)(Color.green(n2) * n3 + Color.green(n) * n4), (int)(Color.blue(n2) * n3 + Color.blue(n) * n4));
    }
    
    public static double d(final int n, final int n2) {
        if (Color.alpha(n2) == 255) {
            int g = n;
            if (Color.alpha(n) < 255) {
                g = g(n, n2);
            }
            final double n3 = e(g) + 0.05;
            final double n4 = e(n2) + 0.05;
            return Math.max(n3, n4) / Math.min(n3, n4);
        }
        final StringBuilder g2 = w48.g("background can not be translucent: #");
        g2.append(Integer.toHexString(n2));
        throw new IllegalArgumentException(g2.toString());
    }
    
    public static double e(int blue) {
        final ThreadLocal<double[]> a = gs4.a;
        double[] array;
        if ((array = a.get()) == null) {
            array = new double[3];
            a.set(array);
        }
        final int red = Color.red(blue);
        final int green = Color.green(blue);
        blue = Color.blue(blue);
        if (array.length == 3) {
            final double n = red / 255.0;
            double pow;
            if (n < 0.04045) {
                pow = n / 12.92;
            }
            else {
                pow = Math.pow((n + 0.055) / 1.055, 2.4);
            }
            final double n2 = green / 255.0;
            double pow2;
            if (n2 < 0.04045) {
                pow2 = n2 / 12.92;
            }
            else {
                pow2 = Math.pow((n2 + 0.055) / 1.055, 2.4);
            }
            final double n3 = blue / 255.0;
            double pow3;
            if (n3 < 0.04045) {
                pow3 = n3 / 12.92;
            }
            else {
                pow3 = Math.pow((n3 + 0.055) / 1.055, 2.4);
            }
            array[0] = (0.1805 * pow3 + (0.3576 * pow2 + 0.4124 * pow)) * 100.0;
            array[1] = (0.0722 * pow3 + (0.7152 * pow2 + 0.2126 * pow)) * 100.0;
            array[2] = (pow3 * 0.9505 + (pow2 * 0.1192 + pow * 0.0193)) * 100.0;
            return array[1] / 100.0;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
    
    public static int f(final int n, final int n2, final float n3) {
        final int alpha = Color.alpha(n2);
        int n4 = 255;
        if (alpha != 255) {
            final StringBuilder g = w48.g("background can not be translucent: #");
            g.append(Integer.toHexString(n2));
            throw new IllegalArgumentException(g.toString());
        }
        final double d = d(k(n, 255), n2);
        final double n5 = n3;
        if (d < n5) {
            return -1;
        }
        for (int n6 = 0, n7 = 0; n6 <= 10 && n4 - n7 > 1; ++n6) {
            final int n8 = (n7 + n4) / 2;
            if (d(k(n, n8), n2) < n5) {
                n7 = n8;
            }
            else {
                n4 = n8;
            }
        }
        return n4;
    }
    
    public static int g(final int n, final int n2) {
        final int alpha = Color.alpha(n2);
        final int alpha2 = Color.alpha(n);
        final int n3 = 255 - (255 - alpha2) * (255 - alpha) / 255;
        return Color.argb(n3, h(Color.red(n), alpha2, Color.red(n2), alpha, n3), h(Color.green(n), alpha2, Color.green(n2), alpha, n3), h(Color.blue(n), alpha2, Color.blue(n2), alpha, n3));
    }
    
    public static int h(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return 0;
        }
        return ((255 - n2) * (n3 * n4) + n * 255 * n2) / (n5 * 255);
    }
    
    public static float i(float min, final float n) {
        final float n2 = 0.0f;
        if (min < 0.0f) {
            min = n2;
        }
        else {
            min = Math.min(min, n);
        }
        return min;
    }
    
    public static int j(int min) {
        if (min < 0) {
            min = 0;
        }
        else {
            min = Math.min(min, 255);
        }
        return min;
    }
    
    public static int k(final int n, final int n2) {
        if (n2 >= 0 && n2 <= 255) {
            return (n & 0xFFFFFF) | n2 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
