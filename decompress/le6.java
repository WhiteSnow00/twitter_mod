import android.widget.ImageView;
import com.twitter.android.topiccarousel.MediaTileContainerView;
import android.widget.TextView;
import com.twitter.media.ui.image.UserImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class le6 extends b8t
{
    public final View M0;
    public final iyu N0;
    public final UserImageView O0;
    public final TextView P0;
    public final TextView Q0;
    public final MediaTileContainerView R0;
    public final TextView S0;
    public final TextView T0;
    public final TextView U0;
    public final ImageView V0;
    
    public le6(View viewById, final iyu n0) {
        czd.f((Object)n0, "tweetViewClickListener");
        super(viewById);
        this.M0 = viewById;
        this.N0 = n0;
        this.O0 = (UserImageView)viewById.findViewById(2131432470);
        this.P0 = (TextView)viewById.findViewById(2131432513);
        this.Q0 = (TextView)viewById.findViewById(2131432466);
        this.R0 = (MediaTileContainerView)viewById.findViewById(2131429985);
        this.S0 = (TextView)viewById.findViewById(2131432466);
        this.T0 = (TextView)viewById.findViewById(2131432513);
        this.U0 = (TextView)viewById.findViewById(2131432061);
        viewById = viewById.findViewById(2131427763);
        czd.e((Object)viewById, "itemView.findViewById(R.id.badge)");
        this.V0 = (ImageView)viewById;
    }
}
