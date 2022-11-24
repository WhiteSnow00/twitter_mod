import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import java.io.IOException;
import com.google.android.exoplayer2.n;
import java.util.Arrays;
import com.google.android.exoplayer2.ParserException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qgj implements qoa
{
    public voa a;
    public ekr b;
    public boolean c;
    
    static {
        final p71 i0 = p71.I0;
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        omi.r((Object)this.a);
        if (this.b == null) {
            if (!this.d(roa)) {
                throw ParserException.a("Failed to determine bitstream type", (Throwable)null);
            }
            roa.e();
        }
        final boolean c = this.c;
        final int n = 0;
        if (!c) {
            final vwt r = this.a.r(0, 1);
            this.a.p();
            final ekr b = this.b;
            b.c = this.a;
            b.b = r;
            b.e(true);
            this.c = true;
        }
        final ekr b2 = this.b;
        omi.r((Object)b2.b);
        final int a = rnw.a;
        final int h = b2.h;
        if (h == 0) {
            while (true) {
                while (b2.a.b(roa)) {
                    final long position = roa.getPosition();
                    final long f = b2.f;
                    b2.k = position - f;
                    if (b2.d(b2.a.b, f, b2.j)) {
                        b2.f = roa.getPosition();
                    }
                    else {
                        final boolean b3 = true;
                        if (!b3) {
                            return -1;
                        }
                        final n a2 = b2.j.a;
                        b2.i = a2.e1;
                        if (!b2.m) {
                            b2.b.e(a2);
                            b2.m = true;
                        }
                        final j2b$a b4 = b2.j.b;
                        if (b4 != null) {
                            b2.d = (tgj)b4;
                        }
                        else if (roa.getLength() == -1L) {
                            b2.d = new ekr.b();
                        }
                        else {
                            final sgj a3 = b2.a.a;
                            b2.d = new zj8(b2, b2.f, roa.getLength(), a3.d + a3.e, a3.b, (a3.a & 0x4) != 0x0);
                        }
                        b2.h = 2;
                        final rgj a4 = b2.a;
                        final gxj b5 = a4.b;
                        final byte[] a5 = b5.a;
                        if (a5.length == 65025) {
                            return n;
                        }
                        b5.B(Arrays.copyOf(a5, Math.max(65025, b5.c)), a4.b.c);
                        return n;
                    }
                }
                b2.h = 3;
                final boolean b3 = false;
                continue;
            }
        }
        if (h == 1) {
            roa.k((int)b2.f);
            b2.h = 2;
            return n;
        }
        if (h != 2) {
            if (h != 3) {
                throw new IllegalStateException();
            }
        }
        else {
            final long a6 = b2.d.a(roa);
            if (a6 >= 0L) {
                lsk.a = a6;
                return 1;
            }
            if (a6 < -1L) {
                b2.b(-(a6 + 2L));
            }
            if (!b2.l) {
                final qcp b6 = b2.d.b();
                omi.r((Object)b6);
                b2.c.l(b6);
                b2.l = true;
            }
            if (b2.k > 0L || b2.a.b(roa)) {
                b2.k = 0L;
                final gxj b7 = b2.a.b;
                final long c2 = b2.c(b7);
                if (c2 >= 0L) {
                    final long g = b2.g;
                    if (g + c2 >= b2.e) {
                        final long n3 = g * 1000000L / b2.i;
                        b2.b.d(b7, b7.c);
                        b2.b.b(n3, 1, b7.c, 0, (vwt$a)null);
                        b2.e = -1L;
                    }
                }
                b2.g += c2;
                return n;
            }
            b2.h = 3;
        }
        return -1;
    }
    
    public final boolean b(final roa roa) throws IOException {
        try {
            return this.d(roa);
        }
        catch (final ParserException ex) {
            return false;
        }
    }
    
    public final void c(long a, final long n) {
        final ekr b = this.b;
        if (b != null) {
            final rgj a2 = b.a;
            a2.a.b();
            a2.b.A(0);
            a2.c = -1;
            a2.e = false;
            if (a == 0L) {
                b.e(b.l ^ true);
            }
            else if (b.h != 0) {
                a = b.a(n);
                b.e = a;
                final tgj d = b.d;
                final int a3 = rnw.a;
                d.c(a);
                b.h = 2;
            }
        }
    }
    
    @EnsuresNonNullIf(expression = { "streamReader" }, result = true)
    public final boolean d(final roa roa) throws IOException {
        final sgj sgj = new sgj();
        if (sgj.a(roa, true)) {
            if ((sgj.a & 0x2) == 0x2) {
                final int min = Math.min(sgj.e, 8);
                final gxj gxj = new gxj(min);
                roa.n(gxj.a, 0, min);
                gxj.D(0);
                if (gxj.c - gxj.b >= 5 && gxj.t() == 127 && gxj.u() == 1179402563L) {
                    this.b = (ekr)new j2b();
                }
                else {
                    gxj.D(0);
                    boolean d;
                    try {
                        d = hix.d(1, gxj, true);
                    }
                    catch (final ParserException ex) {
                        d = false;
                    }
                    if (d) {
                        this.b = new gix();
                    }
                    else {
                        gxj.D(0);
                        if (!toj.f(gxj, toj.n)) {
                            return false;
                        }
                        this.b = new toj();
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public final void i(final voa a) {
        this.a = a;
    }
    
    public final void release() {
    }
}
