import android.view.View;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnh extends ste implements qsb<boh, fzv>
{
    public final xmh D0;
    
    public lnh(final xmh d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final boh boh = (boh)o;
        czd.f((Object)boh, "$this$distinct");
        final HorizonInlineCalloutView r0 = this.D0.R0;
        czd.e((Object)r0, "disclaimerCalloutView");
        int visibility;
        if (boh.d) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)r0).setVisibility(visibility);
        return fzv.a;
    }
}
