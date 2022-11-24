import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pka implements q7x$a
{
    public final int F0;
    public final Object G0;
    
    public pka(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final q7x a(final View view) {
        switch (this.F0) {
            default: {
                return (q7x)((mww$a)this.G0).a(view);
            }
            case 0: {
                final kcm kcm = (kcm)this.G0;
                final TypefacesTextView typefacesTextView = (TypefacesTextView)view;
                e0e.f((Object)kcm, "$releaseCompletable");
                e0e.f((Object)typefacesTextView, "view");
                return (q7x)new oad(typefacesTextView, kcm);
            }
        }
    }
}
