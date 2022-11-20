import android.view.View;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ygo extends ste implements qsb<aho, fzv>
{
    public final ugo D0;
    
    public ygo(final ugo d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final aho aho = (aho)o;
        czd.f((Object)aho, "$this$distinct");
        final ProgressBar h0 = this.D0.H0;
        int visibility;
        if (aho.b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)h0).setVisibility(visibility);
        return fzv.a;
    }
}
