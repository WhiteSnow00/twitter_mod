import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ea4 extends hvj
{
    public final hwj I0;
    public final hwj J0;
    public final hwj K0;
    public final hwj L0;
    public final hwj M0;
    public final hwj N0;
    public final hwj O0;
    public final hwj P0;
    public final n4s Q0;
    public final hwj R0;
    public final hwj S0;
    public final hwj T0;
    
    public ea4() {
        Objects.requireNonNull(nq4.Companion);
        this.I0 = (hwj)blz.Q(new nq4(nq4.g));
        this.J0 = (hwj)blz.Q(1.0f);
        final float n = 0;
        this.K0 = (hwj)blz.Q(new m89(n));
        this.L0 = (hwj)blz.Q(new m89((float)5));
        this.M0 = (hwj)blz.Q(Boolean.FALSE);
        this.N0 = (hwj)blz.Q(new m89(n));
        this.O0 = (hwj)blz.Q(new m89(n));
        this.P0 = (hwj)blz.Q(1.0f);
        this.Q0 = (n4s)pps.n((nsb)ea4$a.D0);
        this.R0 = (hwj)blz.Q(0.0f);
        this.S0 = (hwj)blz.Q(0.0f);
        this.T0 = (hwj)blz.Q(0.0f);
    }
    
    public final boolean b(final float n) {
        this.J0.setValue((Object)n);
        return true;
    }
    
    public final long h() {
        Objects.requireNonNull(ddq.Companion);
        return ddq.c;
    }
    
    public final void j(final tc9 tc9) {
        czd.f((Object)tc9, "<this>");
        final float n = this.n();
        final long b0 = tc9.B0();
        final mc9 u0 = tc9.u0();
        final long c = u0.c();
        u0.b().p();
        u0.a().f(n, b0);
        final float n2 = ((lo8)tc9).t0(this.o()) / 2.0f + ((lo8)tc9).t0(((m89)this.K0.getValue()).D0);
        final float n3 = wfj.d(oj7.j(tc9.c())) - n2;
        final float n4 = wfj.e(oj7.j(tc9.c())) - n2;
        final float d = wfj.d(oj7.j(tc9.c()));
        final float e = wfj.e(oj7.j(tc9.c()));
        final float floatValue = ((Number)this.R0.getValue()).floatValue();
        final float n5 = this.n();
        final float n6 = 360;
        final float n7 = (n5 + floatValue) * n6;
        final float n8 = (this.n() + ((Number)this.S0.getValue()).floatValue()) * n6 - n7;
        final long a = ((nq4)this.I0.getValue()).a;
        final float floatValue2 = ((Number)this.J0.getValue()).floatValue();
        final long a2 = wj1.a(n3, n4);
        final float n9 = d + n2 - n3;
        final float n10 = e + n2 - n4;
        final long d2 = oj7.d(n9, n10);
        final float t0 = ((lo8)tc9).t0(this.o());
        Objects.requireNonNull(jlr.Companion);
        sc9.b(tc9, a, n7, n8, false, a2, d2, floatValue2, (nbu)new ilr(t0, 0.0f, 2, 0, 26), (qq4)null, 0, 768, (Object)null);
        if (this.M0.getValue()) {
            this.k().c();
            this.k().a(0.0f, 0.0f);
            this.k().d(this.l() * ((lo8)tc9).t0(this.m()), 0.0f);
            this.k().d(this.l() * ((lo8)tc9).t0(this.m()) / 2, this.l() * ((lo8)tc9).t0(((m89)this.O0.getValue()).D0));
            final float n11 = Math.min(n9, n10) / 2.0f;
            final float n12 = this.l() * ((lo8)tc9).t0(this.m()) / 2.0f;
            final lzj k = this.k();
            final float n13 = n9 / 2.0f + n3;
            final float n14 = n10 / 2.0f + n4;
            k.j(wj1.a(wfj.d(wj1.a(n13, n14)) + n11 - n12, ((lo8)tc9).t0(this.o()) / 2.0f + wfj.e(wj1.a(n13, n14))));
            this.k().close();
            final long b2 = tc9.B0();
            final mc9 u2 = tc9.u0();
            final long c2 = u2.c();
            u2.b().p();
            u2.a().f(n7 + n8, b2);
            sc9.h(tc9, this.k(), ((nq4)this.I0.getValue()).a, ((Number)this.J0.getValue()).floatValue(), (nbu)null, (qq4)null, 0, 56, (Object)null);
            u2.b().c();
            u2.d(c2);
        }
        u0.b().c();
        u0.d(c);
    }
    
    public final lzj k() {
        return (lzj)this.Q0.getValue();
    }
    
    public final float l() {
        return ((Number)this.P0.getValue()).floatValue();
    }
    
    public final float m() {
        return ((m89)this.N0.getValue()).D0;
    }
    
    public final float n() {
        return ((Number)this.T0.getValue()).floatValue();
    }
    
    public final float o() {
        return ((m89)this.L0.getValue()).D0;
    }
}
