import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vch extends RecyclerView$c0 implements c7x
{
    public final FrescoMediaImageView W0;
    public final TextView X0;
    public final TextView Y0;
    public final TextView Z0;
    public final TextView a1;
    public final TextView b1;
    public final ConstraintLayout c1;
    
    public vch(View viewById) {
        super(viewById);
        final View viewById2 = viewById.findViewById(2131430067);
        zzd.e((Object)viewById2, "view.findViewById(R.id.mobile_app_icon)");
        this.W0 = (FrescoMediaImageView)viewById2;
        final View viewById3 = viewById.findViewById(2131430073);
        zzd.e((Object)viewById3, "view.findViewById(R.id.mobile_app_name_text)");
        this.X0 = (TextView)viewById3;
        final View viewById4 = viewById.findViewById(2131430078);
        zzd.e((Object)viewById4, "view.findViewById(R.id.mobile_app_subtitle_text)");
        this.Y0 = (TextView)viewById4;
        final View viewById5 = viewById.findViewById(2131430075);
        zzd.e((Object)viewById5, "view.findViewById(R.id.m\u2026pp_primary_category_text)");
        this.Z0 = (TextView)viewById5;
        final View viewById6 = viewById.findViewById(2131430076);
        zzd.e((Object)viewById6, "view.findViewById(R.id.mobile_app_rating_text)");
        this.a1 = (TextView)viewById6;
        final View viewById7 = viewById.findViewById(2131430074);
        zzd.e((Object)viewById7, "view.findViewById(R.id.mobile_app_price_text)");
        this.b1 = (TextView)viewById7;
        viewById = viewById.findViewById(2131430069);
        zzd.e((Object)viewById, "view.findViewById(R.id.mobile_app_item_layout)");
        this.c1 = (ConstraintLayout)viewById;
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
}
