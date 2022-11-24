import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajb implements View$OnClickListener
{
    public final bjb F0;
    public final zib G0;
    public final boolean H0;
    
    public ajb(final bjb f0, final zib g0, final boolean h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void onClick(final View view) {
        final bjb f0 = this.F0;
        final zib g0 = this.G0;
        final boolean h0 = this.H0;
        if (!f0.c.a(slq.R0)) {
            final boolean l1 = f0.a.a.L1;
            if (l1) {
                f0.b.a(g0.a.f());
            }
            else {
                f0.b.c(g0.a.f());
            }
            f0.c(h0, l1);
            final bjb$a d = f0.d;
            if (d != null) {
                d.b(l1);
            }
        }
    }
}
