import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pty extends jvy
{
    public final /* synthetic */ String G0;
    public final /* synthetic */ String H0;
    public final /* synthetic */ boolean I0;
    public final /* synthetic */ omy J0;
    public final /* synthetic */ wxy K0;
    
    public pty(final wxy k0, final String g0, final String h0, final boolean i0, final omy j0) {
        this.K0 = k0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super(k0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final doy f = this.K0.f;
        Objects.requireNonNull(f, "null reference");
        f.getUserProperties(this.G0, this.H0, this.I0, (roy)this.J0);
    }
    
    @Override
    public final void b() {
        this.J0.m((Bundle)null);
    }
}
