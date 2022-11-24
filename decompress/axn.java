import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axn extends pue implements stb<fxn, vzv>
{
    public final awn F0;
    
    public axn(final awn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final fxn fxn = (fxn)o;
        e0e.f((Object)fxn, "$this$distinct");
        final View m0 = this.F0.M0;
        final boolean t = fxn.t;
        final int n = 8;
        int visibility;
        if (t) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        m0.setVisibility(visibility);
        final TypefacesTextView t2 = this.F0.T0;
        int visibility2 = n;
        if (fxn.t) {
            visibility2 = n;
            if (fxn.u) {
                visibility2 = 0;
            }
        }
        ((View)t2).setVisibility(visibility2);
        return vzv.a;
    }
}
