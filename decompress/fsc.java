// 
// Decompiled by Procyon v0.6.0
// 

public final class fsc implements sfa
{
    public cdi C0;
    public final iw0 D0;
    
    public fsc(final iw0 d0) {
        this.D0 = d0;
    }
    
    public final void a(final xrc xrc) {
        synchronized ("HttpOperationNARCLogger") {
            pf8.r(this.C0);
            this.C0.c();
        }
    }
    
    public final void d(final xrc xrc) {
        synchronized ("HttpOperationNARCLogger") {
            rzh.b((cd)(this.C0 = new cdi(xrc, this.D0)));
        }
    }
}
