import android.util.Pair;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import java.util.Arrays;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbc implements bz9
{
    public static final double[] q;
    public String a;
    public vwt b;
    public final cbw c;
    public final gxj d;
    public final y6i e;
    public final boolean[] f;
    public final kbc.kbc$a g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    
    static {
        q = new double[] { 23.976023976023978, 24.0, 25.0, 29.97002997002997, 30.0, 50.0, 59.94005994005994, 60.0 };
    }
    
    public kbc(final cbw c) {
        this.c = c;
        this.f = new boolean[4];
        this.g = new kbc.kbc$a();
        if (c != null) {
            this.e = new y6i(178);
            this.d = new gxj();
        }
        else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
    
    public final void a(final gxj gxj) {
        omi.r((Object)this.b);
        int b = gxj.b;
        final int c = gxj.c;
        final byte[] a = gxj.a;
        final long h = this.h;
        final int n = c - b;
        this.h = h + n;
        this.b.d(gxj, n);
        while (true) {
            final int b2 = z6i.b(a, b, c, this.f);
            if (b2 == c) {
                break;
            }
            final byte[] a2 = gxj.a;
            final int n2 = b2 + 3;
            final int n3 = a2[n2] & 0xFF;
            final int n4 = b2 - b;
            if (!this.j) {
                if (n4 > 0) {
                    this.g.a(a, b, b2);
                }
                int n5;
                if (n4 < 0) {
                    n5 = -n4;
                }
                else {
                    n5 = 0;
                }
                final kbc.kbc$a g = this.g;
                boolean b3 = false;
                Label_0290: {
                    if (g.a) {
                        final int n6 = g.b - n5;
                        g.b = n6;
                        if (g.c != 0 || n3 != 181) {
                            g.a = false;
                            b3 = true;
                            break Label_0290;
                        }
                        g.c = n6;
                    }
                    else if (n3 == 179) {
                        g.a = true;
                    }
                    g.a(kbc.kbc$a.e, 0, 3);
                    b3 = false;
                }
                if (b3) {
                    final kbc.kbc$a g2 = this.g;
                    final String a3 = this.a;
                    Objects.requireNonNull(a3);
                    final byte[] copy = Arrays.copyOf(g2.d, g2.b);
                    final byte b4 = copy[4];
                    final int n7 = copy[5] & 0xFF;
                    final byte b5 = copy[6];
                    final int p = (b4 & 0xFF) << 4 | n7 >> 4;
                    final int q = (n7 & 0xF) << 8 | (b5 & 0xFF);
                    final int n8 = (copy[7] & 0xF0) >> 4;
                    float t = 0.0f;
                    Label_0477: {
                        float n9;
                        int n10;
                        if (n8 != 2) {
                            if (n8 != 3) {
                                if (n8 != 4) {
                                    t = 1.0f;
                                    break Label_0477;
                                }
                                n9 = (float)(q * 121);
                                n10 = p * 100;
                            }
                            else {
                                n9 = (float)(q * 16);
                                n10 = p * 9;
                            }
                        }
                        else {
                            n9 = (float)(q * 4);
                            n10 = p * 3;
                        }
                        t = n9 / n10;
                    }
                    final n$a n$a = new n$a();
                    n$a.a = a3;
                    n$a.k = "video/mpeg2";
                    n$a.p = p;
                    n$a.q = q;
                    n$a.t = t;
                    n$a.m = Collections.singletonList(copy);
                    final n n11 = new n(n$a);
                    final int n12 = (copy[7] & 0xF) - 1;
                    long n17 = 0L;
                    Label_0647: {
                        if (n12 >= 0) {
                            final double[] q2 = kbc.q;
                            if (n12 < 8) {
                                double n13 = q2[n12];
                                final int n14 = g2.c + 9;
                                final int n15 = (copy[n14] & 0x60) >> 5;
                                final int n16 = copy[n14] & 0x1F;
                                if (n15 != n16) {
                                    n13 *= (n15 + 1.0) / (n16 + 1);
                                }
                                n17 = (long)(1000000.0 / n13);
                                break Label_0647;
                            }
                        }
                        n17 = 0L;
                    }
                    final Pair create = Pair.create((Object)n11, (Object)n17);
                    this.b.e((n)create.first);
                    this.k = (long)create.second;
                    this.j = true;
                }
            }
            final y6i e = this.e;
            if (e != null) {
                int n18;
                if (n4 > 0) {
                    e.a(a, b, b2);
                    n18 = 0;
                }
                else {
                    n18 = -n4;
                }
                if (this.e.b(n18)) {
                    final y6i e2 = this.e;
                    final int f = z6i.f(e2.d, e2.e);
                    final gxj d = this.d;
                    final int a4 = rnw.a;
                    d.B(this.e.d, f);
                    this.c.a(this.n, this.d);
                }
                if (n3 == 178 && gxj.a[b2 + 2] == 1) {
                    this.e.d(n3);
                }
            }
            if (n3 != 0 && n3 != 179) {
                if (n3 == 184) {
                    this.o = true;
                }
            }
            else {
                final int n19 = c - b2;
                if (this.p && this.j) {
                    final long n20 = this.n;
                    if (n20 != -9223372036854775807L) {
                        this.b.b(n20, (int)(this.o ? 1 : 0), (int)(this.h - this.m) - n19, n19, (vwt$a)null);
                    }
                }
                if (!this.i || this.p) {
                    this.m = this.h - n19;
                    long l = this.l;
                    if (l == -9223372036854775807L) {
                        final long n21 = this.n;
                        if (n21 != -9223372036854775807L) {
                            l = n21 + this.k;
                        }
                        else {
                            l = -9223372036854775807L;
                        }
                    }
                    this.n = l;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.i = true;
                }
                boolean p2 = false;
                if (n3 == 0) {
                    p2 = true;
                }
                this.p = p2;
            }
            b = n2;
        }
        if (!this.j) {
            this.g.a(a, b, c);
        }
        final y6i e3 = this.e;
        if (e3 != null) {
            e3.a(a, b, c);
        }
    }
    
    public final void c() {
        z6i.a(this.f);
        final kbc.kbc$a g = this.g;
        g.a = false;
        g.b = 0;
        g.c = 0;
        final y6i e = this.e;
        if (e != null) {
            e.c();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
    
    public final void d(final voa voa, final kbu$d kbu$d) {
        kbu$d.a();
        this.a = kbu$d.b();
        this.b = voa.r(kbu$d.c(), 2);
        final cbw c = this.c;
        if (c != null) {
            c.b(voa, kbu$d);
        }
    }
    
    public final void e() {
    }
    
    public final void f(final long l, final int n) {
        this.l = l;
    }
}
