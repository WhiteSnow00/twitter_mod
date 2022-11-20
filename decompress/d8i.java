import android.content.res.Resources;
import android.content.Context;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d8i
{
    public static final void a(final String s, okh companion, final x66 x66, final int n, final int n2) {
        czd.f((Object)s, "trustedFriendsTitle");
        final x66 h = x66.h(1877619399);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)s)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n3 | 0x30);
        }
        else {
            n6 = n3;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)companion)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n3 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n5 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final yzq a2 = yzq.a;
            final okh j = kdq.j(nza.G1(companion, yzq.f, 0.0f, 0.0f, 0.0f, 14), xli.E(2131166693, h));
            h.x(1157296644);
            final boolean p5 = h.P((Object)s);
            final Object y = h.y();
            Object o = null;
            Label_0280: {
                if (!p5) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y) != x66$a.b) {
                        break Label_0280;
                    }
                }
                o = new qsb<fhp, fzv>(s) {
                    public final String D0;
                    
                    public final Object invoke(final Object o) {
                        final fhp fhp = (fhp)o;
                        czd.f((Object)fhp, "$this$semantics");
                        chp.f(fhp, this.D0);
                        return fzv.a;
                    }
                };
                h.p(o);
            }
            h.O();
            final okh n8 = oj7.n(j, false, (qsb)o);
            final ds0 a3 = ds0.a;
            final ds0$b f = ds0.f;
            h.x(-483455358);
            Objects.requireNonNull(ex.Companion);
            final fqg a4 = nr4.a((ds0.l)f, (ex.b)ex.a.n, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a5 = ove.a(n8);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)a4, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a5).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            sis.a(s, (okh)null, 0L, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, kpc.Companion.a(h).g, false, h, n6 & 0xE, 0, 49150);
            c0.D(h);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(s, companion, n, n2) {
                public final String D0;
                public final okh E0;
                public final int F0;
                public final int G0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    d8i.a(this.D0, this.E0, x66, this.F0 | 0x1, this.G0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void b(final y8i$d y8i$d, final boolean b, final qsb<? super h9i, fzv> qsb, final nsb<fzv> nsb, okh companion, final x66 x66, final int n, final int n2) {
        czd.f((Object)y8i$d, "item");
        czd.f((Object)qsb, "onClick");
        czd.f((Object)nsb, "onEditButtonClick");
        final x66 h = x66.h(872612301);
        if ((n2 & 0x10) != 0x0) {
            companion = (okh)okh.Companion;
        }
        final n96$b a = n96.a;
        final String a2 = wd.A(2131955300, h);
        final okh$a companion2 = okh.Companion;
        final okh b2 = gep.b(kdq.i((okh)companion2), b, (nsb)new nsb<fzv>(qsb, y8i$d) {
            public final qsb<h9i, fzv> D0;
            public final y8i$d E0;
            
            public final Object invoke() {
                final qsb<h9i, fzv> d0 = this.D0;
                final y8i$d e0 = this.E0;
                d0.invoke((Object)new h9i$f(e0.a, Integer.valueOf(e0.b), this.E0.c));
                return fzv.a;
            }
        });
        final yzq a3 = yzq.a;
        final okh e = nza.G1(b2, 0.0f, yzq.g, 0.0f, yzq.e, 5).E(companion);
        h.x(693286680);
        final ds0 a4 = ds0.a;
        final ds0$j b3 = ds0.b;
        Objects.requireNonNull(ex.Companion);
        final fqg a5 = ulo.a((ds0.d)b3, ex.a.k, h);
        h.x(-1323940314);
        final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
        final fve fve = (fve)h.m((wd6)yd6.k);
        final t6x t6x = (t6x)h.m((wd6)yd6.o);
        Objects.requireNonNull(q66.Companion);
        final vve$a b4 = q66.a.b;
        final itb a6 = ove.a(e);
        if (!(h.j() instanceof qr0)) {
            wd.t();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((nsb)b4);
        }
        else {
            h.o();
        }
        h.F();
        mru.p(h, (Object)a5, (ftb)q66.a.e);
        mru.p(h, (Object)lo8, (ftb)q66.a.d);
        mru.p(h, (Object)fve, (ftb)q66.a.f);
        ((t26)a6).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-678309503);
        e(b, kdq.o(nza.E1((okh)companion2, 0.0f, 0.0f, 3), xli.E(2131166692, h), xli.E(2131166692, h)), h, n >> 3 & 0xE, 0);
        if (y8i$d.a != 0L) {
            h.x(-329238305);
            c(a2, y8i$d.b, null, h, 0, 4);
            h.O();
        }
        else {
            h.x(-329238129);
            a(a2, null, h, 0, 2);
            h.O();
        }
        if (1.0f > 0.0) {
            final wrd$a a7 = wrd.a;
            final wrd$a a8 = wrd.a;
            final mwe mwe = new mwe(1.0f, true);
            ((okh)companion2).E((okh)mwe);
            wd.k((okh)mwe, h, 0);
            if (y8i$d.a != 0L) {
                final String a9 = wd.A(2131955298, h);
                final f53 f53 = new f53(k53.E0, (k4f)k4f$f.G0);
                final b53$b b53$b = new b53$b(false);
                h.x(1157296644);
                final boolean p8 = h.P((Object)nsb);
                final Object y = h.y();
                Object o = null;
                Label_0651: {
                    if (!p8) {
                        Objects.requireNonNull(x66.Companion);
                        if ((o = y) != x66$a.b) {
                            break Label_0651;
                        }
                    }
                    o = new nsb<fzv>(nsb) {
                        public final nsb<fzv> D0;
                        
                        public final Object invoke() {
                            this.D0.invoke();
                            return fzv.a;
                        }
                    };
                    h.p(o);
                }
                h.O();
                coc.b(f53, (okh)null, a9, (b53)b53$b, (Icon)null, (String)null, false, (nsb)o, h, 4096, 114);
            }
            final lxo y2 = wk0.y(h);
            if (y2 != null) {
                y2.a((ftb)new ftb<x66, Integer, fzv>(y8i$d, b, qsb, nsb, companion, n, n2) {
                    public final y8i$d D0;
                    public final boolean E0;
                    public final qsb<h9i, fzv> F0;
                    public final nsb<fzv> G0;
                    public final okh H0;
                    public final int I0;
                    public final int J0;
                    
                    public final Object invoke(final Object o, final Object o2) {
                        final x66 x66 = (x66)o;
                        ((Number)o2).intValue();
                        d8i.b(this.D0, this.E0, this.F0, this.G0, this.H0, x66, this.I0 | 0x1, this.J0);
                        return fzv.a;
                    }
                });
            }
            return;
        }
        throw new IllegalArgumentException(sk0.B("invalid weight ", 1.0f, "; must be greater than zero").toString());
    }
    
    public static final void c(final String s, final int n, okh companion, final x66 x66, final int n2, final int n3) {
        czd.f((Object)s, "trustedFriendsTitle");
        final x66 h = x66.h(433899557);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)s)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n2);
        }
        else {
            n4 = n2;
        }
        int n6;
        if ((n3 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n2 & 0x70) == 0x0) {
                int n7;
                if (h.d(n)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        final int n8 = n3 & 0x4;
        int n9;
        if (n8 != 0) {
            n9 = (n6 | 0x180);
        }
        else {
            n9 = n6;
            if ((n2 & 0x380) == 0x0) {
                int n10;
                if (h.P((Object)companion)) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n6 | n10);
            }
        }
        if ((n9 & 0x2DB) == 0x92 && h.i()) {
            h.H();
        }
        else {
            if (n8 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final Resources resources = ((Context)h.m((wd6)z20.b)).getResources();
            h.x(1157296644);
            final boolean p6 = h.P((Object)n);
            final Object y = h.y();
            Object h2 = null;
            Label_0343: {
                if (!p6) {
                    Objects.requireNonNull(x66.Companion);
                    if ((h2 = y) != x66$a.b) {
                        break Label_0343;
                    }
                }
                h2 = o1d.h(resources, (long)n, true);
                h.p(h2);
            }
            h.O();
            czd.e(h2, "remember(peopleCount) {\n\u2026e\n            )\n        }");
            final String v = wd.v(2131820620, n, new Object[] { h2 }, h);
            final yzq a2 = yzq.a;
            final okh j = kdq.j(nza.G1(companion, yzq.f, 0.0f, 0.0f, 0.0f, 14), xli.E(2131166693, h));
            h.x(511388516);
            final boolean p7 = h.P((Object)s);
            final boolean p8 = h.P((Object)v);
            final Object y2 = h.y();
            Object o = null;
            Label_0489: {
                if (!(p7 | p8)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y2) != x66$a.b) {
                        break Label_0489;
                    }
                }
                o = new qsb<fhp, fzv>(s, v) {
                    public final String D0;
                    public final String E0;
                    
                    public final Object invoke(final Object o) {
                        final fhp fhp = (fhp)o;
                        czd.f((Object)fhp, "$this$semantics");
                        final String d0 = this.D0;
                        final String e0 = this.E0;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(d0);
                        sb.append(", ");
                        sb.append(e0);
                        chp.f(fhp, sb.toString());
                        return fzv.a;
                    }
                };
                h.p(o);
            }
            h.O();
            final okh n11 = oj7.n(j, false, (qsb)o);
            final ds0 a3 = ds0.a;
            final ds0$b f = ds0.f;
            h.x(-483455358);
            Objects.requireNonNull(ex.Companion);
            final fqg a4 = nr4.a((ds0.l)f, (ex.b)ex.a.n, h);
            h.x(-1323940314);
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o2 = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o2);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a5 = ove.a(n11);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            h.F();
            final q66$a$c e2 = q66.a.e;
            mru.p(h, (Object)a4, (ftb)e2);
            final q66$a$a d = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d);
            final q66$a$b f2 = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f2);
            final q66$a$e g = q66.a.g;
            ((t26)a5).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final kpc$a companion2 = kpc.Companion;
            sis.a(s, (okh)null, 0L, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, companion2.a(h).g, false, h, n9 & 0xE, 0, 49150);
            zzq.e(h, 0);
            h.x(693286680);
            final okh$a companion3 = okh.Companion;
            final fqg a6 = ulo.a((ds0.d)ds0.b, ex.a.k, h);
            h.x(-1323940314);
            final lo8 lo9 = (lo8)h.m((wd6)e);
            final fve fve2 = (fve)h.m((wd6)k);
            final t6x t6x2 = (t6x)h.m((wd6)o2);
            final itb a7 = ove.a((okh)companion3);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            ((t26)a7).h0((Object)mw.x(h, h, a6, e2, h, lo9, d, h, fve2, f2, h, t6x2, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-678309503);
            sis.a(v, (okh)null, ((dpc)h.m((wd6)ipc.a)).j(), 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, companion2.a(h).j, false, h, 0, 0, 49146);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
        }
        final lxo i = h.k();
        if (i != null) {
            i.a((ftb)new ftb<x66, Integer, fzv>(s, n, companion, n2, n3) {
                public final String D0;
                public final int E0;
                public final okh F0;
                public final int G0;
                public final int H0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    d8i.c(this.D0, this.E0, this.F0, x66, this.G0 | 0x1, this.H0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void d(okh companion, x66 h, final int n, final int n2) {
        h = h.h(32895421);
        final int n3 = n2 & 0x1;
        final int n4 = 4;
        int n5;
        if (n3 != 0) {
            n5 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n6;
            if (h.P((Object)companion)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n);
        }
        else {
            n5 = n;
        }
        if ((n5 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final int n7 = n5 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final fqg d = bb2.d((ex)ex.a.b, false, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a2 = ove.a(companion);
            final int n8 = ((n7 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)d, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a2).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)(n8 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n8 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final rp9 d2 = rp9.D0;
                int n10;
                final int n9 = n10 = ((n7 >> 6 & 0x70) | 0x6);
                if ((n9 & 0xE) == 0x0) {
                    int n11;
                    if (h.P((Object)d2)) {
                        n11 = n4;
                    }
                    else {
                        n11 = 2;
                    }
                    n10 = (n9 | n11);
                }
                if ((n10 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    final okh$a companion2 = okh.Companion;
                    final eoc a3 = eoc.a;
                    bb2.a(d2.t0(gmw.e((okh)companion2, eoc.H)), h, 0);
                    r6d.a(af8.F(joc.X0.getDrawableRes(), h), null, d2.m((okh)companion2, ex.a.f), null, null, 0.0f, qq4$a.b(qq4.Companion, eoc.B1), h, 56, 56);
                }
            }
            c0.D(h);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(companion, n, n2) {
                public final okh D0;
                public final int E0;
                public final int F0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    d8i.d(this.D0, x66, this.E0 | 0x1, this.F0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void e(final boolean b, okh companion, x66 h, final int n, final int n2) {
        h = h.h(444122362);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.a(b)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n3 | 0x30);
        }
        else {
            n6 = n3;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)companion)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n3 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n5 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final int n8 = n6 >> 3 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final fqg d = bb2.d((ex)ex.a.b, false, h);
            h.x(-1323940314);
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b2 = q66.a.b;
            final itb a2 = ove.a(companion);
            final int n9 = ((n8 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b2);
            }
            else {
                h.o();
            }
            h.F();
            final q66$a$c e2 = q66.a.e;
            mru.p(h, (Object)d, (ftb)e2);
            final q66$a$a d2 = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d2);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a2).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)(n9 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            final int n10 = 2;
            if ((n9 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final rp9 d3 = rp9.D0;
                int n12;
                final int n11 = n12 = ((n8 >> 6 & 0x70) | 0x6);
                if ((n11 & 0xE) == 0x0) {
                    int n13 = n10;
                    if (h.P((Object)d3)) {
                        n13 = 4;
                    }
                    n12 = (n11 | n13);
                }
                if ((n12 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    h.x(-483455358);
                    final okh$a companion2 = okh.Companion;
                    final ds0 a3 = ds0.a;
                    final fqg a4 = nr4.a((ds0.l)ds0.d, (ex.b)ex.a.n, h);
                    h.x(-1323940314);
                    final lo8 lo9 = (lo8)h.m((wd6)e);
                    final fve fve2 = (fve)h.m((wd6)k);
                    final t6x t6x2 = (t6x)h.m((wd6)o);
                    final itb a5 = ove.a((okh)companion2);
                    if (!(h.j() instanceof qr0)) {
                        wd.t();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((nsb)b2);
                    }
                    else {
                        h.o();
                    }
                    ((t26)a5).h0((Object)mw.x(h, h, a4, e2, h, lo9, d2, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
                    h.x(2058660585);
                    h.x(-1163856341);
                    final okh o2 = kdq.o((okh)companion2, xli.E(2131166693, h), xli.E(2131166693, h));
                    final float n14 = 12;
                    d(rrz.l(o2, (frp)elo.d(n14, n14, n14, n14)), h, 0, 0);
                    zzq.l(h, 0);
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                    h.O();
                    if (b) {
                        s6i.a(d3.m((okh)companion2, ex.a.j), h, 0, 0);
                    }
                }
            }
            c0.D(h);
        }
        final lxo i = h.k();
        if (i != null) {
            i.a((ftb)new ftb<x66, Integer, fzv>(b, companion, n, n2) {
                public final boolean D0;
                public final okh E0;
                public final int F0;
                public final int G0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    d8i.e(this.D0, this.E0, x66, this.F0 | 0x1, this.G0);
                    return fzv.a;
                }
            });
        }
    }
}
