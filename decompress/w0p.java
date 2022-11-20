import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w0p extends tp1<x0p$a>
{
    public final TextView E0;
    public final TextView F0;
    public final TextView G0;
    public final oa8 H0;
    public final x0p I0;
    
    public w0p(final x0p i0, final TextView e0, final TextView f0, final TextView g0, final oa8 h0) {
        this.I0 = i0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void b(final Object o) {
        final x0p$a x0p$a = (x0p$a)o;
        int textColor;
        if (x0p$a.a) {
            textColor = this.I0.E0.getResources().getColor(2131100717);
        }
        else {
            textColor = d4j.i(this.I0.E0, 2130969093);
        }
        int n;
        if (x0p$a.a) {
            n = this.I0.E0.getResources().getColor(2131100721);
        }
        else {
            n = d4j.i(this.I0.E0, 2130969091);
        }
        this.E0.setTextColor(textColor);
        this.F0.setTextColor(n);
        this.G0.setTextColor(n);
        this.E0.setText((CharSequence)x0p$a.b);
        this.F0.setText((CharSequence)x0p$a.c);
        this.G0.setText((CharSequence)x0p$a.d);
        final TextView g0 = this.G0;
        int visibility;
        if (this.I0.D0.contains((Object)this.H0)) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)g0).setVisibility(visibility);
    }
}
