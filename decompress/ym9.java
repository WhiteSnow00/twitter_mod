import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ym9 implements bz9
{
    public final List<kbu$a> a;
    public final vwt[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    
    public ym9(final List<kbu$a> a) {
        this.a = a;
        this.b = new vwt[a.size()];
        this.f = -9223372036854775807L;
    }
    
    public final void a(final gxj gxj) {
        if (this.c) {
            if (this.d == 2 && !this.b(gxj, 32)) {
                return;
            }
            final int d = this.d;
            int i = 0;
            if (d == 1 && !this.b(gxj, 0)) {
                return;
            }
            final int b = gxj.b;
            final int n = gxj.c - b;
            for (vwt[] b2 = this.b; i < b2.length; ++i) {
                final vwt vwt = b2[i];
                gxj.D(b);
                vwt.d(gxj, n);
            }
            this.e += n;
        }
    }
    
    public final boolean b(final gxj gxj, final int n) {
        if (gxj.c - gxj.b == 0) {
            return false;
        }
        if (gxj.t() != n) {
            this.c = false;
        }
        --this.d;
        return this.c;
    }
    
    public final void c() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
    
    public final void d(final voa voa, final kbu$d kbu$d) {
        for (int i = 0; i < this.b.length; ++i) {
            final kbu$a kbu$a = this.a.get(i);
            kbu$d.a();
            final vwt r = voa.r(kbu$d.c(), 3);
            final n$a n$a = new n$a();
            n$a.a = kbu$d.b();
            n$a.k = "application/dvbsubs";
            n$a.m = Collections.singletonList(kbu$a.b);
            n$a.c = kbu$a.a;
            r.e(new n(n$a));
            this.b[i] = r;
        }
    }
    
    public final void e() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                final vwt[] b = this.b;
                for (int length = b.length, i = 0; i < length; ++i) {
                    b[i].b(this.f, 1, this.e, 0, (vwt$a)null);
                }
            }
            this.c = false;
        }
    }
    
    public final void f(final long f, final int n) {
        if ((n & 0x4) == 0x0) {
            return;
        }
        this.c = true;
        if (f != -9223372036854775807L) {
            this.f = f;
        }
        this.e = 0;
        this.d = 2;
    }
}
