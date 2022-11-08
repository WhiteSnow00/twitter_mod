import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3i extends RecyclerView$c0 implements c7x
{
    public final TypefacesTextView W0;
    public final TypefacesTextView X0;
    
    public p3i(View viewById) {
        super(viewById);
        final View viewById2 = viewById.findViewById(2131430306);
        zzd.e((Object)viewById2, "itemView.findViewById(R.id.nft_info_title)");
        this.W0 = (TypefacesTextView)viewById2;
        viewById = viewById.findViewById(2131430305);
        zzd.e((Object)viewById, "itemView.findViewById(R.id.nft_info_data)");
        this.X0 = (TypefacesTextView)viewById;
    }
    
    public final View getHeldView() {
        final View c0 = super.C0;
        zzd.e((Object)c0, "itemView");
        return c0;
    }
}
