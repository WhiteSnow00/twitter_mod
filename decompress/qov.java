import java.util.List;
import java.util.Objects;
import android.app.Dialog;
import android.content.DialogInterface;
import com.twitter.app.common.timeline.cover.URTCoverController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qov extends a
{
    public final pov D0;
    public final URTCoverController E0;
    
    public qov(final URTCoverController e0, final pov d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    @Override
    public final void R0(final DialogInterface dialogInterface, final int n) {
        final URTCoverController e0 = this.E0;
        e0.a = null;
        e0.b = null;
    }
    
    @Override
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n2 != -2) {
            if (n2 == -1) {
                URTCoverController.a(this.E0, (DialogInterface)dialog, this.D0.a(), true);
            }
        }
        else {
            final URTCoverController e0 = this.E0;
            final rov b = this.D0.b();
            jee.l((Object)b);
            URTCoverController.a(e0, (DialogInterface)dialog, b, false);
        }
    }
    
    @Override
    public final void s0(final DialogInterface dialogInterface, final int n) {
        final URTCoverController e0 = this.E0;
        final pov d0 = this.D0;
        Objects.requireNonNull(e0);
        if (d0 instanceof gpv) {
            final dpv g = ((gpv)d0).g;
            if (g != null) {
                e0.b((List)g.a);
            }
        }
        else if (d0 instanceof npv) {
            final dpv h = ((npv)d0).h;
            if (h != null) {
                e0.b((List)h.a);
            }
        }
        e0.c(e0.c, (String)null, "dismiss");
    }
}
