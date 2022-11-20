import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f6b implements Comparable<f6b>
{
    public static final a Companion;
    public static final float D0;
    
    static {
        Companion = new a();
        b(1.0f);
        b(-1.0f);
        D0 = Float.intBitsToFloat(1056964608);
    }
    
    public static short b(final float n) {
        Objects.requireNonNull(f6b.Companion);
        final int floatToRawIntBits = Float.floatToRawIntBits(n);
        final int n2 = floatToRawIntBits >>> 31;
        final int n3 = floatToRawIntBits >>> 23 & 0xFF;
        final int n4 = floatToRawIntBits & 0x7FFFFF;
        int n5 = 0;
        int n6 = 0;
        if (n3 == 255) {
            if (n4 != 0) {
                n6 = 512;
            }
            n5 = 31;
        }
        else {
            final int n7 = n3 - 127 + 15;
            if (n7 >= 31) {
                n6 = 0;
                n5 = 49;
            }
            else if (n7 <= 0) {
                if (n7 >= -10) {
                    int n9;
                    final int n8 = n9 = (n4 | 0x800000) >> 1 - n7;
                    if ((n8 & 0x1000) != 0x0) {
                        n9 = n8 + 8192;
                    }
                    n6 = n9 >> 13;
                }
                else {
                    n6 = 0;
                }
            }
            else {
                n6 = n4 >> 13;
                if ((n4 & 0x1000) != 0x0) {
                    n6 = (n7 << 10 | n6) + 1;
                    final int n10 = n2 << 15;
                    return (short)(n6 | n10);
                }
                n5 = n7;
            }
        }
        final int n10 = n2 << 15 | n5 << 10;
        return (short)(n6 | n10);
    }
    
    public static final float e(final short n) {
        final int n2 = n & 0xFFFF;
        final int n3 = 0x8000 & n2;
        final int n4 = n2 >>> 10 & 0x1F;
        final int n5 = n2 & 0x3FF;
        int n6 = 0;
        int n8;
        if (n4 == 0) {
            if (n5 != 0) {
                float n7 = Float.intBitsToFloat(n5 + 1056964608) - f6b.D0;
                if (n3 != 0) {
                    n7 = -n7;
                }
                return n7;
            }
            n8 = 0;
        }
        else {
            n8 = n5 << 13;
            if (n4 == 31) {
                int n9;
                if ((n9 = n8) != 0) {
                    n9 = (n8 | 0x400000);
                }
                n8 = n9;
                n6 = 255;
            }
            else {
                n6 = n4 - 15 + 127;
            }
        }
        return Float.intBitsToFloat(n8 | (n3 << 16 | n6 << 23));
    }
    
    public static final class a
    {
    }
}
