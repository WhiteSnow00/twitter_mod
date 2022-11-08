import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbc implements oy9
{
    public final zbp a;
    public String b;
    public ovt c;
    public lbc.lbc$a d;
    public boolean e;
    public final boolean[] f;
    public final d6i g;
    public final d6i h;
    public final d6i i;
    public final d6i j;
    public final d6i k;
    public long l;
    public long m;
    public final mwj n;
    
    public lbc(final zbp a) {
        this.a = a;
        this.f = new boolean[3];
        this.g = new d6i(32);
        this.h = new d6i(33);
        this.i = new d6i(34);
        this.j = new d6i(39);
        this.k = new d6i(40);
        this.m = -9223372036854775807L;
        this.n = new mwj();
    }
    
    public final void a(final mwj mwj) {
        ri4.y((Object)this.c);
        final int a = imw.a;
        while (true) {
            final int c = mwj.c;
            int i = mwj.b;
            final int n = c - i;
            if (n <= 0) {
                return;
            }
            final byte[] a2 = mwj.a;
            this.l += n;
            this.c.d(mwj, n);
            final byte[] array = a2;
            while (i < c) {
                final int b = e6i.b(array, i, c, this.f);
                if (b == c) {
                    this.b(array, i, c);
                    return;
                }
                final int n2 = b + 3;
                final int n3 = (array[n2] & 0x7E) >> 1;
                final int n4 = b - i;
                if (n4 > 0) {
                    this.b(array, i, b);
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
                long m = this.m;
                final lbc.lbc$a d = this.d;
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
                if (!this.e) {
                    this.g.b(n6);
                    this.h.b(n6);
                    this.i.b(n6);
                    final d6i g = this.g;
                    if (g.c) {
                        final d6i h = this.h;
                        if (h.c) {
                            final d6i j = this.i;
                            if (j.c) {
                                final ovt c2 = this.c;
                                final String b3 = this.b;
                                final int e2 = g.e;
                                final byte[] array2 = new byte[h.e + e2 + j.e];
                                System.arraycopy(g.d, 0, array2, 0, e2);
                                System.arraycopy(h.d, 0, array2, g.e, h.e);
                                System.arraycopy(j.d, 0, array2, g.e + h.e, j.e);
                                final nwj nwj = new nwj(h.d, 0, h.e);
                                nwj.j(44);
                                final int e3 = nwj.e(3);
                                nwj.i();
                                final int e4 = nwj.e(2);
                                final boolean d2 = nwj.d();
                                final int e5 = nwj.e(5);
                                int k = 0;
                                int n7 = 0;
                                while (k < 32) {
                                    int n8 = n7;
                                    if (nwj.d()) {
                                        n8 = (n7 | 1 << k);
                                    }
                                    ++k;
                                    n7 = n8;
                                }
                                final int[] array3 = new int[6];
                                for (int l = 0; l < 6; ++l) {
                                    array3[l] = nwj.e(8);
                                }
                                final int e6 = nwj.e(8);
                                int n9 = 0;
                                int n10 = 0;
                                while (n9 < e3) {
                                    int n11 = n10;
                                    if (nwj.d()) {
                                        n11 = n10 + 89;
                                    }
                                    n10 = n11;
                                    if (nwj.d()) {
                                        n10 = n11 + 8;
                                    }
                                    ++n9;
                                }
                                nwj.j(n10);
                                if (e3 > 0) {
                                    nwj.j((8 - e3) * 2);
                                }
                                nwj.f();
                                final int f = nwj.f();
                                if (f == 3) {
                                    nwj.i();
                                }
                                final int f2 = nwj.f();
                                final int f3 = nwj.f();
                                int p;
                                int n16;
                                if (nwj.d()) {
                                    final int f4 = nwj.f();
                                    final int f5 = nwj.f();
                                    final int f6 = nwj.f();
                                    final int f7 = nwj.f();
                                    int n12;
                                    if (f != 1 && f != 2) {
                                        n12 = 1;
                                    }
                                    else {
                                        n12 = 2;
                                    }
                                    int n13;
                                    if (f == 1) {
                                        n13 = 2;
                                    }
                                    else {
                                        n13 = 1;
                                    }
                                    final int n14 = f2 - (f4 + f5) * n12;
                                    final int n15 = f3 - (f6 + f7) * n13;
                                    p = n14;
                                    n16 = n15;
                                }
                                else {
                                    n16 = f3;
                                    p = f2;
                                }
                                nwj.f();
                                nwj.f();
                                final int f8 = nwj.f();
                                int n17;
                                if (nwj.d()) {
                                    n17 = 0;
                                }
                                else {
                                    n17 = e3;
                                }
                                while (n17 <= e3) {
                                    nwj.f();
                                    nwj.f();
                                    nwj.f();
                                    ++n17;
                                }
                                nwj.f();
                                nwj.f();
                                nwj.f();
                                nwj.f();
                                nwj.f();
                                nwj.f();
                                long n18 = m;
                                if (nwj.d()) {
                                    n18 = m;
                                    if (nwj.d()) {
                                        int n19 = 0;
                                        while (true) {
                                            n18 = m;
                                            if (n19 >= 4) {
                                                break;
                                            }
                                            int n22;
                                            for (int n20 = 0; n20 < 6; n20 += n22) {
                                                if (!nwj.d()) {
                                                    nwj.f();
                                                }
                                                else {
                                                    final int min = Math.min(64, 1 << (n19 << 1) + 4);
                                                    if (n19 > 1) {
                                                        nwj.g();
                                                    }
                                                    for (int n21 = 0; n21 < min; ++n21) {
                                                        nwj.g();
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
                                nwj.j(2);
                                if (nwj.d()) {
                                    nwj.j(8);
                                    nwj.f();
                                    nwj.f();
                                    nwj.i();
                                }
                                final int f9 = nwj.f();
                                int n23 = 0;
                                boolean d3 = false;
                                int n24 = 0;
                                while (n23 < f9) {
                                    if (n23 != 0) {
                                        d3 = nwj.d();
                                    }
                                    if (d3) {
                                        nwj.i();
                                        nwj.f();
                                        for (int n25 = 0; n25 <= n24; ++n25) {
                                            if (nwj.d()) {
                                                nwj.i();
                                            }
                                        }
                                    }
                                    else {
                                        final int f10 = nwj.f();
                                        final int f11 = nwj.f();
                                        for (int n26 = 0; n26 < f10; ++n26) {
                                            nwj.f();
                                            nwj.i();
                                        }
                                        for (int n27 = 0; n27 < f11; ++n27) {
                                            nwj.f();
                                            nwj.i();
                                        }
                                        n24 = f10 + f11;
                                    }
                                    ++n23;
                                }
                                if (nwj.d()) {
                                    for (int n28 = 0; n28 < nwj.f(); ++n28) {
                                        nwj.j(f8 + 4 + 1);
                                    }
                                }
                                nwj.j(2);
                                float t;
                                final float n29 = t = 1.0f;
                                int q = n16;
                                if (nwj.d()) {
                                    float n30 = n29;
                                    if (nwj.d()) {
                                        final int e7 = nwj.e(8);
                                        if (e7 == 255) {
                                            final int e8 = nwj.e(16);
                                            final int e9 = nwj.e(16);
                                            n30 = n29;
                                            if (e8 != 0) {
                                                n30 = n29;
                                                if (e9 != 0) {
                                                    n30 = e8 / (float)e9;
                                                }
                                            }
                                        }
                                        else {
                                            final float[] b4 = e6i.b;
                                            if (e7 < 17) {
                                                n30 = b4[e7];
                                            }
                                            else {
                                                zi.z(46, "Unexpected aspect_ratio_idc value: ", e7, "H265Reader");
                                                n30 = n29;
                                            }
                                        }
                                    }
                                    if (nwj.d()) {
                                        nwj.i();
                                    }
                                    if (nwj.d()) {
                                        nwj.j(4);
                                        if (nwj.d()) {
                                            nwj.j(24);
                                        }
                                    }
                                    if (nwj.d()) {
                                        nwj.f();
                                        nwj.f();
                                    }
                                    nwj.i();
                                    t = n30;
                                    q = n16;
                                    if (nwj.d()) {
                                        q = n16 * 2;
                                        t = n30;
                                    }
                                }
                                final String w = poa.w(e4, d2, e5, n7, array3, e6);
                                final n$a n$a = new n$a();
                                n$a.a = b3;
                                n$a.k = "video/hevc";
                                n$a.h = w;
                                n$a.p = p;
                                n$a.q = q;
                                n$a.t = t;
                                n$a.m = Collections.singletonList(array2);
                                c2.e(new n(n$a));
                                this.e = true;
                                m = n18;
                            }
                        }
                    }
                }
                if (this.j.b(n6)) {
                    final d6i j2 = this.j;
                    this.n.B(this.j.d, e6i.f(j2.d, j2.e));
                    this.n.E(5);
                    this.a.a(m, this.n);
                }
                if (this.k.b(n6)) {
                    final d6i k2 = this.k;
                    this.n.B(this.k.d, e6i.f(k2.d, k2.e));
                    this.n.E(5);
                    this.a.a(m, this.n);
                }
                final long m2 = this.m;
                final lbc.lbc$a d4 = this.d;
                final boolean e10 = this.e;
                d4.g = false;
                d4.h = false;
                d4.e = m2;
                d4.d = 0;
                d4.b = b2;
                if (n3 >= 32 && n3 != 40) {
                    if (d4.i && !d4.j) {
                        if (e10) {
                            d4.a(n5);
                        }
                        d4.i = false;
                    }
                    if ((32 <= n3 && n3 <= 35) || n3 == 39) {
                        d4.h = (d4.j ^ true);
                        d4.j = true;
                    }
                }
                final boolean c3 = n3 >= 16 && n3 <= 21;
                d4.c = c3;
                d4.f = (c3 || n3 <= 9);
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
        final lbc.lbc$a d = this.d;
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
        e6i.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        final lbc.lbc$a d = this.d;
        if (d != null) {
            d.f = false;
            d.g = false;
            d.h = false;
            d.i = false;
            d.j = false;
        }
    }
    
    public final void d(final ooa ooa, final bau$d bau$d) {
        bau$d.a();
        this.b = bau$d.b();
        final ovt s = ooa.s(bau$d.c(), 2);
        this.c = s;
        this.d = new lbc.lbc$a(s);
        this.a.b(ooa, bau$d);
    }
    
    public final void e() {
    }
    
    public final void f(final long m, final int n) {
        if (m != -9223372036854775807L) {
            this.m = m;
        }
    }
}
