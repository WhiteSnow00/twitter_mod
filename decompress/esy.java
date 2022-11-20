import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esy extends xvy
{
    public final String H0;
    public final kyy I0;
    
    public esy(final kyy i0, final String h0) {
        this.I0 = i0;
        this.H0 = h0;
        super(i0, true);
    }
    
    public final void a() throws RemoteException {
        final qoy f = this.I0.f;
        Objects.requireNonNull(f, "null reference");
        f.endAdUnitExposure(this.H0, super.E0);
    }
}
