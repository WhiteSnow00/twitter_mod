import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbc implements bz9
{
    public final mdp a;
    public String b;
    public vwt c;
    public nbc.nbc$a d;
    public boolean e;
    public final boolean[] f;
    public final y6i g;
    public final y6i h;
    public final y6i i;
    public final y6i j;
    public final y6i k;
    public long l;
    public long m;
    public final gxj n;
    
    public nbc(final mdp a) {
        this.a = a;
        this.f = new boolean[3];
        this.g = new y6i(32);
        this.h = new y6i(33);
        this.i = new y6i(34);
        this.j = new y6i(39);
        this.k = new y6i(40);
        this.m = -9223372036854775807L;
        this.n = new gxj();
    }
    
    public final void a(final gxj gxj) {
        omi.r((Object)this.c);
        final int a = rnw.a;
        while (true) {
            final int c = gxj.c;
            int i = gxj.b;
            final int n = c - i;
            if (n <= 0) {
                return;
            }
            final byte[] a2 = gxj.a;
            this.l += n;
            this.c.d(gxj, n);
            while (i < c) {
                final int b = z6i.b(a2, i, c, this.f);
                if (b == c) {
                    this.b(a2, i, c);
                    return;
                }
                final int n2 = b + 3;
                final int n3 = (a2[n2] & 0x7E) >> 1;
                final int n4 = b - i;
                if (n4 > 0) {
                    this.b(a2, i, b);
                }
                final int n5 = c - b;
                final long b2 = this.l - n5;
                int n6;
                if (n4 < 0) {
                    n6 = -n4;
                }
                else {
                    n6 = 0;
                }
                final long m = this.m;
                final nbc.nbc$a d = this.d;
                final boolean e = this.e;
                if (d.j && d.g) {
                    d.m = d.c;
                    d.j = false;
                }
                else if (d.h || d.g) {
                    if (e && d.i) {
                        d.a((int)(b2 - d.b) + n5);
                    }
                    d.k = d.b;
                    d.l = d.e;
                    d.m = d.c;
                    d.i = true;
                }
                long n18 = 0L;
                Label_1694: {
                    if (!this.e) {
                        this.g.b(n6);
                        this.h.b(n6);
                        this.i.b(n6);
                        final y6i g = this.g;
                        if (g.c) {
                            final y6i h = this.h;
                            if (h.c) {
                                final y6i j = this.i;
                                if (j.c) {
                                    final vwt c2 = this.c;
                                    final String b3 = this.b;
                                    final int e2 = g.e;
                                    final byte[] array = new byte[h.e + e2 + j.e];
                                    System.arraycopy(g.d, 0, array, 0, e2);
                                    System.arraycopy(h.d, 0, array, g.e, h.e);
                                    System.arraycopy(j.d, 0, array, g.e + h.e, j.e);
                                    final hxj hxj = new hxj(h.d, 0, h.e);
                                    hxj.m(44);
                                    final int h2 = hxj.h(3);
                                    hxj.l();
                                    final int h3 = hxj.h(2);
                                    final boolean g2 = hxj.g();
                                    final int h4 = hxj.h(5);
                                    int k = 0;
                                    int n7 = 0;
                                    while (k < 32) {
                                        int n8 = n7;
                                        if (hxj.g()) {
                                            n8 = (n7 | 1 << k);
                                        }
                                        ++k;
                                        n7 = n8;
                                    }
                                    final int[] array2 = new int[6];
                                    for (int l = 0; l < 6; ++l) {
                                        array2[l] = hxj.h(8);
                                    }
                                    final int h5 = hxj.h(8);
                                    int n9 = 0;
                                    int n10 = 0;
                                    while (n9 < h2) {
                                        int n11 = n10;
                                        if (hxj.g()) {
                                            n11 = n10 + 89;
                                        }
                                        n10 = n11;
                                        if (hxj.g()) {
                                            n10 = n11 + 8;
                                        }
                                        ++n9;
                                    }
                                    hxj.m(n10);
                                    if (h2 > 0) {
                                        hxj.m((8 - h2) * 2);
                                    }
                                    hxj.i();
                                    final int i2 = hxj.i();
                                    if (i2 == 3) {
                                        hxj.l();
                                    }
                                    final int i3 = hxj.i();
                                    final int i4 = hxj.i();
                                    int p;
                                    int n16;
                                    if (hxj.g()) {
                                        final int i5 = hxj.i();
                                        final int i6 = hxj.i();
                                        final int i7 = hxj.i();
                                        final int i8 = hxj.i();
                                        int n12;
                                        if (i2 != 1 && i2 != 2) {
                                            n12 = 1;
                                        }
                                        else {
                                            n12 = 2;
                                        }
                                        int n13;
                                        if (i2 == 1) {
                                            n13 = 2;
                                        }
                                        else {
                                            n13 = 1;
                                        }
                                        final int n14 = i3 - (i5 + i6) * n12;
                                        final int n15 = i4 - (i7 + i8) * n13;
                                        p = n14;
                                        n16 = n15;
                                    }
                                    else {
                                        n16 = i4;
                                        p = i3;
                                    }
                                    hxj.i();
                                    hxj.i();
                                    final int i9 = hxj.i();
                                    int n17;
                                    if (hxj.g()) {
                                        n17 = 0;
                                    }
                                    else {
                                        n17 = h2;
                                    }
                                    while (n17 <= h2) {
                                        hxj.i();
                                        hxj.i();
                                        hxj.i();
                                        ++n17;
                                    }
                                    hxj.i();
                                    hxj.i();
                                    hxj.i();
                                    hxj.i();
                                    hxj.i();
                                    hxj.i();
                                    n18 = m;
                                    if (hxj.g()) {
                                        n18 = m;
                                        if (hxj.g()) {
                                            int n19 = 0;
                                            while (true) {
                                                n18 = m;
                                                if (n19 >= 4) {
                                                    break;
                                                }
                                                int n22;
                                                for (int n20 = 0; n20 < 6; n20 += n22) {
                                                    if (!hxj.g()) {
                                                        hxj.i();
                                                    }
                                                    else {
                                                        final int min = Math.min(64, 1 << (n19 << 1) + 4);
                                                        if (n19 > 1) {
                                                            hxj.j();
                                                        }
                                                        for (int n21 = 0; n21 < min; ++n21) {
                                                            hxj.j();
                                                        }
                                                    }
                                                    if (n19 == 3) {
                                                        n22 = 3;
                                                    }
                                                    else {
                                                        n22 = 1;
                                                    }
                                                }
                                                ++n19;
                                            }
                                        }
                                    }
                                    hxj.m(2);
                                    if (hxj.g()) {
                                        hxj.m(8);
                                        hxj.i();
                                        hxj.i();
                                        hxj.l();
                                    }
                                    final int i10 = hxj.i();
                                    int n23 = 0;
                                    boolean g3 = false;
                                    int n24 = 0;
                                    while (n23 < i10) {
                                        if (n23 != 0) {
                                            g3 = hxj.g();
                                        }
                                        if (g3) {
                                            hxj.l();
                                            hxj.i();
                                            for (int n25 = 0; n25 <= n24; ++n25) {
                                                if (hxj.g()) {
                                                    hxj.l();
                                                }
                                            }
                                        }
                                        else {
                                            final int i11 = hxj.i();
                                            final int i12 = hxj.i();
                                            for (int n26 = 0; n26 < i11; ++n26) {
                                                hxj.i();
                                                hxj.l();
                                            }
                                            for (int n27 = 0; n27 < i12; ++n27) {
                                                hxj.i();
                                                hxj.l();
                                            }
                                            n24 = i11 + i12;
                                        }
                                        ++n23;
                                    }
                                    if (hxj.g()) {
                                        for (int n28 = 0; n28 < hxj.i(); ++n28) {
                                            hxj.m(i9 + 4 + 1);
                                        }
                                    }
                                    hxj.m(2);
                                    float t;
                                    final float n29 = t = 1.0f;
                                    int q = n16;
                                    if (hxj.g()) {
                                        float n30 = n29;
                                        if (hxj.g()) {
                                            final int h6 = hxj.h(8);
                                            if (h6 == 255) {
                                                final int h7 = hxj.h(16);
                                                final int h8 = hxj.h(16);
                                                n30 = n29;
                                                if (h7 != 0) {
                                                    n30 = n29;
                                                    if (h8 != 0) {
                                                        n30 = h7 / (float)h8;
                                                    }
                                                }
                                            }
                                            else {
                                                final float[] b4 = z6i.b;
                                                if (h6 < 17) {
                                                    n30 = b4[h6];
                                                }
                                                else {
                                                    d10.F(46, "Unexpected aspect_ratio_idc value: ", h6, "H265Reader");
                                                    n30 = n29;
                                                }
                                            }
                                        }
                                        if (hxj.g()) {
                                            hxj.l();
                                        }
                                        if (hxj.g()) {
                                            hxj.m(4);
                                            if (hxj.g()) {
                                                hxj.m(24);
                                            }
                                        }
                                        if (hxj.g()) {
                                            hxj.i();
                                            hxj.i();
                                        }
                                        hxj.l();
                                        t = n30;
                                        q = n16;
                                        if (hxj.g()) {
                                            q = n16 * 2;
                                            t = n30;
                                        }
                                    }
                                    final String e3 = b1b.e(h3, g2, h4, n7, array2, h5);
                                    final n$a n$a = new n$a();
                                    n$a.a = b3;
                                    n$a.k = "video/hevc";
                                    n$a.h = e3;
                                    n$a.p = p;
                                    n$a.q = q;
                                    n$a.t = t;
                                    n$a.m = Collections.singletonList(array);
                                    c2.e(new n(n$a));
                                    this.e = true;
                                    break Label_1694;
                                }
                            }
                        }
                    }
                    n18 = m;
                }
                if (this.j.b(n6)) {
                    final y6i j2 = this.j;
                    this.n.B(this.j.d, z6i.f(j2.d, j2.e));
                    this.n.E(5);
                    this.a.a(n18, this.n);
                }
                if (this.k.b(n6)) {
                    final y6i k2 = this.k;
                    this.n.B(this.k.d, z6i.f(k2.d, k2.e));
                    this.n.E(5);
                    this.a.a(n18, this.n);
                }
                final long m2 = this.m;
                final nbc.nbc$a d2 = this.d;
                final boolean e4 = this.e;
                d2.g = false;
                d2.h = false;
                d2.e = m2;
                d2.d = 0;
                d2.b = b2;
                if (n3 >= 32 && n3 != 40) {
                    if (d2.i && !d2.j) {
                        if (e4) {
                            d2.a(n5);
                        }
                        d2.i = false;
                    }
                    if ((32 <= n3 && n3 <= 35) || n3 == 39) {
                        d2.h = (d2.j ^ true);
                        d2.j = true;
                    }
                }
                final boolean c3 = n3 >= 16 && n3 <= 21;
                d2.c = c3;
                d2.f = (c3 || n3 <= 9);
                if (!this.e) {
                    this.g.d(n3);
                    this.h.d(n3);
                    this.i.d(n3);
                }
                this.j.d(n3);
                this.k.d(n3);
                i = n2;
            }
        }
    }
    
    @RequiresNonNull({ "sampleReader" })
    public final void b(final byte[] array, final int n, final int n2) {
        final nbc.nbc$a d = this.d;
        if (d.f) {
            final int d2 = d.d;
            final int n3 = n + 2 - d2;
            if (n3 < n2) {
                d.g = ((array[n3] & 0x80) != 0x0);
                d.f = false;
            }
            else {
                d.d = n2 - n + d2;
            }
        }
        if (!this.e) {
            this.g.a(array, n, n2);
            this.h.a(array, n, n2);
            this.i.a(array, n, n2);
        }
        this.j.a(array, n, n2);
        this.k.a(array, n, n2);
    }
    
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        z6i.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        final nbc.nbc$a d = this.d;
        if (d != null) {
            d.f = false;
            d.g = false;
            d.h = false;
            d.i = false;
            d.j = false;
        }
    }
    
    public final void d(final voa voa, final kbu$d kbu$d) {
        kbu$d.a();
        this.b = kbu$d.b();
        final vwt r = voa.r(kbu$d.c(), 2);
        this.c = r;
        this.d = new nbc.nbc$a(r);
        this.a.b(voa, kbu$d);
    }
    
    public final void e() {
    }
    
    public final void f(final long m, final int n) {
        if (m != -9223372036854775807L) {
            this.m = m;
        }
    }
}
