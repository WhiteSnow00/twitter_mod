// 
// Decompiled by Procyon v0.6.0
// 

public final class prz
{
    public static final wqz a;
    
    static {
        if (uqz.e && uqz.d) {
            final int a2 = ifz.a;
        }
        a = new wqz();
    }
    
    public static int b(final CharSequence charSequence, final byte[] array, int codePoint, int n) {
        final int length = charSequence.length();
        final int n2 = n + codePoint;
        int i;
        for (i = 0; i < length; ++i) {
            n = i + codePoint;
            if (n >= n2) {
                break;
            }
            final char char1 = charSequence.charAt(i);
            if (char1 >= '\u0080') {
                break;
            }
            array[n] = (byte)char1;
        }
        if (i != length) {
            n = codePoint + i;
            codePoint = i;
            while (true) {
                final int n3 = n;
                if (codePoint >= length) {
                    return n3;
                }
                final char char2 = charSequence.charAt(codePoint);
                if (char2 < '\u0080' && n < n2) {
                    final int n4 = n + 1;
                    array[n] = (byte)char2;
                    n = n4;
                }
                else if (char2 < '\u0800' && n <= n2 - 2) {
                    final int n5 = n + 1;
                    array[n] = (byte)(char2 >>> 6 | 0x3C0);
                    n = n5 + 1;
                    array[n5] = (byte)((char2 & '?') | 0x80);
                }
                else if ((char2 < '\ud800' || char2 > '\udfff') && n <= n2 - 3) {
                    final int n6 = n + 1;
                    array[n] = (byte)(char2 >>> 12 | 0x1E0);
                    final int n7 = n6 + 1;
                    array[n6] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                    n = n7 + 1;
                    array[n7] = (byte)((char2 & '?') | 0x80);
                }
                else {
                    if (n > n2 - 4) {
                        if (char2 >= '\ud800' && char2 <= '\udfff') {
                            final int n8 = codePoint + 1;
                            if (n8 == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(n8))) {
                                throw new xqz(codePoint, length);
                            }
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Failed writing ");
                        sb.append(char2);
                        sb.append(" at index ");
                        sb.append(n);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    final int n9 = codePoint + 1;
                    if (n9 == charSequence.length()) {
                        break;
                    }
                    final char char3 = charSequence.charAt(n9);
                    if (!Character.isSurrogatePair(char2, char3)) {
                        codePoint = n9;
                        break;
                    }
                    codePoint = Character.toCodePoint(char2, char3);
                    final int n10 = n + 1;
                    array[n] = (byte)(codePoint >>> 18 | 0xF0);
                    n = n10 + 1;
                    array[n10] = (byte)((codePoint >>> 12 & 0x3F) | 0x80);
                    final int n11 = n + 1;
                    array[n] = (byte)((codePoint >>> 6 & 0x3F) | 0x80);
                    n = n11 + 1;
                    array[n11] = (byte)((codePoint & 0x3F) | 0x80);
                    codePoint = n9;
                }
                ++codePoint;
            }
            throw new xqz(codePoint - 1, length);
        }
        return codePoint + length;
    }
    
    public static int c(final CharSequence charSequence) {
        final int length = charSequence.length();
        final int n = 0;
        int i;
        for (i = 0; i < length && charSequence.charAt(i) < '\u0080'; ++i) {}
        int n2 = length;
        int n3;
        while (true) {
            n3 = n2;
            if (i >= length) {
                break;
            }
            final char char1 = charSequence.charAt(i);
            if (char1 >= '\u0800') {
                final int length2 = charSequence.length();
                int n4 = n;
                while (i < length2) {
                    final char char2 = charSequence.charAt(i);
                    int n5;
                    if (char2 < '\u0800') {
                        n4 += '\u007f' - char2 >>> 31;
                        n5 = i;
                    }
                    else {
                        final int n6 = n4 += 2;
                        n5 = i;
                        if (char2 >= '\ud800') {
                            n4 = n6;
                            n5 = i;
                            if (char2 <= '\udfff') {
                                if (Character.codePointAt(charSequence, i) < 65536) {
                                    throw new xqz(i, length2);
                                }
                                n5 = i + 1;
                                n4 = n6;
                            }
                        }
                    }
                    i = n5 + 1;
                }
                n3 = n2 + n4;
                break;
            }
            n2 += '\u007f' - char1 >>> 31;
            ++i;
        }
        if (n3 >= length) {
            return n3;
        }
        final StringBuilder g = w48.g("UTF-8 length does not fit in int: ");
        g.append(n3 + 4294967296L);
        throw new IllegalArgumentException(g.toString());
    }
    
    public static boolean d(final byte[] array, final int n, final int n2) {
        return prz.a.a(array, n, n2);
    }
}
