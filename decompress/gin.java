import android.view.View;
import com.twitter.media.ui.image.UserImageView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gin extends RecyclerView$c0 implements c7x
{
    public final UserImageView W0;
    
    public gin(View viewById) {
        super(viewById);
        viewById = viewById.findViewById(2131427735);
        zzd.e((Object)viewById, "view.findViewById(R.id.avatar)");
        this.W0 = (UserImageView)viewById;
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
}
