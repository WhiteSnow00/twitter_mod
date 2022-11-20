import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ruy extends xvy
{
    public final String H0;
    public final eny I0;
    public final kyy J0;
    
    public ruy(final kyy j0, final String h0, final eny i0) {
        this.J0 = j0;
        this.H0 = h0;
        this.I0 = i0;
        super(j0, true);
    }
    
    public final void a() throws RemoteException {
        final qoy f = this.J0.f;
        Objects.requireNonNull(f, "null reference");
        f.getMaxUserProperties(this.H0, (epy)this.I0);
    }
    
    public final void b() {
        this.I0.m(null);
    }
}
