import java.io.Writer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zsv extends Writer
{
    public static String a(final int n) {
        if (n > 1114111) {
            final StringBuilder f = ehk.f("Illegal character point (0x");
            f.append(Integer.toHexString(n));
            f.append(") to output; max is 0x10FFFF as per RFC 4627");
            return f.toString();
        }
        if (n < 55296) {
            final StringBuilder f2 = ehk.f("Illegal character point (0x");
            f2.append(Integer.toHexString(n));
            f2.append(") to output");
            return f2.toString();
        }
        if (n <= 56319) {
            final StringBuilder f3 = ehk.f("Unmatched first part of surrogate pair (0x");
            f3.append(Integer.toHexString(n));
            f3.append(")");
            return f3.toString();
        }
        final StringBuilder f4 = ehk.f("Unmatched second part of surrogate pair (0x");
        f4.append(Integer.toHexString(n));
        f4.append(")");
        return f4.toString();
    }
}
