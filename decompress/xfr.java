import android.view.ViewStub;
import android.view.View;
import com.twitter.ui.widget.TintableImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.media.ui.image.UserImageView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xfr extends RecyclerView$c0 implements n8x
{
    public final UserImageView Z0;
    public final TypefacesTextView a1;
    public final TypefacesTextView b1;
    public final TypefacesTextView c1;
    public final UserImageView d1;
    public final TypefacesTextView e1;
    public final TintableImageView f1;
    public final x3c g1;
    
    public xfr(final View view) {
        super(view);
        final View viewById = view.findViewById(2131430720);
        e0e.e((Object)viewById, "view.findViewById(R.id.profile_avatar)");
        this.Z0 = (UserImageView)viewById;
        final View viewById2 = view.findViewById(2131429481);
        e0e.e((Object)viewById2, "view.findViewById(R.id.host_name)");
        this.a1 = (TypefacesTextView)viewById2;
        final View viewById3 = view.findViewById(2131431540);
        e0e.e((Object)viewById3, "view.findViewById(R.id.space_name)");
        this.b1 = (TypefacesTextView)viewById3;
        final View viewById4 = view.findViewById(2131431543);
        e0e.e((Object)viewById4, "view.findViewById(R.id.space_start_time)");
        this.c1 = (TypefacesTextView)viewById4;
        final View viewById5 = view.findViewById(2131429785);
        e0e.e((Object)viewById5, "view.findViewById(R.id.listener_avatar)");
        this.d1 = (UserImageView)viewById5;
        final View viewById6 = view.findViewById(2131432428);
        e0e.e((Object)viewById6, "view.findViewById(R.id.upcoming_going)");
        this.e1 = (TypefacesTextView)viewById6;
        final View viewById7 = view.findViewById(2131431375);
        e0e.e((Object)viewById7, "view.findViewById(R.id.set_reminder)");
        this.f1 = (TintableImageView)viewById7;
        this.g1 = new x3c((ViewStub)view.findViewById(2131432528));
    }
    
    public final View getHeldView() {
        final View f0 = super.F0;
        e0e.e((Object)f0, "itemView");
        return f0;
    }
}
