import android.content.Context;
import android.widget.TextView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l03 extends ste implements qsb<w03, fzv>
{
    public final zz2 D0;
    
    public l03(final zz2 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final w03 w03 = (w03)o;
        czd.f((Object)w03, "$this$distinct");
        if (w03.k != null) {
            final zz2 d0 = this.D0;
            final String j = w03.j;
            czd.c((Object)j);
            final String k = w03.k;
            f0r.c(d0.L0);
            final TextView l0 = d0.L0;
            final Context context = d0.D0.getContext();
            czd.e((Object)context, "rootView.context");
            l0.setText(eif.a(context, j, new View$OnClickListener[] { (View$OnClickListener)new eoa((Object)d0, (Object)k, 8) }));
        }
        return fzv.a;
    }
}
