// 
// Decompiled by Procyon v0.6.0
// 

public final class jy6
{
    public static final a Companion;
    public static final long a;
    
    static {
        Companion = new a();
        a = zi8.d(0.0f, 0.0f);
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static final float b(final long n) {
        return Float.intBitsToFloat((int)(n >> 32));
    }
    
    public static final float c(final long n) {
        return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
    }
    
    public static int d(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static String e(final long n) {
        String s;
        if (b(n) == c(n)) {
            final StringBuilder g = w48.g("CornerRadius.circular(");
            g.append(oyz.c0(b(n)));
            g.append(')');
            s = g.toString();
        }
        else {
            final StringBuilder g2 = w48.g("CornerRadius.elliptical(");
            g2.append(oyz.c0(b(n)));
            g2.append(", ");
            g2.append(oyz.c0(c(n)));
            g2.append(')');
            s = g2.toString();
        }
        return s;
    }
    
    public static final class a
    {
    }
}
