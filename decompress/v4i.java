import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v4i extends v3e<fnj, w4i>
{
    public v4i(final zml<p1i> zml) {
        zzd.f((Object)zml, "clickSubject");
        super((Class)fnj.class);
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final w4i w4i = (w4i)c7x;
        final fnj fnj = (fnj)o;
        zzd.f((Object)w4i, "viewHolder");
        zzd.f((Object)fnj, "item");
        final TypefacesTextView w0 = w4i.W0;
        final String b = fnj.b;
        String upperCase;
        if (b != null) {
            upperCase = b.toUpperCase(Locale.ROOT);
            zzd.e((Object)upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        }
        else {
            upperCase = null;
        }
        ((TextView)w0).setText((CharSequence)upperCase);
        ((TextView)w4i.X0).setText((CharSequence)fnj.c);
        ((AppCompatTextView)w4i.X0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        final View v = lf.v(viewGroup, "parent", 2131624971, viewGroup, false);
        zzd.e((Object)v, "view");
        return (c7x)new w4i(v);
    }
}
