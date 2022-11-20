import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ks1
{
    public static final void a(final xc0 xc0, okh companion, sjs d, qsb<? super yis, fzv> d2, int n, boolean b, int n2, Map<String, upd> d3, final x66 x66, final int n3, final int n4) {
        czd.f((Object)xc0, "text");
        final x66 h = x66.h(-648605928);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n6;
            if (h.P((Object)xc0)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n3);
        }
        else {
            n5 = n3;
        }
        final int n7 = n4 & 0x2;
        int n10 = 0;
        Label_0145: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x30);
            }
            else {
                n8 = n5;
                if ((n3 & 0x70) == 0x0) {
                    int n9;
                    if (h.P((Object)companion)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n5 | n9);
                    break Label_0145;
                }
            }
            n10 = n8;
        }
        final int n11 = n4 & 0x4;
        int n14 = 0;
        Label_0218: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n3 & 0x380) == 0x0) {
                    int n13;
                    if (h.P((Object)d)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0218;
                }
            }
            n14 = n12;
        }
        final int n15 = n4 & 0x8;
        int n18 = 0;
        Label_0292: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n3 & 0x1C00) == 0x0) {
                    int n17;
                    if (h.P((Object)d2)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0292;
                }
            }
            n18 = n16;
        }
        final int n19 = n4 & 0x10;
        int n22 = 0;
        Label_0366: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x6000);
            }
            else {
                n20 = n18;
                if ((0xE000 & n3) == 0x0) {
                    int n21;
                    if (h.d(n)) {
                        n21 = 16384;
                    }
                    else {
                        n21 = 8192;
                    }
                    n22 = (n18 | n21);
                    break Label_0366;
                }
            }
            n22 = n20;
        }
        final int n23 = n4 & 0x20;
        int n26 = 0;
        Label_0437: {
            int n24;
            if (n23 != 0) {
                n24 = (n22 | 0x30000);
            }
            else {
                n24 = n22;
                if ((0x70000 & n3) == 0x0) {
                    int n25;
                    if (h.a(b)) {
                        n25 = 131072;
                    }
                    else {
                        n25 = 65536;
                    }
                    n26 = (n22 | n25);
                    break Label_0437;
                }
            }
            n26 = n24;
        }
        final int n27 = n4 & 0x40;
        int n28;
        if (n27 != 0) {
            n28 = (n26 | 0x180000);
        }
        else {
            n28 = n26;
            if ((n3 & 0x380000) == 0x0) {
                int n29;
                if (h.d(n2)) {
                    n29 = 1048576;
                }
                else {
                    n29 = 524288;
                }
                n28 = (n26 | n29);
            }
        }
        final int n30 = n4 & 0x80;
        int n31 = n28;
        if (n30 != 0) {
            n31 = (n28 | 0x400000);
        }
        Object o;
        okh okh;
        sjs sjs2;
        int n32;
        Object o2;
        if (n30 == 128 && (0x16DB6DB & n31) == 0x492492 && h.i()) {
            h.H();
            final sjs sjs = d;
            o = d2;
            final k2a k2a = d3;
            okh = companion;
            sjs2 = sjs;
            n32 = n;
            o2 = k2a;
        }
        else {
            h.C();
            Object c;
            if ((n3 & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n33 = n31;
                if (n30 != 0) {
                    n33 = (n31 & 0xFE3FFFFF);
                }
                final ks1$c ks1$c = d2;
                n32 = n;
                okh = companion;
                o2 = d3;
                n = n33;
                c = ks1$c;
            }
            else {
                if (n7 != 0) {
                    companion = (okh)okh.Companion;
                }
                if (n11 != 0) {
                    Objects.requireNonNull(sjs.Companion);
                    d = sjs.d;
                }
                if (n15 != 0) {
                    d2 = ks1$c.D0;
                }
                if (n19 != 0) {
                    Objects.requireNonNull(ejs.Companion);
                    n = 1;
                }
                if (n23 != 0) {
                    b = true;
                }
                if (n27 != 0) {
                    n2 = Integer.MAX_VALUE;
                }
                if (n30 != 0) {
                    d3 = k2a.D0;
                    n31 &= 0xFE3FFFFF;
                }
                final ks1$c ks1$c2 = d2;
                final int n34 = n31;
                final k2a k2a2 = d3;
                n32 = n;
                okh = companion;
                c = ks1$c2;
                o2 = k2a2;
                n = n34;
            }
            h.s();
            final n96$b a = n96.a;
            if (n2 <= 0) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            final rfp rfp = (rfp)h.m((wd6)ufp.a);
            final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
            final pjb$b pjb$b = (pjb$b)h.m((wd6)yd6.h);
            final long b2 = ((njs)h.m((wd6)ojs.a)).b;
            final lvj a2 = ix6.a;
            czd.f(o2, "inlineContent");
            lvj a3;
            if (((Map)o2).isEmpty()) {
                a3 = ix6.a;
            }
            else {
                final List b3 = xc0.b("androidx.compose.foundation.text.inlineContent", 0, xc0.length());
                final ArrayList<xc0$b> list = new ArrayList<xc0$b>();
                final ArrayList<xc0$b> list2 = new ArrayList<xc0$b>();
                final ArrayList list3 = (ArrayList)b3;
                for (int size = list3.size(), i = 0; i < size; ++i) {
                    final xc0$b xc0$b = list3.get(i);
                    if (((Map<String, upd>)o2).get(xc0$b.a) != null) {
                        list.add(new xc0$b((Object)null, xc0$b.b, xc0$b.c));
                        list2.add(new xc0$b((Object)null, xc0$b.b, xc0$b.c));
                    }
                }
                a3 = new lvj((Object)list, (Object)list2);
            }
            final List list4 = (List)a3.D0;
            final List list5 = (List)a3.E0;
            h.x(959243020);
            long longValue;
            if (rfp == null) {
                longValue = 0L;
            }
            else {
                longValue = ((Number)uoz.T(new Object[] { xc0, rfp }, vto.a((ftb)new ls1(rfp), (qsb)ms1.D0), (String)null, (nsb)new ks1$g(rfp), h, 4)).longValue();
            }
            h.O();
            h.x(-492369756);
            Object y = h.y();
            Objects.requireNonNull(x66.Companion);
            if (y == x66$a.b) {
                y = new bfs(new qjs(new hfs(xc0, d, n2, b, n32, lo8, pjb$b, list4, null), longValue));
                h.p(y);
            }
            h.O();
            final bfs bfs = (bfs)y;
            final qjs d4 = bfs.D0;
            if (!h.f()) {
                bfs.e(ix6.b(d4.a, xc0, d, lo8, pjb$b, b, n32, n2, list4));
            }
            Objects.requireNonNull(d4);
            czd.f(c, "<set-?>");
            d4.c = (qsb)c;
            d4.h = b2;
            bfs.f(rfp);
            Object o3;
            if (list5.isEmpty()) {
                final b36 a4 = b36.a;
                o3 = b36.b;
            }
            else {
                o3 = io7.g(h, 1892283635, (Object)new ks1$d(xc0, list5, n));
            }
            final okh e = okh.E(bfs.H0.E(bfs.I0).E(bfs.J0));
            final fqg g0 = (fqg)bfs.G0;
            h.x(-1323940314);
            final lo8 lo9 = (lo8)h.m((wd6)yd6.e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b4 = q66.a.b;
            final itb a5 = ove.a(e);
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
            mru.p(h, (Object)g0, (ftb)q66.a.e);
            mru.p(h, (Object)lo9, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a5).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            ((t26)o3).invoke((Object)h, (Object)0);
            h.O();
            h.r();
            h.O();
            final n96$b a6 = n96.a;
            final sjs sjs3 = d;
            o = c;
            sjs2 = sjs3;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ks1$e(xc0, okh, sjs2, (qsb)o, n32, b, n2, (Map)o2, n3, n4));
        }
    }
    
    public static final void b(final String s, okh companion, sjs d, qsb<? super yis, fzv> d2, int n, boolean b, int n2, final x66 x66, final int n3, final int n4) {
        czd.f((Object)s, "text");
        final x66 h = x66.h(1022429478);
        int n5;
        if ((n4 & 0x1) != 0x0) {
            n5 = (n3 | 0x6);
        }
        else if ((n3 & 0xE) == 0x0) {
            int n6;
            if (h.P((Object)s)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n5 = (n6 | n3);
        }
        else {
            n5 = n3;
        }
        final int n7 = n4 & 0x2;
        int n10 = 0;
        Label_0146: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x30);
            }
            else {
                n8 = n5;
                if ((n3 & 0x70) == 0x0) {
                    int n9;
                    if (h.P((Object)companion)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n5 | n9);
                    break Label_0146;
                }
            }
            n10 = n8;
        }
        final int n11 = n4 & 0x4;
        int n14 = 0;
        Label_0219: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x180);
            }
            else {
                n12 = n10;
                if ((n3 & 0x380) == 0x0) {
                    int n13;
                    if (h.P((Object)d)) {
                        n13 = 256;
                    }
                    else {
                        n13 = 128;
                    }
                    n14 = (n10 | n13);
                    break Label_0219;
                }
            }
            n14 = n12;
        }
        final int n15 = n4 & 0x8;
        int n18 = 0;
        Label_0293: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0xC00);
            }
            else {
                n16 = n14;
                if ((n3 & 0x1C00) == 0x0) {
                    int n17;
                    if (h.P((Object)d2)) {
                        n17 = 2048;
                    }
                    else {
                        n17 = 1024;
                    }
                    n18 = (n14 | n17);
                    break Label_0293;
                }
            }
            n18 = n16;
        }
        final int n19 = n4 & 0x10;
        int n22 = 0;
        Label_0367: {
            int n20;
            if (n19 != 0) {
                n20 = (n18 | 0x6000);
            }
            else {
                n20 = n18;
                if ((0xE000 & n3) == 0x0) {
                    int n21;
                    if (h.d(n)) {
                        n21 = 16384;
                    }
                    else {
                        n21 = 8192;
                    }
                    n22 = (n18 | n21);
                    break Label_0367;
                }
            }
            n22 = n20;
        }
        final int n23 = n4 & 0x20;
        int n26 = 0;
        Label_0438: {
            int n24;
            if (n23 != 0) {
                n24 = (n22 | 0x30000);
            }
            else {
                n24 = n22;
                if ((0x70000 & n3) == 0x0) {
                    int n25;
                    if (h.a(b)) {
                        n25 = 131072;
                    }
                    else {
                        n25 = 65536;
                    }
                    n26 = (n22 | n25);
                    break Label_0438;
                }
            }
            n26 = n24;
        }
        final int n27 = n4 & 0x40;
        int n28;
        if (n27 != 0) {
            n28 = (n26 | 0x180000);
        }
        else {
            n28 = n26;
            if ((n3 & 0x380000) == 0x0) {
                int n29;
                if (h.d(n2)) {
                    n29 = 1048576;
                }
                else {
                    n29 = 524288;
                }
                n28 = (n26 | n29);
            }
        }
        sjs sjs;
        Object o;
        if ((n28 & 0x2DB6DB) == 0x92492 && h.i()) {
            h.H();
            final qsb<? super yis, fzv> qsb = (qsb<? super yis, fzv>)d2;
            sjs = d;
            o = qsb;
        }
        else {
            if (n7 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n11 != 0) {
                Objects.requireNonNull(sjs.Companion);
                d = sjs.d;
            }
            if (n15 != 0) {
                d2 = ks1$a.D0;
            }
            if (n19 != 0) {
                Objects.requireNonNull(ejs.Companion);
                n = 1;
            }
            if (n23 != 0) {
                b = true;
            }
            if (n27 != 0) {
                n2 = Integer.MAX_VALUE;
            }
            final n96$b a = n96.a;
            if (n2 <= 0) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            final rfp rfp = (rfp)h.m((wd6)ufp.a);
            final iar e = yd6.e;
            final lo8 lo8 = (lo8)h.m((wd6)e);
            final pjb$b pjb$b = (pjb$b)h.m((wd6)yd6.h);
            h.x(959238313);
            long longValue;
            if (rfp == null) {
                longValue = 0L;
            }
            else {
                longValue = ((Number)uoz.T(new Object[] { s, rfp }, vto.a((ftb)new ls1(rfp), (qsb)ms1.D0), (String)null, (nsb)new ks1$f(rfp), h, 4)).longValue();
            }
            h.O();
            h.x(-492369756);
            Object y = h.y();
            Objects.requireNonNull(x66.Companion);
            if (y == x66$a.b) {
                y = new bfs(new qjs(new hfs(new xc0(s, (List)null, 6), d, n2, b, n, lo8, pjb$b, 128), longValue));
                h.p(y);
            }
            h.O();
            final bfs bfs = (bfs)y;
            final qjs d3 = bfs.D0;
            if (!h.f()) {
                final hfs a2 = d3.a;
                final lvj a3 = ix6.a;
                czd.f((Object)a2, "current");
                czd.f((Object)d, "style");
                czd.f((Object)lo8, "density");
                czd.f((Object)pjb$b, "fontFamilyResolver");
                hfs hfs = null;
                Label_1079: {
                    if (czd.a((Object)a2.a.D0, (Object)s) && czd.a((Object)a2.b, (Object)d) && a2.d == b && a2.e == n && a2.c == n2 && czd.a((Object)a2.f, (Object)lo8)) {
                        hfs = a2;
                        if (a2.g == pjb$b) {
                            break Label_1079;
                        }
                    }
                    hfs = new hfs(new xc0(s, (List)null, 6), d, n2, b, n, lo8, pjb$b, 128);
                }
                bfs.e(hfs);
            }
            Objects.requireNonNull(d3);
            czd.f((Object)d2, "<set-?>");
            d3.c = (qsb)d2;
            bfs.f(rfp);
            h.x(959239630);
            if (rfp != null) {
                d3.h = ((njs)h.m((wd6)ojs.a)).b;
            }
            h.O();
            final okh e2 = companion.E(bfs.H0.E(bfs.I0).E(bfs.J0));
            final fqg g0 = (fqg)bfs.G0;
            h.x(544976794);
            final lo8 lo9 = (lo8)h.m((wd6)e);
            final fve fve = (fve)h.m((wd6)yd6.k);
            final t6x t6x = (t6x)h.m((wd6)yd6.o);
            final okh c = w66.c(h, e2);
            Objects.requireNonNull(q66.Companion);
            final vve$a b2 = q66.a.b;
            h.x(1405779621);
            if (!(h.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((nsb)new ks1$h((nsb)b2));
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)g0, (ftb)q66.a.e);
            mru.p(h, (Object)lo9, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            mru.p(h, (Object)t6x, (ftb)q66.a.g);
            mru.p(h, (Object)c, (ftb)q66.a.c);
            h.c();
            h.r();
            h.O();
            h.O();
            final sjs sjs2 = d;
            o = d2;
            sjs = sjs2;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ks1$b(s, companion, sjs, (qsb)o, n, b, n2, n3, n4));
        }
    }
}
