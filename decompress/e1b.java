import java.io.IOException;
import com.google.android.exoplayer2.ParserException;
import java.util.Objects;
import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e1b implements ina
{
    public final byte[] a;
    public final rwj b;
    public final boolean c;
    public final f1b.a d;
    public nna e;
    public ewt f;
    public int g;
    public z8h h;
    public j1b i;
    public int j;
    public int k;
    public d1b l;
    public int m;
    public long n;
    
    static {
        final c71 j0 = c71.J0;
    }
    
    public e1b() {
        this.a = new byte[42];
        this.b = new rwj(new byte[32768], 0);
        this.c = false;
        this.d = new f1b.a();
        this.g = 0;
    }
    
    @Override
    public final int a(jna b, final zrk zrk) throws IOException {
        final int g = this.g;
        int n = 1;
        final boolean b2 = true;
        final int n2 = 0;
        if (g == 0) {
            final boolean c = this.c;
            b.e();
            final long h = b.h();
            final z8h a = g1b.a(b, c ^ true);
            b.k((int)(b.h() - h));
            this.h = a;
            this.g = 1;
            return 0;
        }
        if (g == 1) {
            final byte[] a2 = this.a;
            b.n(a2, 0, a2.length);
            b.e();
            this.g = 2;
            return 0;
        }
        if (g != 2) {
            int n3 = 7;
            if (g == 3) {
                j1b i = this.i;
                boolean f = false;
                while (!f) {
                    b.e();
                    final nhx nhx = new nhx(new byte[4], 1, (da8)null);
                    b.n(nhx.b, 0, 4);
                    f = nhx.f();
                    final int g2 = nhx.g(7);
                    final int n4 = nhx.g(24) + 4;
                    if (g2 == 0) {
                        final byte[] array = new byte[38];
                        b.readFully(array, 0, 38);
                        i = new j1b(array, 4);
                    }
                    else {
                        if (i == null) {
                            throw new IllegalArgumentException();
                        }
                        if (g2 == 3) {
                            final rwj rwj = new rwj(n4);
                            b.readFully(rwj.a, 0, n4);
                            i = i.a(g1b.b(rwj));
                        }
                        else if (g2 == 4) {
                            final rwj rwj2 = new rwj(n4);
                            b.readFully(rwj2.a, 0, n4);
                            rwj2.E(4);
                            i = new j1b(i.a, i.b, i.c, i.d, i.e, i.g, i.h, i.j, i.k, i.e(rhx.b(Arrays.asList(rhx.c(rwj2, false, false).a))));
                        }
                        else if (g2 == 6) {
                            final rwj rwj3 = new rwj(n4);
                            b.readFully(rwj3.a, 0, n4);
                            rwj3.E(4);
                            i = new j1b(i.a, i.b, i.c, i.d, i.e, i.g, i.h, i.j, i.k, i.e(new z8h((List)edd.t(uck.a(rwj3)))));
                        }
                        else {
                            b.k(n4);
                        }
                    }
                    final int a3 = cnw.a;
                    this.i = i;
                }
                Objects.requireNonNull(this.i);
                this.j = Math.max(this.i.c, 6);
                final ewt f2 = this.f;
                final int a4 = cnw.a;
                f2.e(this.i.d(this.a, this.h));
                this.g = 4;
                return 0;
            }
            final long n5 = 0L;
            if (g != 4) {
                if (g == 5) {
                    Objects.requireNonNull(this.f);
                    Objects.requireNonNull(this.i);
                    final d1b l = this.l;
                    int a5;
                    if (l != null && ((ay1)l).b()) {
                        a5 = ((ay1)this.l).a(b, zrk);
                    }
                    else {
                        if (this.n != -1L) {
                            final rwj b3 = this.b;
                            final int c2 = b3.c;
                            int n6;
                            if (c2 < 32768) {
                                final int b4 = b.b(b3.a, c2, 32768 - c2);
                                if (b4 != -1) {
                                    n = 0;
                                }
                                if (n == 0) {
                                    this.b.C(c2 + b4);
                                    n6 = n;
                                }
                                else {
                                    final rwj b5 = this.b;
                                    n6 = n;
                                    if (b5.c - b5.b == 0) {
                                        this.d();
                                        a5 = -1;
                                        return a5;
                                    }
                                }
                            }
                            else {
                                n6 = 0;
                            }
                            final rwj b6 = this.b;
                            final int b7 = b6.b;
                            final int m = this.m;
                            final int j = this.j;
                            if (m < j) {
                                b6.E(Math.min(j - m, b6.c - b7));
                            }
                            b = (jna)this.b;
                            Objects.requireNonNull(this.i);
                            int k = ((rwj)b).b;
                        Label_0661:
                            while (true) {
                                while (k <= ((rwj)b).c - 16) {
                                    ((rwj)b).D(k);
                                    if (f1b.a((rwj)b, this.i, this.k, this.d)) {
                                        ((rwj)b).D(k);
                                        final long n7 = this.d.a;
                                        final rwj b8 = this.b;
                                        final int n8 = b8.b - b7;
                                        b8.D(b7);
                                        this.f.d(this.b, n8);
                                        this.m += n8;
                                        if (n7 != -1L) {
                                            this.d();
                                            this.m = 0;
                                            this.n = n7;
                                        }
                                        final rwj b9 = this.b;
                                        final int c3 = b9.c;
                                        final int b10 = b9.b;
                                        final int n9 = c3 - b10;
                                        a5 = n2;
                                        if (n9 < 16) {
                                            final byte[] a6 = b9.a;
                                            System.arraycopy(a6, b10, a6, 0, n9);
                                            this.b.D(0);
                                            this.b.C(n9);
                                            a5 = n2;
                                            return a5;
                                        }
                                        return a5;
                                    }
                                    else {
                                        ++k;
                                    }
                                }
                                if (n6 != 0) {
                                    while (true) {
                                        final int c4 = ((rwj)b).c;
                                        if (k > c4 - this.j) {
                                            ((rwj)b).D(c4);
                                            break;
                                        }
                                        ((rwj)b).D(k);
                                        boolean a7;
                                        try {
                                            a7 = f1b.a((rwj)b, this.i, this.k, this.d);
                                        }
                                        catch (final IndexOutOfBoundsException ex) {
                                            a7 = false;
                                        }
                                        if (((rwj)b).b > ((rwj)b).c) {
                                            a7 = false;
                                        }
                                        if (a7) {
                                            ((rwj)b).D(k);
                                            final long n7 = this.d.a;
                                            continue Label_0661;
                                        }
                                        ++k;
                                    }
                                }
                                else {
                                    ((rwj)b).D(k);
                                }
                                final long n7 = -1L;
                                continue Label_0661;
                            }
                        }
                        final j1b i2 = this.i;
                        b.e();
                        b.i(1);
                        final byte[] array2 = { 0 };
                        b.n(array2, 0, 1);
                        final boolean b11 = (array2[0] & 0x1) == 0x1;
                        b.i(2);
                        if (!b11) {
                            n3 = 6;
                        }
                        final rwj rwj4 = new rwj(n3);
                        final byte[] a8 = rwj4.a;
                        int n10;
                        int j2;
                        for (n10 = 0; n10 < n3; n10 += j2) {
                            j2 = b.j(a8, 0 + n10, n3 - n10);
                            if (j2 == -1) {
                                break;
                            }
                        }
                        rwj4.C(n10);
                        b.e();
                        long z;
                        int n11;
                        try {
                            z = rwj4.z();
                            if (b11) {
                                n11 = (b2 ? 1 : 0);
                            }
                            else {
                                z *= i2.b;
                                n11 = (b2 ? 1 : 0);
                            }
                        }
                        catch (final NumberFormatException ex2) {
                            n11 = 0;
                            z = n5;
                        }
                        if (n11 == 0) {
                            throw ParserException.a((String)null, (Throwable)null);
                        }
                        this.n = z;
                        a5 = n2;
                    }
                    return a5;
                }
                throw new IllegalStateException();
            }
            else {
                b.e();
                final byte[] array3 = new byte[2];
                b.n(array3, 0, 2);
                final int k2 = (array3[1] & 0xFF) | (array3[0] & 0xFF) << 8;
                if (k2 >> 2 == 16382) {
                    b.e();
                    this.k = k2;
                    final nna e = this.e;
                    final int a9 = cnw.a;
                    final long position = b.getPosition();
                    final long length = b.getLength();
                    Objects.requireNonNull(this.i);
                    final j1b i3 = this.i;
                    Object a10;
                    if (i3.k != null) {
                        a10 = new i1b(i3, position);
                    }
                    else if (length != -1L && i3.j > 0L) {
                        final d1b l2 = new d1b(i3, this.k, position, length);
                        this.l = l2;
                        a10 = ((ay1)l2).a;
                    }
                    else {
                        a10 = new vbp.b(i3.c());
                    }
                    e.l((vbp)a10);
                    this.g = 5;
                    return 0;
                }
                b.e();
                throw ParserException.a("First frame does not start with sync code.", (Throwable)null);
            }
        }
        else {
            final byte[] array4 = new byte[4];
            b.readFully(array4, 0, 4);
            if ((((long)array4[0] & 0xFFL) << 24 | ((long)array4[1] & 0xFFL) << 16 | ((long)array4[2] & 0xFFL) << 8 | ((long)array4[3] & 0xFFL)) == 0x664C6143L) {
                this.g = 3;
                return 0;
            }
            throw ParserException.a("Failed to read FLAC stream marker.", (Throwable)null);
        }
    }
    
    @Override
    public final boolean b(final jna jna) throws IOException {
        boolean b = false;
        g1b.a(jna, false);
        final byte[] array = new byte[4];
        ((pg8)jna).c(array, 0, 4, false);
        if ((((long)array[0] & 0xFFL) << 24 | ((long)array[1] & 0xFFL) << 16 | ((long)array[2] & 0xFFL) << 8 | (0xFFL & (long)array[3])) == 0x664C6143L) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final void c(long n, final long n2) {
        final long n3 = 0L;
        if (n == 0L) {
            this.g = 0;
        }
        else {
            final d1b l = this.l;
            if (l != null) {
                ((ay1)l).e(n2);
            }
        }
        if (n2 == 0L) {
            n = n3;
        }
        else {
            n = -1L;
        }
        this.n = n;
        this.m = 0;
        this.b.A(0);
    }
    
    public final void d() {
        final long n = this.n;
        final j1b i = this.i;
        final int a = cnw.a;
        this.f.b(n * 1000000L / i.e, 1, this.m, 0, null);
    }
    
    @Override
    public final void i(final nna e) {
        this.e = e;
        this.f = e.n(0, 1);
        e.m();
    }
    
    @Override
    public final void release() {
    }
}
