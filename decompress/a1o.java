import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a1o extends ste implements qsb<j1o, fzv>
{
    public final k0o D0;
    
    public a1o(final k0o d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final j1o j1o = (j1o)o;
        czd.f((Object)j1o, "$this$distinct");
        int imageResource;
        if (j1o.h) {
            imageResource = 2131232302;
        }
        else {
            imageResource = 2131232353;
        }
        final Context context = this.D0.D0.getContext();
        int n;
        if (j1o.h) {
            n = 2131955649;
        }
        else {
            n = 2131955768;
        }
        final String string = context.getString(n);
        czd.e((Object)string, "rootView.context.getStri\u2026          }\n            )");
        this.D0.K0.setImageResource(imageResource);
        ((View)this.D0.K0).setContentDescription((CharSequence)string);
        final ImageView l0 = this.D0.L0;
        int imageResource2;
        if (j1o.h) {
            imageResource2 = 2131232432;
        }
        else {
            imageResource2 = 2131231956;
        }
        l0.setImageResource(imageResource2);
        final k0o d0 = this.D0;
        final ImageView l2 = d0.L0;
        final Context context2 = d0.D0.getContext();
        int n2;
        if (j1o.h) {
            n2 = 2131958113;
        }
        else {
            n2 = 2131952491;
        }
        ((View)l2).setContentDescription((CharSequence)context2.getString(n2));
        final boolean h = j1o.h;
        if (!h && j1o.l) {
            this.D0.H0.a();
        }
        else if (!h) {
            this.D0.H0.b();
        }
        else {
            ((Animator)this.D0.H0.I0).resume();
        }
        return fzv.a;
    }
}
