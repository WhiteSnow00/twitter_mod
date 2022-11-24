// 
// Decompiled by Procyon v0.6.0
// 

public final class u8r implements voa
{
    public final long F0;
    public final voa G0;
    
    public u8r(final long f0, final voa g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void l(final qcp qcp) {
        this.G0.l((qcp)new qcp(this, qcp) {
            public final qcp a;
            public final u8r b;
            
            public final qcp$a d(long f0) {
                final qcp$a d = this.a.d(f0);
                final scp a = d.a;
                final long a2 = a.a;
                final long b = a.b;
                f0 = this.b.F0;
                final scp scp = new scp(a2, b + f0);
                final scp b2 = d.b;
                return new qcp$a(scp, new scp(b2.a, b2.b + f0));
            }
            
            public final boolean f() {
                return this.a.f();
            }
            
            public final long h() {
                return this.a.h();
            }
        });
    }
    
    public final void p() {
        this.G0.p();
    }
    
    public final vwt r(final int n, final int n2) {
        return this.G0.r(n, n2);
    }
}
