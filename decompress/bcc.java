import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcc implements acc
{
    public final acc D0;
    public final z9a E0;
    
    public bcc(final acc d0, final z9a e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final xba<lmd> A0() {
        return this.a(this.D0.A0());
    }
    
    @Override
    public final xba<y6k> D() {
        return this.a(this.D0.D());
    }
    
    @Override
    public final xba<of1> J() {
        return this.a(this.D0.J());
    }
    
    public final <T> xba<T> a(final xba<T> xba) {
        final yba yba = new yba(this.E0, true);
        rp9.O(xba.v0(), (yaa)yba);
        return (xba<T>)yba;
    }
    
    @Override
    public final xba<Configuration> u() {
        return this.a(this.D0.u());
    }
    
    @Override
    public final xba<bo> z() {
        return this.a(this.D0.z());
    }
}
