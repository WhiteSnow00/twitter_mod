import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u0i extends RecyclerView$c0 implements c7x
{
    public final TypefacesTextView W0;
    public final TypefacesTextView X0;
    public final FrescoMediaImageView Y0;
    public final RecyclerView Z0;
    public final View a1;
    
    public u0i(View viewById) {
        super(viewById);
        final View viewById2 = viewById.findViewById(2131428295);
        zzd.e((Object)viewById2, "itemView.findViewById(R.id.collection_item_name)");
        this.W0 = (TypefacesTextView)viewById2;
        final View viewById3 = viewById.findViewById(2131428296);
        zzd.e((Object)viewById3, "itemView.findViewById(R.id.collection_see_all)");
        this.X0 = (TypefacesTextView)viewById3;
        final View viewById4 = viewById.findViewById(2131428294);
        zzd.e((Object)viewById4, "itemView.findViewById(R.id.collection_item_image)");
        this.Y0 = (FrescoMediaImageView)viewById4;
        final View viewById5 = viewById.findViewById(2131430255);
        zzd.e((Object)viewById5, "itemView.findViewById(R.id.nft_collections)");
        this.Z0 = (RecyclerView)viewById5;
        viewById = viewById.findViewById(2131428293);
        zzd.e((Object)viewById, "itemView.findViewById(R.id.collection_container)");
        this.a1 = viewById;
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
}
