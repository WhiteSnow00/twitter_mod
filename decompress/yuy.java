import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yuy extends uwy
{
    public final String J0;
    public final String K0;
    public final boolean L0;
    public final yny M0;
    public final jzy N0;
    
    public yuy(final jzy n0, final String j0, final String k0, final boolean l0, final yny m0) {
        this.N0 = n0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        super(n0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final npy f = this.N0.f;
        Objects.requireNonNull(f, "null reference");
        f.getUserProperties(this.J0, this.K0, this.L0, (aqy)this.M0);
    }
    
    @Override
    public final void b() {
        this.M0.m(null);
    }
}
