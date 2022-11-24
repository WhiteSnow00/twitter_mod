import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import android.util.Log;
import java.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jv implements bz9
{
    public static final byte[] v;
    public final boolean a;
    public final dix b;
    public final gxj c;
    public final String d;
    public String e;
    public vwt f;
    public vwt g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public vwt t;
    public long u;
    
    static {
        v = new byte[] { 73, 68, 51 };
    }
    
    public jv(final boolean a, final String d) {
        this.b = new dix(new byte[7], 1, (j98)null);
        this.c = new gxj(Arrays.copyOf(jv.v, 10));
        this.h();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.a = a;
        this.d = d;
    }
    
    public static boolean g(final int n) {
        return (n & 0xFFF6) == 0xFFF0;
    }
    
    public final void a(final gxj gxj) throws ParserException {
        Objects.requireNonNull(this.f);
        final int a = rnw.a;
    Label_0012:
        while (true) {
            final int c = gxj.c;
            int i = gxj.b;
            final int n = c - i;
            if (n <= 0) {
                return;
            }
            final int h = this.h;
            if (h != 0) {
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h != 4) {
                                throw new IllegalStateException();
                            }
                            final int min = Math.min(n, this.r - this.i);
                            this.t.d(gxj, min);
                            final int j = this.i + min;
                            this.i = j;
                            final int r = this.r;
                            if (j != r) {
                                continue;
                            }
                            final long s = this.s;
                            if (s != -9223372036854775807L) {
                                this.t.b(s, 1, r, 0, (vwt$a)null);
                                this.s += this.u;
                            }
                            this.h();
                        }
                        else {
                            int n2;
                            if (this.k) {
                                n2 = 7;
                            }
                            else {
                                n2 = 5;
                            }
                            if (!this.b(gxj, this.b.b, n2)) {
                                continue;
                            }
                            this.b.k(0);
                            if (!this.p) {
                                final int n3 = this.b.g(2) + 1;
                                int n4;
                                if ((n4 = n3) != 2) {
                                    final StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(n3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                    n4 = 2;
                                }
                                this.b.m(5);
                                final int g = this.b.g(3);
                                final int n5 = this.n;
                                final byte[] array = { (byte)((n4 << 3 & 0xF8) | (n5 >> 1 & 0x7)), (byte)((n5 << 7 & 0x80) | (g << 3 & 0x78)) };
                                final y6$a c2 = y6.c(array);
                                final n$a n$a = new n$a();
                                n$a.a = this.e;
                                n$a.k = "audio/mp4a-latm";
                                n$a.h = c2.c;
                                n$a.x = c2.b;
                                n$a.y = c2.a;
                                n$a.m = Collections.singletonList(array);
                                n$a.c = this.d;
                                final n n6 = new n(n$a);
                                this.q = 1024000000L / n6.e1;
                                this.f.e(n6);
                                this.p = true;
                            }
                            else {
                                this.b.m(10);
                            }
                            this.b.m(4);
                            int r2 = this.b.g(13) - 2 - 5;
                            if (this.k) {
                                r2 -= 2;
                            }
                            final vwt f = this.f;
                            final long q = this.q;
                            this.h = 4;
                            this.i = 0;
                            this.t = f;
                            this.u = q;
                            this.r = r2;
                        }
                    }
                    else {
                        if (!this.b(gxj, this.c.a, 10)) {
                            continue;
                        }
                        this.g.d(this.c, 10);
                        this.c.D(6);
                        final vwt g2 = this.g;
                        final int s2 = this.c.s();
                        this.h = 4;
                        this.i = 10;
                        this.t = g2;
                        this.u = 0L;
                        this.r = s2 + 10;
                    }
                }
                else {
                    if (n == 0) {
                        continue;
                    }
                    final dix b = this.b;
                    b.b[0] = gxj.a[i];
                    b.k(2);
                    final int g3 = this.b.g(4);
                    final int n7 = this.n;
                    if (n7 != -1 && g3 != n7) {
                        this.l = false;
                        this.h();
                    }
                    else {
                        if (!this.l) {
                            this.l = true;
                            this.m = this.o;
                            this.n = g3;
                        }
                        this.h = 3;
                        this.i = 0;
                    }
                }
            }
            else {
                final byte[] a2 = gxj.a;
                while (i < c) {
                    final int n8 = i + 1;
                    final int n9 = a2[i] & 0xFF;
                    Label_1227: {
                        if (this.j == 512 && g(((byte)n9 & 0xFF) | 0xFF00)) {
                            if (!this.l) {
                                final int n10 = n8 - 2;
                                gxj.D(n10 + 1);
                                boolean b2 = false;
                                Label_1152: {
                                    Label_1150: {
                                        if (this.i(gxj, this.b.b, 1)) {
                                            this.b.k(4);
                                            final int g4 = this.b.g(1);
                                            final int m = this.m;
                                            if (m == -1 || g4 == m) {
                                                Label_1145: {
                                                    if (this.n != -1) {
                                                        if (!this.i(gxj, this.b.b, 1)) {
                                                            break Label_1145;
                                                        }
                                                        this.b.k(2);
                                                        if (this.b.g(4) != this.n) {
                                                            break Label_1150;
                                                        }
                                                        gxj.D(n10 + 2);
                                                    }
                                                    if (this.i(gxj, this.b.b, 4)) {
                                                        this.b.k(14);
                                                        final int g5 = this.b.g(13);
                                                        if (g5 < 7) {
                                                            break Label_1150;
                                                        }
                                                        final byte[] a3 = gxj.a;
                                                        final int c3 = gxj.c;
                                                        int n11 = n10 + g5;
                                                        if (n11 < c3) {
                                                            if (a3[n11] == -1) {
                                                                if (++n11 != c3) {
                                                                    if (!g((a3[n11] & 0xFF) | 0xFF00) || (a3[n11] & 0x8) >> 3 != g4) {
                                                                        break Label_1150;
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                if (a3[n11] != 73) {
                                                                    break Label_1150;
                                                                }
                                                                final int n12 = n11 + 1;
                                                                if (n12 != c3) {
                                                                    if (a3[n12] != 68) {
                                                                        break Label_1150;
                                                                    }
                                                                    final int n13 = n11 + 2;
                                                                    if (n13 != c3) {
                                                                        if (a3[n13] != 51) {
                                                                            break Label_1150;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                b2 = true;
                                                break Label_1152;
                                            }
                                        }
                                    }
                                    b2 = false;
                                }
                                if (!b2) {
                                    break Label_1227;
                                }
                            }
                            this.o = (n9 & 0x8) >> 3;
                            this.k = ((n9 & 0x1) == 0x0);
                            if (!this.l) {
                                this.h = 1;
                                this.i = 0;
                            }
                            else {
                                this.h = 3;
                                this.i = 0;
                            }
                            gxj.D(n8);
                            continue Label_0012;
                        }
                    }
                    final int k = this.j;
                    final int n14 = n9 | k;
                    if (n14 != 329) {
                        if (n14 != 511) {
                            if (n14 != 836) {
                                if (n14 == 1075) {
                                    this.h = 2;
                                    this.i = 3;
                                    this.r = 0;
                                    this.c.D(0);
                                    gxj.D(n8);
                                    continue Label_0012;
                                }
                                if (k != 256) {
                                    this.j = 256;
                                    i = n8 - 1;
                                    continue;
                                }
                            }
                            else {
                                this.j = 1024;
                            }
                        }
                        else {
                            this.j = 512;
                        }
                    }
                    else {
                        this.j = 768;
                    }
                    i = n8;
                }
                gxj.D(i);
            }
        }
    }
    
    public final boolean b(final gxj gxj, final byte[] array, final int n) {
        final int min = Math.min(gxj.c - gxj.b, n - this.i);
        gxj.d(array, this.i, min);
        final int i = this.i + min;
        this.i = i;
        return i == n;
    }
    
    public final void c() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h();
    }
    
    public final void d(final voa voa, final kbu$d kbu$d) {
        kbu$d.a();
        this.e = kbu$d.b();
        final vwt r = voa.r(kbu$d.c(), 1);
        this.f = r;
        this.t = r;
        if (this.a) {
            kbu$d.a();
            final vwt r2 = voa.r(kbu$d.c(), 5);
            this.g = r2;
            final n$a n$a = new n$a();
            n$a.a = kbu$d.b();
            n$a.k = "application/id3";
            r2.e(new n(n$a));
        }
        else {
            this.g = (vwt)new lm9();
        }
    }
    
    public final void e() {
    }
    
    public final void f(final long s, final int n) {
        if (s != -9223372036854775807L) {
            this.s = s;
        }
    }
    
    public final void h() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }
    
    public final boolean i(final gxj gxj, final byte[] array, final int n) {
        if (gxj.c - gxj.b < n) {
            return false;
        }
        gxj.d(array, 0, n);
        return true;
    }
}
