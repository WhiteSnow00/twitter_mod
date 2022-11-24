import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b13 extends pue implements stb<p13, vzv>
{
    public final s03 F0;
    
    public b13(final s03 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final p13 p = (p13)o;
        e0e.f((Object)p, "$this$distinct");
        if (p.j != null) {
            final s03 f0 = this.F0;
            final TextView n0 = f0.N0;
            e0e.e((Object)n0, "warningText");
            ((View)n0).setVisibility(0);
            f0.N0.setText((CharSequence)p.j);
        }
        else {
            final TextView n2 = this.F0.N0;
            e0e.e((Object)n2, "warningText");
            ((View)n2).setVisibility(8);
        }
        return vzv.a;
    }
}
