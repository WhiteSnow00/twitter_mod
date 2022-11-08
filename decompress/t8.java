import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t8 extends gue implements rtb<m9, oyv>
{
    public final /* synthetic */ k8 C0;
    
    public t8(final k8 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final m9 m9 = (m9)o;
        zzd.f((Object)m9, "$this$distinct");
        final TextView p = this.C0.P0;
        zzd.e((Object)p, "moduleTitleView");
        int visibility;
        if (m9.o) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)p).setVisibility(visibility);
        return oyv.a;
    }
}
