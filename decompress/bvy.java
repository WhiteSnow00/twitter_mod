import android.os.RemoteException;
import java.util.Objects;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvy extends jvy
{
    public final /* synthetic */ Long G0;
    public final /* synthetic */ String H0;
    public final /* synthetic */ String I0;
    public final /* synthetic */ Bundle J0;
    public final /* synthetic */ boolean K0;
    public final /* synthetic */ boolean L0;
    public final /* synthetic */ wxy M0;
    
    public bvy(final wxy m0, final String h0, final String i0, final Bundle j0) {
        this.M0 = m0;
        this.G0 = null;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = true;
        this.L0 = true;
        super(m0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final Long g0 = this.G0;
        long n;
        if (g0 == null) {
            n = super.C0;
        }
        else {
            n = g0;
        }
        final doy f = this.M0.f;
        Objects.requireNonNull(f, "null reference");
        f.logEvent(this.H0, this.I0, this.J0, this.K0, this.L0, n);
    }
}
