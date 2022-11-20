import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i6l extends ste implements qsb<z6l, fzv>
{
    public final z5l D0;
    
    public i6l(final z5l d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final z6l z6l = (z6l)o;
        czd.f((Object)z6l, "$this$distinct");
        final ViewGroup m0 = this.D0.M0;
        czd.e((Object)m0, "moduleRow");
        int visibility;
        if (z6l.c) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)m0).setVisibility(visibility);
        return fzv.a;
    }
}
