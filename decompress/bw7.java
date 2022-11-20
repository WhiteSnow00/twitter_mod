import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View$OnClickListener;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bw7 extends ste implements qsb<cw7, fzv>
{
    public final pv7 D0;
    
    public bw7(final pv7 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final cw7 cw7 = (cw7)o;
        czd.f((Object)cw7, "$this$distinctType");
        if (cw7 instanceof cw7$c.a) {
            final pv7 d0 = this.D0;
            d0.E0.g((List)f2a.D0);
            d0.M0.setText((CharSequence)d0.V0);
            d0.O0.setText((CharSequence)d0.W0);
            ((TextView)d0.P0).setText((CharSequence)d0.X0);
            final TextView k0 = d0.K0;
            czd.e((Object)k0, "unSearchedTextView");
            ((View)k0).setVisibility(8);
            final ViewGroup l0 = d0.L0;
            czd.e((Object)l0, "noResultsContainer");
            ((View)l0).setVisibility(0);
            ((View)d0.P0).setOnClickListener((View$OnClickListener)new ji2((Object)d0, 10));
        }
        return fzv.a;
    }
}
