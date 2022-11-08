import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l3n extends gue implements rtb<f6n, oyv>
{
    public final /* synthetic */ x0n C0;
    
    public l3n(final x0n c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final f6n f6n = (f6n)o;
        zzd.f((Object)f6n, "$this$distinct");
        final ImageView p = this.C0.P1;
        int visibility;
        if (f6n.I) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)p).setVisibility(visibility);
        if (!f6n.I) {
            final x0n c0 = this.C0;
            c0.X1.o((View)c0.P1);
        }
        return oyv.a;
    }
}
