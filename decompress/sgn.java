import android.view.View;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sgn extends ste implements qsb<whn, fzv>
{
    public final lgn D0;
    
    public sgn(final lgn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final whn whn = (whn)o;
        czd.f((Object)whn, "$this$distinct");
        final ImageView y0 = this.D0.Y0;
        czd.e((Object)y0, "moreSettingsButton");
        int visibility;
        if (whn.c) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)y0).setVisibility(visibility);
        return fzv.a;
    }
}
