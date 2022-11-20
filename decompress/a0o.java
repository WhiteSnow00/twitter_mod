import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a0o extends ste implements qsb<d0o, fzv>
{
    public final dyn D0;
    
    public a0o(final dyn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "$this$distinct");
        final TypefacesTextView x0 = this.D0.X0;
        final String l = d0o.l;
        final int n = 0;
        String text;
        if (l == null || l.length() == 0) {
            text = this.D0.D0.getContext().getResources().getString(2131957010, new Object[] { d0o.h });
        }
        else {
            text = d0o.l;
        }
        ((TextView)x0).setText((CharSequence)text);
        final ImageView y0 = this.D0.Y0;
        int visibility;
        if (d0o.c) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        ((View)y0).setVisibility(visibility);
        return fzv.a;
    }
}
