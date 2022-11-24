import android.os.BaseBundle;
import android.os.RemoteException;
import java.util.Objects;
import android.app.Activity;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxy extends uwy
{
    public final Bundle J0;
    public final Activity K0;
    public final fzy L0;
    
    public gxy(final fzy l0, final Bundle j0, final Activity k0) {
        this.L0 = l0;
        this.J0 = j0;
        this.K0 = k0;
        super(l0.F0, true);
    }
    
    @Override
    public final void a() throws RemoteException {
        Bundle bundle2;
        if (this.J0 != null) {
            final Bundle bundle = bundle2 = new Bundle();
            if (((BaseBundle)this.J0).containsKey("com.google.app_measurement.screen_service")) {
                final Object value = ((BaseBundle)this.J0).get("com.google.app_measurement.screen_service");
                bundle2 = bundle;
                if (value instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle)value);
                    bundle2 = bundle;
                }
            }
        }
        else {
            bundle2 = null;
        }
        final npy f = this.L0.F0.f;
        Objects.requireNonNull(f, "null reference");
        f.onActivityCreated((l3d)new p5j(this.K0), bundle2, super.G0);
    }
}
