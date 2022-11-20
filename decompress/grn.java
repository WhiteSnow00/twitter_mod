import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grn extends ste implements qsb<jrn, fzv>
{
    public final crn D0;
    
    public grn(final crn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jrn jrn = (jrn)o;
        czd.f((Object)jrn, "$this$distinct");
        final TypefacesTextView g0 = this.D0.G0;
        int visibility;
        if (jrn.b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)g0).setVisibility(visibility);
        return fzv.a;
    }
}
