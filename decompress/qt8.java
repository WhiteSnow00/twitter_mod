import com.google.zxing.NotFoundException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qt8
{
    public final f02 a;
    public fsm b;
    
    public qt8(final f02 a) {
        this.a = a;
    }
    
    public final float a(final esm esm, final esm esm2) {
        final float d = this.d((int)esm.a, (int)esm.b, (int)esm2.a, (int)esm2.b);
        final float d2 = this.d((int)esm2.a, (int)esm2.b, (int)esm.a, (int)esm.b);
        if (Float.isNaN(d)) {
            return d2 / 7.0f;
        }
        if (Float.isNaN(d2)) {
            return d / 7.0f;
        }
        return (d + d2) / 14.0f;
    }
    
    public final lx b(final float n, int max, int n2, float n3) throws NotFoundException {
        final int n4 = (int)(n3 * n);
        final int max2 = Math.max(0, max - n4);
        final int n5 = Math.min(this.a.C0 - 1, max + n4) - max2;
        n3 = (float)n5;
        final float n6 = 3.0f * n;
        if (n3 < n6) {
            throw NotFoundException.E0;
        }
        max = Math.max(0, n2 - n4);
        n2 = Math.min(this.a.D0 - 1, n2 + n4) - max;
        if (n2 < n6) {
            throw NotFoundException.E0;
        }
        final mx mx = new mx(this.a, max2, max, n5, n2, n, this.b);
        final int c = mx.c;
        final int f = mx.f;
        final int n7 = mx.e + c;
        final int d = mx.d;
        final int n8 = f / 2;
        final int[] array = new int[3];
        for (int i = 0; i < f; ++i) {
            if ((i & 0x1) == 0x0) {
                max = (i + 1) / 2;
            }
            else {
                max = -((i + 1) / 2);
            }
            final int n9 = max + (n8 + d);
            array[0] = 0;
            array[2] = (array[1] = 0);
            for (n2 = c; n2 < n7 && !mx.a.c(n2, n9); ++n2) {}
            max = 0;
            for (int j = n2; j < n7; ++j) {
                if (mx.a.c(j, n9)) {
                    if (max == 1) {
                        ++array[max];
                    }
                    else if (max == 2) {
                        if (mx.a(array)) {
                            final lx lx = mx.b(array, n9, j);
                            if (lx != null) {
                                return lx;
                            }
                        }
                        array[0] = array[2];
                        array[1] = 1;
                        array[2] = 0;
                        max = 1;
                    }
                    else {
                        ++max;
                        ++array[max];
                    }
                }
                else {
                    if ((n2 = max) == 1) {
                        n2 = max + 1;
                    }
                    ++array[n2];
                    max = n2;
                }
            }
            if (mx.a(array)) {
                final lx lx = mx.b(array, n9, n7);
                if (lx != null) {
                    return lx;
                }
            }
        }
        if (!mx.b.isEmpty()) {
            return mx.b.get(0);
        }
        throw NotFoundException.E0;
    }
    
    public final float c(int i, int n, int n2, int n3) {
        final boolean b = Math.abs(n3 - n) > Math.abs(n2 - i);
        int n5;
        if (b) {
            final int n4 = n;
            n5 = n2;
            n = n3;
            n2 = n4;
            n3 = i;
            i = n;
        }
        else {
            final int n6 = i;
            i = n2;
            n5 = n3;
            n3 = n;
            n2 = n6;
        }
        final int abs = Math.abs(i - n2);
        final int n7 = n5 - n3;
        final int abs2 = Math.abs(n7);
        int n8 = -abs / 2;
        int n9 = -1;
        int n10;
        if (n2 < i) {
            n10 = 1;
        }
        else {
            n10 = -1;
        }
        if (n3 < n5) {
            n9 = 1;
        }
        final int n11 = i + n10;
        i = n2;
        n = n3;
        int n12 = 0;
        final boolean b2 = b;
        while (true) {
            while (i != n11) {
                int n13;
                if (b2) {
                    n13 = n;
                }
                else {
                    n13 = i;
                }
                int n14;
                if (b2) {
                    n14 = i;
                }
                else {
                    n14 = n;
                }
                final boolean b3 = n12 == 1;
                int n15 = n12;
                if (b3 == this.a.c(n13, n14)) {
                    if (n12 == 2) {
                        i -= n2;
                        n -= n3;
                        return (float)Math.sqrt(n * n + i * i);
                    }
                    n15 = n12 + 1;
                }
                final int n16 = n8 += abs2;
                int n17 = n;
                if (n16 > 0) {
                    if (n == n5) {
                        if (n15 == 2) {
                            i = n11 - n2;
                            return (float)Math.sqrt(n7 * n7 + i * i);
                        }
                        return Float.NaN;
                    }
                    else {
                        n17 = n + n9;
                        n8 = n16 - abs;
                    }
                }
                i += n10;
                n12 = n15;
                n = n17;
            }
            int n15 = n12;
            continue;
        }
    }
    
    public final float d(final int n, final int n2, int n3, int n4) {
        final float c = this.c(n, n2, n3, n4);
        n3 = n - (n3 - n);
        final int n5 = 0;
        float n6;
        if (n3 < 0) {
            n6 = n / (float)(n - n3);
            n3 = 0;
        }
        else {
            final int c2 = this.a.C0;
            if (n3 >= c2) {
                n6 = (c2 - 1 - n) / (float)(n3 - n);
                n3 = c2 - 1;
            }
            else {
                n6 = 1.0f;
            }
        }
        final float n7 = (float)n2;
        n4 = (int)(n7 - (n4 - n2) * n6);
        float n8;
        if (n4 < 0) {
            n8 = n7 / (n2 - n4);
            n4 = n5;
        }
        else {
            final int d0 = this.a.D0;
            if (n4 >= d0) {
                n8 = (d0 - 1 - n2) / (float)(n4 - n2);
                n4 = d0 - 1;
            }
            else {
                n8 = 1.0f;
            }
        }
        return this.c(n, n2, (int)((n3 - n) * n8 + n), n4) + c - 1.0f;
    }
}
