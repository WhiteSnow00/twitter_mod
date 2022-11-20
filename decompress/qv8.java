import android.os.Bundle;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qv8 implements pv8
{
    public final p D0;
    public final String E0;
    public pv8 F0;
    public wk1 G0;
    
    public qv8(final p d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        final wk1 g0 = (wk1)d0.H(e0);
        this.G0 = g0;
        if (g0 != null) {
            g0.U1 = (xv8)this;
            final int a = c5j.a;
            g0.R1 = (uv8)this;
            g0.S1 = (vv8)this;
            g0.T1 = (wv8)this;
        }
    }
    
    public final void R0(final DialogInterface dialogInterface, final int n) {
        final pv8 f0 = this.F0;
        if (f0 != null) {
            ((wv8)f0).R0(dialogInterface, n);
        }
        this.G0 = null;
    }
    
    public final void a(final wk1 g0) {
        if (this.G0 == null) {
            this.G0 = g0;
            g0.U1 = (xv8)this;
            final int a = c5j.a;
            g0.R1 = (uv8)this;
            g0.S1 = (vv8)this;
            g0.T1 = (wv8)this;
            g0.e2(this.D0, this.E0);
        }
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        final pv8 f0 = this.F0;
        if (f0 != null) {
            ((xv8)f0).k0(dialog, n, n2);
        }
    }
    
    public final void q0(final Dialog dialog, final int n, final Bundle bundle) {
        final pv8 f0 = this.F0;
        if (f0 != null) {
            ((vv8)f0).q0(dialog, n, bundle);
        }
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        final pv8 f0 = this.F0;
        if (f0 != null) {
            ((uv8)f0).s0(dialogInterface, n);
        }
    }
}
