import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class euy extends xvy
{
    public final String H0;
    public final Object I0;
    public final kyy J0;
    
    public euy(final kyy j0, final Object i0) {
        this.J0 = j0;
        this.H0 = "Error with data collection. Data lost.";
        this.I0 = i0;
        super(j0, false);
    }
    
    public final void a() throws RemoteException {
        final qoy f = this.J0.f;
        Objects.requireNonNull(f, "null reference");
        f.logHealthData(5, this.H0, (l2d)new d5j(this.I0), (l2d)new d5j((Object)null), (l2d)new d5j((Object)null));
    }
}
