import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public class dxs extends j1d<cxs>
{
    public final ieg<Integer, cxs> G0;
    public final Cursor H0;
    public final boolean I0;
    
    public dxs(final Cursor h0, final w87<? extends cxs> w87, final int n) {
        super(h0, (w87)w87);
        ieg g0;
        if (n > 0) {
            g0 = new ieg(n);
        }
        else {
            g0 = null;
        }
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = io7.e(h0);
    }
    
    public final void i() {
        ((gzt)this).E0.close();
        final ieg<Integer, cxs> g0 = this.G0;
        if (g0 != null) {
            g0.i(-1);
        }
    }
    
    public Object m(final int n) {
        final ieg<Integer, cxs> g0 = this.G0;
        Object o;
        if (g0 != null) {
            if ((o = g0.c(n)) == null) {
                final Object m = super.m(n);
                if ((o = m) != null) {
                    this.G0.d(n, (cxs)m);
                    o = m;
                }
            }
        }
        else {
            o = super.m(n);
        }
        return o;
    }
    
    public final boolean p() {
        final Cursor h0 = this.H0;
        return h0 != null && !h0.isClosed();
    }
}
