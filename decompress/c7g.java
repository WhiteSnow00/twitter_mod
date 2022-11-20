import java.util.concurrent.Callable;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c7g implements z6g, jf1$a
{
    public final jf1 D0;
    public final i7g E0;
    public final g7g F0;
    public final y5g G0;
    public final hd3 H0;
    public final gwo I0;
    public final nnl<ynj<p6g>> J0;
    public final wc6 K0;
    public boolean L0;
    public boolean M0;
    
    public c7g(final jf1 d0, final g7g f0, final i7g e0, final y5g g0, final hd3 h0, final gwo i0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (nnl<ynj<p6g>>)new nnl();
        this.K0 = new wc6();
    }
    
    public final boolean Q0() {
        return this.F0.P2();
    }
    
    public final void bind() {
        this.K0.e();
        final wc6 k0 = this.K0;
        final t19 subscribe = this.F0.s().subscribe((lj6)new a7g(this, 0));
        final t19 subscribe2 = this.F0.v2().subscribe((lj6)new hd1((Object)this, 20));
        final t19 subscribe3 = this.F0.i4().subscribe((lj6)new hoa(this, 19));
        final t19 subscribe4 = this.F0.P1().subscribe((lj6)new vgd(this, 19));
        final h5j map = this.F0.A1().map((psb)hvt.G0);
        final g7g f0 = this.F0;
        Objects.requireNonNull(f0);
        final t19 subscribe5 = map.subscribe((lj6)new kds((Object)f0, 18));
        final t19 subscribe6 = this.E0.c().observeOn(this.I0).subscribe((lj6)new a7g(this, 1));
        final nnl<ynj<p6g>> j0 = this.J0;
        final g7g f2 = this.F0;
        Objects.requireNonNull(f2);
        final t19 subscribe7 = ((h5j)j0).subscribe((lj6)new iag(f2, 19));
        final h5j skipWhile = ((h5j)this.J0).skipWhile((ytk)z61.T0);
        final hd3 h0 = this.H0;
        Objects.requireNonNull(h0);
        k0.d(new t19[] { subscribe, subscribe2, subscribe3, subscribe4, subscribe5, subscribe6, subscribe7, skipWhile.subscribe((lj6)new z0p((Object)h0, 26)), this.s1().filter((ytk)c71.N0).subscribe((lj6)new a1p((Object)this, 21)), this.s1().filter((ytk)a71.Q0).subscribe((lj6)new y0p((Object)this, 20)) });
        this.F0.y4();
        final g7g f3 = this.F0;
        final ynj b = ynj.b;
        final int a = c5j.a;
        f3.p(b);
        if (!this.G0.c()) {
            this.L0 = true;
        }
        this.D0.a((jf1.jf1$a)this);
    }
    
    public final h5j<Boolean> s1() {
        return (h5j<Boolean>)this.F0.A1().map((psb)fjc.I0).distinctUntilChanged();
    }
    
    public final void unbind() {
        this.K0.dispose();
        this.D0.b((jf1.jf1$a)this);
    }
    
    public final kog<ynj<p6g>> w4(final ynj<p6g> ynj) {
        if (!this.G0.c()) {
            this.G0.a();
            final sy5 b = this.G0.b();
            final tog tog = new tog((Callable)new b7g((Object)this, (Object)ynj, 0));
            Objects.requireNonNull(b);
            return (kog<ynj<p6g>>)new vog((ppg)tog, (rz5)b);
        }
        if (this.M0) {
            ((y8x)this.E0).a();
            this.M0 = false;
            this.F0.y4();
        }
        this.F0.p((ynj)ynj);
        this.F0.O();
        return (kog<ynj<p6g>>)kog.e((npg)new rrx((Object)this, 12)).m(this.I0);
    }
}
