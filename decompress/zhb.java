import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zhb implements View$OnClickListener
{
    public final aib D0;
    public final yhb E0;
    public final boolean F0;
    
    public zhb(final aib d0, final yhb e0, final boolean f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        final aib d0 = this.D0;
        final yhb e0 = this.E0;
        final boolean f0 = this.F0;
        if (!d0.c.a(vkq.P0)) {
            final boolean j1 = d0.a.a.J1;
            if (j1) {
                d0.b.a(e0.a.f());
            }
            else {
                d0.b.b(e0.a.f());
            }
            d0.c(f0, j1);
            final aib.a d2 = d0.d;
            if (d2 != null) {
                d2.a(j1);
            }
        }
    }
}
