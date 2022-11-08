import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p2p extends gue implements jub<jkh, m76, Integer, jkh>
{
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ v2p E0;
    public final /* synthetic */ boolean F0;
    public final /* synthetic */ z6b G0;
    
    public p2p(final boolean d0, final v2p e0, final boolean f0, final z6b g0) {
        this.C0 = true;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(3);
    }
    
    public final Object h0(Object d, Object y, final Object o) {
        final jkh jkh = (jkh)d;
        final m76 m76 = (m76)y;
        lf.x((Number)o, jkh, "$this$composed", m76, 1478351300);
        final ea6$b a = ea6.a;
        final qqj r = r9i.r(m76);
        m76.x(773894976);
        m76.x(-492369756);
        y = m76.y();
        Objects.requireNonNull(m76.Companion);
        d = y;
        if (y == m76$a.b) {
            d = rb0.d(jgw.A(m76), m76);
        }
        m76.O();
        final yy6 c0 = ((ue6)d).C0;
        m76.O();
        final jkh.a companion = jkh.Companion;
        final jkh k = x3j.K((jkh)companion, false, (rtb)new o2p(this.D0, this.C0, this.F0, this.E0, c0));
        ioj ioj;
        if (this.C0) {
            ioj = ioj.C0;
        }
        else {
            ioj = ioj.D0;
        }
        final boolean s = r9i.s((tve)m76.m((re6)te6.k), ioj, this.D0);
        final v2p e0 = this.E0;
        final jkh e2 = j78.A(hi4.a(k, ioj), r).E(g3p.b((jkh)companion, (n3p)e0, ioj, r, this.F0, s, this.G0, (oth)e0.b)).E((jkh)new v3p(this.E0, this.D0, this.C0, r));
        m76.O();
        return e2;
    }
}
