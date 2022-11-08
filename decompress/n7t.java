import java.util.Locale;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n7t
{
    public static final List<Integer> a;
    
    static {
        a = ijf.w((Object)17, (Object[])new Integer[] { 34 });
    }
    
    public static boolean a(final int n) {
        return n == 14 || n == 61;
    }
    
    public static boolean b(final int n) {
        return n7t.a.contains(n);
    }
    
    public static boolean c(final int n) {
        return n == 7 || n == 8 || n == 9 || n == 6;
    }
    
    public static boolean d(final int n) {
        return e(n) || n == 5 || n == 29 || n == 15;
    }
    
    public static boolean e(final int n) {
        return n == 27 || n == 28 || n == 2;
    }
    
    public static boolean f(final int n) {
        return n == 21;
    }
    
    public static int g(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Timeline type %d has no matching TweetGroupType value", n));
            }
            case 29: {
                return 2;
            }
            case 17:
            case 34: {
                return 0;
            }
            case 6:
            case 7:
            case 8:
            case 9: {
                return 6;
            }
            case 1:
            case 2:
            case 3:
            case 5:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 21:
            case 22:
            case 23:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case 35:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67: {
                return 42;
            }
        }
    }
}
