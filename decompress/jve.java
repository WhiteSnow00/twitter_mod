import java.util.Objects;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jve implements bz9
{
    public final String a;
    public final gxj b;
    public final dix c;
    public vwt d;
    public String e;
    public n f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;
    
    public jve(final String a) {
        this.a = a;
        final gxj b = new gxj(1024);
        this.b = b;
        this.c = new dix(b.a, 1, (j98)null);
        this.k = -9223372036854775807L;
    }
    
    public static long b(final dix dix) {
        return dix.g((dix.g(2) + 1) * 8);
    }
    
    public final void a(final gxj gxj) throws ParserException {
        omi.r((Object)this.d);
        while (true) {
            final int n = gxj.c - gxj.b;
            if (n <= 0) {
                return;
            }
            final int g = this.g;
            if (g != 0) {
                if (g != 1) {
                    if (g != 2) {
                        if (g != 3) {
                            throw new IllegalStateException();
                        }
                        final int min = Math.min(n, this.i - this.h);
                        gxj.d(this.c.b, this.h, min);
                        if ((this.h += min) != this.i) {
                            continue;
                        }
                        this.c.k(0);
                        final dix c = this.c;
                        Label_0779: {
                            if (!c.f()) {
                                this.l = true;
                                final int g2 = c.g(1);
                                int g3;
                                if (g2 == 1) {
                                    g3 = c.g(1);
                                }
                                else {
                                    g3 = 0;
                                }
                                this.m = g3;
                                if (g3 != 0) {
                                    throw ParserException.a((String)null, (Throwable)null);
                                }
                                if (g2 == 1) {
                                    b(c);
                                }
                                if (!c.f()) {
                                    throw ParserException.a((String)null, (Throwable)null);
                                }
                                this.n = c.g(6);
                                final int g4 = c.g(4);
                                final int g5 = c.g(3);
                                if (g4 != 0 || g5 != 0) {
                                    throw ParserException.a((String)null, (Throwable)null);
                                }
                                if (g2 == 0) {
                                    final int e = c.e();
                                    final int g6 = this.g(c);
                                    c.k(e);
                                    final byte[] array = new byte[(g6 + 7) / 8];
                                    c.h(array, g6);
                                    final n$a n$a = new n$a();
                                    n$a.a = this.e;
                                    n$a.k = "audio/mp4a-latm";
                                    n$a.h = this.u;
                                    n$a.x = this.t;
                                    n$a.y = this.r;
                                    n$a.m = Collections.singletonList(array);
                                    n$a.c = this.a;
                                    final n f = new n(n$a);
                                    if (!f.equals((Object)this.f)) {
                                        this.f = f;
                                        this.s = 1024000000L / f.e1;
                                        this.d.e(f);
                                    }
                                }
                                else {
                                    c.m((int)b(c) - this.g(c));
                                }
                                final int g7 = c.g(3);
                                if ((this.o = g7) != 0) {
                                    if (g7 != 1) {
                                        if (g7 != 3 && g7 != 4 && g7 != 5) {
                                            if (g7 != 6 && g7 != 7) {
                                                throw new IllegalStateException();
                                            }
                                            c.m(1);
                                        }
                                        else {
                                            c.m(6);
                                        }
                                    }
                                    else {
                                        c.m(9);
                                    }
                                }
                                else {
                                    c.m(8);
                                }
                                final boolean f2 = c.f();
                                this.p = f2;
                                this.q = 0L;
                                if (f2) {
                                    if (g2 == 1) {
                                        this.q = b(c);
                                    }
                                    else {
                                        boolean f3;
                                        do {
                                            f3 = c.f();
                                            this.q = (this.q << 8) + c.g(8);
                                        } while (f3);
                                    }
                                }
                                if (c.f()) {
                                    c.m(8);
                                }
                            }
                            else if (!this.l) {
                                break Label_0779;
                            }
                            if (this.m != 0) {
                                throw ParserException.a((String)null, (Throwable)null);
                            }
                            if (this.n != 0) {
                                throw ParserException.a((String)null, (Throwable)null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a((String)null, (Throwable)null);
                            }
                            int n2 = 0;
                            int g8;
                            do {
                                g8 = c.g(8);
                                n2 += g8;
                            } while (g8 == 255);
                            final int e2 = c.e();
                            if ((e2 & 0x7) == 0x0) {
                                this.b.D(e2 >> 3);
                            }
                            else {
                                c.h(this.b.a, n2 * 8);
                                this.b.D(0);
                            }
                            this.d.d(this.b, n2);
                            final long k = this.k;
                            if (k != -9223372036854775807L) {
                                this.d.b(k, 1, n2, 0, (vwt$a)null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                c.m((int)this.q);
                            }
                        }
                        this.g = 0;
                    }
                    else {
                        final int i = (this.j & 0xFFFFFF1F) << 8 | gxj.t();
                        this.i = i;
                        final gxj b = this.b;
                        if (i > b.a.length) {
                            b.A(i);
                            final dix c2 = this.c;
                            final byte[] a = this.b.a;
                            Objects.requireNonNull(c2);
                            c2.j(a, a.length);
                        }
                        this.h = 0;
                        this.g = 3;
                    }
                }
                else {
                    final int t = gxj.t();
                    if ((t & 0xE0) == 0xE0) {
                        this.j = t;
                        this.g = 2;
                    }
                    else {
                        if (t == 86) {
                            continue;
                        }
                        this.g = 0;
                    }
                }
            }
            else {
                if (gxj.t() != 86) {
                    continue;
                }
                this.g = 1;
            }
        }
    }
    
    public final void c() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }
    
    public final void d(final voa voa, final kbu$d kbu$d) {
        kbu$d.a();
        this.d = voa.r(kbu$d.c(), 1);
        this.e = kbu$d.b();
    }
    
    public final void e() {
    }
    
    public final void f(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
    
    public final int g(final dix dix) throws ParserException {
        final int b = dix.b();
        final y6$a b2 = y6.b(dix, true);
        this.u = b2.c;
        this.r = b2.a;
        this.t = b2.b;
        return b - dix.b();
    }
}
