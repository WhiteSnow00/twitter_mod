import android.widget.ImageView;
import com.twitter.android.topiccarousel.MediaTileContainerView;
import android.widget.TextView;
import com.twitter.media.ui.image.UserImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gf6 extends j7t
{
    public final View L0;
    public final oxu M0;
    public final UserImageView N0;
    public final TextView O0;
    public final TextView P0;
    public final MediaTileContainerView Q0;
    public final TextView R0;
    public final TextView S0;
    public final TextView T0;
    public final ImageView U0;
    
    public gf6(View viewById, final oxu m0) {
        zzd.f((Object)m0, "tweetViewClickListener");
        super(viewById);
        this.L0 = viewById;
        this.M0 = m0;
        this.N0 = (UserImageView)viewById.findViewById(2131432467);
        this.O0 = (TextView)viewById.findViewById(2131432510);
        this.P0 = (TextView)viewById.findViewById(2131432463);
        this.Q0 = (MediaTileContainerView)viewById.findViewById(2131429983);
        this.R0 = (TextView)viewById.findViewById(2131432463);
        this.S0 = (TextView)viewById.findViewById(2131432510);
        this.T0 = (TextView)viewById.findViewById(2131432058);
        viewById = viewById.findViewById(2131427763);
        zzd.e((Object)viewById, "itemView.findViewById(R.id.badge)");
        this.U0 = (ImageView)viewById;
    }
}
