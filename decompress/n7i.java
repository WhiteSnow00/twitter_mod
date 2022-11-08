import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n7i
{
    public static final void a(final int n, final long n2, final long n3, jkh companion, m76 h, final int n4, final int n5) {
        h = h.h(-1440444722);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n7;
            if (h.d(n)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n4);
        }
        else {
            n6 = n4;
        }
        int n8;
        if ((n5 & 0x2) != 0x0) {
            n8 = (n6 | 0x30);
        }
        else {
            n8 = n6;
            if ((n4 & 0x70) == 0x0) {
                int n9;
                if (h.e(n2)) {
                    n9 = 32;
                }
                else {
                    n9 = 16;
                }
                n8 = (n6 | n9);
            }
        }
        int n10;
        if ((n5 & 0x4) != 0x0) {
            n10 = (n8 | 0x180);
        }
        else {
            n10 = n8;
            if ((n4 & 0x380) == 0x0) {
                int n11;
                if (h.e(n3)) {
                    n11 = 256;
                }
                else {
                    n11 = 128;
                }
                n10 = (n8 | n11);
            }
        }
        final int n12 = n5 & 0x8;
        int n13;
        if (n12 != 0) {
            n13 = (n10 | 0xC00);
        }
        else {
            n13 = n10;
            if ((n4 & 0x1C00) == 0x0) {
                int n14;
                if (h.P((Object)companion)) {
                    n14 = 2048;
                }
                else {
                    n14 = 1024;
                }
                n13 = (n10 | n14);
            }
        }
        if ((n13 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            if (n12 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final int n15 = n13 >> 9 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(dx.Companion);
            final gqg d = ib2.d((dx)dx$a.b, false, h);
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a2 = cwe.a(companion);
            final int n16 = ((n15 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)d, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a2).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)(n16 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            final int n17 = 2;
            if ((n16 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final asy i0 = asy.I0;
                int n19;
                final int n18 = n19 = ((n15 >> 6 & 0x70) | 0x6);
                if ((n18 & 0xE) == 0x0) {
                    int n20 = n17;
                    if (h.P((Object)i0)) {
                        n20 = 4;
                    }
                    n19 = (n18 | n20);
                }
                if ((n19 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    final jkh.a companion2 = jkh.Companion;
                    ib2.a(i0.n0(h6q.j((jkh)companion2, n3)), h, 0);
                    n7d.a(oyz.V(n, h), (String)null, i0.d((jkh)companion2, (dx)dx$a.f), (dx)null, (ym6)null, 0.0f, sr4$a.b(sr4.Companion, n2), h, 56, 56);
                }
            }
            dia.u(h);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new n7i$a(n, n2, n3, companion, n4, n5));
        }
    }
    
    public static final void b(final int n, final long n2, final long n3, final boolean b, jkh companion, m76 h, final int n4, final int n5) {
        h = h.h(323943239);
        int n6;
        if ((n5 & 0x1) != 0x0) {
            n6 = (n4 | 0x6);
        }
        else if ((n4 & 0xE) == 0x0) {
            int n7;
            if (h.d(n)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n6 = (n7 | n4);
        }
        else {
            n6 = n4;
        }
        int n10 = 0;
        Label_0135: {
            int n8;
            if ((n5 & 0x2) != 0x0) {
                n8 = (n6 | 0x30);
            }
            else {
                n8 = n6;
                if ((n4 & 0x70) == 0x0) {
                    int n9;
                    if (h.e(n2)) {
                        n9 = 32;
                    }
                    else {
                        n9 = 16;
                    }
                    n10 = (n6 | n9);
                    break Label_0135;
                }
            }
            n10 = n8;
        }
        int n11;
        if ((n5 & 0x4) != 0x0) {
            n11 = (n10 | 0x180);
        }
        else {
            n11 = n10;
            if ((n4 & 0x380) == 0x0) {
                int n12;
                if (h.e(n3)) {
                    n12 = 256;
                }
                else {
                    n12 = 128;
                }
                n11 = (n10 | n12);
            }
        }
        int n13;
        if ((n5 & 0x8) != 0x0) {
            n13 = (n11 | 0xC00);
        }
        else {
            n13 = n11;
            if ((n4 & 0x1C00) == 0x0) {
                int n14;
                if (h.a(b)) {
                    n14 = 2048;
                }
                else {
                    n14 = 1024;
                }
                n13 = (n11 | n14);
            }
        }
        final int n15 = n5 & 0x10;
        int n16;
        if (n15 != 0) {
            n16 = (n13 | 0x6000);
        }
        else {
            n16 = n13;
            if ((0xE000 & n4) == 0x0) {
                int n17;
                if (h.P((Object)companion)) {
                    n17 = 16384;
                }
                else {
                    n17 = 8192;
                }
                n16 = (n13 | n17);
            }
        }
        if ((0xB6DB & n16) == 0x2492 && h.i()) {
            h.H();
        }
        else {
            if (n15 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final int n18 = n16 >> 12 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(dx.Companion);
            final gqg d = ib2.d((dx)dx$a.b, false, h);
            h.x(-1323940314);
            final n9r e = te6.e;
            final dp8 dp8 = (dp8)h.m((re6)e);
            final n9r k = te6.k;
            final tve tve = (tve)h.m((re6)k);
            final n9r o = te6.o;
            final z5x z5x = (z5x)h.m((re6)o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b2 = f76.a.b;
            final jub a2 = cwe.a(companion);
            final int n19 = ((n18 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b2);
            }
            else {
                h.o();
            }
            h.F();
            final f76$a$c e2 = f76.a.e;
            r9x.v(h, (Object)d, (gub)e2);
            final f76$a$a d2 = f76.a.d;
            r9x.v(h, (Object)dp8, (gub)d2);
            final f76$a$b f = f76.a.f;
            r9x.v(h, (Object)tve, (gub)f);
            final f76$a$e g = f76.a.g;
            ((j36)a2).h0((Object)hvl.b(h, z5x, g, h), (Object)h, (Object)(n19 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            final int n20 = 2;
            if ((n19 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                final asy i0 = asy.I0;
                int n22;
                final int n21 = n22 = ((n18 >> 6 & 0x70) | 0x6);
                if ((n21 & 0xE) == 0x0) {
                    int n23 = n20;
                    if (h.P((Object)i0)) {
                        n23 = 4;
                    }
                    n22 = (n21 | n23);
                }
                if ((n22 & 0x5B) == 0x12 && h.i()) {
                    h.H();
                }
                else {
                    h.x(-483455358);
                    final jkh.a companion2 = jkh.Companion;
                    final ks0 a3 = ks0.a;
                    final gqg a4 = ps4.a((ks0$l)ks0.d, (dx$b)dx$a.n, h);
                    h.x(-1323940314);
                    final dp8 dp9 = (dp8)h.m((re6)e);
                    final tve tve2 = (tve)h.m((re6)k);
                    final z5x z5x2 = (z5x)h.m((re6)o);
                    final jub a5 = cwe.a((jkh)companion2);
                    if (!(h.j() instanceof xr0)) {
                        ukg.l0();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((otb)b2);
                    }
                    else {
                        h.o();
                    }
                    ((j36)a5).h0((Object)af.x(h, h, a4, e2, h, dp9, d2, h, tve2, f, h, z5x2, g, h), (Object)h, (Object)0);
                    h.x(2058660585);
                    h.x(-1163856341);
                    final jkh o2 = tcq.o(companion2, xd.A(2131166693, h), xd.A(2131166693, h));
                    final float n24 = 12;
                    a(n, n2, n3, rp2.A(o2, (oqp)qko.d(n24, n24, n24, n24)), h, (n16 & 0xE) | (n16 & 0x70) | (n16 & 0x380), 0);
                    gzq.l(h, 0);
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                    h.O();
                    if (b) {
                        r6i.a(i0.d((jkh)companion2, (dx)dx$a.j), h, 0, 0);
                    }
                }
            }
            dia.u(h);
        }
        final vwo j = h.k();
        if (j != null) {
            j.a((gub)new n7i$b(n, n2, n3, b, companion, n4, n5));
        }
    }
    
    public static final void c(final String s, m76 h, final int n) {
        h = h.h(896795302);
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
            final ea6$b a = ea6.a;
            final jkh.a companion = jkh.Companion;
            final fzq a2 = fzq.a;
            final jkh j = tcq.j(oyz.U(companion, fzq.f, 0.0f, 0.0f, 0.0f, 14), xd.A(2131166693, h));
            final ks0 a3 = ks0.a;
            final ks0$e f = (ks0$e)ks0.f;
            h.x(-483455358);
            Objects.requireNonNull(dx.Companion);
            final gqg a4 = ps4.a((ks0$l)f, (dx$b)dx$a.n, h);
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a5 = cwe.a(j);
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)a4, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a5).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final xis g = hqc.Companion.a(h).g;
            final m76 m76 = h;
            xhs.a(s, (jkh)null, 0L, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 0, false, 0, g, false, m76, n3 & 0xE, 0, 49150);
            dia.u(m76);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new n7i$c(s, n));
        }
    }
    
    public static final void d(final g9i g9i, final int n, final int n2, final long n3, final long n4, final boolean b, jkh companion, final rtb<? super g9i, oyv> rtb, m76 h, final int n5, final int n6) {
        zzd.f((Object)g9i, "type");
        zzd.f((Object)rtb, "onClick");
        h = h.h(1842285472);
        if ((n6 & 0x40) != 0x0) {
            companion = jkh.Companion;
        }
        final ea6$b a = ea6.a;
        final jkh.a companion2 = jkh.Companion;
        final jkh b2 = pdp.b(tcq.i(companion2), b, (otb)new n7i$d((rtb)rtb, g9i));
        final fzq a2 = fzq.a;
        final jkh e = oyz.U(b2, 0.0f, fzq.g, 0.0f, fzq.e, 5).E(companion);
        h.x(693286680);
        final ks0 a3 = ks0.a;
        final ks0$j b3 = ks0.b;
        Objects.requireNonNull(dx.Companion);
        final gqg a4 = glo.a((ks0$d)b3, (dx$c)dx$a.k, h);
        h.x(-1323940314);
        final dp8 dp8 = (dp8)h.m((re6)te6.e);
        final tve tve = (tve)h.m((re6)te6.k);
        final z5x z5x = (z5x)h.m((re6)te6.o);
        Objects.requireNonNull(f76.Companion);
        final jwe$a b4 = f76.a.b;
        final jub a5 = cwe.a(e);
        if (h.j() instanceof xr0) {
            h.E();
            if (h.f()) {
                h.A((otb)b4);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)a4, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a5).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-678309503);
            final jkh o = tcq.o(companion2, xd.A(2131166692, h), xd.A(2131166692, h));
            final int n7 = n5 >> 6;
            b(n2, n3, n4, b, o, h, (n7 & 0xE) | (n7 & 0x70) | (n7 & 0x380) | (n7 & 0x1C00), 0);
            c(ukg.d1(n, h), h, 0);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final vwo k = h.k();
            if (k != null) {
                k.a((gub)new n7i$e(g9i, n, n2, n3, n4, b, companion, (rtb)rtb, n5, n6));
            }
            return;
        }
        ukg.l0();
        throw null;
    }
}
