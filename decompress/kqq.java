import android.view.View;
import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.media.ui.image.UserImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqq extends ste implements qsb<vrq, fzv>
{
    public final zpq D0;
    
    public kqq(final zpq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vrq vrq = (vrq)o;
        czd.f((Object)vrq, "$this$distinct");
        final String l = vrq.l;
        final int n = 0;
        final boolean b = l != null && vrq.m != null;
        if (b) {
            this.D0.L0.L(vrq.m);
            ((TextView)this.D0.M0).setText((CharSequence)vrq.l);
        }
        final UserImageView l2 = this.D0.L0;
        czd.e((Object)l2, "speakerAvatar");
        final boolean b2 = b ^ true;
        int visibility;
        if (b2) {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        ((View)l2).setVisibility(visibility);
        final TypefacesTextView m0 = this.D0.M0;
        czd.e((Object)m0, "speakerUsername");
        int visibility2 = n;
        if (b2) {
            visibility2 = 4;
        }
        ((View)m0).setVisibility(visibility2);
        return fzv.a;
    }
}
