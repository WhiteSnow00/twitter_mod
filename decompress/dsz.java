// 
// Decompiled by Procyon v0.6.0
// 

public final class dsz
{
    public static final krz a;
    
    static {
        if (irz.e && irz.d) {
            final int a2 = wfz.a;
        }
        a = new krz();
    }
    
    public static /* bridge */ int a(final byte[] array, int n, int n2) {
        final int n3 = array[n - 1];
        n2 -= n;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    throw new AssertionError();
                }
                n2 = array[n];
                n = array[n + 1];
                if (n3 <= -12 && n2 <= -65) {
                    if (n <= -65) {
                        n = (n2 << 8 ^ n3 ^ n << 16);
                        return n;
                    }
                }
            }
            else {
                n = array[n];
                if (n3 <= -12) {
                    if (n <= -65) {
                        n = (n3 ^ n << 8);
                        return n;
                    }
                }
            }
        }
        else if ((n = n3) <= -12) {
            return n;
        }
        n = -1;
        return n;
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
                                throw new lrz(codePoint, length);
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
            throw new lrz(codePoint - 1, length);
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
                                    throw new lrz(i, length2);
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
        final StringBuilder j = fu8.j("UTF-8 length does not fit in int: ");
        j.append(n3 + 4294967296L);
        throw new IllegalArgumentException(j.toString());
    }
    
    public static boolean d(final byte[] array, final int n, final int n2) {
        return ((jrz)dsz.a).a(array, n, n2);
    }
}
