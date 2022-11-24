import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uov
{
    public static final BitSet a;
    public static final BitSet b;
    public static final BitSet c;
    public static final BitSet d;
    public static final BitSet e;
    public static final BitSet f;
    public static final BitSet g;
    
    static {
        a = new BitSet(256);
        b = new BitSet(256);
        c = new BitSet(256);
        d = new BitSet(256);
        e = new BitSet(256);
        f = new BitSet(256);
        g = new BitSet(256);
        for (int i = 97; i <= 122; ++i) {
            uov.a.set(i);
        }
        for (int j = 65; j <= 90; ++j) {
            uov.a.set(j);
        }
        for (int k = 48; k <= 57; ++k) {
            uov.a.set(k);
        }
        final BitSet a2 = uov.a;
        a2.set(95);
        a2.set(45);
        a2.set(46);
        a2.set(42);
        uov.g.or(a2);
        a2.set(33);
        a2.set(126);
        a2.set(39);
        a2.set(40);
        a2.set(41);
        final BitSet b2 = uov.b;
        b2.set(44);
        b2.set(59);
        b2.set(58);
        b2.set(36);
        b2.set(38);
        b2.set(43);
        b2.set(61);
        final BitSet c2 = uov.c;
        c2.or(a2);
        c2.or(b2);
        final BitSet d2 = uov.d;
        d2.or(a2);
        d2.set(47);
        d2.set(59);
        d2.set(58);
        d2.set(64);
        d2.set(38);
        d2.set(61);
        d2.set(43);
        d2.set(36);
        d2.set(44);
        final BitSet f2 = uov.f;
        f2.set(59);
        f2.set(47);
        f2.set(63);
        f2.set(58);
        f2.set(64);
        f2.set(38);
        f2.set(61);
        f2.set(43);
        f2.set(36);
        f2.set(44);
        f2.set(91);
        f2.set(93);
        final BitSet e2 = uov.e;
        e2.or(f2);
        e2.or(a2);
    }
    
    public static String a(final String s, final String s2) {
        if (s == null) {
            return null;
        }
        Charset charset;
        if (s2 != null) {
            charset = Charset.forName(s2);
        }
        else {
            charset = ik6.a;
        }
        final BitSet g = uov.g;
        final StringBuilder sb = new StringBuilder();
        final ByteBuffer encode = charset.encode(s);
        while (encode.hasRemaining()) {
            final int n = encode.get() & 0xFF;
            if (g.get(n)) {
                sb.append((char)n);
            }
            else if (n == 32) {
                sb.append('+');
            }
            else {
                sb.append("%");
                final char upperCase = Character.toUpperCase(Character.forDigit(n >> 4 & 0xF, 16));
                final char upperCase2 = Character.toUpperCase(Character.forDigit(n & 0xF, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }
}
