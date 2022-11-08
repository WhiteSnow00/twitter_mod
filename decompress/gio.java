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

public final class gio extends RecyclerView$c0 implements c7x
{
    public static final a Companion;
    public RoomUserItem W0;
    public final m29 X0;
    public final m29 Y0;
    public final TypefacesTextView Z0;
    public final TypefacesTextView a1;
    public final UserImageView b1;
    public final FrameLayout c1;
    public final v53 d1;
    public final ImageView e1;
    public final v53 f1;
    public final v53 g1;
    public final v53 h1;
    public final v53 i1;
    
    static {
        Companion = new a();
    }
    
    public gio(final View view) {
        super(view);
        final ConstraintLayout constraintLayout = (ConstraintLayout)view;
        this.X0 = new m29();
        this.Y0 = new m29();
        final View viewById = view.findViewById(2131431142);
        zzd.e((Object)viewById, "itemView.findViewById(R.id.room_user_name)");
        this.Z0 = (TypefacesTextView)viewById;
        final View viewById2 = view.findViewById(2131431148);
        zzd.e((Object)viewById2, "itemView.findViewById(R.id.room_user_status)");
        this.a1 = (TypefacesTextView)viewById2;
        final View viewById3 = view.findViewById(2131431137);
        zzd.e((Object)viewById3, "itemView.findViewById(R.id.room_user_avatar)");
        this.b1 = (UserImageView)viewById3;
        final View viewById4 = view.findViewById(2131431147);
        zzd.e((Object)viewById4, "itemView.findViewById(R.\u2026m_user_request_indicator)");
        this.c1 = (FrameLayout)viewById4;
        this.d1 = new v53((ViewStub)view.findViewById(2131431140));
        final View viewById5 = view.findViewById(2131431146);
        zzd.e((Object)viewById5, "itemView.findViewById(R.\u2026room_user_reaction_image)");
        this.e1 = (ImageView)viewById5;
        this.f1 = new v53((ViewStub)view.findViewById(2131431019));
        final ImageView imageView = (ImageView)view.findViewById(2131431575);
        this.g1 = new v53((ViewStub)view.findViewById(2131431138));
        this.h1 = new v53((ViewStub)view.findViewById(2131431141));
        this.i1 = new v53((ViewStub)view.findViewById(2131431145));
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
    
    public static final class a
    {
    }
}
