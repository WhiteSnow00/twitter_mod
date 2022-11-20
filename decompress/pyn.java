import android.view.View;
import android.widget.ScrollView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pyn extends ste implements qsb<d0o, fzv>
{
    public final dyn D0;
    
    public pyn(final dyn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "$this$distinct");
        final ScrollView n1 = this.D0.n1;
        final boolean w = d0o.w;
        final int n2 = 8;
        int visibility;
        if (w) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)n1).setVisibility(visibility);
        final View o2 = this.D0.o1;
        int visibility2;
        if (d0o.w) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        o2.setVisibility(visibility2);
        final View p = this.D0.p1;
        int visibility3 = n2;
        if (d0o.w) {
            visibility3 = 0;
        }
        p.setVisibility(visibility3);
        if (d0o.w) {
            final dyn d0 = this.D0;
            ((View)d0.R0).setContentDescription((CharSequence)d0.D0.getContext().getString(2131952495));
            this.D0.R0.setImageResource(2131231915);
        }
        else {
            final dyn d2 = this.D0;
            ((View)d2.R0).setContentDescription((CharSequence)d2.D0.getContext().getString(2131952494));
            this.D0.R0.setImageResource(2131231914);
        }
        return fzv.a;
    }
}
