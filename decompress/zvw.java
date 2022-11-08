import android.widget.LinearLayout;
import android.content.Context;
import android.app.Activity;
import com.twitter.ui.widget.LandscapeAwareAspectRatioFrameLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zvw
{
    public final View a;
    public final LandscapeAwareAspectRatioFrameLayout b;
    
    public zvw(final Activity activity, final z19 z19) {
        final View a = (View)rqu.Q("VideoAttributionFactory#ctor#inflate", (otb)new v0x((Context)activity, 1));
        this.a = a;
        this.b = (LandscapeAwareAspectRatioFrameLayout)a.findViewById(2131432549);
        if (z19 instanceof z19$z) {
            final int a2 = w4j.a;
            LinearLayout.class.cast(a).setGravity(1);
        }
    }
    
    public final gww a(final Activity activity, final z19 z19, final cf4 cf4) {
        if (!(z19 instanceof z19$z) && !(z19 instanceof z19$y)) {
            return (gww)new iww((Context)activity, this.a, this.b, z19, cf4);
        }
        return (gww)new m3a(activity, this.a);
    }
}
