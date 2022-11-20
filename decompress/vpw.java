import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vpw extends hvj
{
    public final hwj I0;
    public final hwj J0;
    public final kpw K0;
    public pd6 L0;
    public final hwj M0;
    public float N0;
    public qq4 O0;
    
    public vpw() {
        Objects.requireNonNull(ddq.Companion);
        this.I0 = (hwj)blz.Q(new ddq(ddq.b));
        this.J0 = (hwj)blz.Q(Boolean.FALSE);
        final kpw k0 = new kpw();
        k0.e = (nsb)new vpw$c(this);
        this.K0 = k0;
        this.M0 = (hwj)blz.Q(Boolean.TRUE);
        this.N0 = 1.0f;
    }
    
    public final boolean b(final float n0) {
        this.N0 = n0;
        return true;
    }
    
    public final boolean e(final qq4 o0) {
        this.O0 = o0;
        return true;
    }
    
    public final long h() {
        return ((ddq)this.I0.getValue()).a;
    }
    
    public final void j(final tc9 tc9) {
        czd.f((Object)tc9, "<this>");
        final kpw k0 = this.K0;
        qq4 o0;
        if ((o0 = this.O0) == null) {
            o0 = (qq4)k0.f.getValue();
        }
        if ((boolean)this.J0.getValue() && tc9.getLayoutDirection() == fve.E0) {
            final long b0 = tc9.B0();
            final mc9 u0 = tc9.u0();
            final long c = u0.c();
            u0.b().p();
            u0.a().e(-1.0f, 1.0f, b0);
            k0.f(tc9, this.N0, o0);
            u0.b().c();
            u0.d(c);
        }
        else {
            k0.f(tc9, this.N0, o0);
        }
        if (this.M0.getValue()) {
            this.M0.setValue((Object)Boolean.FALSE);
        }
    }
    
    public final void k(final String i, final float g, final float h, final ktb<? super Float, ? super Float, ? super x66, ? super Integer, fzv> ktb, final x66 x66, final int n) {
        czd.f((Object)i, "name");
        czd.f((Object)ktb, "content");
        final x66 h2 = x66.h(1264894527);
        final n96$b a = n96.a;
        final kpw k0 = this.K0;
        Objects.requireNonNull(k0);
        final y7c b = k0.b;
        Objects.requireNonNull(b);
        b.i = i;
        ((qnw)b).c();
        final float g2 = k0.g;
        final int n2 = 0;
        if (g2 != g) {
            k0.g = g;
            k0.e();
        }
        int n3 = n2;
        if (k0.h == h) {
            n3 = 1;
        }
        if (n3 == 0) {
            k0.h = h;
            k0.e();
        }
        final qd6 w = wd.w(h2);
        final pd6 l0 = this.L0;
        pd6 a2 = null;
        Label_0193: {
            if (l0 != null) {
                a2 = l0;
                if (!l0.isDisposed()) {
                    break Label_0193;
                }
            }
            a2 = ud6.a((qr0<?>)new jpw((qnw)this.K0.b), w);
        }
        (this.L0 = a2).g((ftb)io7.h(-1916507005, true, (Object)new wpw((ktb)ktb, this)));
        npe.c((Object)a2, (qsb)new vpw$a(a2), h2);
        final lxo j = h2.k();
        if (j != null) {
            j.a((ftb)new vpw$b(this, i, g, h, (ktb)ktb, n));
        }
    }
}
