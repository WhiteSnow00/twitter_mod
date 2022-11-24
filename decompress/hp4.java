import com.twitter.core.ui.styles.icons.implementation.Icon;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.app.collabs.search.CollaboratorsSearchViewModel;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hp4
{
    public static final void a(final ptb<vzv> ptb, d86 h, final int n) {
        h = h.h(-643477777);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)ptb)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            final long a2 = ((dqc)h.m((df6)iqc.a)).a();
            final float n4 = 0;
            final q46 a3 = q46.a;
            ij0.c((hub)q46.b, (dlh)null, (hub)w9y.i(h, 573866601, new hub<d86, Integer, vzv>(ptb, n3) {
                public final ptb<vzv> F0;
                public final int G0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
                        d86.H();
                    }
                    else {
                        final sa6$b a = sa6.a;
                        final ptb<vzv> f0 = this.F0;
                        final q46 a2 = q46.a;
                        h4d.a((ptb)f0, (dlh)null, false, (iuh)null, (hub)q46.c, d86, (this.G0 & 0xE) | 0x6000, 14);
                    }
                    return vzv.a;
                }
            }), (kub)null, a2, 0L, n4, h, 1573254, 42);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(ptb, n) {
                public final ptb<vzv> F0;
                public final int G0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    hp4.a(this.F0, d86, this.G0 | 0x1);
                    return vzv.a;
                }
            });
        }
    }
    
    public static final void b(final f8p f8p, final stb<? super qgv, vzv> stb, final stb<? super qgv, vzv> stb2, dlh companion, d86 h, final int n, final int n2) {
        h = h.h(465356871);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)f8p)) {
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
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (h.P((Object)stb)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        int n7;
        if ((n2 & 0x4) != 0x0) {
            n7 = (n5 | 0x180);
        }
        else {
            n7 = n5;
            if ((n & 0x380) == 0x0) {
                int n8;
                if (h.P((Object)stb2)) {
                    n8 = 256;
                }
                else {
                    n8 = 128;
                }
                n7 = (n5 | n8);
            }
        }
        final int n9 = n2 & 0x8;
        int n10;
        if (n9 != 0) {
            n10 = (n7 | 0xC00);
        }
        else {
            n10 = n7;
            if ((n & 0x1C00) == 0x0) {
                int n11;
                if (h.P((Object)companion)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n7 | n11);
            }
        }
        if ((n10 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            if (n9 != 0) {
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            u77.c((Object)(f8p instanceof f8p$d), (dlh)null, (w0b)null, (String)null, (kub)w9y.i(h, -1002036248, new kub<Boolean, d86, Integer, vzv>(f8p, stb, stb2, n10, companion) {
                public final f8p F0;
                public final stb<qgv, vzv> G0;
                public final stb<qgv, vzv> H0;
                public final int I0;
                public final dlh J0;
                
                public final Object h0(final Object o, final Object o2, final Object o3) {
                    final boolean booleanValue = (boolean)o;
                    final d86 d86 = (d86)o2;
                    int intValue;
                    final int n = intValue = ((Number)o3).intValue();
                    if ((n & 0xE) == 0x0) {
                        int n2;
                        if (d86.a(booleanValue)) {
                            n2 = 4;
                        }
                        else {
                            n2 = 2;
                        }
                        intValue = (n | n2);
                    }
                    if ((intValue & 0x5B) == 0x12 && d86.i()) {
                        d86.H();
                    }
                    else {
                        final sa6$b a = sa6.a;
                        if (booleanValue && this.F0 instanceof f8p$d) {
                            d86.x(-1158429977);
                            final hed a2 = ((f8p$d)this.F0).a;
                            final stb<qgv, vzv> g0 = this.G0;
                            final stb<qgv, vzv> h0 = this.H0;
                            final int i0 = this.I0;
                            hp4.f(a2, g0, h0, null, d86, (i0 & 0x70) | 0x8 | (i0 & 0x380), 8);
                            d86.O();
                        }
                        else {
                            d86.x(-1158429880);
                            hp4.e(w0r.n(this.J0), d86, 0, 0);
                            d86.O();
                        }
                    }
                    return vzv.a;
                }
            }), h, 24576, 14);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(f8p, stb, stb2, companion, n, n2) {
                public final f8p F0;
                public final stb<qgv, vzv> G0;
                public final stb<qgv, vzv> H0;
                public final dlh I0;
                public final int J0;
                public final int K0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    hp4.b(this.F0, this.G0, this.H0, this.I0, d86, this.J0 | 0x1, this.K0);
                    return vzv.a;
                }
            });
        }
    }
    
    public static final void c(final qgv qgv, final stb<? super qgv, vzv> stb, final stb<? super qgv, vzv> stb2, dlh companion, final d86 d86, final int n, final int n2) {
        e0e.f((Object)qgv, "user");
        e0e.f((Object)stb, "onAvatarClicked");
        e0e.f((Object)stb2, "onUserClicked");
        final d86 h = d86.h(-266552639);
        if ((n2 & 0x8) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        final sa6$b a = sa6.a;
        Objects.requireNonNull(ex.Companion);
        final jw1.b l = ex$a.l;
        final dlh b0 = zzz.b0(pe4.d(companion, false, null, null, (ptb)new ptb<vzv>(stb2, qgv) {
            public final stb<qgv, vzv> F0;
            public final qgv G0;
            
            public final Object invoke() {
                this.F0.invoke((Object)this.G0);
                return vzv.a;
            }
        }, 7), 0.0f, (float)12, 1);
        h.x(693286680);
        final gs0 a2 = gs0.a;
        final zqg a3 = omo.a((gs0$d)gs0.b, (ex$c)l, h);
        h.x(-1323940314);
        final gbr e = ff6.e;
        final rp8 rp8 = (rp8)h.m((df6)e);
        final gbr k = ff6.k;
        final cwe cwe = (cwe)h.m((df6)k);
        final gbr o = ff6.o;
        final l7x l7x = (l7x)h.m((df6)o);
        Objects.requireNonNull(w76.Companion);
        final swe$a b2 = w76.a.b;
        final kub<weq<w76>, d86, Integer, vzv> a4 = lwe.a(b0);
        if (!(h.j() instanceof tr0)) {
            kqe.W();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((ptb)b2);
        }
        else {
            h.o();
        }
        h.F();
        final w76$a$c e2 = w76.a.e;
        jty.X(h, a3, (hub)e2);
        final w76$a$a d87 = w76.a.d;
        jty.X(h, rp8, (hub)d87);
        final w76$a$b f = w76.a.f;
        jty.X(h, cwe, (hub)f);
        final w76$a$e g = w76.a.g;
        ((z36)a4).h0((Object)af.y(h, l7x, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-678309503);
        w0r.d(h, 0);
        h.x(-492369756);
        final Object y = h.y();
        Objects.requireNonNull(d86.Companion);
        Object d88 = y;
        if (y == d86$a.b) {
            d88 = zk.d(h);
        }
        h.O();
        final iuh iuh = (iuh)d88;
        final de1$b b3 = de1$b.b;
        final dlh.a companion2 = dlh.Companion;
        cdw.b(qgv, pe4.c((dlh)companion2, iuh, null, false, null, null, (ptb)new ptb<vzv>(stb, qgv) {
            public final stb<qgv, vzv> F0;
            public final qgv G0;
            
            public final Object invoke() {
                this.F0.invoke((Object)this.G0);
                return vzv.a;
            }
        }, 28), (hvd)iuh, (String)null, (de1)b3, (asp)null, 0.0f, (vr4)null, (stb)null, (krb)null, (kub)null, (kub)null, h, 33160, 0, 4072);
        w0r.c(h, 0);
        if (1.0f <= 0.0) {
            throw new IllegalArgumentException(qd.B("invalid weight ", 1.0f, "; must be greater than zero").toString());
        }
        final ysd$a a5 = ysd.a;
        final ysd$a a6 = ysd.a;
        final jxe jxe = new jxe(1.0f, true);
        ((dlh)companion2).E((dlh)jxe);
        h.x(-483455358);
        final zqg a7 = ts4.a((gs0$l)gs0.d, (ex$b)ex$a.n, h);
        h.x(-1323940314);
        final rp8 rp9 = (rp8)h.m((df6)e);
        final cwe cwe2 = (cwe)h.m((df6)k);
        final l7x l7x2 = (l7x)h.m((df6)o);
        final kub<weq<w76>, d86, Integer, vzv> a8 = lwe.a((dlh)jxe);
        if (!(h.j() instanceof tr0)) {
            kqe.W();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((ptb)b2);
        }
        else {
            h.o();
        }
        ((z36)a8).h0((Object)mw.y(h, h, a7, e2, h, rp9, d87, h, cwe2, f, h, l7x2, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-1163856341);
        final String c = qgv.c();
        if (c != null) {
            i9w.a(c, (dlh)companion2, qgv.O0, qgv.P0 || e0e.a((Object)qgv.h(), (Object)Boolean.TRUE), (String)null, (qlb)null, 0L, h, 48, 112);
            String i;
            if ((i = flr.l(qgv.M0)) == null) {
                i = "";
            }
            kjs.a(i, (dlh)null, ((dqc)h.m((df6)iqc.a)).j(), 0L, (mlb)null, (qlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 0, false, 1, kqc.Companion.a(h).i, false, h, 0, 3072, 40954);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            w0r.d(h, 0);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final gyo j = h.k();
            if (j != null) {
                j.a((hub)new hub<d86, Integer, vzv>(qgv, stb, stb2, companion, n, n2) {
                    public final qgv F0;
                    public final stb<qgv, vzv> G0;
                    public final stb<qgv, vzv> H0;
                    public final dlh I0;
                    public final int J0;
                    public final int K0;
                    
                    public final Object invoke(final Object o, final Object o2) {
                        final d86 d86 = (d86)o;
                        ((Number)o2).intValue();
                        hp4.c(this.F0, this.G0, this.H0, this.I0, d86, this.J0 | 0x1, this.K0);
                        return vzv.a;
                    }
                });
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public static final void d(dlh companion, CollaboratorsSearchViewModel collaboratorsSearchViewModel, final d86 d86, final int n, final int n2) {
        final d86 h = d86.h(-1752014608);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        final int n6 = n2 & 0x2;
        int n7 = n4;
        if (n6 != 0) {
            n7 = (n4 | 0x10);
        }
        if (n6 == 2 && (n7 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n8 = n7;
                if (n6 != 0) {
                    n8 = (n7 & 0xFFFFFF8F);
                }
                n7 = n8;
            }
            else {
                if (n3 != 0) {
                    companion = (dlh)dlh.Companion;
                }
                if (n6 != 0) {
                    collaboratorsSearchViewModel = (CollaboratorsSearchViewModel)((z9x)h.m((df6)bmx.a)).a.c((oax)new oax$b(new fax((Class)CollaboratorsSearchViewModel.class, "")));
                    n7 &= 0xFFFFFF8F;
                }
            }
            h.s();
            final sa6$b a = sa6.a;
            final l9r o0 = eg8.O0((MviViewModel)collaboratorsSearchViewModel, (dpe)fp4.F0, h, 72);
            final fvh fvh = (fvh)bs4.c0(new Object[0], null, null, (ptb)gp4.F0, h, 6);
            h.x(1157296644);
            final boolean p5 = h.P((Object)fvh);
            final Object y = h.y();
            Object o2 = null;
            Label_0381: {
                if (!p5) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o2 = y) != d86$a.b) {
                        break Label_0381;
                    }
                }
                o2 = new yo4(fvh, (mp6)null);
                h.p(o2);
            }
            h.O();
            final hub hub = (hub)o2;
            h.x(1941511575);
            h.x(-301010798);
            h.x(773894976);
            h.x(-492369756);
            final Object y2 = h.y();
            Objects.requireNonNull(d86.Companion);
            gf6 c;
            if ((c = (gf6)y2) == d86$a.b) {
                c = j00.c(shw.y(h), h);
            }
            h.O();
            final iz6 f0 = c.F0;
            h.O();
            shw.i((Object)collaboratorsSearchViewModel, (Object)f0, (hub)new xo4((MviViewModel)collaboratorsSearchViewModel, f0, zzz.h0((Object)hub, h), (mp6)null), h);
            h.O();
            h.O();
            final int n9 = n7 & 0xE;
            h.x(-483455358);
            final gs0 a2 = gs0.a;
            final gs0$l d87 = (gs0$l)gs0.d;
            Objects.requireNonNull(ex.Companion);
            final zqg a3 = ts4.a((gs0$l)d87, (ex$b)ex$a.n, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a4 = lwe.a(companion);
            final int n10 = ((n9 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, a3, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a4).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)(n10 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-1163856341);
            if ((n10 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n9 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                h.H();
            }
            else {
                a((ptb<vzv>)new zo4(collaboratorsSearchViewModel), h, 0);
                final String s = (String)((l9r)fvh).getValue();
                final String r0 = kqe.r0(2131952541, h);
                final ap4 ap4 = new ap4(collaboratorsSearchViewModel, (fvh<String>)fvh);
                final bp4 bp4 = new bp4(collaboratorsSearchViewModel);
                final dlh.a companion2 = dlh.Companion;
                final float n11 = 16;
                t6p.a(s, r0, (stb)ap4, (ptb)bp4, zzz.b0((dlh)companion2, n11, 0.0f, 2), h, 24576, 0);
                w0r.l(h, 0);
                b((f8p)o0.getValue(), (stb<? super qgv, vzv>)new cp4(collaboratorsSearchViewModel), (stb<? super qgv, vzv>)new dp4(collaboratorsSearchViewModel), zzz.b0((dlh)companion2, n11, 0.0f, 2), h, 3072, 0);
            }
            awg.g(h);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new ep4(companion, collaboratorsSearchViewModel, n, n2));
        }
    }
    
    public static final void e(dlh companion, d86 h, final int n, final int n2) {
        h = h.h(-794859854);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            lpc.a(companion, kqe.r0(2131952538, h), (Icon)null, kqe.r0(2131952539, h), (String)null, (ptb)null, h, n4 & 0xE, 52);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new ip4(companion, n, n2));
        }
    }
    
    public static final void f(final hed hed, final stb stb, final stb stb2, dlh companion, d86 h, final int n, final int n2) {
        h = h.h(-578221621);
        if ((n2 & 0x8) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        final sa6$b a = sa6.a;
        xxe.a(companion, r1n.Z(0, 0, h, 3), (osj)null, false, (gs0$l)null, (ex$b)null, (y6b)null, false, (stb)new mp4((hed<? extends qgv>)hed, (stb<? super qgv, vzv>)stb, (stb<? super qgv, vzv>)stb2, n), h, n >> 9 & 0xE, 252);
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new np4((hed<? extends qgv>)hed, (stb<? super qgv, vzv>)stb, (stb<? super qgv, vzv>)stb2, companion, n, n2));
        }
    }
}
