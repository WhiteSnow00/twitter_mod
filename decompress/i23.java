import android.view.View;
import com.twitter.ui.widget.TwitterEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i23 extends pue implements stb<m23, vzv>
{
    public final j23 F0;
    
    public i23(final j23 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final m23 m23 = (m23)o;
        e0e.f((Object)m23, "$this$distinct");
        final TwitterEditText j0 = this.F0.J0;
        e0e.e((Object)j0, "searchBar");
        int visibility;
        if (m23.e) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)j0).setVisibility(visibility);
        return vzv.a;
    }
}
