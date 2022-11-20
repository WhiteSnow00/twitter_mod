// 
// Decompiled by Procyon v0.6.0
// 

public final class drf extends fo1<vwf>
{
    public final boolean E0;
    public final erf F0;
    
    public drf(final erf f0, final boolean e0) {
        this.F0 = f0;
        this.E0 = e0;
    }
    
    public final void onError(final Throwable t) {
        m8a.d(t);
        this.F0.g.V0(this.E0);
    }
    
    public final void onNext(final Object o) {
        final vwf vwf = (vwf)o;
        erf.a(this.F0, vwf);
        this.F0.g.V0(vwf.a());
    }
}
