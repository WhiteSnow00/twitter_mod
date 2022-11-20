import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxy implements Runnable
{
    public final ara D0;
    public final List E0;
    public final List F0;
    public final List G0;
    public final long H0;
    
    public gxy(final ara d0, final List e0, final List f0, final List g0, final long h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        final ara d0 = this.D0;
        final List e0 = this.E0;
        final List f0 = this.F0;
        final List g0 = this.G0;
        final long h0 = this.H0;
        if (d0.n.get()) {
            d0.m(6, -6, (Long)null, (Long)null, (List)null, (Integer)null, (List)null);
        }
        else if (d0.i.b() != null) {
            d0.k(e0, f0, g0, h0, false);
        }
        else {
            d0.l(f0, g0, h0);
        }
    }
}
