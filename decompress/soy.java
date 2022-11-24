import android.os.Bundle;
import java.util.Objects;
import com.google.android.gms.common.api.internal.LifecycleCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class soy implements Runnable
{
    public final LifecycleCallback F0;
    public final String G0;
    public final rty H0;
    
    public soy(final rty h0, final LifecycleCallback f0, final String g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        final rty h0 = this.H0;
        if (h0.D1 > 0) {
            final LifecycleCallback f0 = this.F0;
            final Bundle e1 = h0.E1;
            Bundle bundle;
            if (e1 != null) {
                bundle = e1.getBundle(this.G0);
            }
            else {
                bundle = null;
            }
            f0.e(bundle);
        }
        if (this.H0.D1 >= 2) {
            this.F0.h();
        }
        if (this.H0.D1 >= 3) {
            this.F0.f();
        }
        if (this.H0.D1 >= 4) {
            this.F0.i();
        }
        if (this.H0.D1 >= 5) {
            Objects.requireNonNull(this.F0);
        }
    }
}
