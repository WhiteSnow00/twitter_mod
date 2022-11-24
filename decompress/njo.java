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

public final class njo extends RecyclerView$c0 implements n8x
{
    public static final njo.njo$a Companion;
    public RoomUserItem Z0;
    public final e39 a1;
    public final e39 b1;
    public final TypefacesTextView c1;
    public final TypefacesTextView d1;
    public final UserImageView e1;
    public final FrameLayout f1;
    public final x3c g1;
    public final ImageView h1;
    public final x3c i1;
    public final x3c j1;
    public final x3c k1;
    public final x3c l1;
    
    static {
        Companion = new njo.njo$a();
    }
    
    public njo(final View view) {
        super(view);
        final ConstraintLayout constraintLayout = (ConstraintLayout)view;
        this.a1 = new e39();
        this.b1 = new e39();
        final View viewById = view.findViewById(2131431145);
        e0e.e((Object)viewById, "itemView.findViewById(R.id.room_user_name)");
        this.c1 = (TypefacesTextView)viewById;
        final View viewById2 = view.findViewById(2131431151);
        e0e.e((Object)viewById2, "itemView.findViewById(R.id.room_user_status)");
        this.d1 = (TypefacesTextView)viewById2;
        final View viewById3 = view.findViewById(2131431140);
        e0e.e((Object)viewById3, "itemView.findViewById(R.id.room_user_avatar)");
        this.e1 = (UserImageView)viewById3;
        final View viewById4 = view.findViewById(2131431150);
        e0e.e((Object)viewById4, "itemView.findViewById(R.\u2026m_user_request_indicator)");
        this.f1 = (FrameLayout)viewById4;
        this.g1 = new x3c((ViewStub)view.findViewById(2131431143));
        final View viewById5 = view.findViewById(2131431149);
        e0e.e((Object)viewById5, "itemView.findViewById(R.\u2026room_user_reaction_image)");
        this.h1 = (ImageView)viewById5;
        this.i1 = new x3c((ViewStub)view.findViewById(2131431022));
        final ImageView imageView = (ImageView)view.findViewById(2131431579);
        this.j1 = new x3c((ViewStub)view.findViewById(2131431141));
        this.k1 = new x3c((ViewStub)view.findViewById(2131431144));
        this.l1 = new x3c((ViewStub)view.findViewById(2131431148));
    }
    
    public final View getHeldView() {
        final View f0 = super.F0;
        e0e.e((Object)f0, "itemView");
        return f0;
    }
}
