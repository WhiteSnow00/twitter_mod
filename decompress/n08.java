import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n08 extends pue implements stb<y08$a, vzv>
{
    public final j08 F0;
    
    public n08(final j08 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final y08$a y08$a = (y08$a)o;
        e0e.f((Object)y08$a, "$this$distinct");
        final j08 f0 = this.F0;
        f0.H0.g(y08$a.e);
        final TextView m0 = f0.M0;
        e0e.e((Object)m0, "unSearchedTextView");
        ((View)m0).setVisibility(8);
        final ViewGroup n0 = f0.N0;
        e0e.e((Object)n0, "noResultsContainer");
        ((View)n0).setVisibility(8);
        return vzv.a;
    }
}
