import com.google.android.exoplayer2.ParserException;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xbk implements kbu
{
    public final bz9 a;
    public final dix b;
    public int c;
    public int d;
    public tat e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    
    public xbk(final bz9 a) {
        this.a = a;
        this.b = new dix(new byte[10], 1, (j98)null);
        this.c = 0;
    }
    
    public final void a(final gxj gxj, int j) throws ParserException {
        omi.r((Object)this.e);
        int n = j;
        if ((j & 0x1) != 0x0) {
            final int c = this.c;
            if (c != 0 && c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        throw new IllegalStateException();
                    }
                    final int i = this.j;
                    if (i != -1) {
                        final StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.a.e();
                }
                else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.e(1);
            n = j;
        }
        while (true) {
            final int c2 = gxj.c;
            final int b = gxj.b;
            if (c2 - b <= 0) {
                return;
            }
            final int c3 = this.c;
            if (c3 != 0) {
                final int n2 = 0;
                int n3 = 0;
                j = 0;
                if (c3 != 1) {
                    if (c3 != 2) {
                        if (c3 != 3) {
                            throw new IllegalStateException();
                        }
                        final int n4 = c2 - b;
                        final int k = this.j;
                        if (k != -1) {
                            j = n4 - k;
                        }
                        int n5 = n4;
                        if (j > 0) {
                            n5 = n4 - j;
                            gxj.C(b + n5);
                        }
                        this.a.a(gxj);
                        final int l = this.j;
                        j = n;
                        if (l != -1) {
                            final int m = l - n5;
                            this.j = m;
                            j = n;
                            if (m == 0) {
                                this.a.e();
                                this.e(1);
                                j = n;
                            }
                        }
                    }
                    else {
                        final int min = Math.min(10, this.i);
                        j = n;
                        if (this.d(gxj, this.b.b, min)) {
                            j = n;
                            if (this.d(gxj, null, this.i)) {
                                this.b.k(0);
                                this.l = -9223372036854775807L;
                                if (this.f) {
                                    this.b.m(4);
                                    final long n6 = this.b.g(3);
                                    this.b.m(1);
                                    final long n7 = this.b.g(15) << 15;
                                    this.b.m(1);
                                    final long n8 = this.b.g(15);
                                    this.b.m(1);
                                    if (!this.h && this.g) {
                                        this.b.m(4);
                                        final long n9 = this.b.g(3);
                                        this.b.m(1);
                                        final long n10 = this.b.g(15) << 15;
                                        this.b.m(1);
                                        final long n11 = this.b.g(15);
                                        this.b.m(1);
                                        this.e.b(n9 << 30 | n10 | n11);
                                        this.h = true;
                                    }
                                    this.l = this.e.b(n6 << 30 | n7 | n8);
                                }
                                j = n2;
                                if (this.k) {
                                    j = 4;
                                }
                                j |= n;
                                this.a.f(this.l, j);
                                this.e(3);
                            }
                        }
                    }
                }
                else {
                    j = n;
                    if (this.d(gxj, this.b.b, 9)) {
                        this.b.k(0);
                        j = this.b.g(24);
                        if (j != 1) {
                            d10.F(41, "Unexpected start code prefix: ", j, "PesReader");
                            this.j = -1;
                            j = 0;
                        }
                        else {
                            this.b.m(8);
                            j = this.b.g(16);
                            this.b.m(5);
                            this.k = this.b.f();
                            this.b.m(2);
                            this.f = this.b.f();
                            this.g = this.b.f();
                            this.b.m(6);
                            final int g = this.b.g(8);
                            this.i = g;
                            if (j == 0) {
                                this.j = -1;
                            }
                            else {
                                j = j + 6 - 9 - g;
                                if ((this.j = j) < 0) {
                                    d10.F(47, "Found negative packet payload size: ", j, "PesReader");
                                    this.j = -1;
                                }
                            }
                            j = 1;
                        }
                        if (j != 0) {
                            n3 = 2;
                        }
                        this.e(n3);
                        j = n;
                    }
                }
            }
            else {
                gxj.E(c2 - b);
                j = n;
            }
            n = j;
        }
    }
    
    public final void b(final tat e, final voa voa, final kbu$d kbu$d) {
        this.e = e;
        this.a.d(voa, kbu$d);
    }
    
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }
    
    public final boolean d(final gxj gxj, final byte[] array, final int n) {
        final int min = Math.min(gxj.c - gxj.b, n - this.d);
        boolean b = true;
        if (min <= 0) {
            return true;
        }
        if (array == null) {
            gxj.E(min);
        }
        else {
            gxj.d(array, this.d, min);
        }
        final int d = this.d + min;
        this.d = d;
        if (d != n) {
            b = false;
        }
        return b;
    }
    
    public final void e(final int c) {
        this.c = c;
        this.d = 0;
    }
}
