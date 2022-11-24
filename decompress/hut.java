import android.view.View;
import androidx.recyclerview.widget.RecyclerView$m;
import com.twitter.onboarding.ocf.topicselector.SmoothScrollLayoutManager;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.media.ui.image.BadgeableImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hut extends sl8
{
    public final ba2 G0;
    public final srt H0;
    public final BadgeableImageView I0;
    public final RecyclerView J0;
    
    public hut(final LayoutInflater layoutInflater) {
        final View inflate = layoutInflater.inflate(2131625108, (ViewGroup)null);
        super(inflate);
        this.G0 = new ba2(inflate);
        this.I0 = (BadgeableImageView)inflate.findViewById(2131428134);
        (this.J0 = (RecyclerView)inflate.findViewById(2131432202)).setLayoutManager((RecyclerView$m)new SmoothScrollLayoutManager(inflate.getContext(), true));
        this.H0 = new srt(inflate.findViewById(2131431275));
    }
    
    public final void l0(final int badgeNumber) {
        this.I0.setBadgeNumber(badgeNumber);
        ((View)this.I0).setEnabled(badgeNumber != 0);
        final BadgeableImageView i0 = this.I0;
        float alpha;
        if (((View)i0).isEnabled()) {
            alpha = 1.0f;
        }
        else {
            alpha = 0.3f;
        }
        ((View)i0).setAlpha(alpha);
    }
}
