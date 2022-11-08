import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mes
{
    public static final a Companion;
    public final bd0 a;
    public final xis b;
    public final int c;
    public final boolean d;
    public final int e;
    public final dp8 f;
    public final rkb$b g;
    public final List<bd0$b<vgk>> h;
    public jsh i;
    public tve j;
    
    static {
        Companion = new a();
    }
    
    public mes(final bd0 a, final xis b, int c, final boolean d, final int e, final dp8 f, final rkb$b g, final List h, final hg8 hg8) {
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
        return xd.j(this.b().b());
    }
    
    public final jsh b() {
        final jsh i = this.i;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
    
    public final dis c(long r, final tve tve, final dis dis) {
        zzd.f((Object)tve, "layoutDirection");
        if (dis != null) {
            final bd0 a = this.a;
            final xis b = this.b;
            final List<bd0$b<vgk>> h = this.h;
            final int c = this.c;
            final boolean d = this.d;
            final int e = this.e;
            final dp8 f = this.f;
            final rkb$b g = this.g;
            zzd.f((Object)a, "text");
            zzd.f((Object)b, "style");
            zzd.f((Object)h, "placeholders");
            zzd.f((Object)f, "density");
            zzd.f((Object)g, "fontFamilyResolver");
            final bis a2 = dis.a;
            boolean b3 = false;
            Label_0387: {
                Label_0384: {
                    if (!dis.b.a.a()) {
                        if (zzd.a((Object)a2.a, (Object)a)) {
                            final xis b2 = a2.b;
                            Objects.requireNonNull(b2);
                            if ((b2 == b || (zzd.a((Object)b2.b, (Object)b.b) && b2.a.d(b.a))) && zzd.a((Object)a2.c, (Object)h) && a2.d == c && a2.e == d && a2.f == e && zzd.a((Object)a2.g, (Object)f) && a2.h == tve) {
                                if (zzd.a((Object)a2.i, (Object)g)) {
                                    if (jj6.j(r) == jj6.j(a2.j)) {
                                        Label_0378: {
                                            if (!d) {
                                                Objects.requireNonNull(jis.Companion);
                                                if (e != 2) {
                                                    break Label_0378;
                                                }
                                            }
                                            if (jj6.h(r) != jj6.h(a2.j) || jj6.g(r) != jj6.g(a2.j)) {
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
                final bis a3 = dis.a;
                final bis bis = new bis(a3.a, this.b, a3.c, a3.d, a3.e, a3.f, a3.g, a3.h, a3.i, r, (hg8)null);
                r = fk7.r(r, lr0.b(xd.j(dis.b.d), xd.j(dis.b.e)));
                return new dis(bis, dis.b, r);
            }
        }
        this.d(tve);
        final int j = jj6.j(r);
        boolean b4 = false;
        Label_0552: {
            if (!this.d) {
                final int e2 = this.e;
                Objects.requireNonNull(jis.Companion);
                if (e2 != 2) {
                    b4 = false;
                    break Label_0552;
                }
            }
            b4 = true;
        }
        int n;
        if (b4 && jj6.d(r)) {
            n = jj6.h(r);
        }
        else {
            n = Integer.MAX_VALUE;
        }
        boolean b5 = false;
        Label_0626: {
            if (!this.d) {
                final int e3 = this.e;
                Objects.requireNonNull(jis.Companion);
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
            n = pf8.v(this.a(), j, n);
        }
        final jsh b6 = this.b();
        final long g2 = fk7.g(n, jj6.g(r), 5);
        final int e4 = this.e;
        Objects.requireNonNull(jis.Companion);
        final ish ish = new ish(b6, g2, c2, e4 == 2);
        return new dis(new bis(this.a, this.b, (List)this.h, this.c, this.d, this.e, this.f, tve, this.g, r, (hg8)null), ish, fk7.r(r, lr0.b(xd.j(ish.d), xd.j(ish.e))));
    }
    
    public final void d(final tve j) {
        zzd.f((Object)j, "layoutDirection");
        final jsh i = this.i;
        jsh k = null;
        Label_0079: {
            if (i != null && j == this.j) {
                k = i;
                if (!i.a()) {
                    break Label_0079;
                }
            }
            this.j = j;
            k = new jsh(this.a, asy.u0(this.b, j), (List)this.h, this.f, this.g);
        }
        this.i = k;
    }
    
    public static final class a
    {
    }
}
