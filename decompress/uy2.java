import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uy2 extends pue implements stb<d03, vzv>
{
    public final zx2 F0;
    
    public uy2(final zx2 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d03 d03 = (d03)o;
        e0e.f((Object)d03, "$this$distinct");
        this.F0.i1.setChecked(d03.j);
        final TextView j1 = this.F0.j1;
        e0e.e((Object)j1, "displayMapTextview");
        final zx2 f0 = this.F0;
        int n;
        if (d03.j) {
            n = 2131953878;
        }
        else {
            n = 2131953133;
        }
        final String a = f0.a(n);
        final CharSequence text = j1.getText();
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)text);
        sb.append(" ");
        sb.append(a);
        ((View)j1).setContentDescription((CharSequence)sb.toString());
        return vzv.a;
    }
}
