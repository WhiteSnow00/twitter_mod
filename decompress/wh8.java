// 
// Decompiled by Procyon v0.6.0
// 

public final class wh8 implements cqg
{
    public final hyd D0;
    public final int E0;
    public final int F0;
    
    public wh8(final hyd d0, final int e0, final int f0) {
        czd.f((Object)d0, "measurable");
        da8.m(e0, "minMax");
        da8.m(f0, "widthHeight");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final int H(final int n) {
        return this.D0.H(n);
    }
    
    public final int K(final int n) {
        return this.D0.K(n);
    }
    
    public final wgk W(final long n) {
        if (this.F0 == 1) {
            int n2;
            if (this.E0 == 2) {
                n2 = this.D0.K(pi6.g(n));
            }
            else {
                n2 = this.D0.H(pi6.g(n));
            }
            return new w0b(n2, pi6.g(n));
        }
        int n3;
        if (this.E0 == 2) {
            n3 = this.D0.e(pi6.h(n));
        }
        else {
            n3 = this.D0.x(pi6.h(n));
        }
        return new w0b(pi6.h(n), n3);
    }
    
    public final int e(final int n) {
        return this.D0.e(n);
    }
    
    public final Object m() {
        return this.D0.m();
    }
    
    public final int x(final int n) {
        return this.D0.x(n);
    }
}
