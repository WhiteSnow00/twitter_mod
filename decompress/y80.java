import java.util.ListIterator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y80
{
    public static final <S> void a(final mzt<S> mzt, okh okh, qsb<? super h90<S>, jm6> d0, final ex ex, qsb<? super S, ?> d2, final ktb<? super va0, ? super S, ? super x66, ? super Integer, fzv> ktb, final x66 x66, final int n, final int n2) {
        czd.f((Object)mzt, "<this>");
        czd.f((Object)ktb, "content");
        final x66 h = x66.h(-114689412);
        int n3;
        if ((n2 & Integer.MIN_VALUE) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)mzt)) {
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
        final int n5 = n2 & 0x1;
        int n8 = 0;
        Label_0153: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (h.P((Object)okh)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0153;
                }
            }
            n8 = n6;
        }
        final okh okh2 = okh;
        final int n9 = n2 & 0x2;
        int n12 = 0;
        Label_0229: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x380) == 0x0) {
                    int n11;
                    if (h.P((Object)d0)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0229;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x4;
        int n16 = 0;
        Label_0302: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0x1C00) == 0x0) {
                    int n15;
                    if (h.P((Object)ex)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0302;
                }
            }
            n16 = n14;
        }
        ex b = ex;
        final int n17 = n2 & 0x8;
        int n20 = 0;
        Label_0378: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((0xE000 & n) == 0x0) {
                    int n19;
                    if (h.P((Object)d2)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0378;
                }
            }
            n20 = n18;
        }
        int n22 = 0;
        Label_0435: {
            int n21;
            if ((n2 & 0x10) != 0x0) {
                n21 = 196608;
            }
            else {
                n22 = n20;
                if ((0x70000 & n) != 0x0) {
                    break Label_0435;
                }
                if (h.P((Object)ktb)) {
                    n21 = 131072;
                }
                else {
                    n21 = 65536;
                }
            }
            n22 = (n20 | n21);
        }
        Object companion;
        y80$c y80$c;
        qsb<? super S, ?> qsb2;
        if ((0x5B6DB & n22) == 0x12492 && h.i()) {
            h.H();
            final qsb<? super S, ?> qsb = (qsb<? super S, ?>)d2;
            companion = okh2;
            y80$c = d0;
            qsb2 = qsb;
        }
        else {
            if (n5 != 0) {
                companion = okh.Companion;
            }
            else {
                companion = okh2;
            }
            if (n9 != 0) {
                d0 = y80$c.D0;
            }
            if (n13 != 0) {
                Objects.requireNonNull(ex.Companion);
                b = ex.a.b;
            }
            if (n17 != 0) {
                d2 = y80$d.D0;
            }
            final n96$b a = n96.a;
            final fve fve = (fve)h.m((wd6)yd6.k);
            h.x(1157296644);
            final boolean p9 = h.P((Object)mzt);
            final Object y = h.y();
            h90 h2 = null;
            Label_0628: {
                if (!p9) {
                    Objects.requireNonNull(x66.Companion);
                    if ((h2 = (h90)y) != x66$a.b) {
                        break Label_0628;
                    }
                }
                h2 = new h90((mzt)mzt, b, fve);
                h.p((Object)h2);
            }
            h.O();
            final h90 h3 = h2;
            h.x(1157296644);
            final boolean p10 = h.P((Object)mzt);
            final Object y2 = h.y();
            niq niq = null;
            Label_0736: {
                if (!p10) {
                    Objects.requireNonNull(x66.Companion);
                    if ((niq = (niq)y2) != x66$a.b) {
                        break Label_0736;
                    }
                }
                final Object b2 = mzt.b();
                niq = new niq();
                niq.addAll((Collection)ct0.g1(new Object[] { b2 }));
                h.p((Object)niq);
            }
            h.O();
            final niq niq2 = niq;
            h.x(1157296644);
            final boolean p11 = h.P((Object)mzt);
            final Object y3 = h.y();
            Map map = null;
            Label_0820: {
                if (!p11) {
                    Objects.requireNonNull(x66.Companion);
                    if ((map = (Map)y3) != x66$a.b) {
                        break Label_0820;
                    }
                }
                map = new LinkedHashMap();
                h.p((Object)map);
            }
            h.O();
            final Map map2 = map;
            if (czd.a(mzt.b(), mzt.f())) {
                if (niq2.size() != 1 || !czd.a(niq2.get(0), mzt.b())) {
                    niq2.clear();
                    niq2.add(mzt.b());
                }
                if (map2.size() != 1 || map2.containsKey(mzt.b())) {
                    map2.clear();
                }
                Objects.requireNonNull(h3);
                czd.f((Object)b, "<set-?>");
                h3.b = b;
                czd.f((Object)fve, "<set-?>");
            }
            if (!czd.a(mzt.b(), mzt.f()) && !niq2.contains(mzt.f())) {
                final ListIterator listIterator = niq2.listIterator();
                int n23 = 0;
                while (true) {
                    final w8r w8r = (w8r)listIterator;
                    if (!w8r.hasNext()) {
                        n23 = -1;
                        break;
                    }
                    if (czd.a(((qsb)d2).invoke(w8r.next()), ((qsb)d2).invoke(mzt.f()))) {
                        break;
                    }
                    ++n23;
                }
                if (n23 == -1) {
                    niq2.add(mzt.f());
                }
                else {
                    niq2.set(n23, mzt.f());
                }
            }
            Map map3 = map2;
            niq niq3 = niq2;
            ex ex2 = b;
            h90 h4 = h3;
            if (!map2.containsKey(mzt.f())) {
                map2.clear();
                final int size = niq2.size();
                int n24 = 0;
                while (true) {
                    map3 = map2;
                    niq3 = niq2;
                    ex2 = b;
                    h4 = h3;
                    if (n24 >= size) {
                        break;
                    }
                    final Object value = niq2.get(n24);
                    map2.put(value, io7.g(h, 963631013, (Object)new y80$e((mzt)mzt, value, n22, (qsb)d0, h3, (ktb)ktb, niq2)));
                    ++n24;
                }
            }
            boolean b3 = true;
            final mzt$b d3 = mzt.d();
            h.x(511388516);
            final boolean p12 = h.P((Object)h4);
            final boolean p13 = h.P((Object)d3);
            final Object y4 = h.y();
            Object o = null;
            Label_1280: {
                if (!(p13 | p12)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y4) != x66$a.b) {
                        break Label_1280;
                    }
                }
                o = ((qsb)d0).invoke((Object)h4);
                h.p(o);
            }
            h.O();
            final jm6 jm6 = (jm6)o;
            Objects.requireNonNull(h4);
            czd.f((Object)jm6, "contentTransform");
            h.x(-1349251863);
            final n96$b a2 = n96.a;
            h.x(1157296644);
            final boolean p14 = h.P((Object)h4);
            final Object y5 = h.y();
            puh q = null;
            Label_1386: {
                if (!p14) {
                    Objects.requireNonNull(x66.Companion);
                    if ((q = (puh)y5) != x66$a.b) {
                        break Label_1386;
                    }
                }
                q = blz.Q(Boolean.FALSE);
                h.p((Object)q);
            }
            h.O();
            final puh puh = q;
            final m8r u = blz.U(jm6.d, h);
            if (czd.a(h4.a.b(), h4.a.f())) {
                puh.setValue((Object)Boolean.FALSE);
            }
            else if (u.getValue() != null) {
                puh.setValue((Object)Boolean.TRUE);
            }
            if (((m8r)puh).getValue()) {
                final mzt$a a3 = e0u.a(h4.a, npw.d(ltd.Companion), (String)null, h, 2);
                h.x(1157296644);
                final boolean p15 = h.P((Object)a3);
                final Object y6 = h.y();
                Label_1625: {
                    if (!p15) {
                        Objects.requireNonNull(x66.Companion);
                        if ((okh = (okh)y6) != x66$a.b) {
                            break Label_1625;
                        }
                    }
                    final ndq ndq = (ndq)u.getValue();
                    if (ndq == null || ndq.i()) {
                        b3 = false;
                    }
                    okh = (okh)okh.Companion;
                    if (!b3) {
                        okh = rrz.m(okh);
                    }
                    okh = okh.E((okh)new h90.b((mzt$a<ltd, ic0>)a3, (m8r<? extends ndq>)u));
                    h.p((Object)okh);
                }
                h.O();
                okh = okh;
            }
            else {
                okh = (okh)okh.Companion;
            }
            h.O();
            final okh e = ((okh)companion).E(okh);
            h.x(-492369756);
            final Object y7 = h.y();
            Objects.requireNonNull(x66.Companion);
            Object o2 = y7;
            if (y7 == x66$a.b) {
                o2 = new g90(h4);
                h.p(o2);
            }
            h.O();
            final g90 g90 = (g90)o2;
            h.x(-1323940314);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final fve fve2 = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b4 = q66.a.b;
            final itb a4 = ove.a(e);
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
            mru.p(h, (Object)g90, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve2, (ftb)q66.a.f);
            ((t26)a4).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-451584589);
            final ListIterator listIterator2 = niq3.listIterator();
            while (true) {
                final w8r w8r2 = (w8r)listIterator2;
                if (!w8r2.hasNext()) {
                    break;
                }
                final Object next = w8r2.next();
                h.D(-1739565921, ((qsb)d2).invoke(next));
                final ftb ftb = map3.get(next);
                if (ftb != null) {
                    ftb.invoke((Object)h, (Object)0);
                }
                h.N();
            }
            h.O();
            h.O();
            h.r();
            h.O();
            final n96$b a5 = n96.a;
            final y80$d y80$d = d2;
            y80$c = d0;
            qsb2 = (qsb<? super S, ?>)y80$d;
            b = ex2;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new y80$f((mzt)mzt, (okh)companion, (qsb)y80$c, b, (qsb)qsb2, (ktb)ktb, n, n2));
        }
    }
    
    public static final <S> void b(final S n, okh companion, qsb<? super h90<S>, jm6> d0, ex b, final ktb<? super va0, ? super S, ? super x66, ? super Integer, fzv> ktb, final x66 x66, final int n2, final int n3) {
        czd.f((Object)ktb, "content");
        final x66 h = x66.h(2124549995);
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
        final int n6 = n3 & 0x2;
        int n9 = 0;
        Label_0147: {
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
                    n9 = (n4 | n8);
                    break Label_0147;
                }
            }
            n9 = n7;
        }
        final int n10 = n3 & 0x4;
        int n13 = 0;
        Label_0220: {
            int n11;
            if (n10 != 0) {
                n11 = (n9 | 0x180);
            }
            else {
                n11 = n9;
                if ((n2 & 0x380) == 0x0) {
                    int n12;
                    if (h.P((Object)d0)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n9 | n12);
                    break Label_0220;
                }
            }
            n13 = n11;
        }
        final int n14 = n3 & 0x8;
        int n17 = 0;
        Label_0294: {
            int n15;
            if (n14 != 0) {
                n15 = (n13 | 0xC00);
            }
            else {
                n15 = n13;
                if ((n2 & 0x1C00) == 0x0) {
                    int n16;
                    if (h.P((Object)b)) {
                        n16 = 2048;
                    }
                    else {
                        n16 = 1024;
                    }
                    n17 = (n13 | n16);
                    break Label_0294;
                }
            }
            n17 = n15;
        }
        int n18;
        if ((n3 & 0x10) != 0x0) {
            n18 = (n17 | 0x6000);
        }
        else {
            n18 = n17;
            if ((0xE000 & n2) == 0x0) {
                int n19;
                if (h.P((Object)ktb)) {
                    n19 = 16384;
                }
                else {
                    n19 = 8192;
                }
                n18 = (n17 | n19);
            }
        }
        ex ex;
        Object o;
        if ((0xB6DB & n18) == 0x2492 && h.i()) {
            h.H();
            final y80$a y80$a = d0;
            ex = b;
            o = y80$a;
        }
        else {
            if (n6 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n10 != 0) {
                d0 = y80$a.D0;
            }
            if (n14 != 0) {
                Objects.requireNonNull(ex.Companion);
                b = ex.a.b;
            }
            final n96$b a = n96.a;
            a((mzt<Object>)e0u.c((Object)n, "AnimatedContent", h, (n18 & 0x8) | 0x30 | (n18 & 0xE), 0), companion, (qsb<? super h90<Object>, jm6>)d0, b, null, (ktb<? super va0, ? super Object, ? super x66, ? super Integer, fzv>)ktb, h, (n18 & 0x70) | (n18 & 0x380) | (n18 & 0x1C00) | (n18 << 3 & 0x70000), 8);
            final qsb<? super h90<Object>, jm6> qsb = (qsb<? super h90<Object>, jm6>)d0;
            ex = b;
            o = qsb;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new y80$b((Object)n, companion, (qsb)o, ex, (ktb)ktb, n2, n3));
        }
    }
    
    public static ndq c(final int n) {
        final boolean b = (n & 0x1) != 0x0;
        Object d0;
        if ((n & 0x2) != 0x0) {
            d0 = f90.D0;
        }
        else {
            d0 = null;
        }
        czd.f(d0, "sizeAnimationSpec");
        return (ndq)new odq(b, (ftb)d0);
    }
}
