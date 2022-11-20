import android.view.View;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzn extends ste implements qsb<d0o, fzv>
{
    public final dyn D0;
    
    public kzn(final dyn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "$this$distinct");
        final ImageView e = this.D0.t1.e;
        int visibility;
        if (d0o.z) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)e).setVisibility(visibility);
        return fzv.a;
    }
}
