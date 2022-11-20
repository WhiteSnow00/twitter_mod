import android.view.View;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wob extends h0u
{
    public final Object D0;
    public final ArrayList E0;
    public final Object F0;
    public final ArrayList G0;
    public final Object H0;
    public final ArrayList I0;
    public final vob J0;
    
    public wob(final vob j0, final Object d0, final ArrayList e0, final Object h0, final ArrayList i0) {
        this.J0 = j0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = null;
        this.G0 = null;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void d(final nzt nzt) {
        nzt.F((nzt.e)this);
    }
    
    public final void e() {
        final Object d0 = this.D0;
        if (d0 != null) {
            this.J0.t(d0, this.E0, null);
        }
        final Object f0 = this.F0;
        if (f0 != null) {
            this.J0.t(f0, this.G0, null);
        }
        final Object h0 = this.H0;
        if (h0 != null) {
            this.J0.t(h0, this.I0, null);
        }
    }
}
