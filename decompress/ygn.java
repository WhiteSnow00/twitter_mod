import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ygn extends ste implements qsb<whn, fzv>
{
    public final lgn D0;
    
    public ygn(final lgn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final whn whn = (whn)o;
        czd.f((Object)whn, "$this$distinct");
        final TypefacesTextView u0 = this.D0.U0;
        czd.e((Object)u0, "playButton");
        final boolean d = whn.d;
        int visibility = 8;
        int visibility2;
        if (d) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)u0).setVisibility(visibility2);
        final View v0 = this.D0.V0;
        czd.e((Object)v0, "analyticsButton");
        int visibility3;
        if (whn.e) {
            visibility3 = 0;
        }
        else {
            visibility3 = 8;
        }
        v0.setVisibility(visibility3);
        final ConstraintLayout w0 = this.D0.W0;
        czd.e((Object)w0, "buttonContainer");
        if (whn.d || whn.e) {
            visibility = 0;
        }
        ((View)w0).setVisibility(visibility);
        return fzv.a;
    }
}
