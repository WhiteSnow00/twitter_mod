import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvy extends uwy
{
    public final String J0;
    public final Object K0;
    public final jzy L0;
    
    public dvy(final jzy l0, final Object k0) {
        this.L0 = l0;
        this.J0 = "Error with data collection. Data lost.";
        this.K0 = k0;
        super(l0, false);
    }
    
    @Override
    public final void a() throws RemoteException {
        final npy f = this.L0.f;
        Objects.requireNonNull(f, "null reference");
        f.logHealthData(5, this.J0, (l3d)new p5j(this.K0), (l3d)new p5j(null), (l3d)new p5j(null));
    }
}
