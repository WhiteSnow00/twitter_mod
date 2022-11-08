import java.io.IOException;
import java.io.EOFException;
import com.google.android.exoplayer2.ParserException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iv implements joa
{
    public final int a;
    public final jv b;
    public final mwj c;
    public final mwj d;
    public final rgx e;
    public ooa f;
    public long g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    
    static {
        final m71 k0 = m71.K0;
    }
    
    public iv(final int n) {
        this.a = 0;
        this.b = new jv(true, (String)null);
        this.c = new mwj(2048);
        this.i = -1;
        this.h = -1L;
        final mwj d = new mwj(10);
        this.d = d;
        this.e = new rgx(d.a, 1, (w48)null);
    }
    
    @Override
    public final int a(final koa koa, final rrk rrk) throws IOException {
        ri4.y((Object)this.f);
        final long length = koa.getLength();
        final int a = this.a;
        if ((a & 0x2) != 0x0 || ((a & 0x1) != 0x0 && length != -1L)) {
            if (!this.j) {
                this.i = -1;
                koa.e();
                final long position = koa.getPosition();
                long n = 0L;
                if (position == 0L) {
                    this.d(koa);
                }
                int n2 = 0;
                int n5;
                long n6;
                while (true) {
                    int n3 = n2;
                    long n4 = n;
                    n5 = n2;
                    n6 = n;
                    try {
                        if (koa.c(this.d.a, 0, 2, true)) {
                            n3 = n2;
                            n4 = n;
                            this.d.D(0);
                            n3 = n2;
                            n4 = n;
                            if (!jv.g(this.d.y())) {
                                n5 = 0;
                                n6 = n;
                            }
                            else {
                                n3 = n2;
                                n4 = n;
                                if (!koa.c(this.d.a, 0, 4, true)) {
                                    n5 = n2;
                                    n6 = n;
                                }
                                else {
                                    n3 = n2;
                                    n4 = n;
                                    this.e.k(14);
                                    n3 = n2;
                                    n4 = n;
                                    final int g = this.e.g(13);
                                    if (g <= 6) {
                                        n3 = n2;
                                        n4 = n;
                                        this.j = true;
                                        n3 = n2;
                                        n4 = n;
                                        throw ParserException.a("Malformed ADTS stream", (Throwable)null);
                                    }
                                    n += g;
                                    if (++n2 == 1000) {
                                        n5 = n2;
                                        n6 = n;
                                    }
                                    else {
                                        n3 = n2;
                                        n4 = n;
                                        if (koa.l(g - 6, true)) {
                                            continue;
                                        }
                                        n5 = n2;
                                        n6 = n;
                                    }
                                }
                            }
                        }
                    }
                    catch (final EOFException ex) {
                        n6 = n4;
                        n5 = n3;
                    }
                    break;
                }
                koa.e();
                if (n5 > 0) {
                    this.i = (int)(n6 / n5);
                }
                else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        final int b = koa.b(this.c.a, 0, 2048);
        final boolean b2 = b == -1;
        if (!this.l) {
            final int a2 = this.a;
            final boolean b3 = (a2 & 0x1) != 0x0 && this.i > 0;
            if (!b3 || this.b.q != -9223372036854775807L || b2) {
                Label_0622: {
                    if (b3) {
                        final long q = this.b.q;
                        if (q != -9223372036854775807L) {
                            final ooa f = this.f;
                            final boolean b4 = (0x2 & a2) != 0x0;
                            final int i = this.i;
                            f.n((ebp)new ni6(length, this.h, (int)(i * 8 * 1000000L / q), i, b4));
                            break Label_0622;
                        }
                    }
                    this.f.n((ebp)new ebp.b(-9223372036854775807L));
                }
                this.l = true;
            }
        }
        if (b2) {
            return -1;
        }
        this.c.D(0);
        this.c.C(b);
        if (!this.k) {
            this.b.f(this.g, 4);
            this.k = true;
        }
        this.b.a(this.c);
        return 0;
    }
    
    @Override
    public final boolean b(final koa koa) throws IOException {
        int d;
        final int n = d = this.d(koa);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        do {
            final byte[] a = this.d.a;
            final gh8 gh8 = (gh8)koa;
            gh8.c(a, 0, 2, false);
            this.d.D(0);
            int n6 = 0;
            Label_0207: {
                int n5;
                if (!jv.g(this.d.y())) {
                    n5 = d + 1;
                    gh8.f = 0;
                    gh8.l(n5, false);
                }
                else {
                    if (++n2 >= 4 && n3 > 188) {
                        return true;
                    }
                    gh8.c(this.d.a, 0, 4, false);
                    this.e.k(14);
                    final int g = this.e.g(13);
                    if (g > 6) {
                        gh8.l(g - 6, false);
                        n3 += g;
                        n4 = d;
                        n6 = n2;
                        break Label_0207;
                    }
                    n5 = d + 1;
                    gh8.f = 0;
                    gh8.l(n5, false);
                }
                n6 = 0;
                final int n7 = 0;
                n4 = n5;
                n3 = n7;
            }
            n2 = n6;
            d = n4;
        } while (n4 - n < 8192);
        return false;
    }
    
    @Override
    public final void c(final long n, final long g) {
        this.k = false;
        this.b.c();
        this.g = g;
    }
    
    public final int d(final koa koa) throws IOException {
        int n = 0;
        while (true) {
            koa.n(this.d.a, 0, 10);
            this.d.D(0);
            if (this.d.v() != 4801587) {
                break;
            }
            this.d.E(3);
            final int s = this.d.s();
            n += s + 10;
            koa.i(s);
        }
        koa.e();
        koa.i(n);
        if (this.h == -1L) {
            this.h = n;
        }
        return n;
    }
    
    @Override
    public final void i(final ooa f) {
        this.f = f;
        this.b.d(f, new bau$d(0, 1));
        f.q();
    }
    
    @Override
    public final void release() {
    }
}
