import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bty extends uwy
{
    public final String J0;
    public final jzy K0;
    
    public bty(final jzy k0, final String j0) {
        this.K0 = k0;
        this.J0 = j0;
        super(k0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final npy f = this.K0.f;
        Objects.requireNonNull(f, "null reference");
        f.endAdUnitExposure(this.J0, super.G0);
    }
}
