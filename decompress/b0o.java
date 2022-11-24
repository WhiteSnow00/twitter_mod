import android.view.View;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b0o extends pue implements stb<w0o, vzv>
{
    public final wyn F0;
    
    public b0o(final wyn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final w0o w0o = (w0o)o;
        e0e.f((Object)w0o, "$this$distinct");
        final ImageView x0 = this.F0.X0;
        int visibility;
        if (w0o.B) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)x0).setVisibility(visibility);
        return vzv.a;
    }
}
