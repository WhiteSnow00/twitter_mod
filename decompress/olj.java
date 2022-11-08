import android.view.View;
import com.twitter.ui.components.button.compose.HorizonComposeButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class olj extends gue implements rtb<sc2, oyv>
{
    public final /* synthetic */ plj C0;
    
    public olj(final plj c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final sc2 sc2 = (sc2)o;
        zzd.f((Object)sc2, "$this$distinctType");
        final HorizonComposeButton c0 = this.C0.C0;
        final boolean b = sc2 instanceof sc2.a;
        final int n = 0;
        int visibility;
        if (b || sc2 instanceof sc2.b) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        ((View)c0).setVisibility(visibility);
        return oyv.a;
    }
}
