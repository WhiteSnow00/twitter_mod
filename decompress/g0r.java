import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import j$.util.concurrent.ThreadLocalRandom;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g0r extends xp1 implements b0r
{
    public static final g0r.g0r$a Companion;
    public final int u;
    
    static {
        Companion = new g0r.g0r$a();
    }
    
    public g0r(final String s, final xp1 xp1, final mvt mvt, final sbu sbu, final fca fca, final rvt rvt, final boolean b, final boolean b2, final rf8 rf8) {
        super(s, xp1, mvt, sbu, fca, rvt, b, b2, 256);
        int nextInt;
        if (f6s.a) {
            nextInt = ThreadLocalRandom.current().nextInt();
        }
        else {
            nextInt = Integer.MIN_VALUE;
        }
        this.u = nextInt;
    }
    
    public final boolean U(final oir oir) {
        return this.n(true, oir);
    }
    
    public final boolean a(long a, final TimeUnit timeUnit) {
        czd.f((Object)timeUnit, "unit");
        long n = a;
        if (a < 0L) {
            wk0.b().t();
            n = 0L;
        }
        synchronized (super.c) {
            a = super.d.a();
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            a -= timeUnit.convert(n, milliseconds);
            boolean b;
            if (this.j(a)) {
                super.m = milliseconds.toMicros(a);
                final String j = super.j;
                final int u = this.u;
                final boolean a2 = f6s.a;
                czd.f((Object)j, "name");
                if (f6s.a) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("pct:");
                    sb.append(j);
                    c20.a(sb.toString(), u);
                }
                this.m(2);
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    public final int h() {
        final int decrementAndGet = super.s.decrementAndGet();
        if (decrementAndGet == 0 && super.h) {
            this.n(false, oir.F0);
        }
        return decrementAndGet;
    }
    
    public final boolean n(final boolean b, final oir oir) {
        synchronized (super.c) {
            boolean b2;
            if (ze.g(super.l) && (!super.h || !b || oir.D0)) {
                for (final xp1 xp1 : super.p) {
                    if (ze.g(xp1.l)) {
                        ((z0k)xp1).U(oir);
                    }
                    else {
                        if (ze.e(xp1.l)) {
                            continue;
                        }
                        xp1.cancel();
                    }
                }
                super.n = TimeUnit.MILLISECONDS.toMicros(super.d.a());
                final j06 e0 = oir.E0;
                czd.f((Object)e0, "<set-?>");
                super.o = e0;
                this.m(3);
                final String j = super.j;
                final int u = this.u;
                final boolean a = f6s.a;
                czd.f((Object)j, "name");
                if (f6s.a) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("pct:");
                    sb.append(j);
                    c20.b(sb.toString(), u);
                }
                if (super.g || oir.D0) {
                    this.k();
                }
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
    }
    
    public final boolean start() {
        return jxa.u((gjg)this, 0L, null, 2, null);
    }
}
