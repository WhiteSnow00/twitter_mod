import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqw
{
    public static final void a(final gqw gqw, Map<String, ? extends bqw> f0, final d86 d86, final int n, final int n2) {
        e0e.f((Object)gqw, "group");
        final d86 h = d86.h(-446179233);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)gqw)) {
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
        int n6 = n3;
        if (n5 != 0) {
            n6 = (n3 | 0x10);
        }
        if (n5 == 2 && (n6 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
            }
            else if (n5 != 0) {
                f0 = m3a.F0;
            }
            h.s();
            final sa6$b a = sa6.a;
            for (final iqw iqw : gqw.O0) {
                if (iqw instanceof oqw) {
                    h.x(-326285817);
                    final oqw oqw = (oqw)iqw;
                    Object o;
                    if ((o = ((Map<String, bqw>)f0).get(oqw.a)) == null) {
                        o = new mqw$c();
                    }
                    aqw.b((List)((bqw)o).a((pqw)pqw.c.a, (Object)oqw.b), oqw.c, oqw.a, (wq2)((bqw)o).a((pqw)pqw.a.a, (Object)oqw.d), ((Number)((bqw)o).a((pqw)pqw.b.a, (Object)oqw.e)).floatValue(), (wq2)((bqw)o).a((pqw)pqw.i.a, (Object)oqw.f), ((Number)((bqw)o).a((pqw)pqw.j.a, (Object)oqw.g)).floatValue(), ((Number)((bqw)o).a((pqw)pqw.k.a, (Object)oqw.h)).floatValue(), oqw.i, oqw.j, oqw.k, ((Number)((bqw)o).a((pqw)pqw.p.a, (Object)oqw.l)).floatValue(), ((Number)((bqw)o).a((pqw)pqw.n.a, (Object)oqw.m)).floatValue(), ((Number)((bqw)o).a((pqw)pqw.o.a, (Object)oqw.n)).floatValue(), h, 8, 0, 0);
                    h.O();
                }
                else if (iqw instanceof gqw) {
                    h.x(-326283959);
                    final gqw gqw2 = (gqw)iqw;
                    Object o2;
                    if ((o2 = ((Map<String, bqw>)f0).get(gqw2.F0)) == null) {
                        o2 = new mqw$d();
                    }
                    aqw.a(gqw2.F0, ((Number)((bqw)o2).a((pqw)pqw.f.a, (Object)gqw2.G0)).floatValue(), ((Number)((bqw)o2).a((pqw)pqw.d.a, (Object)gqw2.H0)).floatValue(), ((Number)((bqw)o2).a((pqw)pqw.e.a, (Object)gqw2.I0)).floatValue(), ((Number)((bqw)o2).a((pqw)pqw.g.a, (Object)gqw2.J0)).floatValue(), ((Number)((bqw)o2).a((pqw)pqw.h.a, (Object)gqw2.K0)).floatValue(), ((Number)((bqw)o2).a((pqw)pqw.l.a, (Object)gqw2.L0)).floatValue(), ((Number)((bqw)o2).a((pqw)pqw.m.a, (Object)gqw2.M0)).floatValue(), (List)((bqw)o2).a((pqw)pqw.c.a, (Object)gqw2.N0), (hub)w9y.i(h, 1450046638, new mqw$a(iqw, (Map)f0)), h, 939524096, 0);
                    h.O();
                }
                else {
                    h.x(-326282489);
                    h.O();
                }
            }
            final sa6$b a2 = sa6.a;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new mqw$b(gqw, (Map)f0, n, n2));
        }
    }
    
    public static final kqw b(final r9d r9d, final d86 d86) {
        e0e.f((Object)r9d, "image");
        d86.x(1413834416);
        final sa6$b a = sa6.a;
        final float b = r9d.b;
        final float c = r9d.c;
        final float d87 = r9d.d;
        final float e = r9d.e;
        final String a2 = r9d.a;
        final long g = r9d.g;
        final int h = r9d.h;
        final boolean i = r9d.i;
        final y36 j = w9y.i(d86, 1873274766, new nqw(r9d));
        d86.x(1068590786);
        final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
        final float t0 = rp8.t0(b);
        final float t2 = rp8.t0(c);
        float n = d87;
        if (Float.isNaN(d87)) {
            n = t0;
        }
        float n2 = e;
        if (Float.isNaN(e)) {
            n2 = t2;
        }
        final sr4 sr4 = new sr4(g);
        final q12 q12 = new q12(h);
        d86.x(511388516);
        final boolean p2 = d86.P((Object)sr4);
        final boolean p3 = d86.P((Object)q12);
        final Object y = d86.y();
        vr4 a3 = null;
        Label_0275: {
            if (!(p2 | p3)) {
                Objects.requireNonNull(d86.Companion);
                if ((a3 = (vr4)y) != d86$a.b) {
                    break Label_0275;
                }
            }
            Objects.requireNonNull(sr4.Companion);
            if (!sr4.c(g, sr4.g)) {
                a3 = vr4.Companion.a(g, h);
            }
            else {
                a3 = null;
            }
            d86.p((Object)a3);
        }
        d86.O();
        final vr4 value = a3;
        d86.x(-492369756);
        final Object y2 = d86.y();
        Objects.requireNonNull(d86.Companion);
        kqw kqw;
        if ((kqw = (kqw)y2) == d86$a.b) {
            kqw = new kqw();
            d86.p((Object)kqw);
        }
        d86.O();
        final kqw kqw2 = kqw;
        ((cjq<aeq>)kqw2.K0).setValue(new aeq(jty.g(t0, t2)));
        ((cjq<Boolean>)kqw2.L0).setValue(Boolean.valueOf(i));
        ((cjq<vr4>)kqw2.M0.f).setValue(value);
        kqw2.k(a2, n, n2, (mub<? super Float, ? super Float, ? super d86, ? super Integer, vzv>)j, d86, 35840);
        d86.O();
        d86.O();
        return kqw2;
    }
}
