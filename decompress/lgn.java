import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgn extends gue implements rtb<ihn, oyv>
{
    public final /* synthetic */ yfn C0;
    
    public lgn(final yfn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ihn ihn = (ihn)o;
        zzd.f((Object)ihn, "$this$distinct");
        final TypefacesTextView t0 = this.C0.T0;
        zzd.e((Object)t0, "playButton");
        final boolean d = ihn.d;
        int visibility = 8;
        int visibility2;
        if (d) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)t0).setVisibility(visibility2);
        final View u0 = this.C0.U0;
        zzd.e((Object)u0, "analyticsButton");
        int visibility3;
        if (ihn.e) {
            visibility3 = 0;
        }
        else {
            visibility3 = 8;
        }
        u0.setVisibility(visibility3);
        final ConstraintLayout v0 = this.C0.V0;
        zzd.e((Object)v0, "buttonContainer");
        if (ihn.d || ihn.e) {
            visibility = 0;
        }
        ((View)v0).setVisibility(visibility);
        return oyv.a;
    }
}
