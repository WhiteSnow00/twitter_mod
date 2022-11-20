import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bf implements ay9
{
    public final nhx a;
    public final rwj b;
    public final String c;
    public String d;
    public ewt e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public n j;
    public int k;
    public long l;
    
    public bf(final String c) {
        final nhx a = new nhx(new byte[128], 1, (da8)null);
        this.a = a;
        this.b = new rwj(a.b);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = c;
    }
    
    public final void a(final rwj rwj) {
        omy.m((Object)this.e);
    Label_0008:
        while (true) {
            final int n = rwj.c - rwj.b;
            if (n <= 0) {
                break;
            }
            final int f = this.f;
            if (f == 0) {
                while (true) {
                    while (rwj.c - rwj.b > 0) {
                        if (!this.h) {
                            this.h = (rwj.t() == 11);
                        }
                        else {
                            final int t = rwj.t();
                            if (t == 119) {
                                this.h = false;
                                final boolean b = true;
                                if (b) {
                                    this.f = 1;
                                    final byte[] a = this.b.a;
                                    a[0] = 11;
                                    a[1] = 119;
                                    this.g = 2;
                                    continue Label_0008;
                                }
                                continue Label_0008;
                            }
                            else {
                                this.h = (t == 11);
                            }
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
            if (f != 1) {
                if (f != 2) {
                    continue;
                }
                final int min = Math.min(n, this.k - this.g);
                this.e.d(rwj, min);
                final int g = this.g + min;
                this.g = g;
                final int k = this.k;
                if (g != k) {
                    continue;
                }
                final long l = this.l;
                if (l != -9223372036854775807L) {
                    this.e.b(l, 1, k, 0, null);
                    this.l += this.i;
                }
                this.f = 0;
            }
            else {
                final byte[] a2 = this.b.a;
                final int min2 = Math.min(n, 128 - this.g);
                rwj.d(a2, this.g, min2);
                if ((this.g += min2) != 128) {
                    continue;
                }
                this.a.k(0);
                final nhx a3 = this.a;
                final int e = a3.e();
                a3.m(40);
                final boolean b2 = a3.g(5) > 10;
                a3.k(e);
                int y = -1;
                String j;
                int a4;
                int n7;
                int x;
                if (b2) {
                    a3.m(16);
                    final int g2 = a3.g(2);
                    if (g2 != 0) {
                        if (g2 != 1) {
                            if (g2 == 2) {
                                y = 2;
                            }
                        }
                        else {
                            y = 1;
                        }
                    }
                    else {
                        y = 0;
                    }
                    a3.m(3);
                    final int n2 = (a3.g(11) + 1) * 2;
                    final int g3 = a3.g(2);
                    int n3;
                    int n4;
                    int g4;
                    if (g3 == 3) {
                        n3 = cf.c[a3.g(2)];
                        n4 = 6;
                        g4 = 3;
                    }
                    else {
                        g4 = a3.g(2);
                        n4 = cf.a[g4];
                        n3 = cf.b[g3];
                    }
                    final int n5 = n4 * 256;
                    final int g5 = a3.g(3);
                    final int f2 = a3.f() ? 1 : 0;
                    final int n6 = cf.d[g5] + f2;
                    a3.m(10);
                    if (a3.f()) {
                        a3.m(8);
                    }
                    if (g5 == 0) {
                        a3.m(5);
                        if (a3.f()) {
                            a3.m(8);
                        }
                    }
                    if (y == 1 && a3.f()) {
                        a3.m(16);
                    }
                    if (a3.f()) {
                        if (g5 > 2) {
                            a3.m(2);
                        }
                        if ((g5 & 0x1) != 0x0 && g5 > 2) {
                            a3.m(6);
                        }
                        if ((g5 & 0x4) != 0x0) {
                            a3.m(6);
                        }
                        if (f2 != 0 && a3.f()) {
                            a3.m(5);
                        }
                        if (y == 0) {
                            if (a3.f()) {
                                a3.m(6);
                            }
                            if (g5 == 0 && a3.f()) {
                                a3.m(6);
                            }
                            if (a3.f()) {
                                a3.m(6);
                            }
                            final int g6 = a3.g(2);
                            if (g6 == 1) {
                                a3.m(5);
                            }
                            else if (g6 == 2) {
                                a3.m(12);
                            }
                            else if (g6 == 3) {
                                final int g7 = a3.g(5);
                                if (a3.f()) {
                                    a3.m(5);
                                    if (a3.f()) {
                                        a3.m(4);
                                    }
                                    if (a3.f()) {
                                        a3.m(4);
                                    }
                                    if (a3.f()) {
                                        a3.m(4);
                                    }
                                    if (a3.f()) {
                                        a3.m(4);
                                    }
                                    if (a3.f()) {
                                        a3.m(4);
                                    }
                                    if (a3.f()) {
                                        a3.m(4);
                                    }
                                    if (a3.f()) {
                                        a3.m(4);
                                    }
                                    if (a3.f()) {
                                        if (a3.f()) {
                                            a3.m(4);
                                        }
                                        if (a3.f()) {
                                            a3.m(4);
                                        }
                                    }
                                }
                                if (a3.f()) {
                                    a3.m(5);
                                    if (a3.f()) {
                                        a3.m(7);
                                        if (a3.f()) {
                                            a3.m(8);
                                        }
                                    }
                                }
                                a3.m((g7 + 2) * 8);
                                a3.c();
                            }
                            if (g5 < 2) {
                                if (a3.f()) {
                                    a3.m(14);
                                }
                                if (g5 == 0 && a3.f()) {
                                    a3.m(14);
                                }
                            }
                            if (a3.f()) {
                                if (g4 == 0) {
                                    a3.m(5);
                                }
                                else {
                                    for (int i = 0; i < n4; ++i) {
                                        if (a3.f()) {
                                            a3.m(5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (a3.f()) {
                        a3.m(5);
                        if (g5 == 2) {
                            a3.m(4);
                        }
                        if (g5 >= 6) {
                            a3.m(2);
                        }
                        if (a3.f()) {
                            a3.m(8);
                        }
                        if (g5 == 0 && a3.f()) {
                            a3.m(8);
                        }
                        if (g3 < 3) {
                            a3.l();
                        }
                    }
                    if (y == 0 && g4 != 3) {
                        a3.l();
                    }
                    if (y == 2 && (g4 == 3 || a3.f())) {
                        a3.m(6);
                    }
                    if (a3.f() && a3.g(6) == 1 && a3.g(8) == 1) {
                        j = "audio/eac3-joc";
                    }
                    else {
                        j = "audio/eac3";
                    }
                    y = n3;
                    a4 = n2;
                    n7 = n5;
                    x = n6;
                }
                else {
                    a3.m(32);
                    final int g8 = a3.g(2);
                    if (g8 == 3) {
                        j = null;
                    }
                    else {
                        j = "audio/ac3";
                    }
                    a4 = cf.a(g8, a3.g(6));
                    a3.m(8);
                    final int g9 = a3.g(3);
                    if ((g9 & 0x1) != 0x0 && g9 != 1) {
                        a3.m(2);
                    }
                    if ((g9 & 0x4) != 0x0) {
                        a3.m(2);
                    }
                    if (g9 == 2) {
                        a3.m(2);
                    }
                    final int[] b3 = cf.b;
                    if (g8 < 3) {
                        y = b3[g8];
                    }
                    x = cf.d[g9] + (a3.f() ? 1 : 0);
                    n7 = 1536;
                }
                final n m = this.j;
                if (m == null || x != m.b1 || y != m.c1 || !cnw.a(j, m.O0)) {
                    final n$a n$a = new n$a();
                    n$a.a = this.d;
                    n$a.k = j;
                    n$a.x = x;
                    n$a.y = y;
                    n$a.c = this.c;
                    final n j2 = new n(n$a);
                    this.j = j2;
                    this.e.e(j2);
                }
                this.k = a4;
                this.i = n7 * 1000000L / this.j.c1;
                this.b.D(0);
                this.e.d(this.b, 128);
                this.f = 2;
            }
        }
    }
    
    public final void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }
    
    public final void d(final nna nna, final uau.d d) {
        d.a();
        this.d = d.b();
        this.e = nna.n(d.c(), 1);
    }
    
    public final void e() {
    }
    
    public final void f(final long l, final int n) {
        if (l != -9223372036854775807L) {
            this.l = l;
        }
    }
}
