import android.view.View;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a6i extends RecyclerView$c0 implements c7x
{
    public final TypefacesTextView W0;
    public final ImageView X0;
    
    public a6i(View viewById) {
        super(viewById);
        final View viewById2 = viewById.findViewById(2131430346);
        zzd.e((Object)viewById2, "itemView.findViewById(R.id.nft_wallet_item_name)");
        this.W0 = (TypefacesTextView)viewById2;
        viewById = viewById.findViewById(2131430345);
        zzd.e((Object)viewById, "itemView.findViewById(R.id.nft_wallet_item_image)");
        this.X0 = (ImageView)viewById;
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
}
