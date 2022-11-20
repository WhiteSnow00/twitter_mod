import androidx.constraintlayout.widget.a;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z3n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public z3n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        final ImageView q1 = this.D0.Q1;
        int visibility;
        if (t6n.I) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)q1).setVisibility(visibility);
        if (!t6n.I) {
            final l1n d0 = this.D0;
            ((a)d0.Y1).o((View)d0.Q1);
        }
        return fzv.a;
    }
}
