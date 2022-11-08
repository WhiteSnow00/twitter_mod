import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sw7 extends gue implements rtb<vw7$b, oyv>
{
    public final /* synthetic */ iw7 C0;
    
    public sw7(final iw7 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vw7$b vw7$b = (vw7$b)o;
        zzd.f((Object)vw7$b, "$this$distinct");
        final iw7 c0 = this.C0;
        final boolean b = vw7$b.b;
        c0.D0.g((List)v2a.C0);
        final TextView j0 = c0.J0;
        zzd.e((Object)j0, "unSearchedTextView");
        int visibility;
        if (b) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)j0).setVisibility(visibility);
        final ViewGroup k0 = c0.K0;
        zzd.e((Object)k0, "noResultsContainer");
        ((View)k0).setVisibility(8);
        return oyv.a;
    }
}
