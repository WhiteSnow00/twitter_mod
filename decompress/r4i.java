import android.view.View;
import com.twitter.media.ui.image.AnimatedGifView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r4i extends RecyclerView$c0 implements n8x
{
    public final TypefacesTextView Z0;
    public final TypefacesTextView a1;
    public final AnimatedGifView b1;
    public final View c1;
    
    public r4i(View viewById) {
        super(viewById);
        final View viewById2 = viewById.findViewById(2131430312);
        e0e.e((Object)viewById2, "itemView.findViewById(R.id.nft_item_name)");
        this.Z0 = (TypefacesTextView)viewById2;
        final View viewById3 = viewById.findViewById(2131430310);
        e0e.e((Object)viewById3, "itemView.findViewById(R.\u2026nft_item_collection_name)");
        this.a1 = (TypefacesTextView)viewById3;
        final View viewById4 = viewById.findViewById(2131430311);
        e0e.e((Object)viewById4, "itemView.findViewById(R.id.nft_item_image)");
        this.b1 = (AnimatedGifView)viewById4;
        viewById = viewById.findViewById(2131430330);
        e0e.e((Object)viewById, "itemView.findViewById(R.id.nft_unsupported)");
        this.c1 = viewById;
    }
    
    public final View getHeldView() {
        final View f0 = super.F0;
        e0e.e((Object)f0, "itemView");
        return f0;
    }
}
