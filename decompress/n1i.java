import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n1i extends RecyclerView$c0 implements n8x
{
    public final TypefacesTextView Z0;
    public final TypefacesTextView a1;
    public final FrescoMediaImageView b1;
    public final RecyclerView c1;
    public final View d1;
    
    public n1i(View viewById) {
        super(viewById);
        final View viewById2 = viewById.findViewById(2131428295);
        e0e.e((Object)viewById2, "itemView.findViewById(R.id.collection_item_name)");
        this.Z0 = (TypefacesTextView)viewById2;
        final View viewById3 = viewById.findViewById(2131428296);
        e0e.e((Object)viewById3, "itemView.findViewById(R.id.collection_see_all)");
        this.a1 = (TypefacesTextView)viewById3;
        final View viewById4 = viewById.findViewById(2131428294);
        e0e.e((Object)viewById4, "itemView.findViewById(R.id.collection_item_image)");
        this.b1 = (FrescoMediaImageView)viewById4;
        final View viewById5 = viewById.findViewById(2131430258);
        e0e.e((Object)viewById5, "itemView.findViewById(R.id.nft_collections)");
        this.c1 = (RecyclerView)viewById5;
        viewById = viewById.findViewById(2131428293);
        e0e.e((Object)viewById, "itemView.findViewById(R.id.collection_container)");
        this.d1 = viewById;
    }
    
    public final View getHeldView() {
        final View f0 = super.F0;
        e0e.e((Object)f0, "itemView");
        return f0;
    }
}
