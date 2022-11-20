// 
// Decompiled by Procyon v0.6.0
// 

public final class nx6
{
    public static final a Companion;
    public static final long a;
    
    static {
        Companion = new a();
        a = lp.c(0.0f, 0.0f);
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
            final StringBuilder j = fu8.j("CornerRadius.circular(");
            j.append(max.H(b(n)));
            j.append(')');
            s = j.toString();
        }
        else {
            final StringBuilder i = fu8.j("CornerRadius.elliptical(");
            i.append(max.H(b(n)));
            i.append(", ");
            i.append(max.H(c(n)));
            i.append(')');
            s = i.toString();
        }
        return s;
    }
    
    public static final class a
    {
    }
}
