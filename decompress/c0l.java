import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c0l
{
    public final j84 a;
    public final j84 b;
    public final ydj c;
    public final View d;
    public final View e;
    public final TypefacesTextView f;
    
    public c0l(final LayoutInflater layoutInflater, final ydj c) {
        this.c = c;
        final View inflate = layoutInflater.inflate(2131625068, (ViewGroup)null);
        this.a = new j84(inflate.findViewById(2131428693));
        this.b = new j84(inflate.findViewById(2131428692));
        this.d = inflate.findViewById(2131427753);
        this.f = (TypefacesTextView)inflate.findViewById(2131430695);
        this.e = inflate;
    }
}
