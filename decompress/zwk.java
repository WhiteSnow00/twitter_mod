// 
// Decompiled by Procyon v0.6.0
// 

public final class zwk implements ywk, lo8
{
    public final lo8 D0;
    public boolean E0;
    public boolean F0;
    public final wxh G0;
    
    public zwk(final lo8 d0) {
        czd.f((Object)d0, "density");
        this.D0 = d0;
        this.G0 = new wxh(false);
    }
    
    public final long C(final float n) {
        return this.D0.C(n);
    }
    
    public final long C0(final long n) {
        return this.D0.C0(n);
    }
    
    public final long D(final long n) {
        return this.D0.D(n);
    }
    
    public final Object F(final go6<? super Boolean> go6) {
        zwk$a zwk$a2 = null;
        Label_0047: {
            if (go6 instanceof zwk$a) {
                final zwk$a zwk$a = (zwk$a)go6;
                final int g0 = zwk$a.G0;
                if ((g0 & Integer.MIN_VALUE) != 0x0) {
                    zwk$a.G0 = g0 + Integer.MIN_VALUE;
                    zwk$a2 = zwk$a;
                    break Label_0047;
                }
            }
            zwk$a2 = new zwk$a(this, (go6)go6);
        }
        final Object e0 = zwk$a2.E0;
        final dy6 d0 = dy6.D0;
        final int g2 = zwk$a2.G0;
        zwk d2;
        if (g2 != 0) {
            if (g2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d2 = zwk$a2.D0;
            b1n.u(e0);
        }
        else {
            b1n.u(e0);
            if (!this.E0 && !this.F0) {
                final wxh g3 = this.G0;
                zwk$a2.D0 = this;
                zwk$a2.G0 = 1;
                if (g3.b((Object)null, (go6)zwk$a2) == d0) {
                    return d0;
                }
            }
            d2 = this;
        }
        return d2.E0;
    }
    
    public final int S(final float n) {
        return this.D0.S(n);
    }
    
    public final float V(final long n) {
        return this.D0.V(n);
    }
    
    public final void d() {
        this.F0 = true;
        this.G0.a((Object)null);
    }
    
    public final void e() {
        this.E0 = true;
        this.G0.a((Object)null);
    }
    
    public final void f() {
        this.G0.c((Object)null);
        this.E0 = false;
        this.F0 = false;
    }
    
    public final float getDensity() {
        return this.D0.getDensity();
    }
    
    public final float m0(final int n) {
        return this.D0.m0(n);
    }
    
    public final float n0(final float n) {
        return this.D0.n0(n);
    }
    
    public final float p0() {
        return this.D0.p0();
    }
    
    public final float t0(final float n) {
        return this.D0.t0(n);
    }
    
    public final int w0(final long n) {
        return this.D0.w0(n);
    }
}
