import androidx.constraintlayout.widget.Group;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkk extends ste implements qsb<xp2, fzv>
{
    public final hkk D0;
    
    public mkk(final hkk d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xp2 xp2 = (xp2)o;
        czd.f((Object)xp2, "$this$distinct");
        final hkk d0 = this.D0;
        final xp2.d e = xp2.e;
        if (e == xp2.d.E0) {
            if (d0.O0.getVisibility() != 0) {
                final zpa zpa = new zpa();
                ((nzt)zpa).E0 = 100L;
                ((nzt)zpa).F0 = 300L;
                ((nzt)zpa).d(d0.O0);
                final FrescoMediaImageView p = d0.P0;
                if (p != null) {
                    ((nzt)zpa).d((View)p);
                }
                final View d2 = d0.D0;
                czd.d((Object)d2, "null cannot be cast to non-null type android.view.ViewGroup");
                i0u.a((ViewGroup)d2, (nzt)zpa);
                final FrescoMediaImageView p2 = d0.P0;
                if (p2 != null) {
                    ((View)p2).setVisibility(0);
                }
                d0.O0.setVisibility(0);
            }
        }
        else if (d0.O0.getVisibility() != 8) {
            final zpa zpa2 = new zpa();
            ((nzt)zpa2).d(d0.O0);
            final FrescoMediaImageView p3 = d0.P0;
            if (p3 != null) {
                ((nzt)zpa2).d((View)p3);
            }
            final FrescoMediaImageView q0 = d0.Q0;
            if (q0 != null) {
                ((nzt)zpa2).d((View)q0);
            }
            ((nzt)zpa2).E0 = 200L;
            ((nzt)zpa2).F0 = 300L;
            final View d3 = d0.D0;
            czd.d((Object)d3, "null cannot be cast to non-null type android.view.ViewGroup");
            i0u.a((ViewGroup)d3, (nzt)zpa2);
            final FrescoMediaImageView p4 = d0.P0;
            if (p4 != null) {
                ((View)p4).setVisibility(8);
            }
            d0.O0.setVisibility(8);
            final FrescoMediaImageView q2 = d0.Q0;
            if (q2 != null) {
                ((View)q2).setVisibility(8);
            }
        }
        final Group r0 = d0.R0;
        int visibility;
        if (e == xp2.d.D0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        r0.setVisibility(visibility);
        if (e == xp2.d.F0) {
            ((View)d0.K0).setVisibility(0);
            if (d0.b1 == 0L) {
                d0.b1 = SystemClock.elapsedRealtime();
            }
        }
        else {
            ((View)d0.K0).setVisibility(8);
        }
        return fzv.a;
    }
}
