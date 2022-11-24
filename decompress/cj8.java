// 
// Decompiled by Procyon v0.6.0
// 

public final class cj8 implements wqg
{
    public final jzd F0;
    public final int G0;
    public final int H0;
    
    public cj8(final jzd f0, final int g0, final int h0) {
        e0e.f((Object)f0, "measurable");
        mqb.n(g0, "minMax");
        mqb.n(h0, "widthHeight");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final int H(final int n) {
        return this.F0.H(n);
    }
    
    public final int K(final int n) {
        return this.F0.K(n);
    }
    
    @Override
    public final khk W(final long n) {
        if (this.H0 == 1) {
            int n2;
            if (this.G0 == 2) {
                n2 = this.F0.K(vj6.g(n));
            }
            else {
                n2 = this.F0.H(vj6.g(n));
            }
            return (khk)new y1b(n2, vj6.g(n));
        }
        int n3;
        if (this.G0 == 2) {
            n3 = this.F0.e(vj6.h(n));
        }
        else {
            n3 = this.F0.x(vj6.h(n));
        }
        return (khk)new y1b(vj6.h(n), n3);
    }
    
    public final int e(final int n) {
        return this.F0.e(n);
    }
    
    public final Object m() {
        return this.F0.m();
    }
    
    public final int x(final int n) {
        return this.F0.x(n);
    }
}
