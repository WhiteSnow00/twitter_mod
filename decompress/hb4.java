import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hb4 extends wvj
{
    public final wwj K0;
    public final wwj L0;
    public final wwj M0;
    public final wwj N0;
    public final wwj O0;
    public final wwj P0;
    public final wwj Q0;
    public final wwj R0;
    public final h5s S0;
    public final wwj T0;
    public final wwj U0;
    public final wwj V0;
    
    public hb4() {
        Objects.requireNonNull(sr4.Companion);
        this.K0 = (wwj)zzz.W((Object)new sr4(sr4.g));
        this.L0 = (wwj)zzz.W((Object)1.0f);
        final float n = 0;
        this.M0 = (wwj)zzz.W((Object)new s99(n));
        this.N0 = (wwj)zzz.W((Object)new s99(5));
        this.O0 = (wwj)zzz.W((Object)Boolean.FALSE);
        this.P0 = (wwj)zzz.W((Object)new s99(n));
        this.Q0 = (wwj)zzz.W((Object)new s99(n));
        this.R0 = (wwj)zzz.W((Object)1.0f);
        this.S0 = (h5s)jty.N((ptb)hb4$a.F0);
        this.T0 = (wwj)zzz.W((Object)0.0f);
        this.U0 = (wwj)zzz.W((Object)0.0f);
        this.V0 = (wwj)zzz.W((Object)0.0f);
    }
    
    public final boolean b(final float n) {
        ((cjq<Float>)this.L0).setValue(Float.valueOf(n));
        return true;
    }
    
    public final long h() {
        Objects.requireNonNull(aeq.Companion);
        return aeq.c;
    }
    
    public final void j(final wd9 wd9) {
        e0e.f((Object)wd9, "<this>");
        final float n = this.n();
        final long b0 = wd9.B0();
        final pd9 u0 = wd9.u0();
        final long c = u0.c();
        u0.b().p();
        u0.a().f(n, b0);
        final float n2 = ((rp8)wd9).t0(this.o()) / 2.0f + ((rp8)wd9).t0(((cjq<s99>)this.M0).getValue().F0);
        final float n3 = kgj.d(jty.C(wd9.c())) - n2;
        final float n4 = kgj.e(jty.C(wd9.c())) - n2;
        final float d = kgj.d(jty.C(wd9.c()));
        final float e = kgj.e(jty.C(wd9.c()));
        final float floatValue = ((cjq<Number>)this.T0).getValue().floatValue();
        final float n5 = this.n();
        final float n6 = 360;
        final float n7 = (n5 + floatValue) * n6;
        final float n8 = (this.n() + ((cjq<Number>)this.U0).getValue().floatValue()) * n6 - n7;
        final long a = ((cjq<sr4>)this.K0).getValue().a;
        final float floatValue2 = ((cjq<Number>)this.L0).getValue().floatValue();
        final long e2 = kqe.e(n3, n4);
        final float n9 = d + n2 - n3;
        final float n10 = e + n2 - n4;
        final long g = jty.g(n9, n10);
        final float t0 = ((rp8)wd9).t0(this.o());
        Objects.requireNonNull(gmr.Companion);
        vd9.b(wd9, a, n7, n8, false, e2, g, floatValue2, new fmr(t0, 0.0f, 2, 0, 26), null, 0, 768, null);
        if (((cjq<Boolean>)this.O0).getValue()) {
            this.k().b();
            this.k().a(0.0f, 0.0f);
            this.k().d(this.l() * ((rp8)wd9).t0(this.m()), 0.0f);
            this.k().d(this.l() * ((rp8)wd9).t0(this.m()) / 2, this.l() * ((rp8)wd9).t0(((cjq<s99>)this.Q0).getValue().F0));
            final float n11 = Math.min(n9, n10) / 2.0f;
            final float n12 = this.l() * ((rp8)wd9).t0(this.m()) / 2.0f;
            final c0k k = this.k();
            final float n13 = n9 / 2.0f + n3;
            final float n14 = n10 / 2.0f + n4;
            k.j(kqe.e(kgj.d(kqe.e(n13, n14)) + n11 - n12, ((rp8)wd9).t0(this.o()) / 2.0f + kgj.e(kqe.e(n13, n14))));
            this.k().close();
            final long b2 = wd9.B0();
            final pd9 u2 = wd9.u0();
            final long c2 = u2.c();
            u2.b().p();
            u2.a().f(n7 + n8, b2);
            vd9.h(wd9, this.k(), ((cjq<sr4>)this.K0).getValue().a, ((cjq<Number>)this.L0).getValue().floatValue(), null, null, 0, 56, null);
            u2.b().c();
            u2.d(c2);
        }
        u0.b().c();
        u0.d(c);
    }
    
    public final c0k k() {
        return (c0k)this.S0.getValue();
    }
    
    public final float l() {
        return ((cjq<Number>)this.R0).getValue().floatValue();
    }
    
    public final float m() {
        return ((cjq<s99>)this.P0).getValue().F0;
    }
    
    public final float n() {
        return ((cjq<Number>)this.V0).getValue().floatValue();
    }
    
    public final float o() {
        return ((cjq<s99>)this.N0).getValue().F0;
    }
}
