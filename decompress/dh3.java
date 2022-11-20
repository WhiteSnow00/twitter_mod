// 
// Decompiled by Procyon v0.6.0
// 

public final class dh3 extends fo1<Boolean>
{
    public boolean E0;
    public z3u F0;
    public long G0;
    public final eh3 H0;
    
    public dh3(final eh3 h0) {
        this.H0 = h0;
        this.F0 = z3u.D0;
    }
    
    public final void b() {
        this.H0.I1(false);
        final eh3 h0 = this.H0;
        h0.I0.Y3();
        h0.K0.c();
        h0.O0.c();
        this.F0 = z3u.D0;
        this.G0 = 0L;
        this.E0 = false;
        this.H0.K0.h();
    }
    
    public final void onNext(final Object o) {
        if (o) {
            final m4s a = hq1.a;
            this.G0 = System.currentTimeMillis();
            this.E0 = false;
            this.F0 = z3u.E0;
            this.H0.O0.a();
            this.H0.X0.h();
            final eh3 h0 = this.H0;
            h0.Z0.b(h0.I0.K0().n(this.H0.b1).r((oj)new ifc(this, 11), (lj6)new ydm((Object)this, 24)));
        }
        else if (this.H0.I0.A()) {
            final m4s a2 = hq1.a;
            final long n = System.currentTimeMillis() - this.G0;
            if (n > 300L) {
                this.E0 = true;
                if (z3u.f(this.F0)) {
                    this.H0.F1(n);
                }
                else {
                    this.H0.K0.d();
                }
            }
            else {
                this.F0 = z3u.D0;
                this.G0 = 0L;
                this.E0 = false;
                m1f.e().c(2131952368, 0);
                this.H0.K0.d();
            }
        }
    }
}
