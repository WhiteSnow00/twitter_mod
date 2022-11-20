import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b2a extends ste implements qsb<nc2, fzv>
{
    public final c2a D0;
    
    public b2a(final c2a d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nc2 nc2 = (nc2)o;
        czd.f((Object)nc2, "$this$distinctType");
        final ViewGroup d0 = this.D0.D0;
        int visibility;
        if (nc2 instanceof nc2$d ^ true) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)d0).setVisibility(visibility);
        return fzv.a;
    }
}
