import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apn extends pue implements stb<gpn, vzv>
{
    public final ton F0;
    
    public apn(final ton f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gpn gpn = (gpn)o;
        e0e.f((Object)gpn, "$this$distinct");
        final TypefacesTextView j0 = this.F0.J0;
        int backgroundResource;
        if (gpn.l) {
            backgroundResource = 2131233239;
        }
        else {
            backgroundResource = 2131233241;
        }
        ((AppCompatTextView)j0).setBackgroundResource(backgroundResource);
        final ImageView o2 = this.F0.O0;
        int backgroundResource2;
        if (gpn.l) {
            backgroundResource2 = 2131231107;
        }
        else {
            backgroundResource2 = 2131231108;
        }
        ((View)o2).setBackgroundResource(backgroundResource2);
        return vzv.a;
    }
}
