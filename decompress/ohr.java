import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohr implements h7f
{
    public final View C0;
    public final TypefacesTextView D0;
    
    public ohr(final LayoutInflater layoutInflater) {
        final View inflate = layoutInflater.inflate(2131624454, (ViewGroup)null);
        this.C0 = inflate;
        final TypefacesTextView d0 = (TypefacesTextView)inflate.findViewById(2131430839);
        this.D0 = d0;
        inflate.setContentDescription((CharSequence)tqm.b((View)d0).b.getString(2131957467));
    }
    
    public final View getView() {
        return this.C0;
    }
}
