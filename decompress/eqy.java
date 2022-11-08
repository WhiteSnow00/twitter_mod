import android.os.RemoteException;
import java.util.Objects;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eqy extends jvy
{
    public final /* synthetic */ String G0;
    public final /* synthetic */ String H0;
    public final /* synthetic */ Bundle I0;
    public final /* synthetic */ wxy J0;
    
    public eqy(final wxy j0, final String g0, final String h0, final Bundle i0) {
        this.J0 = j0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(j0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final doy f = this.J0.f;
        Objects.requireNonNull(f, "null reference");
        f.clearConditionalUserProperty(this.G0, this.H0, this.I0);
    }
}
