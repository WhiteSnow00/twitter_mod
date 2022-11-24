// 
// Decompiled by Procyon v0.6.0
// 

public abstract class khk implements drg
{
    public int F0;
    public int G0;
    public long H0;
    public long I0;
    
    public khk() {
        this.H0 = shw.f(0, 0);
        this.I0 = nhk.b;
    }
    
    public int A0() {
        return nud.b(this.H0);
    }
    
    public int F0() {
        return (int)(this.H0 >> 32);
    }
    
    public abstract void G0(final long p0, final float p1, final stb<? super q8c, vzv> p2);
    
    public final void H0() {
        this.F0 = jb2.F((int)(this.H0 >> 32), vj6.j(this.I0), vj6.h(this.I0));
        this.G0 = jb2.F(nud.b(this.H0), vj6.i(this.I0), vj6.g(this.I0));
    }
    
    public final void I0(final long h0) {
        if (!nud.a(this.H0, h0)) {
            this.H0 = h0;
            this.H0();
        }
    }
    
    public final void J0(final long i0) {
        if (!vj6.b(this.I0, i0)) {
            this.I0 = i0;
            this.H0();
        }
    }
    
    public Object m() {
        return null;
    }
    
    public final long z0() {
        final int f0 = this.F0;
        final long h0 = this.H0;
        return kqe.d((f0 - (int)(h0 >> 32)) / 2, (this.G0 - nud.b(h0)) / 2);
    }
}
