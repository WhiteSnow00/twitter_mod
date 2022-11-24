// 
// Decompiled by Procyon v0.6.0
// 

public final class qxk implements pxk, rp8
{
    public final rp8 F0;
    public boolean G0;
    public boolean H0;
    public final nyh I0;
    
    public qxk(final rp8 f0) {
        e0e.f((Object)f0, "density");
        this.F0 = f0;
        this.I0 = new nyh(false);
    }
    
    public final long C(final float n) {
        return this.F0.C(n);
    }
    
    public final long C0(final long n) {
        return this.F0.C0(n);
    }
    
    public final long D(final long n) {
        return this.F0.D(n);
    }
    
    @Override
    public final Object F(final mp6<? super Boolean> mp6) {
        qxk$a qxk$a2 = null;
        Label_0047: {
            if (mp6 instanceof qxk$a) {
                final qxk$a qxk$a = (qxk$a)mp6;
                final int i0 = qxk$a.I0;
                if ((i0 & Integer.MIN_VALUE) != 0x0) {
                    qxk$a.I0 = i0 + Integer.MIN_VALUE;
                    qxk$a2 = qxk$a;
                    break Label_0047;
                }
            }
            qxk$a2 = new qxk$a(this, (mp6)mp6);
        }
        final Object g0 = qxk$a2.G0;
        final jz6 f0 = jz6.F0;
        final int i2 = qxk$a2.I0;
        qxk f2;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = qxk$a2.F0;
            jb2.M0(g0);
        }
        else {
            jb2.M0(g0);
            if (!this.G0 && !this.H0) {
                final nyh i3 = this.I0;
                qxk$a2.F0 = this;
                qxk$a2.I0 = 1;
                if (i3.b((Object)null, (mp6)qxk$a2) == f0) {
                    return f0;
                }
            }
            f2 = this;
        }
        return f2.G0;
    }
    
    public final int S(final float n) {
        return this.F0.S(n);
    }
    
    public final float V(final long n) {
        return this.F0.V(n);
    }
    
    public final void d() {
        this.H0 = true;
        this.I0.a((Object)null);
    }
    
    public final void e() {
        this.G0 = true;
        this.I0.a((Object)null);
    }
    
    public final void f() {
        this.I0.c((Object)null);
        this.G0 = false;
        this.H0 = false;
    }
    
    public final float getDensity() {
        return this.F0.getDensity();
    }
    
    public final float m0(final int n) {
        return this.F0.m0(n);
    }
    
    public final float n0(final float n) {
        return this.F0.n0(n);
    }
    
    public final float p0() {
        return this.F0.p0();
    }
    
    public final float t0(final float n) {
        return this.F0.t0(n);
    }
    
    public final int w0(final long n) {
        return this.F0.w0(n);
    }
}
