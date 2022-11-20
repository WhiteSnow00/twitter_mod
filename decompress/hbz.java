// 
// Decompiled by Procyon v0.6.0
// 

public final class hbz implements Runnable
{
    public final String D0;
    public final String E0;
    public final String F0;
    public final long G0;
    public final lbz H0;
    
    public hbz(final lbz h0, final String d0, final String e0, final String f0, final long g0) {
        this.H0 = h0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        wvz.c();
        if (this.H0.a.K().t(null, uzy.r0)) {
            final String d0 = this.D0;
            if (d0 == null) {
                this.H0.a.q(this.E0, (sgz)null);
                return;
            }
            this.H0.a.q(this.E0, new sgz(this.F0, d0, this.G0));
        }
        else {
            if (this.D0 == null) {
                this.H0.a.O0.y().q(this.E0);
                return;
            }
            final whz y = this.H0.a.O0.y();
            final String e0 = this.E0;
            ((axy)y).g();
            synchronized (y) {
                final String p0 = y.P0;
                if (p0 != null) {
                    p0.equals(e0);
                }
                y.P0 = e0;
            }
        }
    }
}
