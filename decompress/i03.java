import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i03 extends ste implements qsb<w03, fzv>
{
    public final zz2 D0;
    
    public i03(final zz2 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final w03 w03 = (w03)o;
        czd.f((Object)w03, "$this$distinct");
        if (w03.j != null) {
            final zz2 d0 = this.D0;
            final TextView l0 = d0.L0;
            czd.e((Object)l0, "warningText");
            ((View)l0).setVisibility(0);
            d0.L0.setText((CharSequence)w03.j);
        }
        else {
            final TextView l2 = this.D0.L0;
            czd.e((Object)l2, "warningText");
            ((View)l2).setVisibility(8);
        }
        return fzv.a;
    }
}
