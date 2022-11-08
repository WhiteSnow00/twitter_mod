import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ny2 extends gue implements rtb<sz2, oyv>
{
    public final /* synthetic */ ox2 C0;
    
    public ny2(final ox2 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final sz2 sz2 = (sz2)o;
        zzd.f((Object)sz2, "$this$distinct");
        final TextView h1 = this.C0.h1;
        zzd.e((Object)h1, "googleDisclaimerTextView");
        int visibility;
        if (sz2.l) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)h1).setVisibility(visibility);
        return oyv.a;
    }
}
