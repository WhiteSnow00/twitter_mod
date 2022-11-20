// 
// Decompiled by Procyon v0.6.0
// 

public final class y2j
{
    public static final String a;
    public static final String b;
    public static final int[] c;
    
    static {
        a = String.valueOf(Integer.MIN_VALUE);
        b = String.valueOf(Long.MIN_VALUE);
        c = new int[1000];
        int i = 0;
        int n = 0;
        while (i < 10) {
            for (int j = 0; j < 10; ++j) {
                for (int k = 0; k < 10; ++k, ++n) {
                    y2j.c[n] = (i + 48 << 16 | j + 48 << 8 | k + 48);
                }
            }
            ++i;
        }
    }
    
    public static int a(int n, final byte[] array, int n2) {
        n = y2j.c[n];
        final int n3 = n2 + 1;
        array[n2] = (byte)(n >> 16);
        n2 = n3 + 1;
        array[n3] = (byte)(n >> 8);
        array[n2] = (byte)n;
        return n2 + 1;
    }
    
    public static int b(int n, final char[] array, int n2) {
        final int n3 = y2j.c[n];
        n = n2 + 1;
        array[n2] = (char)(n3 >> 16);
        n2 = n + 1;
        array[n] = (char)(n3 >> 8 & 0x7F);
        array[n2] = (char)(n3 & 0x7F);
        return n2 + 1;
    }
    
    public static int c(final int n, final byte[] array, final int n2) {
        final int n3 = y2j.c[n];
        int n4 = n2;
        if (n > 9) {
            n4 = n2;
            if (n > 99) {
                array[n2] = (byte)(n3 >> 16);
                n4 = n2 + 1;
            }
            array[n4] = (byte)(n3 >> 8);
            ++n4;
        }
        array[n4] = (byte)n3;
        return n4 + 1;
    }
    
    public static int d(final int n, final char[] array, final int n2) {
        final int n3 = y2j.c[n];
        int n4 = n2;
        if (n > 9) {
            n4 = n2;
            if (n > 99) {
                array[n2] = (char)(n3 >> 16);
                n4 = n2 + 1;
            }
            array[n4] = (char)(n3 >> 8 & 0x7F);
            ++n4;
        }
        array[n4] = (char)(n3 & 0x7F);
        return n4 + 1;
    }
    
    public static int e(int n, final byte[] array, int n2) {
        final int n3 = n / 1000;
        final int n4 = n3 / 1000;
        final int[] c = y2j.c;
        final int n5 = c[n4];
        final int n6 = n2 + 1;
        array[n2] = (byte)(n5 >> 16);
        final int n7 = n6 + 1;
        array[n6] = (byte)(n5 >> 8);
        n2 = n7 + 1;
        array[n7] = (byte)n5;
        final int n8 = c[n3 - n4 * 1000];
        final int n9 = n2 + 1;
        array[n2] = (byte)(n8 >> 16);
        final int n10 = n9 + 1;
        array[n9] = (byte)(n8 >> 8);
        n2 = n10 + 1;
        array[n10] = (byte)n8;
        final int n11 = c[n - n3 * 1000];
        n = n2 + 1;
        array[n2] = (byte)(n11 >> 16);
        n2 = n + 1;
        array[n] = (byte)(n11 >> 8);
        array[n2] = (byte)n11;
        return n2 + 1;
    }
    
    public static int f(int n, final char[] array, int n2) {
        final int n3 = n / 1000;
        final int n4 = n3 / 1000;
        final int[] c = y2j.c;
        final int n5 = c[n4];
        final int n6 = n2 + 1;
        array[n2] = (char)(n5 >> 16);
        final int n7 = n6 + 1;
        array[n6] = (char)(n5 >> 8 & 0x7F);
        n2 = n7 + 1;
        array[n7] = (char)(n5 & 0x7F);
        final int n8 = c[n3 - n4 * 1000];
        final int n9 = n2 + 1;
        array[n2] = (char)(n8 >> 16);
        final int n10 = n9 + 1;
        array[n9] = (char)(n8 >> 8 & 0x7F);
        n2 = n10 + 1;
        array[n10] = (char)(n8 & 0x7F);
        final int n11 = c[n - n3 * 1000];
        n = n2 + 1;
        array[n2] = (char)(n11 >> 16);
        n2 = n + 1;
        array[n] = (char)(n11 >> 8 & 0x7F);
        array[n2] = (char)(n11 & 0x7F);
        return n2 + 1;
    }
    
