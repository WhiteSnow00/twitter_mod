import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import java.io.IOException;
import com.google.android.exoplayer2.n;
import java.util.Arrays;
import com.google.android.exoplayer2.ParserException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfj implements joa
{
    public ooa a;
    public oir b;
    public boolean c;
    
    static {
        final p71 f0 = p71.F0;
    }
    
    @Override
    public final int a(final koa koa, final rrk rrk) throws IOException {
        ri4.y((Object)this.a);
        if (this.b == null) {
            if (!this.d(koa)) {
                throw ParserException.a("Failed to determine bitstream type", (Throwable)null);
            }
            koa.e();
        }
        final boolean c = this.c;
        final int n = 0;
        if (!c) {
            final ovt s = this.a.s(0, 1);
            this.a.q();
            final oir b = this.b;
            b.c = this.a;
            b.b = s;
            b.e(true);
            this.c = true;
        }
        final oir b2 = this.b;
        ri4.y((Object)b2.b);
        final int a = imw.a;
        final int h = b2.h;
        if (h == 0) {
            while (true) {
                while (b2.a.b(koa)) {
                    final long position = koa.getPosition();
                    final long f = b2.f;
                    b2.k = position - f;
                    if (b2.d(b2.a.b, f, b2.j)) {
                        b2.f = koa.getPosition();
                    }
                    else {
                        final boolean b3 = true;
                        if (!b3) {
                            return -1;
                        }
                        final n a2 = b2.j.a;
                        b2.i = a2.b1;
                        if (!b2.m) {
                            b2.b.e(a2);
                            b2.m = true;
                        }
                        final n2b$a b4 = b2.j.b;
                        if (b4 != null) {
                            b2.d = (zfj)b4;
                        }
                        else if (koa.getLength() == -1L) {
                            b2.d = (zfj)new oir$b();
                        }
                        else {
                            final yfj a3 = b2.a.a;
                            b2.d = (zfj)new mj8(b2, b2.f, koa.getLength(), (long)(a3.d + a3.e), a3.b, (a3.a & 0x4) != 0x0);
                        }
                        b2.h = 2;
                        final xfj a4 = b2.a;
                        final mwj b5 = a4.b;
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
            koa.k((int)b2.f);
            b2.h = 2;
            return n;
        }
        if (h != 2) {
            if (h != 3) {
                throw new IllegalStateException();
            }
        }
        else {
            final long a6 = b2.d.a(koa);
            if (a6 >= 0L) {
                rrk.a = a6;
                return 1;
            }
            if (a6 < -1L) {
                b2.b(-(a6 + 2L));
            }
            if (!b2.l) {
                final ebp b6 = b2.d.b();
                ri4.y((Object)b6);
                b2.c.n(b6);
                b2.l = true;
            }
            if (b2.k > 0L || b2.a.b(koa)) {
                b2.k = 0L;
                final mwj b7 = b2.a.b;
                final long c2 = b2.c(b7);
                if (c2 >= 0L) {
                    final long g = b2.g;
                    if (g + c2 >= b2.e) {
                        final long n3 = g * 1000000L / b2.i;
                        b2.b.d(b7, b7.c);
                        b2.b.b(n3, 1, b7.c, 0, (ovt$a)null);
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
    
    @Override
    public final boolean b(final koa koa) throws IOException {
        try {
            return this.d(koa);
        }
        catch (final ParserException ex) {
            return false;
        }
    }
    
    @Override
    public final void c(long a, final long n) {
        final oir b = this.b;
        if (b != null) {
            final xfj a2 = b.a;
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
                final zfj d = b.d;
                final int a3 = imw.a;
                d.c(a);
                b.h = 2;
            }
        }
    }
    
    @EnsuresNonNullIf(expression = { "streamReader" }, result = true)
    public final boolean d(final koa koa) throws IOException {
        final yfj yfj = new yfj();
        if (yfj.a(koa, true)) {
            if ((yfj.a & 0x2) == 0x2) {
                final int min = Math.min(yfj.e, 8);
                final mwj mwj = new mwj(min);
                koa.n(mwj.a, 0, min);
                mwj.D(0);
                if (mwj.c - mwj.b >= 5 && mwj.t() == 127 && mwj.u() == 1179402563L) {
                    this.b = (oir)new n2b();
                }
                else {
                    mwj.D(0);
                    boolean d;
                    try {
                        d = vgx.d(1, mwj, true);
                    }
                    catch (final ParserException ex) {
                        d = false;
                    }
                    if (d) {
                        this.b = (oir)new ugx();
                    }
                    else {
                        mwj.D(0);
                        if (!ynj.f(mwj, ynj.n)) {
                            return false;
                        }
                        this.b = new ynj();
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void i(final ooa a) {
        this.a = a;
    }
    
    @Override
    public final void release() {
    }
}
