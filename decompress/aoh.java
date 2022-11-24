import android.view.View;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoh extends pue implements stb<qoh, vzv>
{
    public final mnh F0;
    
    public aoh(final mnh f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qoh qoh = (qoh)o;
        e0e.f((Object)qoh, "$this$distinct");
        final HorizonInlineCalloutView t0 = this.F0.T0;
        e0e.e((Object)t0, "disclaimerCalloutView");
        int visibility;
        if (qoh.d) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)t0).setVisibility(visibility);
        return vzv.a;
    }
}
