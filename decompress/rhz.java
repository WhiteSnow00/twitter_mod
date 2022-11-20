// 
// Decompiled by Procyon v0.6.0
// 

public final class rhz implements Runnable
{
    public final sgz D0;
    public final long E0;
    public final whz F0;
    
    public rhz(final whz f0, final sgz d0, final long e0) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        this.F0.m(this.D0, false, this.E0);
        final whz f0 = this.F0;
        f0.H0 = null;
        final glz z = ((pbz)f0).D0.z();
        ((axy)z).g();
        z.h();
        z.t((Runnable)new wkz((Object)z, (Object)null, 2, (da8)null));
    }
}