    public static int g(int i, final byte[] array, int n) {
        int n2 = i;
        int n3 = n;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                int length;
                for (length = y2j.a.length(), i = 0; i < length; ++i, ++n) {
                    array[n] = (byte)y2j.a.charAt(i);
                }
                return n;
            }
            array[n] = 45;
            n2 = -i;
            n3 = n + 1;
        }
        if (n2 < 1000000) {
            if (n2 < 1000) {
                if (n2 < 10) {
                    i = n3 + 1;
                    array[n3] = (byte)(n2 + 48);
                }
                else {
                    i = c(n2, array, n3);
                }
            }
            else {
                i = n2 / 1000;
                i = a(n2 - i * 1000, array, c(i, array, n3));
            }
            return i;
        }
        if (n2 >= 1000000000) {
            n = n2 - 1000000000;
            if (n >= 1000000000) {
                n -= 1000000000;
                i = n3 + 1;
                array[n3] = 50;
            }
            else {
                i = n3 + 1;
                array[n3] = 49;
            }
            return e(n, array, i);
        }
        i = n2 / 1000;
        n = i / 1000;
        return a(n2 - i * 1000, array, a(i - n * 1000, array, c(n, array, n3)));
    }
    
    public static int h(int length, final char[] array, int n) {
        int n2 = length;
        int n3 = n;
        if (length < 0) {
            if (length == Integer.MIN_VALUE) {
                final String a = y2j.a;
                length = a.length();
                a.getChars(0, length, array, n);
                return length + n;
            }
            array[n] = '-';
            n2 = -length;
            n3 = n + 1;
        }
        if (n2 < 1000000) {
            if (n2 >= 1000) {
                length = n2 / 1000;
                return b(n2 - length * 1000, array, d(length, array, n3));
            }
            if (n2 < 10) {
                array[n3] = (char)(n2 + 48);
                return n3 + 1;
            }
            return d(n2, array, n3);
        }
        else {
            if (n2 >= 1000000000) {
                n = n2 - 1000000000;
                if (n >= 1000000000) {
                    n -= 1000000000;
                    length = n3 + 1;
                    array[n3] = '2';
                }
                else {
                    length = n3 + 1;
                    array[n3] = '1';
                }
                return f(n, array, length);
            }
            n = n2 / 1000;
            length = n / 1000;
            return b(n2 - n * 1000, array, b(n - length * 1000, array, d(length, array, n3)));
        }
    }
    
    public static int i(long n, final byte[] array, int n2) {
        long n3;
        int n4;
        if (n < 0L) {
            if (n > -2147483648L) {
                return g((int)n, array, n2);
            }
            if (n == Long.MIN_VALUE) {
                for (int length = y2j.b.length(), i = 0; i < length; ++i, ++n2) {
                    array[n2] = (byte)y2j.b.charAt(i);
                }
                return n2;
            }
            array[n2] = 45;
            n3 = -n;
            n4 = n2 + 1;
        }
        else {
            n3 = n;
            n4 = n2;
            if (n <= 2147483647L) {
                return g((int)n, array, n2);
            }
        }
        final long n5 = n3 / 1000000000L;
        if (n5 < 1000000000L) {
            final int n6 = (int)n5;
            if (n6 < 1000000) {
                if (n6 < 1000) {
                    n2 = c(n6, array, n4);
                }
                else {
                    final int n7 = n6 / 1000;
                    final int[] c = y2j.c;
                    final int n8 = c[n7];
                    n2 = n4;
                    if (n7 > 9) {
                        n2 = n4;
                        if (n7 > 99) {
                            array[n4] = (byte)(n8 >> 16);
                            n2 = n4 + 1;
                        }
                        array[n2] = (byte)(n8 >> 8);
                        ++n2;
                    }
                    final int n9 = n2 + 1;
                    array[n2] = (byte)n8;
                    final int n10 = c[n6 - n7 * 1000];
                    n2 = n9 + 1;
                    array[n9] = (byte)(n10 >> 16);
                    final int n11 = n2 + 1;
                    array[n2] = (byte)(n10 >> 8);
                    n2 = n11 + 1;
                    array[n11] = (byte)n10;
                }
            }
            else {
                n2 = n6 / 1000;
                final int n12 = n2 / 1000;
                final int c2 = c(n12, array, n4);
                final int[] c3 = y2j.c;
                final int n13 = c3[n2 - n12 * 1000];
                final int n14 = c2 + 1;
                array[c2] = (byte)(n13 >> 16);
                final int n15 = n14 + 1;
                array[n14] = (byte)(n13 >> 8);
                final int n16 = n15 + 1;
                array[n15] = (byte)n13;
                final int n17 = c3[n6 - n2 * 1000];
                n2 = n16 + 1;
                array[n16] = (byte)(n17 >> 16);
                final int n18 = n2 + 1;
                array[n2] = (byte)(n17 >> 8);
                n2 = n18 + 1;
                array[n18] = (byte)n17;
            }
        }
        else {
            n = n5 / 1000000000L;
            n2 = c((int)n, array, n4);
            n2 = e((int)(n5 - 1000000000L * n), array, n2);
        }
        return e((int)(n3 - n5 * 1000000000L), array, n2);
    }
    
    public static int j(long n, final char[] array, int n2) {
        long n3;
        int n4;
        if (n < 0L) {
            if (n > -2147483648L) {
                return h((int)n, array, n2);
            }
            if (n == Long.MIN_VALUE) {
                final String b = y2j.b;
                final int length = b.length();
                b.getChars(0, length, array, n2);
                return length + n2;
            }
            array[n2] = '-';
            n3 = -n;
            n4 = n2 + 1;
        }
        else {
            n3 = n;
            n4 = n2;
            if (n <= 2147483647L) {
                return h((int)n, array, n2);
            }
        }
        final long n5 = n3 / 1000000000L;
        if (n5 < 1000000000L) {
            final int n6 = (int)n5;
            if (n6 < 1000000) {
                if (n6 < 1000) {
                    n2 = d(n6, array, n4);
                }
                else {
                    final int n7 = n6 / 1000;
                    final int[] c = y2j.c;
                    final int n8 = c[n7];
                    n2 = n4;
                    if (n7 > 9) {
                        n2 = n4;
                        if (n7 > 99) {
                            array[n4] = (char)(n8 >> 16);
                            n2 = n4 + 1;
                        }
                        array[n2] = (char)(n8 >> 8 & 0x7F);
                        ++n2;
                    }
                    final int n9 = n2 + 1;
                    array[n2] = (char)(n8 & 0x7F);
                    final int n10 = c[n6 - n7 * 1000];
                    n2 = n9 + 1;
                    array[n9] = (char)(n10 >> 16);
                    final int n11 = n2 + 1;
                    array[n2] = (char)(n10 >> 8 & 0x7F);
                    n2 = n11 + 1;
                    array[n11] = (char)(n10 & 0x7F);
                }
            }
            else {
                n2 = n6 / 1000;
                final int n12 = n2 / 1000;
                final int d = d(n12, array, n4);
                final int[] c2 = y2j.c;
                final int n13 = c2[n2 - n12 * 1000];
                final int n14 = d + 1;
                array[d] = (char)(n13 >> 16);
                final int n15 = n14 + 1;
                array[n14] = (char)(n13 >> 8 & 0x7F);
                final int n16 = n15 + 1;
                array[n15] = (char)(n13 & 0x7F);
                final int n17 = c2[n6 - n2 * 1000];
                n2 = n16 + 1;
                array[n16] = (char)(n17 >> 16);
                final int n18 = n2 + 1;
                array[n2] = (char)(n17 >> 8 & 0x7F);
                n2 = n18 + 1;
                array[n18] = (char)(n17 & 0x7F);
            }
        }
        else {
            n = n5 / 1000000000L;
            n2 = d((int)n, array, n4);
            n2 = f((int)(n5 - 1000000000L * n), array, n2);
        }
        return f((int)(n3 - n5 * 1000000000L), array, n2);
    }
}
