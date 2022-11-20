import com.twitter.media.ui.fresco.FrescoDraweeView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h8d extends nk8
{
    public final View E0;
    public final FrescoDraweeView F0;
    
    public h8d(View viewById) {
        super(viewById);
        this.E0 = viewById;
        viewById = viewById.findViewById(2131429534);
        czd.e((Object)viewById, "contentView.findViewById(R.id.image)");
        this.F0 = (FrescoDraweeView)viewById;
    }
}
