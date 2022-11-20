import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rf7
{
    public static final void a(final long n, okh companion, x66 h, final int n2, final int n3) {
        h = h.h(-2071948945);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.e(n)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n2 | n5);
        }
        else {
            n4 = n2;
        }
        final int n6 = n3 & 0x2;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x30);
        }
        else {
            n7 = n4;
            if ((n2 & 0x70) == 0x0) {
                int n8;
                if (h.P((Object)companion)) {
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
            if (n6 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            final String q = yqs.q(((Context)h.m((wd6)z20.b)).getResources(), n);
            czd.e((Object)q, "getRelativeTimeString(res, timestamp)");
            Objects.requireNonNull(ejs.Companion);
            sis.a(q, companion, ((dpc)h.m((wd6)ipc.a)).j(), 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 2, false, 1, (sjs)null, false, h, n7 & 0x70, 3120, 55288);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new rf7$a(n, companion, n2, n3));
        }
    }
    
    public static final void b(final boolean b, final long n, final boolean b2, final boolean b3, final String s, final cgv cgv, okh companion, x66 h, final int n2, final int n3) {
        czd.f((Object)s, "conversationTitle");
        h = h.h(-398750624);
        if ((n3 & 0x40) != 0x0) {
            companion = (okh)okh.Companion;
        }
        final n96$b a = n96.a;
        final ds0 a2 = ds0.a;
        final ds0$g h2 = ds0.h;
        Objects.requireNonNull(ex.Companion);
        final bw1.b l = ex.a.l;
        final int n4 = (n2 >> 18 & 0xE) | 0x1B0;
        h.x(693286680);
        final fqg a3 = ulo.a((ds0.d)h2, l, h);
        h.x(-1323940314);
        final iar e = yd6.e;
        final lo8 lo8 = (lo8)h.m((wd6)e);
        final iar k = yd6.k;
        final fve fve = (fve)h.m((wd6)k);
        final iar o = yd6.o;
        final t6x t6x = (t6x)h.m((wd6)o);
        Objects.requireNonNull(q66.Companion);
        final vve$a b4 = q66.a.b;
        final itb a4 = ove.a(companion);
        final int n5 = ((n4 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
        if (h.j() instanceof qr0) {
            h.E();
            if (h.f()) {
                h.A((nsb)b4);
            }
            else {
                h.o();
            }
            h.F();
            final q66$a$c e2 = q66.a.e;
            mru.p(h, (Object)a3, (ftb)e2);
            final q66$a$a d = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a4).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)(n5 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-678309503);
            final int n6 = 2;
            if ((n5 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final xlo a5 = xlo.a;
                int n8;
                final int n7 = n8 = ((n4 >> 6 & 0x70) | 0x6);
                if ((n7 & 0xE) == 0x0) {
                    int n9 = n6;
                    if (h.P((Object)a5)) {
                        n9 = 4;
                    }
                    n8 = (n7 | n9);
                }
                if ((n8 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    final okh$a companion2 = okh.Companion;
                    c(n, b3, a5.a((okh)companion2, 1.0f, true), (ftb<? super x66, ? super Integer, fzv>)io7.g(h, 1136787751, (Object)new rf7$b(b2, b, s, n2, cgv)), h, (n2 >> 3 & 0xE) | 0xC00 | (n2 >> 6 & 0x70), 0);
                    final yzq a6 = yzq.a;
                    final okh r = kdq.r((okh)companion2, yzq.h);
                    final fqg g2 = w9.g(h, 733328855, ex.a.g, false, h, -1323940314);
                    final lo8 lo9 = (lo8)h.m((wd6)e);
                    final fve fve2 = (fve)h.m((wd6)k);
                    final t6x t6x2 = (t6x)h.m((wd6)o);
                    final itb a7 = ove.a(r);
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
                    ((t26)a7).h0((Object)mw.x(h, h, g2, e2, h, lo9, d, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
                    h.x(2058660585);
                    h.x(-2137368960);
                    if (b2) {
                        t38.a((okh)null, h, 0, 1);
                    }
                    c0.D(h);
                }
            }
            final lxo y = wk0.y(h);
            if (y != null) {
                y.a((ftb)new rf7$c(b, n, b2, b3, s, cgv, companion, n2, n3));
            }
            return;
        }
        wd.t();
        throw null;
    }
    
    public static final void c(final Long n, final boolean b, okh companion, final ftb<? super x66, ? super Integer, fzv> ftb, x66 h, final int n2, final int n3) {
        czd.f((Object)ftb, "AttributionComponent");
        h = h.h(51921819);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)n)) {
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
                if (h.a(b)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        final int n8 = n3 & 0x4;
        int n11 = 0;
        Label_0209: {
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
                    n11 = (n6 | n10);
                    break Label_0209;
                }
            }
            n11 = n9;
        }
        int n12;
        if ((n3 & 0x8) != 0x0) {
            n12 = (n11 | 0xC00);
        }
        else {
            n12 = n11;
            if ((n2 & 0x1C00) == 0x0) {
                int n13;
                if (h.P((Object)ftb)) {
                    n13 = 2048;
                }
                else {
                    n13 = 1024;
                }
                n12 = (n11 | n13);
            }
        }
        if ((n12 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            if (n8 != 0) {
                companion = (okh)okh.Companion;
            }
            final n96$b a = n96.a;
            Objects.requireNonNull(ex.Companion);
            final bw1.b l = ex.a.l;
            final ds0 a2 = ds0.a;
            final ds0$j b2 = ds0.b;
            final int n14 = (n12 >> 6 & 0xE) | 0x1B0;
            h.x(693286680);
            final fqg a3 = ulo.a((ds0.d)b2, l, h);
            h.x(-1323940314);
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final iar k = yd6.k;
            final fve fve = (fve)h.m((wd6)k);
            final iar o = yd6.o;
            final t6x t6x = (t6x)h.m((wd6)o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b3 = q66.a.b;
            final itb a4 = ove.a(companion);
            final int n15 = ((n14 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)b3);
            }
            else {
                h.o();
            }
            h.F();
            final q66$a$c e2 = q66.a.e;
            mru.p(h, (Object)a3, (ftb)e2);
            final q66$a$a d = q66.a.d;
            mru.p(h, (Object)lo8, (ftb)d);
            final q66$a$b f = q66.a.f;
            mru.p(h, (Object)fve, (ftb)f);
            final q66$a$e g = q66.a.g;
            ((t26)a4).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)(n15 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-678309503);
            if ((n15 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n14 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                h.H();
            }
            else {
                ftb.invoke((Object)h, (Object)(n12 >> 9 & 0xE));
                final okh$a companion2 = okh.Companion;
                final okh u = kdq.u((okh)companion2, (ex)null, 3);
                h.x(693286680);
                final fqg a5 = ulo.a((ds0.d)b2, l, h);
                h.x(-1323940314);
                final lo8 lo9 = (lo8)h.m((wd6)e);
                final fve fve2 = (fve)h.m((wd6)k);
                final t6x t6x2 = (t6x)h.m((wd6)o);
                final itb a6 = ove.a(u);
                if (!(h.j() instanceof qr0)) {
                    wd.t();
                    throw null;
                }
                h.E();
                if (h.f()) {
                    h.A((nsb)b3);
                }
                else {
                    h.o();
                }
                ((t26)a6).h0((Object)mw.x(h, h, a5, e2, h, lo9, d, h, fve2, f, h, t6x2, g, h), (Object)h, (Object)0);
                sk0.D(h, 2058660585, -678309503, -313122948);
                if (n != null && n != 0L) {
                    final yzq a7 = yzq.a;
                    d(nza.G1((okh)companion2, yzq.c, 0.0f, yzq.d, 0.0f, 10), h, 0, 0);
                    a(n, null, h, n12 & 0xE, 2);
                }
                h.O();
                if (b) {
                    final Icon i0 = joc.I0;
                    final yzq a8 = yzq.a;
                    koc.a(i0, (String)null, jes.a(kdq.m(nza.G1((okh)companion2, yzq.d, 0.0f, 0.0f, 0.0f, 14), yzq.g), "Notifications disabled tag"), ((dpc)h.m((wd6)ipc.a)).j(), false, h, 56, 16);
                }
                c0.D(h);
            }
            c0.D(h);
        }
        final lxo j = h.k();
        if (j != null) {
            j.a((ftb)new rf7$d(n, b, companion, (ftb)ftb, n2, n3));
        }
    }
    
    public static final void d(okh companion, x66 h, final int n, final int n2) {
        h = h.h(-1100666400);
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
            final yzq a2 = yzq.a;
            bb2.a(gmw.e(rrz.l(kdq.m(companion, yzq.c), (frp)elo.a), ((dpc)h.m((wd6)ipc.a)).j()), h, 0);
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new rf7$e(companion, n, n2));
        }
    }
}
