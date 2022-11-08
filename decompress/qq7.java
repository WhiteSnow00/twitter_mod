import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qq7
{
    public static final void a(final int n, final String s, final otb<oyv> otb, jkh companion, m76 h, final int n2, final int n3) {
        zzd.f((Object)otb, "onClick");
        h = h.h(2007433636);
        int n4;
        if ((n3 & 0x1) != 0x0) {
            n4 = (n2 | 0x6);
        }
        else if ((n2 & 0xE) == 0x0) {
            int n5;
            if (h.d(n)) {
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
                if (h.P((Object)s)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        int n8;
        if ((n3 & 0x4) != 0x0) {
            n8 = (n6 | 0x180);
        }
        else {
            n8 = n6;
            if ((n2 & 0x380) == 0x0) {
                int n9;
                if (h.P((Object)otb)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n6 | n9);
            }
        }
        final int n10 = n3 & 0x8;
        int n11;
        if (n10 != 0) {
            n11 = (n8 | 0xC00);
        }
        else {
            n11 = n8;
            if ((n2 & 0x1C00) == 0x0) {
                int n12;
                if (h.P((Object)companion)) {
                    n12 = 2048;
                }
                else {
                    n12 = 1024;
                }
                n11 = (n8 | n12);
            }
        }
        if ((n11 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            if (n10 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final jkh d = je4.d(tcq.i(companion), false, null, null, otb, 7);
            final fzq a2 = fzq.a;
            final float g = fzq.g;
            final float e = fzq.e;
            final jkh r = oyz.R(d, g, e);
            Objects.requireNonNull(dx.Companion);
            final gw1$b l = dx$a.l;
            h.x(693286680);
            final ks0 a3 = ks0.a;
            final gqg a4 = glo.a((ks0$d)ks0.b, (dx$c)l, h);
            h.x(-1323940314);
            final n9r e2 = te6.e;
            final dp8 dp8 = (dp8)h.m((re6)e2);
            final n9r k = te6.k;
            final tve tve = (tve)h.m((re6)k);
            final n9r o = te6.o;
            final z5x z5x = (z5x)h.m((re6)o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a5 = cwe.a(r);
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
            final f76$a$c e3 = f76.a.e;
            r9x.v(h, (Object)a4, (gub)e3);
            final f76$a$a d2 = f76.a.d;
            r9x.v(h, (Object)dp8, (gub)d2);
            final f76$a$b f = f76.a.f;
            r9x.v(h, (Object)tve, (gub)f);
            final f76$a$e g2 = f76.a.g;
            ((j36)a5).h0((Object)hvl.b(h, z5x, g2, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-678309503);
            final gw1 f2 = dx$a.f;
            final jkh.a companion2 = jkh.Companion;
            final pko a6 = qko.a;
            final jkh a7 = rp2.A((jkh)companion2, (oqp)a6);
            final float n13 = 1;
            final n9r a8 = fqc.a;
            final jkh q = oyz.Q(t72.b(a7, n13, ((aqc)h.m((re6)a8)).b(), (oqp)a6), g);
            h.x(733328855);
            final gqg d3 = ib2.d((dx)f2, false, h);
            h.x(-1323940314);
            final dp8 dp9 = (dp8)h.m((re6)e2);
            final tve tve2 = (tve)h.m((re6)k);
            final z5x z5x2 = (z5x)h.m((re6)o);
            final jub a9 = cwe.a(q);
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
            ((j36)a9).h0((Object)af.x(h, h, d3, e3, h, dp9, d2, h, tve2, f, h, z5x2, g2, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            hpc.a(gpc.A0, ukg.d1(2131953279, h), (jkh)null, 0L, false, h, 8, 28);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final jkh u = oyz.U(tcq.h(companion2, 1.0f), e, 0.0f, 0.0f, 0.0f, 14);
            final ks0$e f3 = (ks0$e)ks0.f;
            h.x(-483455358);
            final gqg a10 = ps4.a((ks0$l)f3, (dx$b)dx$a.n, h);
            h.x(-1323940314);
            final dp8 dp10 = (dp8)h.m((re6)e2);
            final tve tve3 = (tve)h.m((re6)k);
            final z5x z5x3 = (z5x)h.m((re6)o);
            final jub a11 = cwe.a(u);
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
            ((j36)a11).h0((Object)af.x(h, h, a10, e3, h, dp10, d2, h, tve3, f, h, z5x3, g2, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            final jkh h2 = tcq.h(companion2, 1.0f);
            final ks0$e h3 = (ks0$e)ks0.h;
            h.x(693286680);
            final gqg a12 = glo.a((ks0$d)h3, (dx$c)l, h);
            h.x(-1323940314);
            final dp8 dp11 = (dp8)h.m((re6)e2);
            final tve tve4 = (tve)h.m((re6)k);
            final z5x z5x4 = (z5x)h.m((re6)o);
            final jub a13 = cwe.a(h2);
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
            ((j36)a13).h0((Object)af.x(h, h, a12, e3, h, dp11, d2, h, tve4, f, h, z5x4, g2, h), (Object)h, (Object)0);
            final String g3 = e1.G(h, 2058660585, -678309503, 2131953279, h);
            final long i = ((aqc)h.m((re6)a8)).i();
            Objects.requireNonNull(jis.Companion);
            final hqc$a companion3 = hqc.Companion;
            final xis h4 = companion3.a(h).h;
            Objects.requireNonNull(rlb.Companion);
            xhs.a(g3, (jkh)null, i, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 2, false, 0, xis.a(h4, 0L, 0L, rlb.M0, null, null, null, null, 0L, 262139), false, h, 0, 48, 47098);
            h.x(-297643558);
            if (n > 0) {
                final jkh r2 = tcq.r(companion2, fzq.h);
                final gqg q2 = b8b.q(h, 733328855, dx$a.g, false, h, -1323940314);
                final dp8 dp12 = (dp8)h.m((re6)e2);
                final tve tve5 = (tve)h.m((re6)k);
                final z5x z5x5 = (z5x)h.m((re6)o);
                final jub a14 = cwe.a(r2);
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
                ((j36)a14).h0((Object)af.x(h, h, q2, e3, h, dp12, d2, h, tve5, f, h, z5x5, g2, h), (Object)h, (Object)0);
                h.x(2058660585);
                h.x(-2137368960);
                h48.a(null, h, 0, 1);
                h.O();
                h.O();
                h.r();
                h.O();
                h.O();
            }
            h.O();
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            if (s != null) {
                final long j = ((aqc)h.m((re6)a8)).j();
                final m76 m76 = h;
                xhs.a(s, (jkh)null, j, 0L, (nlb)null, (rlb)null, (rkb)null, 0L, (kes)null, (rds)null, 0L, 2, false, 0, companion3.a(m76).j, false, m76, n11 >> 3 & 0xE, 48, 47098);
            }
            final m76 m77 = h;
            m77.O();
            m77.O();
            m77.r();
            m77.O();
            m77.O();
            m77.O();
            m77.O();
            m77.r();
            m77.O();
            m77.O();
        }
        final vwo k2 = h.k();
        if (k2 != null) {
            k2.a((gub)new qq7$a(n, s, (otb)otb, companion, n2, n3));
        }
    }
}
