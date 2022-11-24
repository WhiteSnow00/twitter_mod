import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pvy extends uwy
{
    public final String J0;
    public final yny K0;
    public final jzy L0;
    
    public pvy(final jzy l0, final String j0, final yny k0) {
        this.L0 = l0;
        this.J0 = j0;
        this.K0 = k0;
        super(l0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final npy f = this.L0.f;
        Objects.requireNonNull(f, "null reference");
        f.getMaxUserProperties(this.J0, (aqy)this.K0);
    }
    
    @Override
    public final void b() {
        this.K0.m(null);
    }
}
