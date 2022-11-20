import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yjl
{
    public static final void a(okh companion, nsb<fzv> d0, x66 h, final int n, final int n2) {
        h = h.h(710362623);
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
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x30);
        }
        else {
            n7 = n4;
            if ((n & 0x70) == 0x0) {
                int n8;
                if (h.P((Object)d0)) {
                    n8 = 32;
                }
                else {
                    n8 = 16;
                }
                n7 = (n4 | n8);
            }
        }
        if ((n7 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n6 != 0) {
                d0 = yjl$a.D0;
            }
            final n96$b a = n96.a;
            final okh u = omy.u(companion, omy.s(h));
            final xgh a2 = xgh.a;
            final okh b1 = nza.B1(u, (zrj)xgh.b);
            h.x(-483455358);
            final ds0 a3 = ds0.a;
            final ds0$k d2 = ds0.d;
            Objects.requireNonNull(ex.Companion);
            final fqg a4 = nr4.a((ds0.l)d2, (ex.b)ex.a.n, h);
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b2 = q66.a.b;
            final itb a5 = ove.a(b1);
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
            mru.p(h, (Object)a4, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a5).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            final String x = ho0.x(h, 2058660585, -1163856341, 2131956007, h);
            final sjs e = kpc.Companion.a(h).e;
            final okh$a companion2 = okh.Companion;
            final yzq a6 = yzq.a;
            sis.a(x, nza.E1((okh)companion2, 0.0f, yzq.e, 1), 0L, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, e, false, h, 0, 0, 49148);
            b(joc.V0, 2131956004, null, h, 8, 4);
            b(joc.c0, 2131956005, null, h, 8, 4);
            b(joc.T0, 2131956006, null, h, 8, 4);
            coc.b(new f53((k53)null, (k4f)k4f$f.G0, 1), nza.G1((okh)companion2, 0.0f, 0.0f, 0.0f, yzq.f, 7), wd.A(2131954239, h), (b53)new b53$a(true), (Icon)null, (String)null, false, (nsb)d0, h, (0x1C00000 & n7 << 18) | 0x1000, 112);
            c0.D(h);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(companion, d0, n, n2) {
                public final okh D0;
                public final nsb<fzv> E0;
                public final int F0;
                public final int G0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    yjl.a(this.D0, this.E0, x66, this.F0 | 0x1, this.G0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void b(final Icon icon, final int n, okh companion, x66 h, final int n2, final int n3) {
        czd.f((Object)icon, "horizonIcon");
        h = h.h(1546734528);
        if ((n3 & 0x4) != 0x0) {
            companion = (okh)okh.Companion;
        }
        final n96$b a = n96.a;
        final yzq a2 = yzq.a;
        rld.a(nza.G1(companion, 0.0f, 0.0f, 0.0f, yzq.g, 7), (ftb)io7.g(h, 1721061679, (Object)new ftb<x66, Integer, fzv>(icon) {
            public final Icon D0;
            
            public final Object invoke(final Object o, final Object o2) {
                final x66 x66 = (x66)o;
                if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
                    x66.H();
                }
                else {
                    final n96$b a = n96.a;
                    final Icon d0 = this.D0;
                    final eoc a2 = eoc.a;
                    koc.a(d0, (String)null, (okh)null, eoc.h, false, x66, 56, 20);
                }
                return fzv.a;
            }
        }), (ftb)null, (ftb)io7.g(h, -202188751, (Object)new ftb<x66, Integer, fzv>(n, n2) {
            public final int D0;
            public final int E0;
            
            public final Object invoke(final Object o, final Object o2) {
                final x66 x66 = (x66)o;
                if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
                    x66.H();
                }
                else {
                    final n96$b a = n96.a;
                    sis.a(wd.A(this.D0, x66), (okh)null, 0L, 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 0, false, 0, (sjs)null, false, x66, 0, 0, 65534);
                }
                return fzv.a;
            }
        }), h, 3120, 4);
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(icon, n, companion, n2, n3) {
                public final Icon D0;
                public final int E0;
                public final okh F0;
                public final int G0;
                public final int H0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    yjl.b(this.D0, this.E0, this.F0, x66, this.G0 | 0x1, this.H0);
                    return fzv.a;
                }
            });
        }
    }
    
    public static final void c(okh companion, final hv8 hv8, final x66 x66, final int n, final int n2) {
        final x66 h = x66.h(1465607101);
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
        okh okh;
        hv8 hv9;
        if (n6 == 2 && (n7 & 0x5B) == 0x12 && h.i()) {
            h.H();
            okh = companion;
            hv9 = hv8;
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n8 = n7;
                if (n6 != 0) {
                    n8 = (n7 & 0xFFFFFF8F);
                }
                okh = companion;
                n7 = n8;
                hv9 = hv8;
            }
            else {
                if (n3 != 0) {
                    companion = (okh)okh.Companion;
                }
                if (n6 != 0) {
                    final hv8 m = v68.M(h);
                    n7 &= 0xFFFFFF8F;
                    okh = companion;
                    hv9 = m;
                }
                else {
                    okh = companion;
                    hv9 = hv8;
                }
            }
            h.s();
            final n96$b a = n96.a;
            c0s.a(okh, (frp)null, ((dpc)h.m((wd6)ipc.a)).a(), 0L, (t72)null, 0.0f, (ftb)io7.g(h, 403036153, (Object)new ftb<x66, Integer, fzv>(hv9) {
                public final hv8 D0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
                        x66.H();
                    }
                    else {
                        final n96$b a = n96.a;
                        yjl.a(null, (nsb<fzv>)new zjl(this.D0), x66, 0, 1);
                    }
                    return fzv.a;
                }
            }), h, (n7 & 0xE) | 0x180000, 58);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(okh, hv9, n, n2) {
                public final okh D0;
                public final hv8 E0;
                public final int F0;
                public final int G0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    yjl.c(this.D0, this.E0, x66, this.F0 | 0x1, this.G0);
                    return fzv.a;
                }
            });
        }
    }
}
