import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import java.util.Arrays;
import java.util.Objects;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbc implements bz9
{
    public static final float[] l;
    public final cbw a;
    public final gxj b;
    public final boolean[] c;
    public final lbc.lbc$a d;
    public final y6i e;
    public lbc.lbc$b f;
    public long g;
    public String h;
    public vwt i;
    public boolean j;
    public long k;
    
    static {
        l = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f };
    }
    
    public lbc(final cbw a) {
        this.a = a;
        this.c = new boolean[4];
        this.d = new lbc.lbc$a();
        this.k = -9223372036854775807L;
        this.e = new y6i(178);
        this.b = new gxj();
    }
    
    public final void a(final gxj gxj) {
        omi.r((Object)this.f);
        omi.r((Object)this.i);
        int b = gxj.b;
        final int c = gxj.c;
        final byte[] a = gxj.a;
        final long g = this.g;
        final int n = c - b;
        this.g = g + n;
        this.i.d(gxj, n);
        while (true) {
            final int b2 = z6i.b(a, b, c, this.c);
            if (b2 == c) {
                if (!this.j) {
                    this.d.a(a, b, c);
                }
                this.f.a(a, b, c);
                final y6i e = this.e;
                if (e != null) {
                    e.a(a, b, c);
                }
                return;
            }
            final byte[] a2 = gxj.a;
            final int n2 = b2 + 3;
            final int e2 = a2[n2] & 0xFF;
            final int n3 = b2 - b;
            if (!this.j) {
                if (n3 > 0) {
                    this.d.a(a, b, b2);
                }
                int n4;
                if (n3 < 0) {
                    n4 = -n3;
                }
                else {
                    n4 = 0;
                }
                final lbc.lbc$a d = this.d;
                final int b3 = d.b;
                boolean b4 = false;
                Label_0443: {
                    if (b3 != 0) {
                        if (b3 != 1) {
                            if (b3 != 2) {
                                if (b3 != 3) {
                                    if (b3 != 4) {
                                        throw new IllegalStateException();
                                    }
                                    if (e2 == 179 || e2 == 181) {
                                        d.c -= n4;
                                        d.a = false;
                                        b4 = true;
                                        break Label_0443;
                                    }
                                }
                                else if ((e2 & 0xF0) != 0x20) {
                                    Log.w("H263Reader", "Unexpected start code value");
                                    d.b();
                                }
                                else {
                                    d.d = d.c;
                                    d.b = 4;
                                }
                            }
                            else if (e2 > 31) {
                                Log.w("H263Reader", "Unexpected start code value");
                                d.b();
                            }
                            else {
                                d.b = 3;
                            }
                        }
                        else if (e2 != 181) {
                            Log.w("H263Reader", "Unexpected start code value");
                            d.b();
                        }
                        else {
                            d.b = 2;
                        }
                    }
                    else if (e2 == 176) {
                        d.b = 1;
                        d.a = true;
                    }
                    d.a(lbc.lbc$a.f, 0, 3);
                    b4 = false;
                }
                if (b4) {
                    final vwt i = this.i;
                    final lbc.lbc$a d2 = this.d;
                    final int d3 = d2.d;
                    final String h = this.h;
                    Objects.requireNonNull(h);
                    final byte[] copy = Arrays.copyOf(d2.e, d2.c);
                    final dix dix = new dix(copy, 1, (j98)null);
                    dix.n(d3);
                    dix.n(4);
                    dix.l();
                    dix.m(8);
                    if (dix.f()) {
                        dix.m(4);
                        dix.m(3);
                    }
                    final int g2 = dix.g(4);
                    float t = 0.0f;
                    Label_0643: {
                        if (g2 == 15) {
                            final int g3 = dix.g(8);
                            final int g4 = dix.g(8);
                            if (g4 != 0) {
                                t = g3 / (float)g4;
                                break Label_0643;
                            }
                            Log.w("H263Reader", "Invalid aspect ratio");
                        }
                        else {
                            final float[] l = lbc.l;
                            if (g2 < 7) {
                                t = l[g2];
                                break Label_0643;
                            }
                            Log.w("H263Reader", "Invalid aspect ratio");
                        }
                        t = 1.0f;
                    }
                    if (dix.f()) {
                        dix.m(2);
                        dix.m(1);
                        if (dix.f()) {
                            dix.m(15);
                            dix.l();
                            dix.m(15);
                            dix.l();
                            dix.m(15);
                            dix.l();
                            dix.m(3);
                            dix.m(11);
                            dix.l();
                            dix.m(15);
                            dix.l();
                        }
                    }
                    if (dix.g(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    dix.l();
                    final int g5 = dix.g(16);
                    dix.l();
                    if (dix.f()) {
                        if (g5 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        }
                        else {
                            int j = g5 - 1;
                            int n5 = 0;
                            while (j > 0) {
                                ++n5;
                                j >>= 1;
                            }
                            dix.m(n5);
                        }
                    }
                    dix.l();
                    final int g6 = dix.g(13);
                    dix.l();
                    final int g7 = dix.g(13);
                    dix.l();
                    dix.l();
                    final n$a n$a = new n$a();
                    n$a.a = h;
                    n$a.k = "video/mp4v-es";
                    n$a.p = g6;
                    n$a.q = g7;
                    n$a.t = t;
                    n$a.m = Collections.singletonList(copy);
                    i.e(new n(n$a));
                    this.j = true;
                }
            }
            this.f.a(a, b, b2);
            final y6i e3 = this.e;
            if (e3 != null) {
                int n6;
                if (n3 > 0) {
                    e3.a(a, b, b2);
                    n6 = 0;
                }
                else {
                    n6 = -n3;
                }
                if (this.e.b(n6)) {
                    final y6i e4 = this.e;
                    final int f = z6i.f(e4.d, e4.e);
                    final gxj b5 = this.b;
                    final int a3 = rnw.a;
                    b5.B(this.e.d, f);
                    this.a.a(this.k, this.b);
                }
                if (e2 == 178 && gxj.a[b2 + 2] == 1) {
                    this.e.d(e2);
                }
            }
            final int n7 = c - b2;
            final long g8 = this.g - n7;
            final lbc.lbc$b f2 = this.f;
            final boolean k = this.j;
            if (f2.e == 182 && k && f2.b) {
                final long h2 = f2.h;
                if (h2 != -9223372036854775807L) {
                    f2.a.b(h2, (int)(f2.d ? 1 : 0), (int)(g8 - f2.g), n7, (vwt$a)null);
                }
            }
            if (f2.e != 179) {
                f2.g = g8;
            }
            final lbc.lbc$b f3 = this.f;
            final long m = this.k;
            f3.e = e2;
            f3.d = false;
            f3.b = (e2 == 182 || e2 == 179);
            f3.c = (e2 == 182);
            f3.f = 0;
            f3.h = m;
            b = n2;
        }
    }
    
    public final void c() {
        z6i.a(this.c);
        this.d.b();
        final lbc.lbc$b f = this.f;
        if (f != null) {
            f.b = false;
            f.c = false;
            f.d = false;
            f.e = -1;
        }
        final y6i e = this.e;
        if (e != null) {
            e.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
    
    public final void d(final voa voa, final kbu$d kbu$d) {
        kbu$d.a();
        this.h = kbu$d.b();
        final vwt r = voa.r(kbu$d.c(), 2);
        this.i = r;
        this.f = new lbc.lbc$b(r);
        final cbw a = this.a;
        if (a != null) {
            a.b(voa, kbu$d);
        }
    }
    
    public final void e() {
    }
    
    public final void f(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
}
