// 
// Decompiled by Procyon v0.6.0
// 

public final class sns
{
    public final int a;
    public final long[] b;
    public final Object[] c;
    
    public sns(final int a, final long[] b, final Object[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a(final long n) {
        int n2 = this.a - 1;
        int n3 = -1;
        if (n2 != -1) {
            int i = 0;
            if (n2 != 0) {
                while (i <= n2) {
                    final int n4 = i + n2 >>> 1;
                    final long n5 = lcmp(this.b[n4] - n, 0L);
                    if (n5 < 0) {
                        i = n4 + 1;
                    }
                    else {
                        if (n5 <= 0) {
                            return n4;
                        }
                        n2 = n4 - 1;
                    }
                }
                return -(i + 1);
            }
            final long[] b = this.b;
            if (b[0] == n) {
                n3 = 0;
            }
            else {
                n3 = n3;
                if (b[0] > n) {
                    n3 = -2;
                }
            }
        }
        return n3;
    }
    
    public final sns b(long n, Object o) {
        final int a = this.a;
        final Object[] c = this.c;
        final int length = c.length;
        final int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            boolean b = true;
            if (n3 >= length) {
                break;
            }
            if (c[n3] == null) {
                b = false;
            }
            int n5 = n4;
            if (b) {
                n5 = n4 + 1;
            }
            ++n3;
            n4 = n5;
        }
        final int n6 = n4 + 1;
        final long[] array = new long[n6];
        final Object[] array2 = new Object[n6];
        if (n6 > 1) {
            int n7 = 0;
            int n8 = n2;
            int i;
            while (true) {
                i = n8;
                if (n8 >= n6) {
                    break;
                }
                i = n8;
                if (n7 >= a) {
                    break;
                }
                final long n9 = this.b[n7];
                final Object o2 = this.c[n7];
                if (n9 > n) {
                    array[n8] = n;
                    array2[n8] = o;
                    i = n8 + 1;
                    break;
                }
                int n10 = n8;
                if (o2 != null) {
                    array[n8] = n9;
                    array2[n8] = o2;
                    n10 = n8 + 1;
                }
                ++n7;
                n8 = n10;
            }
            int n11;
            if ((n11 = n7) == a) {
                final int n12 = n6 - 1;
                array[n12] = n;
                array2[n12] = o;
            }
            else {
                while (i < n6) {
                    n = this.b[n11];
                    o = this.c[n11];
                    int n13 = i;
                    if (o != null) {
                        array[i] = n;
                        array2[i] = o;
                        n13 = i + 1;
                    }
                    ++n11;
                    i = n13;
                }
            }
        }
        else {
            array[0] = n;
            array2[0] = o;
        }
        return new sns(n6, array, array2);
    }
}
