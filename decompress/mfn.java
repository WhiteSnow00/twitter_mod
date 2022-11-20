import android.content.Context;
import android.widget.ImageView;
import android.graphics.ColorFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mfn extends ste implements qsb<zfn, fzv>
{
    public final ven D0;
    
    public mfn(final ven d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final zfn zfn = (zfn)o;
        czd.f((Object)zfn, "$this$distinct");
        if (zfn.b) {
            final ven d0 = this.D0;
            d0.Q0.setImageDrawable(d0.S0);
            final ven d2 = this.D0;
            final ImageView q0 = d2.Q0;
            final Context context = d2.E0.getContext();
            czd.e((Object)context, "rootView.context");
            q0.setColorFilter(d4j.i(context, 2130969091));
        }
        else {
            final ven d3 = this.D0;
            d3.Q0.setImageDrawable(d3.R0);
            this.D0.Q0.setColorFilter((ColorFilter)null);
        }
        return fzv.a;
    }
}
