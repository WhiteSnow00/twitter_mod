import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lz7 extends ste implements qsb<wz7$a, fzv>
{
    public final hz7 D0;
    
    public lz7(final hz7 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wz7$a wz7$a = (wz7$a)o;
        czd.f((Object)wz7$a, "$this$distinct");
        final hz7 d0 = this.D0;
        d0.F0.g(wz7$a.e);
        final TextView k0 = d0.K0;
        czd.e((Object)k0, "unSearchedTextView");
        ((View)k0).setVisibility(8);
        final ViewGroup l0 = d0.L0;
        czd.e((Object)l0, "noResultsContainer");
        ((View)l0).setVisibility(8);
        return fzv.a;
    }
}
