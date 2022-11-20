import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfn extends ste implements qsb<zfn, fzv>
{
    public final ven D0;
    
    public kfn(final ven d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final zfn zfn = (zfn)o;
        czd.f((Object)zfn, "$this$distinct");
        final boolean a = czd.a((Object)zfn.q, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE);
        int n2;
        final int n = n2 = 0;
        if (a) {
            n2 = n;
            if (asa.b().b("super_follow_space_consumption_enabled", false)) {
                n2 = 1;
            }
        }
        if (zfn.g) {
            this.D0.K0.c();
            final ven d0 = this.D0;
            final TypefacesTextView l0 = d0.L0;
            int textColor;
            if (n2 != 0) {
                textColor = ven.a(d0);
            }
            else {
                textColor = d0.T0;
            }
            ((TextView)l0).setTextColor(textColor);
        }
        else {
            this.D0.K0.a();
            final ven d2 = this.D0;
            final TypefacesTextView l2 = d2.L0;
            int textColor2;
            if (n2 != 0) {
                textColor2 = ((Number)d2.e1.getValue()).intValue();
            }
            else {
                textColor2 = d2.U0;
            }
            ((TextView)l2).setTextColor(textColor2);
        }
        if (ikr.g((CharSequence)zfn.h)) {
            ((TextView)this.D0.L0).setText((CharSequence)zfn.h);
        }
        return fzv.a;
    }
}
