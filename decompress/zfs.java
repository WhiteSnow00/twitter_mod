import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfs
{
    public static final a Companion;
    public final xc0 a;
    public final kks b;
    public final int c;
    public final boolean d;
    public final int e;
    public final rp8 f;
    public final qkb$b g;
    public final List<xc0$b<phk>> h;
    public dth i;
    public cwe j;
    
    static {
        Companion = new a();
    }
    
    public zfs(final xc0 xc0, final kks kks, int n, boolean b, int n2, final rp8 rp8, final qkb$b qkb$b, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            n = Integer.MAX_VALUE;
        }
        if ((n3 & 0x8) != 0x0) {
            b = true;
        }
        if ((n3 & 0x10) != 0x0) {
            Objects.requireNonNull(wjs.Companion);
            n2 = 1;
        }
        Object f0;
        if ((n3 & 0x80) != 0x0) {
            f0 = h3a.F0;
        }
        else {
            f0 = null;
        }
        this(xc0, kks, n, b, n2, rp8, qkb$b, (List)f0, null);
    }
    
    public zfs(final xc0 a, final kks b, int c, final boolean d, final int e, final rp8 f, final qkb$b g, final List h, final wg8 wg8) {
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
        return amz.n(this.b().b());
    }
    
    public final dth b() {
        final dth i = this.i;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
    
    public final qjs c(long s, final cwe cwe, final qjs qjs) {
        e0e.f((Object)cwe, "layoutDirection");
        if (qjs != null) {
            final xc0 a = this.a;
            final kks b = this.b;
            final List<xc0$b<phk>> h = this.h;
            final int c = this.c;
            final boolean d = this.d;
            final int e = this.e;
            final rp8 f = this.f;
            final qkb$b g = this.g;
            e0e.f((Object)a, "text");
            e0e.f((Object)b, "style");
            e0e.f((Object)h, "placeholders");
            e0e.f((Object)f, "density");
            e0e.f((Object)g, "fontFamilyResolver");
            final ojs a2 = qjs.a;
            boolean b3 = false;
            Label_0387: {
                Label_0384: {
                    if (!qjs.b.a.a()) {
                        if (e0e.a((Object)a2.a, (Object)a)) {
                            final kks b2 = a2.b;
                            Objects.requireNonNull(b2);
                            if ((b2 == b || (e0e.a((Object)b2.b, (Object)b.b) && b2.a.d(b.a))) && e0e.a((Object)a2.c, (Object)h) && a2.d == c && a2.e == d && a2.f == e && e0e.a((Object)a2.g, (Object)f) && a2.h == cwe) {
                                if (e0e.a((Object)a2.i, (Object)g)) {
                                    if (vj6.j(s) == vj6.j(a2.j)) {
                                        Label_0378: {
                                            if (!d) {
                                                Objects.requireNonNull(wjs.Companion);
                                                if (e != 2) {
                                                    break Label_0378;
                                                }
                                            }
                                            if (vj6.h(s) != vj6.h(a2.j) || vj6.g(s) != vj6.g(a2.j)) {
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
                final ojs a3 = qjs.a;
                final ojs ojs = new ojs(a3.a, this.b, a3.c, a3.d, a3.e, a3.f, a3.g, a3.h, a3.i, s, null);
                s = xd.S(s, shw.f(amz.n(qjs.b.d), amz.n(qjs.b.e)));
                return new qjs(ojs, qjs.b, s);
            }
        }
        this.d(cwe);
        final int j = vj6.j(s);
        boolean b4 = false;
        Label_0552: {
            if (!this.d) {
                final int e2 = this.e;
                Objects.requireNonNull(wjs.Companion);
                if (e2 != 2) {
                    b4 = false;
                    break Label_0552;
                }
            }
            b4 = true;
        }
        int n;
        if (b4 && vj6.d(s)) {
            n = vj6.h(s);
        }
        else {
            n = Integer.MAX_VALUE;
        }
        boolean b5 = false;
        Label_0626: {
            if (!this.d) {
                final int e3 = this.e;
                Objects.requireNonNull(wjs.Companion);
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
            n = jb2.F(this.a(), j, n);
        }
        final dth b6 = this.b();
        final long m = xd.m(n, vj6.g(s), 5);
        final int e4 = this.e;
        Objects.requireNonNull(wjs.Companion);
        final cth cth = new cth(b6, m, c2, e4 == 2);
        return new qjs(new ojs(this.a, this.b, this.h, this.c, this.d, this.e, this.f, cwe, this.g, s, null), cth, xd.S(s, shw.f(amz.n(cth.d), amz.n(cth.e))));
    }
    
    public final void d(final cwe j) {
        e0e.f((Object)j, "layoutDirection");
        final dth i = this.i;
        dth k = null;
        Label_0079: {
            if (i != null && j == this.j) {
                k = i;
                if (!i.a()) {
                    break Label_0079;
                }
            }
            this.j = j;
            k = new dth(this.a, ix.E(this.b, j), this.h, this.f, this.g);
        }
        this.i = k;
    }
    
    public static final class a
    {
    }
}
