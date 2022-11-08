import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ib2
{
    public static final jb2 a;
    public static final ib2$b b;
    
    static {
        Objects.requireNonNull(dx.Companion);
        a = new jb2(false, (dx)dx$a.b);
        b = ib2$b.a;
    }
    
    public static final void a(final jkh jkh, m76 h, final int n) {
        zzd.f((Object)jkh, "modifier");
        h = h.h(-211209833);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)jkh)) {
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
            final ib2$b b = ib2.b;
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b2 = f76.a.b;
            final jub a2 = cwe.a(jkh);
            final int n4 = (((n3 << 3 & 0x70) | 0x180) << 9 & 0x1C00) | 0x6;
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
            r9x.v(h, (Object)b, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a2).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)(n4 >> 3 & 0x70));
            h.x(2058660585);
            h.x(1021196736);
            if ((n4 >> 9 & 0xE & 0xB) == 0x2) {
                if (h.i()) {
                    h.H();
                }
            }
            h.O();
            h.O();
            h.r();
            h.O();
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new ib2$a(jkh, n));
        }
    }
    
    public static final boolean b(final dqg dqg) {
        final Object m = ((ezd)dqg).m();
        hb2 hb2;
        if (m instanceof hb2) {
            hb2 = (hb2)m;
        }
        else {
            hb2 = null;
        }
        return hb2 != null && hb2.E0;
    }
    
    public static final void c(final qgk$a qgk$a, final qgk qgk, final dqg dqg, final tve tve, final int n, final int n2, final dx dx) {
        final Object m = ((ezd)dqg).m();
        hb2 hb2;
        if (m instanceof hb2) {
            hb2 = (hb2)m;
        }
        else {
            hb2 = null;
        }
        dx d0 = null;
        Label_0046: {
            if (hb2 != null) {
                d0 = hb2.D0;
                if (d0 != null) {
                    break Label_0046;
                }
            }
            d0 = dx;
        }
        qgk$a.f(qgk$a, qgk, d0.a(lr0.b(qgk.C0, qgk.D0), lr0.b(n, n2), tve), 0.0f, 2, (Object)null);
    }
    
    public static final gqg d(final dx dx, final boolean b, final m76 m76) {
        zzd.f((Object)dx, "alignment");
        m76.x(56522820);
        final ea6$b a = ea6.a;
        Objects.requireNonNull(dx.Companion);
        gqg a2;
        if (zzd.a((Object)dx, (Object)dx$a.b) && !b) {
            a2 = ib2.a;
        }
        else {
            m76.x(511388516);
            final boolean p3 = m76.P((Object)dx);
            final boolean p4 = m76.P((Object)b);
            final Object y = m76.y();
            gqg gqg = null;
            Label_0126: {
                if (!(p4 | p3)) {
                    Objects.requireNonNull(m76.Companion);
                    if ((gqg = (gqg)y) != m76$a.b) {
                        break Label_0126;
                    }
                }
                gqg = new jb2(b, dx);
                m76.p((Object)gqg);
            }
            m76.O();
            a2 = gqg;
        }
        m76.O();
        return a2;
    }
}
