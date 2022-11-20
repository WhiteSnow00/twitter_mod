import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ef implements ay9
{
    public final nhx a;
    public final rwj b;
    public final String c;
    public String d;
    public ewt e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public n k;
    public int l;
    public long m;
    
    public ef(final String c) {
        final nhx a = new nhx(new byte[16], 1, (da8)null);
        this.a = a;
        this.b = new rwj(a.b);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = c;
    }
    
    public final void a(final rwj rwj) {
        omy.m((Object)this.e);
        while (true) {
            final int n = rwj.c - rwj.b;
            if (n <= 0) {
                break;
            }
            final int f = this.f;
            boolean b = true;
            if (f != 0) {
                if (f != 1) {
                    if (f != 2) {
                        continue;
                    }
                    final int min = Math.min(n, this.l - this.g);
                    this.e.d(rwj, min);
                    final int g = this.g + min;
                    this.g = g;
                    final int l = this.l;
                    if (g != l) {
                        continue;
                    }
                    final long m = this.m;
                    if (m != -9223372036854775807L) {
                        this.e.b(m, 1, l, 0, null);
                        this.m += this.j;
                    }
                    this.f = 0;
                }
                else {
                    final byte[] a = this.b.a;
                    final int min2 = Math.min(n, 16 - this.g);
                    rwj.d(a, this.g, min2);
                    if ((this.g += min2) != 16) {
                        b = false;
                    }
                    if (!b) {
                        continue;
                    }
                    this.a.k(0);
                    final ff.a b2 = ff.b(this.a);
                    final n k = this.k;
                    if (k == null || 2 != k.b1 || b2.a != k.c1 || !"audio/ac4".equals(k.O0)) {
                        final n$a n$a = new n$a();
                        n$a.a = this.d;
                        n$a.k = "audio/ac4";
                        n$a.x = 2;
                        n$a.y = b2.a;
                        n$a.c = this.c;
                        final n i = new n(n$a);
                        this.k = i;
                        this.e.e(i);
                    }
                    this.l = b2.b;
                    this.j = b2.c * 1000000L / this.k.c1;
                    this.b.D(0);
                    this.e.d(this.b, 16);
                    this.f = 2;
                }
            }
            else {
                int n2;
                boolean b4;
                while (true) {
                    final int c = rwj.c;
                    final int b3 = rwj.b;
                    n2 = 65;
                    if (c - b3 <= 0) {
                        b4 = false;
                        break;
                    }
                    if (!this.h) {
                        this.h = (rwj.t() == 172);
                    }
                    else {
                        final int t = rwj.t();
                        this.h = (t == 172);
                        if (t == 64 || t == 65) {
                            this.i = (t == 65);
                            b4 = true;
                            break;
                        }
                        continue;
                    }
                }
                if (!b4) {
                    continue;
                }
                this.f = 1;
                final byte[] a2 = this.b.a;
                a2[0] = -84;
                int n3;
                if (this.i) {
                    n3 = n2;
                }
                else {
                    n3 = 64;
                }
                a2[1] = (byte)n3;
                this.g = 2;
            }
        }
    }
    
    public final void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }
    
    public final void d(final nna nna, final uau.d d) {
        d.a();
        this.d = d.b();
        this.e = nna.n(d.c(), 1);
    }
    
    public final void e() {
    }
    
    public final void f(final long m, final int n) {
        if (m != -9223372036854775807L) {
            this.m = m;
        }
    }
}
