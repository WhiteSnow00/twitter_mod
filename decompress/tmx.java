import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tmx
{
    public static smx a;
    public static boolean b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    
    static {
        c = a("RIFF");
        d = a("WEBP");
        e = a("VP8 ");
        f = a("VP8L");
        g = a("VP8X");
    }
    
    public static byte[] a(final String s) {
        try {
            return s.getBytes("ASCII");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException("ASCII not found!", ex);
        }
    }
    
    public static boolean b(final byte[] array, final int n) {
        boolean b2;
        final boolean b = b2 = false;
        if (n >= 20) {
            b2 = b;
            if (d(array, 0, tmx.c)) {
                b2 = b;
                if (d(array, 8, tmx.d)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static smx c() {
        if (tmx.b) {
            return tmx.a;
        }
        smx smx = null;
        while (true) {
            try {
                smx = (smx)WebpBitmapFactoryImpl.class.newInstance();
                tmx.b = true;
                return smx;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean d(final byte[] array, final int n, final byte[] array2) {
        if (array2 == null) {
            return false;
        }
        if (array2.length + n > array.length) {
            return false;
        }
        for (int i = 0; i < array2.length; ++i) {
            if (array[i + n] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
