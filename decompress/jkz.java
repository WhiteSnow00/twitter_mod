// 
// Decompiled by Procyon v0.6.0
// 

public final class jkz implements Runnable
{
    public final sxz F0;
    public final boolean G0;
    public final rhy H0;
    public final fmz I0;
    
    public jkz(final fmz i0, final sxz f0, final boolean g0, final rhy h0) {
        this.I0 = i0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        final fmz i0 = this.I0;
        final g1z i2 = i0.I0;
        if (i2 == null) {
            ((ocz)i0).F0.b().K0.a("Discarding data. Failed to send event to service");
            return;
        }
        iuk.C((Object)this.F0);
        final fmz i3 = this.I0;
        sd h0;
        if (this.G0) {
            h0 = null;
        }
        else {
            h0 = this.H0;
        }
        i3.k(i2, h0, this.F0);
        this.I0.s();
    }
}
