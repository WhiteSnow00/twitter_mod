import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public class ows extends d2d<nws>
{
    public final seg<Integer, nws> F0;
    public final Cursor G0;
    public final boolean H0;
    
    public ows(final Cursor g0, final s97<? extends nws> s97, final int n) {
        super(g0, (s97)s97);
        seg f0;
        if (n > 0) {
            f0 = new seg(n);
        }
        else {
            f0 = null;
        }
        this.F0 = (seg<Integer, nws>)f0;
        this.G0 = g0;
        this.H0 = mlw.d(g0);
    }
    
    public final void i() {
        ((qyt)this).D0.close();
        final seg<Integer, nws> f0 = this.F0;
        if (f0 != null) {
            f0.i(-1);
        }
    }
    
    public Object m(final int n) {
        final seg<Integer, nws> f0 = this.F0;
        Object o;
        if (f0 != null) {
            if ((o = f0.c((Object)n)) == null) {
                final Object m = super.m(n);
                if ((o = m) != null) {
                    this.F0.d((Object)n, m);
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
        final Cursor g0 = this.G0;
        return g0 != null && !g0.isClosed();
    }
}
