import androidx.constraintlayout.widget.Group;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkk extends gue implements rtb<gq2, oyv>
{
    public final /* synthetic */ bkk C0;
    
    public gkk(final bkk c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gq2 gq2 = (gq2)o;
        zzd.f((Object)gq2, "$this$distinct");
        final bkk c0 = this.C0;
        final gq2.d e = gq2.e;
        if (e == gq2.d.D0) {
            if (c0.N0.getVisibility() != 0) {
                final cra cra = new cra();
                ((xyt)cra).D0 = 100L;
                ((xyt)cra).E0 = 300L;
                ((xyt)cra).d(c0.N0);
                final FrescoMediaImageView o2 = c0.O0;
                if (o2 != null) {
                    ((xyt)cra).d((View)o2);
                }
                final View c2 = c0.C0;
                zzd.d((Object)c2, "null cannot be cast to non-null type android.view.ViewGroup");
                szt.a((ViewGroup)c2, (xyt)cra);
                final FrescoMediaImageView o3 = c0.O0;
                if (o3 != null) {
                    ((View)o3).setVisibility(0);
                }
                c0.N0.setVisibility(0);
            }
        }
        else if (c0.N0.getVisibility() != 8) {
            final cra cra2 = new cra();
            ((xyt)cra2).d(c0.N0);
            final FrescoMediaImageView o4 = c0.O0;
            if (o4 != null) {
                ((xyt)cra2).d((View)o4);
            }
            final FrescoMediaImageView p = c0.P0;
            if (p != null) {
                ((xyt)cra2).d((View)p);
            }
            ((xyt)cra2).D0 = 200L;
            ((xyt)cra2).E0 = 300L;
            final View c3 = c0.C0;
            zzd.d((Object)c3, "null cannot be cast to non-null type android.view.ViewGroup");
            szt.a((ViewGroup)c3, (xyt)cra2);
            final FrescoMediaImageView o5 = c0.O0;
            if (o5 != null) {
                ((View)o5).setVisibility(8);
            }
            c0.N0.setVisibility(8);
            final FrescoMediaImageView p2 = c0.P0;
            if (p2 != null) {
                ((View)p2).setVisibility(8);
            }
        }
        final Group q0 = c0.Q0;
        int visibility;
        if (e == gq2.d.C0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        q0.setVisibility(visibility);
        if (e == gq2.d.E0) {
            ((View)c0.J0).setVisibility(0);
            if (c0.a1 == 0L) {
                c0.a1 = SystemClock.elapsedRealtime();
            }
        }
        else {
            ((View)c0.J0).setVisibility(8);
        }
        return oyv.a;
    }
}
