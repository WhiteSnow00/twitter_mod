import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.FrameLayout;
import com.twitter.media.ui.image.UserImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.rooms.model.helpers.RoomUserItem;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vio extends RecyclerView$c0 implements v7x
{
    public static final vio.vio$a Companion;
    public RoomUserItem X0;
    public final w19 Y0;
    public final w19 Z0;
    public final TypefacesTextView a1;
    public final TypefacesTextView b1;
    public final UserImageView c1;
    public final FrameLayout d1;
    public final v2c e1;
    public final ImageView f1;
    public final v2c g1;
    public final v2c h1;
    public final v2c i1;
    public final v2c j1;
    
    static {
        Companion = new vio.vio$a();
    }
    
    public vio(final View view) {
        super(view);
        final ConstraintLayout constraintLayout = (ConstraintLayout)view;
        this.Y0 = new w19();
        this.Z0 = new w19();
        final View viewById = view.findViewById(2131431144);
        czd.e((Object)viewById, "itemView.findViewById(R.id.room_user_name)");
        this.a1 = (TypefacesTextView)viewById;
        final View viewById2 = view.findViewById(2131431150);
        czd.e((Object)viewById2, "itemView.findViewById(R.id.room_user_status)");
        this.b1 = (TypefacesTextView)viewById2;
        final View viewById3 = view.findViewById(2131431139);
        czd.e((Object)viewById3, "itemView.findViewById(R.id.room_user_avatar)");
        this.c1 = (UserImageView)viewById3;
        final View viewById4 = view.findViewById(2131431149);
        czd.e((Object)viewById4, "itemView.findViewById(R.\u2026m_user_request_indicator)");
        this.d1 = (FrameLayout)viewById4;
        this.e1 = new v2c((ViewStub)view.findViewById(2131431142));
        final View viewById5 = view.findViewById(2131431148);
        czd.e((Object)viewById5, "itemView.findViewById(R.\u2026room_user_reaction_image)");
        this.f1 = (ImageView)viewById5;
        this.g1 = new v2c((ViewStub)view.findViewById(2131431021));
        final ImageView imageView = (ImageView)view.findViewById(2131431578);
        this.h1 = new v2c((ViewStub)view.findViewById(2131431140));
        this.i1 = new v2c((ViewStub)view.findViewById(2131431143));
        this.j1 = new v2c((ViewStub)view.findViewById(2131431147));
    }
    
    public final View getHeldView() {
        final View d0 = super.D0;
        czd.e((Object)d0, "itemView");
        return d0;
    }
}
