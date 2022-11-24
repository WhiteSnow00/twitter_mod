import android.widget.ImageView;
import com.twitter.media.ui.image.UserImageView;
import android.widget.TextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lt3 extends sl8
{
    public static final lt3.lt3$a Companion;
    public final View G0;
    public final FrescoMediaImageView H0;
    public final TextView I0;
    public final UserImageView J0;
    public final TextView K0;
    public final ImageView L0;
    public final ImageView M0;
    public final TextView N0;
    public final TextView O0;
    
    static {
        Companion = new lt3.lt3$a();
    }
    
    public lt3(View viewById) {
        super(viewById);
        this.G0 = viewById;
        final View viewById2 = viewById.findViewById(2131428166);
        e0e.e((Object)viewById2, "root.findViewById(R.id.c\u2026w_view_channel_thumbnail)");
        this.H0 = (FrescoMediaImageView)viewById2;
        final View viewById3 = viewById.findViewById(2131428167);
        e0e.e((Object)viewById3, "root.findViewById(R.id.c\u2026h_row_view_channel_title)");
        this.I0 = (TextView)viewById3;
        final View viewById4 = viewById.findViewById(2131428168);
        e0e.e((Object)viewById4, "root.findViewById(R.id.c\u2026_row_view_creator_avatar)");
        this.J0 = (UserImageView)viewById4;
        final View viewById5 = viewById.findViewById(2131428169);
        e0e.e((Object)viewById5, "root.findViewById(R.id.c\u2026ch_row_view_creator_name)");
        this.K0 = (TextView)viewById5;
        final View viewById6 = viewById.findViewById(2131428171);
        e0e.e((Object)viewById6, "root.findViewById(R.id.c\u2026row_view_protected_badge)");
        this.L0 = (ImageView)viewById6;
        final View viewById7 = viewById.findViewById(2131428172);
        e0e.e((Object)viewById7, "root.findViewById(R.id.c\u2026_row_view_verified_badge)");
        this.M0 = (ImageView)viewById7;
        final View viewById8 = viewById.findViewById(2131428170);
        e0e.e((Object)viewById8, "root.findViewById(R.id.c\u2026ow_view_creator_username)");
        this.N0 = (TextView)viewById8;
        viewById = viewById.findViewById(2131428165);
        e0e.e((Object)viewById, "root.findViewById(R.id.c\u2026view_channel_description)");
        this.O0 = (TextView)viewById;
    }
}
