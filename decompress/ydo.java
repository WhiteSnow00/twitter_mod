import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ydo extends ste implements qsb<geo, fzv>
{
    public final sdo D0;
    public final View E0;
    
    public ydo(final sdo d0, final View e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final geo geo = (geo)o;
        czd.f((Object)geo, "$this$distinct");
        final sdo d0 = this.D0;
        final obi d2 = d0.D0;
        final TypefacesTextView f0 = d0.F0;
        czd.e((Object)f0, "titleView");
        final String a = geo.a;
        final Context context = this.E0.getContext();
        czd.e((Object)context, "rootView.context");
        g63.V(d2, (TextView)f0, a, context);
        return fzv.a;
    }
}
