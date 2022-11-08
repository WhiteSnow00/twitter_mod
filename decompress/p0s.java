import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p0s extends gue implements jub<Boolean, m76, Integer, oyv>
{
    public final /* synthetic */ q0s C0;
    public final /* synthetic */ long D0;
    public final /* synthetic */ int E0;
    public final /* synthetic */ ab4 F0;
    
    public p0s(final q0s c0, final long d0, final int e0, final ab4 f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final boolean booleanValue = (boolean)o;
        final m76 m76 = (m76)o2;
        int intValue;
        final int n = intValue = ((Number)o3).intValue();
        if ((n & 0xE) == 0x0) {
            int n2;
            if (m76.a(booleanValue)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            intValue = (n | n2);
        }
        if ((intValue & 0x5B) == 0x12 && m76.i()) {
            m76.H();
        }
        else {
            final ea6$b a = ea6.a;
            final jkh.a companion = jkh.Companion;
            final jkh g = tcq.g(companion);
            Objects.requireNonNull(dx.Companion);
            final gw1 f = dx$a.f;
            final q0s c0 = this.C0;
            final long d0 = this.D0;
            final int e0 = this.E0;
            final ab4 f2 = this.F0;
            final gqg q = b8b.q(m76, 733328855, f, false, m76, -1323940314);
            final dp8 dp8 = (dp8)m76.m((re6)te6.e);
            final tve tve = (tve)m76.m((re6)te6.k);
            final z5x z5x = (z5x)m76.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a2 = cwe.a(g);
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
            r9x.v(m76, (Object)q, (gub)f76.a.e);
            r9x.v(m76, (Object)dp8, (gub)f76.a.d);
            r9x.v(m76, (Object)tve, (gub)f76.a.f);
            ((j36)a2).h0((Object)hvl.b(m76, z5x, f76.a.g, m76), (Object)m76, (Object)0);
            m76.x(2058660585);
            m76.x(-2137368960);
            if (booleanValue) {
                m76.x(-1527193899);
                final float b2 = c0.b;
                final float c2 = c0.c;
                dhl.b(tcq.m(companion, (b2 + c2) * 2), d0, c2, m76, e0 >> 18 & 0x70, 0);
                m76.O();
            }
            else {
                m76.x(-1527193561);
                n7d.a((cvj)f2, "Refreshing", (jkh)null, (dx)null, (ym6)null, 0.0f, (sr4)null, m76, 56, 124);
                m76.O();
            }
            dia.u(m76);
        }
        return oyv.a;
    }
}
