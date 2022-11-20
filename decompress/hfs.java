import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfs
{
    public static final a Companion;
    public final xc0 a;
    public final sjs b;
    public final int c;
    public final boolean d;
    public final int e;
    public final lo8 f;
    public final pjb$b g;
    public final List<xc0$b<bhk>> h;
    public osh i;
    public fve j;
    
    static {
        Companion = new a();
    }
    
    public hfs(final xc0 xc0, final sjs sjs, int n, boolean b, int n2, final lo8 lo8, final pjb$b pjb$b, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            n = Integer.MAX_VALUE;
        }
        if ((n3 & 0x8) != 0x0) {
            b = true;
        }
        if ((n3 & 0x10) != 0x0) {
            Objects.requireNonNull(ejs.Companion);
            n2 = 1;
        }
        Object d0;
        if ((n3 & 0x80) != 0x0) {
            d0 = f2a.D0;
        }
        else {
            d0 = null;
        }
        this(xc0, sjs, n, b, n2, lo8, pjb$b, (List)d0, null);
    }
    
    public hfs(final xc0 a, final sjs b, int c, final boolean d, final int e, final lo8 f, final pjb$b g, final List h, final rf8 rf8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        if (c > 0) {
            c = 1;
        }
        else {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final int a() {
        return xli.A(this.b().b());
    }
    
    public final osh b() {
        final osh i = this.i;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
    
    public final yis c(long r, final fve fve, final yis yis) {
        czd.f((Object)fve, "layoutDirection");
        if (yis != null) {
            final xc0 a = this.a;
            final sjs b = this.b;
            final List<xc0$b<bhk>> h = this.h;
            final int c = this.c;
            final boolean d = this.d;
            final int e = this.e;
            final lo8 f = this.f;
            final pjb$b g = this.g;
            czd.f((Object)a, "text");
            czd.f((Object)b, "style");
            czd.f((Object)h, "placeholders");
            czd.f((Object)f, "density");
            czd.f((Object)g, "fontFamilyResolver");
            final wis a2 = yis.a;
            boolean b3 = false;
            Label_0387: {
                Label_0384: {
                    if (!yis.b.a.a()) {
                        if (czd.a((Object)a2.a, (Object)a)) {
                            final sjs b2 = a2.b;
                            Objects.requireNonNull(b2);
                            if ((b2 == b || (czd.a((Object)b2.b, (Object)b.b) && b2.a.d(b.a))) && czd.a((Object)a2.c, (Object)h) && a2.d == c && a2.e == d && a2.f == e && czd.a((Object)a2.g, (Object)f) && a2.h == fve) {
                                if (czd.a((Object)a2.i, (Object)g)) {
                                    if (pi6.j(r) == pi6.j(a2.j)) {
                                        Label_0378: {
                                            if (!d) {
                                                Objects.requireNonNull(ejs.Companion);
                                                if (e != 2) {
                                                    break Label_0378;
                                                }
                                            }
                                            if (pi6.h(r) != pi6.h(a2.j) || pi6.g(r) != pi6.g(a2.j)) {
                                                break Label_0384;
                                            }
                                        }
                                        b3 = true;
                                        break Label_0387;
                                    }
                                }
                            }
                        }
                    }
                }
                b3 = false;
            }
            if (b3) {
                final wis a3 = yis.a;
                final wis wis = new wis(a3.a, this.b, a3.c, a3.d, a3.e, a3.f, a3.g, a3.h, a3.i, r, (rf8)null);
                r = uoz.r(r, rp9.t(xli.A(yis.b.d), xli.A(yis.b.e)));
                return new yis(wis, yis.b, r);
            }
        }
        this.d(fve);
        final int j = pi6.j(r);
        boolean b4 = false;
        Label_0552: {
            if (!this.d) {
                final int e2 = this.e;
                Objects.requireNonNull(ejs.Companion);
                if (e2 != 2) {
                    b4 = false;
                    break Label_0552;
                }
            }
            b4 = true;
        }
        int n;
        if (b4 && pi6.d(r)) {
            n = pi6.h(r);
        }
        else {
            n = Integer.MAX_VALUE;
        }
        boolean b5 = false;
        Label_0626: {
            if (!this.d) {
                final int e3 = this.e;
                Objects.requireNonNull(ejs.Companion);
                if (e3 == 2) {
                    b5 = true;
                    break Label_0626;
                }
            }
            b5 = false;
        }
        int c2;
        if (b5) {
            c2 = 1;
        }
        else {
            c2 = this.c;
        }
        if (j != n) {
            n = rrz.p(this.a(), j, n);
        }
        final osh b6 = this.b();
        final long c3 = uoz.c(n, pi6.g(r), 5);
        final int e4 = this.e;
        Objects.requireNonNull(ejs.Companion);
        final nsh nsh = new nsh(b6, c3, c2, e4 == 2);
        return new yis(new wis(this.a, this.b, (List)this.h, this.c, this.d, this.e, this.f, fve, this.g, r, (rf8)null), nsh, uoz.r(r, rp9.t(xli.A(nsh.d), xli.A(nsh.e))));
    }
    
    public final void d(final fve j) {
        czd.f((Object)j, "layoutDirection");
        final osh i = this.i;
        osh k = null;
        Label_0079: {
            if (i != null && j == this.j) {
                k = i;
                if (!i.a()) {
                    break Label_0079;
                }
            }
            this.j = j;
            k = new osh(this.a, af8.L(this.b, j), (List)this.h, this.f, this.g);
        }
        this.i = k;
    }
    
    public static final class a
    {
    }
}
