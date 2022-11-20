import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w2g extends ste implements qsb<nc2, fzv>
{
    public final x2g D0;
    
    public w2g(final x2g d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nc2 nc2 = (nc2)o;
        czd.f((Object)nc2, "$this$distinctType");
        final View d0 = this.D0.D0;
        int visibility;
        if (nc2 instanceof nc2$c) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        d0.setVisibility(visibility);
        return fzv.a;
    }
}
