import android.view.View;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acr extends gue implements rtb<ocr, oyv>
{
    public final /* synthetic */ rbr C0;
    
    public acr(final rbr c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ocr ocr = (ocr)o;
        zzd.f((Object)ocr, "$this$distinct");
        final ImageView h0 = this.C0.H0;
        int visibility;
        if (ocr.l) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)h0).setVisibility(visibility);
        return oyv.a;
    }
}
