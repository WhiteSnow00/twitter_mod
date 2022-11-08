import java.util.Objects;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w6m
{
    public final r0c a;
    
    public w6m(final r0c a) {
        this.a = a;
    }
    
    public final void a(final int[] array, int n) throws ReedSolomonException {
        final s0c s0c = new s0c(this.a, array);
        final int[] array2 = new int[n];
        final int n2 = 0;
        int i = 0;
        boolean b = true;
        while (i < n) {
            final r0c a = this.a;
            if ((array2[n - 1 - i] = s0c.b(a.a[a.g + i])) != 0) {
                b = false;
            }
            ++i;
        }
        if (b) {
            return;
        }
        final s0c s0c2 = new s0c(this.a, array2);
        final s0c a2 = this.a.a(n, 1);
        s0c s0c3 = s0c2;
        s0c s0c4 = a2;
        if (a2.b.length - 1 < s0c2.b.length - 1) {
            s0c4 = s0c2;
            s0c3 = a2;
        }
        final r0c a3 = this.a;
        s0c c = a3.c;
        s0c d;
        s0c a4;
        s0c s0c5;
        s0c a5;
        s0c s0c7;
        for (d = a3.d, a4 = s0c4, s0c5 = s0c3; s0c5.b.length - 1 >= n / 2; s0c5 = a4, a4 = s0c7, c = d, d = a5) {
            if (s0c5.d()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            s0c s0c6 = this.a.c;
            final int b2 = this.a.b(s0c5.c(s0c5.b.length - 1));
            while (a4.b.length - 1 >= s0c5.b.length - 1 && !a4.d()) {
                final int[] b3 = a4.b;
                final int n3 = b3.length - 1 - (s0c5.b.length - 1);
                final int c2 = this.a.c(a4.c(b3.length - 1), b2);
                s0c6 = s0c6.a(this.a.a(n3, c2));
                a4 = a4.a(s0c5.g(n3, c2));
            }
            a5 = s0c6.f(d).a(c);
            if (a4.b.length - 1 >= s0c5.b.length - 1) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            s0c7 = s0c5;
        }
        n = d.c(0);
        if (n != 0) {
            n = this.a.b(n);
            final s0c[] array3 = { d.e(n), s0c5.e(n) };
            final s0c s0c8 = array3[0];
            final s0c s0c9 = array3[1];
            final int n4 = s0c8.b.length - 1;
            int[] array4;
            if (n4 == 1) {
                array4 = new int[] { s0c8.c(1) };
            }
            else {
                array4 = new int[n4];
                int n5;
                int n6;
                for (n = 1, n5 = 0; n < this.a.e && n5 < n4; ++n, n5 = n6) {
                    n6 = n5;
                    if (s0c8.b(n) == 0) {
                        array4[n5] = this.a.b(n);
                        n6 = n5 + 1;
                    }
                }
                if (n5 != n4) {
                    throw new ReedSolomonException("Error locator degree does not match number of roots");
                }
            }
            final int length = array4.length;
            final int[] array5 = new int[length];
            n = 0;
            int j;
            while (true) {
                j = n2;
                if (n >= length) {
                    break;
                }
                final int b4 = this.a.b(array4[n]);
                int k = 0;
                int n7 = 1;
                while (k < length) {
                    int c3 = n7;
                    if (n != k) {
                        final int c4 = this.a.c(array4[k], b4);
                        int n8;
                        if ((c4 & 0x1) == 0x0) {
                            n8 = (c4 | 0x1);
                        }
                        else {
                            n8 = (c4 & 0xFFFFFFFE);
                        }
                        c3 = this.a.c(n7, n8);
                    }
                    ++k;
                    n7 = c3;
                }
                array5[n] = this.a.c(s0c9.b(b4), this.a.b(n7));
                final r0c a6 = this.a;
                if (a6.g != 0) {
                    array5[n] = a6.c(array5[n], b4);
                }
                ++n;
            }
            while (j < array4.length) {
                final int length2 = array.length;
                final r0c a7 = this.a;
                n = array4[j];
                Objects.requireNonNull(a7);
                if (n == 0) {
                    throw new IllegalArgumentException();
                }
                n = length2 - 1 - a7.b[n];
                if (n < 0) {
                    throw new ReedSolomonException("Bad error location");
                }
                array[n] ^= array5[j];
                ++j;
            }
            return;
        }
        throw new ReedSolomonException("sigmaTilde(0) was zero");
    }
}
