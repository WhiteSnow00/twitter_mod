import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jon extends ste implements qsb<pon, fzv>
{
    public final con D0;
    
    public jon(final con d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pon pon = (pon)o;
        czd.f((Object)pon, "$this$distinct");
        final TypefacesTextView h0 = this.D0.H0;
        int backgroundResource;
        if (pon.l) {
            backgroundResource = 2131233239;
        }
        else {
            backgroundResource = 2131233241;
        }
        ((AppCompatTextView)h0).setBackgroundResource(backgroundResource);
        final ImageView m0 = this.D0.M0;
        int backgroundResource2;
        if (pon.l) {
            backgroundResource2 = 2131231107;
        }
        else {
            backgroundResource2 = 2131231108;
        }
        ((View)m0).setBackgroundResource(backgroundResource2);
        return fzv.a;
    }
}
