import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksh implements bz9
{
    public final gxj a;
    public final lsh.a b;
    public final String c;
    public vwt d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;
    
    public ksh(final String c) {
        this.f = 0;
        final gxj a = new gxj(4);
        this.a = a;
        a.a[0] = -1;
        this.b = new lsh.a();
        this.l = -9223372036854775807L;
        this.c = c;
    }
    
    public final void a(final gxj gxj) {
        omi.r((Object)this.d);
    Label_0008:
        while (true) {
            final int c = gxj.c;
            int i = gxj.b;
            final int n = c - i;
            if (n <= 0) {
                return;
            }
            final int f = this.f;
            if (f != 0) {
                if (f != 1) {
                    if (f != 2) {
                        throw new IllegalStateException();
                    }
                    final int min = Math.min(n, this.k - this.g);
                    this.d.d(gxj, min);
                    final int g = this.g + min;
                    this.g = g;
                    final int k = this.k;
                    if (g < k) {
                        continue;
                    }
                    final long l = this.l;
                    if (l != -9223372036854775807L) {
                        this.d.b(l, 1, k, 0, (vwt$a)null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
                else {
                    final int min2 = Math.min(n, 4 - this.g);
                    gxj.d(this.a.a, this.g, min2);
                    if ((this.g += min2) < 4) {
                        continue;
                    }
                    this.a.D(0);
                    if (!this.b.a(this.a.e())) {
                        this.g = 0;
                        this.f = 1;
                    }
                    else {
                        final lsh.a b = this.b;
                        this.k = b.c;
                        if (!this.h) {
                            final long n2 = b.g;
                            final int d = b.d;
                            this.j = n2 * 1000000L / d;
                            final n$a n$a = new n$a();
                            n$a.a = this.e;
                            n$a.k = b.b;
                            n$a.l = 4096;
                            n$a.x = b.e;
                            n$a.y = d;
                            n$a.c = this.c;
                            this.d.e(new n(n$a));
                            this.h = true;
                        }
                        this.a.D(0);
                        this.d.d(this.a, 4);
                        this.f = 2;
                    }
                }
            }
            else {
                final byte[] a = gxj.a;
                while (i < c) {
                    final boolean j = (a[i] & 0xFF) == 0xFF;
                    final boolean b2 = this.i && (a[i] & 0xE0) == 0xE0;
                    this.i = j;
                    if (b2) {
                        gxj.D(i + 1);
                        this.i = false;
                        this.a.a[1] = a[i];
                        this.g = 2;
                        this.f = 1;
                        continue Label_0008;
                    }
                    ++i;
                }
                gxj.D(c);
            }
        }
    }
    
    public final void c() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
    
    public final void d(final voa voa, final kbu$d kbu$d) {
        kbu$d.a();
        this.e = kbu$d.b();
        this.d = voa.r(kbu$d.c(), 1);
    }
    
    public final void e() {
    }
    
    public final void f(final long l, final int n) {
        if (l != -9223372036854775807L) {
            this.l = l;
        }
    }
}
