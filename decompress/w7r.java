// 
// Decompiled by Procyon v0.6.0
// 

public final class w7r implements nna
{
    public final long D0;
    public final nna E0;
    
    public w7r(final long d0, final nna e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void l(final vbp vbp) {
        this.E0.l((vbp)new vbp(this, vbp) {
            public final vbp a;
            public final w7r b;
            
            public final vbp$a d(long a) {
                final vbp$a d = this.a.d(a);
                final xbp a2 = d.a;
                a = a2.a;
                final long b = a2.b;
                final long d2 = this.b.D0;
                final xbp xbp = new xbp(a, b + d2);
                final xbp b2 = d.b;
                return new vbp$a(xbp, new xbp(b2.a, b2.b + d2));
            }
            
            public final boolean f() {
                return this.a.f();
            }
            
            public final long h() {
                return this.a.h();
            }
        });
    }
    
    public final void m() {
        this.E0.m();
    }
    
    public final ewt n(final int n, final int n2) {
        return this.E0.n(n, n2);
    }
}
