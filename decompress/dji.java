import android.view.ViewGroup;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dji extends gue implements rtb<lji, oyv>
{
    public final /* synthetic */ vii C0;
    
    public dji(final vii c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        zzd.f((Object)o, "$this$distinct");
        final vii c0 = this.C0;
        final ViewFlipper i0 = c0.I0;
        ((ViewAnimator)i0).setDisplayedChild(((ViewGroup)i0).indexOfChild(c0.J0));
        return oyv.a;
    }
}
