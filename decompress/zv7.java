import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zv7 extends ste implements qsb<cw7$b, fzv>
{
    public final pv7 D0;
    
    public zv7(final pv7 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final cw7$b cw7$b = (cw7$b)o;
        czd.f((Object)cw7$b, "$this$distinct");
        final pv7 d0 = this.D0;
        final boolean b = cw7$b.b;
        d0.E0.g((List)f2a.D0);
        final TextView k0 = d0.K0;
        czd.e((Object)k0, "unSearchedTextView");
        int visibility;
        if (b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)k0).setVisibility(visibility);
        final ViewGroup l0 = d0.L0;
        czd.e((Object)l0, "noResultsContainer");
        ((View)l0).setVisibility(8);
        return fzv.a;
    }
}
