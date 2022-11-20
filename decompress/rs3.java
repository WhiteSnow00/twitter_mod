import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rs3 implements r6f
{
    public final View D0;
    
    public rs3(final LayoutInflater layoutInflater) {
        this.D0 = layoutInflater.inflate(2131624176, (ViewGroup)null);
    }
    
    public final void a(final Drawable imageDrawable) {
        final ImageView imageView = (ImageView)this.D0.findViewById(2131429889);
        if (imageDrawable != null) {
            imageView.setImageDrawable(imageDrawable);
        }
        else {
            h6r.l("ChannelsToolbarViewDelegate", "Error loading logo drawable for the HTL, not update made.");
        }
    }
    
    public final View getView() {
        return this.D0;
    }
}
