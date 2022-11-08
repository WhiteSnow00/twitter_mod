import android.view.ViewStub;
import android.view.View;
import com.twitter.ui.widget.TintableImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import com.twitter.media.ui.image.UserImageView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ger extends RecyclerView$c0 implements c7x
{
    public final UserImageView W0;
    public final TypefacesTextView X0;
    public final TypefacesTextView Y0;
    public final TypefacesTextView Z0;
    public final UserImageView a1;
    public final TypefacesTextView b1;
    public final TintableImageView c1;
    public final v53 d1;
    
    public ger(final View view) {
        super(view);
        final View viewById = view.findViewById(2131430717);
        zzd.e((Object)viewById, "view.findViewById(R.id.profile_avatar)");
        this.W0 = (UserImageView)viewById;
        final View viewById2 = view.findViewById(2131429480);
        zzd.e((Object)viewById2, "view.findViewById(R.id.host_name)");
        this.X0 = (TypefacesTextView)viewById2;
        final View viewById3 = view.findViewById(2131431536);
        zzd.e((Object)viewById3, "view.findViewById(R.id.space_name)");
        this.Y0 = (TypefacesTextView)viewById3;
        final View viewById4 = view.findViewById(2131431539);
        zzd.e((Object)viewById4, "view.findViewById(R.id.space_start_time)");
        this.Z0 = (TypefacesTextView)viewById4;
        final View viewById5 = view.findViewById(2131429784);
        zzd.e((Object)viewById5, "view.findViewById(R.id.listener_avatar)");
        this.a1 = (UserImageView)viewById5;
        final View viewById6 = view.findViewById(2131432424);
        zzd.e((Object)viewById6, "view.findViewById(R.id.upcoming_going)");
        this.b1 = (TypefacesTextView)viewById6;
        final View viewById7 = view.findViewById(2131431372);
        zzd.e((Object)viewById7, "view.findViewById(R.id.set_reminder)");
        this.c1 = (TintableImageView)viewById7;
        this.d1 = new v53((ViewStub)view.findViewById(2131432524));
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
}
