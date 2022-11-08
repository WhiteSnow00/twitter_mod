import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oj0 extends gue implements gub<m76, Integer, oyv>
{
    public final /* synthetic */ jub<ilo, m76, Integer, oyv> C0;
    public final /* synthetic */ int D0;
    
    public oj0(final jub<? super ilo, ? super m76, ? super Integer, oyv> c0, final int d0) {
        this.C0 = (jub<ilo, m76, Integer, oyv>)c0;
        this.D0 = d0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final m76 m76 = (m76)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && m76.i()) {
            m76.H();
        }
        else {
            final ea6$b a = ea6.a;
            final jkh f = tcq.f(jkh.Companion);
            final ks0 a2 = ks0.a;
            final ks0$c c = ks0.c;
            Objects.requireNonNull(dx.Companion);
            final gw1$b l = dx$a.l;
            final jub<ilo, m76, Integer, oyv> c2 = this.C0;
            final int n = (this.D0 & 0x1C00) | 0x1B6;
            m76.x(693286680);
            final gqg a3 = glo.a((ks0$d)c, (dx$c)l, m76);
            m76.x(-1323940314);
            final dp8 dp8 = (dp8)m76.m((re6)te6.e);
            final tve tve = (tve)m76.m((re6)te6.k);
            final z5x z5x = (z5x)m76.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a4 = cwe.a(f);
            final int n2 = ((n << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(m76.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            m76.E();
            if (m76.f()) {
                m76.A((otb)b);
            }
            else {
                m76.o();
            }
            m76.F();
            r9x.v(m76, (Object)a3, (gub)f76.a.e);
            r9x.v(m76, (Object)dp8, (gub)f76.a.d);
            r9x.v(m76, (Object)tve, (gub)f76.a.f);
            ((j36)a4).h0((Object)hvl.b(m76, z5x, f76.a.g, m76), (Object)m76, (Object)(n2 >> 3 & 0x70));
            m76.x(2058660585);
            m76.x(-678309503);
            if ((n2 >> 9 & 0xE & 0xB) == 0x2 && m76.i()) {
                m76.H();
            }
            else {
                c2.h0((Object)jlo.a, (Object)m76, (Object)((n >> 6 & 0x70) | 0x6));
            }
            dia.u(m76);
        }
        return oyv.a;
    }
}
