import android.content.res.Resources;
import android.content.Context;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.android.liveevent.di.view.LiveEventLandingViewObjectGraph;
import com.twitter.android.liveevent.landing.hero.slate.SlateHeroViewModel;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eeq
{
    public static final long a;
    public static final long b;
    
    static {
        a = q3j.d(637534208);
        final eoc a2 = eoc.a;
        b = nq4.b(eoc.C1, 0.5f);
    }
    
    public static final void a(final String s, final nsb<fzv> nsb, final x66 x66, final int n) {
        final x66 h = x66.h(418369809);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)s)) {
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
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (h.P((Object)nsb)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            final xc0 xc0 = new xc0(s, (List)null, 6);
            final eoc a2 = eoc.a;
            final long b1 = eoc.B1;
            final okh$a companion = okh.Companion;
            final yzq a3 = yzq.a;
            final okh e1 = nza.E1((okh)companion, yzq.f, 0.0f, 2);
            h.x(1157296644);
            final boolean p4 = h.P((Object)nsb);
            final Object y = h.y();
            Object o = null;
            Label_0236: {
                if (!p4) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y) != x66$a.b) {
                        break Label_0236;
                    }
                }
                o = new qsb<Integer, fzv>(nsb) {
                    public final nsb<fzv> D0;
                    
                    public final Object invoke(final Object o) {
                        ((Number)o).intValue();
                        this.D0.invoke();
                        return fzv.a;
                    }
                };
                h.p(o);
            }
            h.O();
            me4.a(xc0, e1, b1, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, (qsb)null, (sjs)null, (qsb)o, h, 0, 0, 65528);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(s, nsb, n) {
                public final String D0;
                public final nsb<fzv> E0;
                public final int F0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    eeq.a(this.D0, this.E0, x66, this.F0 | 0x1);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void b(okh companion, x66 h, final int n, final int n2) {
        h = h.h(1450016998);
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
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final hvj f = af8.F(2131232352, h);
            Objects.requireNonNull(em6.Companion);
            r6d.a(f, wd.A(2131954759, h), companion, null, em6.a.b, 0.0f, null, h, (n4 << 6 & 0x380) | 0x6008, 104);
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
                    eeq.b(this.D0, x66, this.E0 | 0x1, this.F0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void c(okh companion, x66 h, final int n, final int n2) {
        h = h.h(-2078194567);
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
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            bb2.a(oc9.a(companion, (qsb<? super tc9, fzv>)eeq$d.D0), h, 0);
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
                    eeq.c(this.D0, x66, this.E0 | 0x1, this.F0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void d(final deq deq, final bo6 bo6, final dtg dtg, okh companion, final x66 x66, final int n, final int n2) {
        czd.f((Object)deq, "slate");
        final x66 h = x66.h(-1849875594);
        if ((n2 & 0x8) != 0x0) {
            companion = (okh)okh.Companion;
        }
        final n96$b a = n96.a;
        final List<z6d> e = deq.e;
        h.x(1157296644);
        final boolean p7 = h.P((Object)e);
        final Object y = h.y();
        z6d v = null;
        Label_0122: {
            if (!p7) {
                Objects.requireNonNull(x66.Companion);
                if ((v = (z6d)y) != x66$a.b) {
                    break Label_0122;
                }
            }
            final List<z6d> e2 = deq.e;
            czd.e((Object)e2, "slate.variants");
            v = jee.v((List)e2);
            h.p((Object)v);
        }
        h.O();
        final z6d z6d = v;
        if (z6d != null) {
            h.x(1862090326);
            i(deq, bo6, z6d, dtg, companion, h, (0xE000 & n << 3) | 0x1248, 0);
            h.O();
        }
        else {
            h.x(1862090552);
            b(null, h, 0, 1);
            h.O();
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(deq, bo6, dtg, companion, n, n2) {
                public final deq D0;
                public final bo6 E0;
                public final dtg F0;
                public final okh G0;
                public final int H0;
                public final int I0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    eeq.d(this.D0, this.E0, this.F0, this.G0, x66, this.H0 | 0x1, this.I0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void e(okh companion, hxf q3, SlateHeroViewModel slateHeroViewModel, heq z2, final x66 x66, final int n, final int n2) {
        final x66 h = x66.h(1821231267);
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
            n4 = (n | n5);
        }
        else {
            n4 = n;
        }
        final int n6 = n2 & 0x2;
        int n7 = n4;
        if (n6 != 0) {
            n7 = (n4 | 0x10);
        }
        final int n8 = n2 & 0x4;
        int n9 = n7;
        if (n8 != 0) {
            n9 = (n7 | 0x80);
        }
        final int n10 = n2 & 0x8;
        int n11 = n9;
        if (n10 != 0) {
            n11 = (n9 | 0x400);
        }
        hxf hxf;
        okh okh;
        SlateHeroViewModel slateHeroViewModel2;
        if ((n2 & 0xE) == 0xE && (n11 & 0x16DB) == 0x492 && h.i()) {
            h.H();
            hxf = q3;
            okh = companion;
            slateHeroViewModel2 = slateHeroViewModel;
        }
        else {
            h.C();
            SlateHeroViewModel slateHeroViewModel3;
            okh okh2;
            hxf hxf3;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                final hxf hxf2 = q3;
                slateHeroViewModel3 = slateHeroViewModel;
                okh2 = companion;
                hxf3 = hxf2;
            }
            else {
                if (n3 != 0) {
                    companion = (okh)okh.Companion;
                }
                if (n6 != 0) {
                    q3 = ((LiveEventLandingViewObjectGraph)d5p.a(h).n()).Q3();
                    czd.e((Object)q3, "viewObjectGraph<LiveEven\u2026).scrollDockingController");
                }
                if (n8 != 0) {
                    slateHeroViewModel = (SlateHeroViewModel)((g9x)h.m((wd6)mlx.a)).a.c((v9x)new v9x$b(new m9x((Class)SlateHeroViewModel.class, "")));
                }
                if (n10 != 0) {
                    z2 = ((qeq)d5p.a(h).z0((Class)qeq.class)).Z2();
                    final hxf hxf4 = q3;
                    slateHeroViewModel3 = slateHeroViewModel;
                    okh2 = companion;
                    hxf3 = hxf4;
                }
                else {
                    final okh okh3 = companion;
                    hxf3 = q3;
                    slateHeroViewModel3 = slateHeroViewModel;
                    okh2 = okh3;
                }
            }
            h.s();
            final n96$b a = n96.a;
            h.x(-2088733469);
            final ftb<geq, go6<? super fzv>, Object> ftb = (ftb<geq, go6<? super fzv>, Object>)new ftb<geq, go6<? super fzv>, Object>(z2) {
                public final Object invoke(final Object o, final Object o2) {
                    final go6 go6 = (go6)o2;
                    ((mx9)super.D0).q(o);
                    return fzv.a;
                }
            };
            h.x(1941511575);
            h.x(-301010798);
            final Object y = nb0.y(h, 773894976, -492369756);
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b = x66$a.b;
            Object g = y;
            if (y == b) {
                g = mb0.g(npe.C(h), h);
            }
            h.O();
            final cy6 d0 = ((zd6)g).D0;
            h.O();
            npe.h((Object)slateHeroViewModel3, (Object)d0, (ftb)new eeq$h((MviViewModel)slateHeroViewModel3, d0, blz.U(ftb, h), (go6)null), h);
            h.O();
            h.O();
            h.O();
            final eeq$m d2 = eeq$m.D0;
            final eeq$n d3 = eeq$n.D0;
            final eeq$o d4 = eeq$o.D0;
            final eeq$p d5 = eeq$p.D0;
            czd.f((Object)slateHeroViewModel3, "<this>");
            czd.f((Object)d2, "property1");
            czd.f((Object)d3, "property2");
            czd.f((Object)d4, "property3");
            czd.f((Object)d5, "property4");
            h.x(-612794708);
            final ij8 a2 = b19.a;
            final dhg j0 = hhg.a.J0();
            h.x(8066681);
            final m8r p7 = chw.P0((MviViewModel)slateHeroViewModel3, (sx6)j0, h, 0);
            h.x(-492369756);
            Object o;
            if ((o = h.y()) == b) {
                o = blz.l((nsb)new clx(p7, (foe)d2, (foe)d3, (foe)d4, (foe)d5));
                h.p(o);
            }
            h.O();
            final m8r m8r = (m8r)o;
            h.O();
            h.O();
            final kbu kbu = (kbu)m8r.getValue();
            final deq deq = (deq)kbu.a;
            final boolean booleanValue = (boolean)kbu.b;
            final bo6 bo6 = (bo6)kbu.c;
            final dtg dtg = (dtg)kbu.d;
            npe.m((nsb)new nsb<fzv>(booleanValue, hxf3) {
                public final boolean D0;
                public final hxf E0;
                
                public final Object invoke() {
                    if (this.D0) {
                        this.E0.b();
                    }
                    return fzv.a;
                }
            }, h);
            f(deq, bo6, dtg, ld4.d(af8.e(kdq.i(okh2), 1.7777778f), deq != null, (String)null, (d0n)null, (nsb)new nsb<fzv>(slateHeroViewModel3) {
                public final SlateHeroViewModel D0;
                
                public final Object invoke() {
                    final SlateHeroViewModel d0 = this.D0;
                    final jeq$a a = jeq$a.a;
                    Objects.requireNonNull(d0);
                    ((MviViewModel)d0).O((cdw)a);
                    return fzv.a;
                }
            }, 6), h, 584, 0);
            hxf = hxf3;
            slateHeroViewModel2 = slateHeroViewModel3;
            okh = okh2;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(okh, hxf, slateHeroViewModel2, z2, n, n2) {
                public final okh D0;
                public final hxf E0;
                public final SlateHeroViewModel F0;
                public final heq G0;
                public final int H0;
                public final int I0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    eeq.e(this.D0, this.E0, this.F0, this.G0, x66, this.H0 | 0x1, this.I0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void f(final deq deq, final bo6 bo6, final dtg dtg, okh companion, x66 h, final int n, final int n2) {
        h = h.h(712577453);
        if ((n2 & 0x8) != 0x0) {
            companion = (okh)okh.Companion;
        }
        final n96$b a = n96.a;
        if (deq != null) {
            h.x(-492131102);
            final eoc a2 = eoc.a;
            d(deq, bo6, dtg, gmw.e(companion, eoc.C1), h, 584, 0);
            h.O();
        }
        else {
            h.x(-492130901);
            b(companion, h, n >> 9 & 0xE, 0);
            h.O();
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(deq, bo6, dtg, companion, n, n2) {
                public final deq D0;
                public final bo6 E0;
                public final dtg F0;
                public final okh G0;
                public final int H0;
                public final int I0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    eeq.f(this.D0, this.E0, this.F0, this.G0, x66, this.H0 | 0x1, this.I0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void g(final String s, x66 h, final int n) {
        h = h.h(125668155);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)s)) {
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
            final n96$b a = n96.a;
            final sjs i = kpc.Companion.a(h).i;
            final eoc a2 = eoc.a;
            final sjs a3 = sjs.a(i, eoc.B1, 0L, (pkb)null, (pjb)null, (ffs)null, (mes)null, (jfs)null, 0L, 262142);
            final okh$a companion = okh.Companion;
            final yzq a4 = yzq.a;
            sis.a(s, nza.E1((okh)companion, yzq.f, 0.0f, 2), 0L, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, a3, false, h, n3 & 0xE, 0, 49148);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(s, n) {
                public final String D0;
                public final int E0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    eeq.g(this.D0, x66, this.E0 | 0x1);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void h(final deq deq, final bo6 bo6, final okh okh, final x66 x66, final int n, final int n2) {
        final x66 h = x66.h(-655641400);
        Object companion;
        if ((n2 & 0x4) != 0x0) {
            companion = okh.Companion;
        }
        else {
            companion = okh;
        }
        final n96$b a = n96.a;
        final Context context = (Context)h.m((wd6)z20.b);
        final m5w m5w = (m5w)h.m((wd6)yd6.n);
        final qof h2 = deq.h;
        h.x(1157296644);
        final boolean p6 = h.P((Object)h2);
        final Object y = h.y();
        lvj lvj = null;
        Label_0339: {
            if (!p6) {
                Objects.requireNonNull(x66.Companion);
                if ((lvj = (lvj)y) != x66$a.b) {
                    break Label_0339;
                }
            }
            final qof h3 = deq.h;
            if (h3 != null) {
                lvj = new lvj((Object)h3.a, (Object)new nsb<fzv>(h3, m5w) {
                    public final qof D0;
                    public final m5w E0;
                    
                    public final Object invoke() {
                        final String b = this.D0.b;
                        fzv a;
                        if (b != null) {
                            this.E0.a(b);
                            a = fzv.a;
                        }
                        else {
                            a = null;
                        }
                        return a;
                    }
                });
            }
            else if (bo6 != null) {
                final Resources resources = context.getResources();
                final String l = ikr.l(bo6.x());
                String s;
                if (bo6.U()) {
                    s = resources.getString(2131955133, new Object[] { l });
                }
                else if (bo6.P()) {
                    s = resources.getString(2131955132, new Object[] { l });
                }
                else if (bo6.d0()) {
                    s = resources.getString(2131955136, new Object[] { l });
                }
                else if (bo6.Q()) {
                    s = resources.getString(2131955135, new Object[] { l });
                }
                else {
                    s = resources.getString(2131955134, new Object[] { l });
                }
                lvj = new lvj((Object)s, (Object)new nsb<fzv>(context, bo6) {
                    public final Context D0;
                    public final bo6 E0;
                    
                    public final Object invoke() {
                        final kfu kfu = new kfu(this.D0);
                        kfu.h(this.E0);
                        kfu.start();
                        return fzv.a;
                    }
                });
            }
            else {
                lvj = new lvj((Object)"", (Object)eeq$v.D0);
            }
            h.p((Object)lvj);
        }
        h.O();
        final lvj lvj2 = lvj;
        final String s2 = (String)lvj2.D0;
        final nsb nsb = (nsb)lvj2.E0;
        final int n3 = n >> 6 & 0xE;
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
        final vve$a b = q66.a.b;
        final itb a2 = ove.a((okh)companion);
        final int n4 = ((n3 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
        if (h.j() instanceof qr0) {
            h.E();
            if (h.f()) {
                h.A((nsb)b);
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
            ((t26)a2).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)(n4 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n4 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n3 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
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
                    h.A((nsb)b);
                }
                else {
                    h.o();
                }
                ((t26)a5).h0((Object)mw.x(h, h, a4, e2, h, lo9, d2, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
                h.x(2058660585);
                h.x(-1163856341);
                final String b2 = deq.b;
                h.x(542873494);
                if (b2 != null) {
                    g(b2, h, 0);
                    final yzq a6 = yzq.a;
                    wd.k(kdq.j((okh)companion2, yzq.f), h, 0);
                }
                h.O();
                czd.e((Object)s2, "text");
                if (vkr.V((CharSequence)s2) ^ true) {
                    h.x(1157296644);
                    final boolean p7 = h.P((Object)nsb);
                    final Object y2 = h.y();
                    Object o2 = null;
                    Label_1098: {
                        if (!p7) {
                            Objects.requireNonNull(x66.Companion);
                            if ((o2 = y2) != x66$a.b) {
                                break Label_1098;
                            }
                        }
                        o2 = new nsb<fzv>(nsb) {
                            public final nsb<fzv> D0;
                            
                            public final Object invoke() {
                                this.D0.invoke();
                                return fzv.a;
                            }
                        };
                        h.p(o2);
                    }
                    h.O();
                    a(s2, (nsb<fzv>)o2, h, 0);
                    final yzq a7 = yzq.a;
                    wd.k(kdq.j((okh)companion2, yzq.f), h, 0);
                }
                c0.D(h);
            }
            final lxo y3 = wk0.y(h);
            if (y3 != null) {
                y3.a((ftb)new ftb<x66, Integer, fzv>(deq, bo6, companion, n, n2) {
                    public final deq D0;
                    public final bo6 E0;
                    public final okh F0;
                    public final int G0;
                    public final int H0;
                    
                    public final Object invoke(final Object o, final Object o2) {
                        final x66 x66 = (x66)o;
                        ((Number)o2).intValue();
                        eeq.h(this.D0, this.E0, this.F0, x66, this.G0 | 0x1, this.H0);
                        return fzv.a;
                    }
                });
            }
            return;
        }
        wd.t();
        throw null;
    }
    
    public static final void i(final deq deq, final bo6 bo6, final z6d z6d, final dtg dtg, final okh okh, final x66 x66, final int n, final int n2) {
        final x66 h = x66.h(-1881685362);
        Object companion;
        if ((n2 & 0x10) != 0x0) {
            companion = okh.Companion;
        }
        else {
            companion = okh;
        }
        final n96$b a = n96.a;
        final int n3 = n >> 12 & 0xE;
        h.x(733328855);
        Objects.requireNonNull(ex.Companion);
        final fqg d = bb2.d((ex)ex.a.b, false, h);
        h.x(-1323940314);
        final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
        final fve fve = (fve)h.m((wd6)yd6.k);
        final t6x t6x = (t6x)h.m((wd6)yd6.o);
        Objects.requireNonNull(q66.Companion);
        final vve$a b = q66.a.b;
        final itb a2 = ove.a((okh)companion);
        final int n4 = ((n3 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
        if (h.j() instanceof qr0) {
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
            ((t26)a2).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)(n4 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            final int n5 = 2;
            if ((n4 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final rp9 d2 = rp9.D0;
                int n7;
                final int n6 = n7 = ((n3 >> 6 & 0x70) | 0x6);
                if ((n6 & 0xE) == 0x0) {
                    int n8 = n5;
                    if (h.P((Object)d2)) {
                        n8 = 4;
                    }
                    n7 = (n6 | n8);
                }
                if ((n7 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    String s;
                    if (dtg == null || (s = dtg.d1) == null) {
                        s = z6d.F0;
                    }
                    h.x(497484083);
                    String a3;
                    if ((a3 = s) == null) {
                        a3 = wd.A(2131954759, h);
                    }
                    h.O();
                    final okh$a companion2 = okh.Companion;
                    acv.c((qsb)new qsb<edq, x7d>(dtg, z6d, deq) {
                        public final dtg D0;
                        public final z6d E0;
                        public final deq F0;
                        
                        public final Object invoke(final Object o) {
                            final edq l = (edq)o;
                            czd.f((Object)l, "size");
                            final dtg d0 = this.D0;
                            x7d$a x7d$a;
                            if (d0 != null) {
                                x7d$a = y7d.b(d0);
                            }
                            else {
                                x7d$a = y7d.a(this.E0);
                            }
                            x7d$a.l = l;
                            x7d$a.p = jee.M(l, this.F0, this.D0, true);
                            return new x7d(x7d$a);
                        }
                    }, d2.t0((okh)companion2), a3, (ex)null, (em6)null, 0.0f, (qq4)null, false, false, (hvj)null, (qsb)eeq$x.D0, (iqb)null, (itb)null, (itb)null, h, 0, 6, 15352);
                    c(d2.t0((okh)companion2), h, 0, 0);
                    h(deq, bo6, d2.m((okh)companion2, ex.a.h), h, 72, 0);
                }
            }
            final lxo y = wk0.y(h);
            if (y != null) {
                y.a((ftb)new ftb<x66, Integer, fzv>(deq, bo6, z6d, dtg, companion, n, n2) {
                    public final deq D0;
                    public final bo6 E0;
                    public final z6d F0;
                    public final dtg G0;
                    public final okh H0;
                    public final int I0;
                    public final int J0;
                    
                    public final Object invoke(final Object o, final Object o2) {
                        final x66 x66 = (x66)o;
                        ((Number)o2).intValue();
                        eeq.i(this.D0, this.E0, this.F0, this.G0, this.H0, x66, this.I0 | 0x1, this.J0);
                        return fzv.a;
                    }
                });
            }
            return;
        }
        wd.t();
        throw null;
    }
}
