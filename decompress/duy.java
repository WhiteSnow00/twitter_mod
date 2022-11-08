import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duy extends jvy
{
    public final /* synthetic */ String G0;
    public final /* synthetic */ omy H0;
    public final /* synthetic */ wxy I0;
    
    public duy(final wxy i0, final String g0, final omy h0) {
        this.I0 = i0;
        this.G0 = g0;
        this.H0 = h0;
        super(i0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        final doy f = this.I0.f;
        Objects.requireNonNull(f, "null reference");
        f.getMaxUserProperties(this.G0, (roy)this.H0);
    }
    
    @Override
    public final void b() {
        this.H0.m((Bundle)null);
    }
}
