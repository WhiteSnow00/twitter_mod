import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import java.io.IOException;
import com.google.android.exoplayer2.extractor.flv.b;
import com.google.android.exoplayer2.extractor.flv.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecb implements qoa
{
    public final gxj a;
    public final gxj b;
    public final gxj c;
    public final gxj d;
    public final j3p e;
    public voa f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public b p;
    
    static {
        final g71 l0 = g71.L0;
    }
    
    public ecb() {
        this.a = new gxj(4);
        this.b = new gxj(9);
        this.c = new gxj(11);
        this.d = new gxj();
        this.e = new j3p();
        this.g = 1;
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        omi.r((Object)this.f);
        while (true) {
            final int g = this.g;
            boolean b = false;
            boolean b2 = false;
            final int n = 0;
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        if (g != 4) {
                            throw new IllegalStateException();
                        }
                        long m;
                        if (this.h) {
                            m = this.i + this.m;
                        }
                        else if (this.e.b == -9223372036854775807L) {
                            m = 0L;
                        }
                        else {
                            m = this.m;
                        }
                        final int k = this.k;
                        int n2 = 0;
                        boolean b3 = false;
                        Label_0278: {
                            if (k == 8 && this.o != null) {
                                this.d();
                                n2 = (((TagPayloadReader)this.o).a(this.e(roa), m) ? 1 : 0);
                            }
                            else if (k == 9 && this.p != null) {
                                this.d();
                                n2 = (((TagPayloadReader)this.p).a(this.e(roa), m) ? 1 : 0);
                            }
                            else {
                                if (k != 18 || this.n) {
                                    roa.k(this.l);
                                    n2 = 0;
                                    b3 = false;
                                    break Label_0278;
                                }
                                final boolean a = ((TagPayloadReader)this.e).a(this.e(roa), m);
                                final j3p e = this.e;
                                final long b4 = e.b;
                                n2 = (a ? 1 : 0);
                                if (b4 != -9223372036854775807L) {
                                    this.f.l((qcp)new ald(e.d, e.c, b4));
                                    this.n = true;
                                    n2 = (a ? 1 : 0);
                                }
                            }
                            b3 = true;
                        }
                        if (!this.h && n2 != 0) {
                            this.h = true;
                            long i;
                            if (this.e.b == -9223372036854775807L) {
                                i = -this.m;
                            }
                            else {
                                i = 0L;
                            }
                            this.i = i;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (b3) {
                            return 0;
                        }
                        continue;
                    }
                    else {
                        int n3;
                        if (!roa.f(this.c.a, 0, 11, true)) {
                            n3 = n;
                        }
                        else {
                            this.c.D(0);
                            this.k = this.c.t();
                            this.l = this.c.v();
                            this.m = this.c.v();
                            this.m = ((long)(this.c.t() << 24) | this.m) * 1000L;
                            this.c.E(3);
                            this.g = 4;
                            n3 = 1;
                        }
                        if (n3 == 0) {
                            return -1;
                        }
                        continue;
                    }
                }
                else {
                    roa.k(this.j);
                    this.j = 0;
                    this.g = 3;
                }
            }
            else {
                if (roa.f(this.b.a, 0, 9, true)) {
                    this.b.D(0);
                    this.b.E(4);
                    final int t = this.b.t();
                    final boolean b5 = (t & 0x4) != 0x0;
                    if ((t & 0x1) != 0x0) {
                        b = true;
                    }
                    if (b5 && this.o == null) {
                        this.o = new a(this.f.r(8, 1));
                    }
                    if (b && this.p == null) {
                        this.p = new b(this.f.r(9, 2));
                    }
                    this.f.p();
                    this.j = this.b.e() - 9 + 4;
                    this.g = 2;
                    b2 = true;
                }
                if (!b2) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    public final boolean b(final roa roa) throws IOException {
        final byte[] a = this.a.a;
        final vh8 vh8 = (vh8)roa;
        boolean b = false;
        vh8.c(a, 0, 3, false);
        this.a.D(0);
        if (this.a.v() != 4607062) {
            return false;
        }
        final byte[] a2 = this.a.a;
        final vh8 vh9 = (vh8)roa;
        vh9.c(a2, 0, 2, false);
        this.a.D(0);
        if ((this.a.y() & 0xFA) != 0x0) {
            return false;
        }
        vh9.c(this.a.a, 0, 4, false);
        this.a.D(0);
        final int e = this.a.e();
        vh9.f = 0;
        vh9.l(e, false);
        vh9.c(this.a.a, 0, 4, false);
        this.a.D(0);
        if (this.a.e() == 0) {
            b = true;
        }
        return b;
    }
    
    public final void c(final long n, final long n2) {
        if (n == 0L) {
            this.g = 1;
            this.h = false;
        }
        else {
            this.g = 3;
        }
        this.j = 0;
    }
    
    @RequiresNonNull({ "extractorOutput" })
    public final void d() {
        if (!this.n) {
            this.f.l((qcp)new qcp.b(-9223372036854775807L));
            this.n = true;
        }
    }
    
    public final gxj e(final roa roa) throws IOException {
        final int l = this.l;
        final gxj d = this.d;
        final byte[] a = d.a;
        if (l > a.length) {
            d.B(new byte[Math.max(a.length * 2, l)], 0);
        }
        else {
            d.D(0);
        }
        this.d.C(this.l);
        roa.readFully(this.d.a, 0, this.l);
        return this.d;
    }
    
    public final void i(final voa f) {
        this.f = f;
    }
    
    public final void release() {
    }
}
