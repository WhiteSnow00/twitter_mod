import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import com.twitter.media.ui.image.MediaImageView;
import com.twitter.ui.user.ProfileCardView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcp extends el8
{
    public final TextView D0;
    public final TextView E0;
    public final ProfileCardView F0;
    public final MediaImageView G0;
    public final View H0;
    public final w92 I0;
    
    public lcp(final LayoutInflater layoutInflater) {
        final View inflate = layoutInflater.inflate(2131625077, (ViewGroup)null);
        super(inflate);
        this.F0 = (ProfileCardView)inflate.findViewById(2131430722);
        this.G0 = (MediaImageView)inflate.findViewById(2131427782);
        this.H0 = inflate.findViewById(2131427786);
        this.D0 = (TextView)inflate.findViewById(2131430695);
        this.E0 = (TextView)inflate.findViewById(2131431295);
        this.I0 = new w92(inflate);
        inflate.findViewById(2131432467).setOnClickListener((View$OnClickListener)ywf.H0);
    }
    
    public final void l0(final boolean b) {
        ((kqt)this.I0).m0(b);
    }
}
