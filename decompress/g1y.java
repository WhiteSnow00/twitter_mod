import android.os.Handler;
import java.util.Objects;
import com.google.android.gms.common.api.internal.LifecycleCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g1y extends h5y
{
    public final ys0<sf0<?>> I0;
    public final r4c J0;
    
    public g1y(final vaf vaf, final r4c j0) {
        final p4c e = p4c.e;
        super(vaf);
        this.I0 = (ys0<sf0<?>>)new ys0(0);
        this.J0 = j0;
        vaf.a("ConnectionlessLifecycleHelper", (LifecycleCallback)this);
    }
    
    public final void f() {
        if (!this.I0.isEmpty()) {
            this.J0.b(this);
        }
    }
    
    public final void h() {
        super.E0 = true;
        if (!this.I0.isEmpty()) {
            this.J0.b(this);
        }
    }
    
    public final void i() {
        super.E0 = false;
        final r4c j0 = this.J0;
        Objects.requireNonNull(j0);
        synchronized (r4c.U0) {
            if (j0.N0 == this) {
                j0.N0 = null;
                j0.O0.clear();
            }
        }
    }
    
    public final void k(final vg6 vg6, final int n) {
        this.J0.i(vg6, n);
    }
    
    public final void l() {
        final j5y q0 = this.J0.Q0;
        ((Handler)q0).sendMessage(((Handler)q0).obtainMessage(3));
    }
}
