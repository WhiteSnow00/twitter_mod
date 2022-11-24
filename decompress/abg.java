import android.widget.TextView;
import com.twitter.subsystem.composer.ComposerCountProgressBarView;
import com.twitter.util.user.UserIdentifier;
import android.view.View;
import android.view.View$OnFocusChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abg implements View$OnFocusChangeListener
{
    public final int F0;
    public final Object G0;
    
    public abg(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onFocusChange(View o1, final boolean b) {
        switch (this.F0) {
            default: {
                final d2n d2n = (d2n)this.G0;
                e0e.f((Object)d2n, "this$0");
                if (b) {
                    fc0.d((View)d2n.K1, 300);
                    d2n.s(0);
                    ((TextView)d2n.a1).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    ((View)d2n.Q1).setAlpha(1.0f);
                    ((View)d2n.Q1).setEnabled(true);
                    if (d2n.f2) {
                        o1 = d2n.O1;
                        if (o1 != null) {
                            o1.setVisibility(8);
                        }
                    }
                }
                else {
                    final ComposerCountProgressBarView k1 = d2n.K1;
                    e0e.e((Object)k1, "descriptionCountProgressBar");
                    ((View)k1).setVisibility(4);
                }
                return;
            }
            case 0: {
                final UserIdentifier userIdentifier = (UserIdentifier)this.G0;
                if (b) {
                    hbg.c(userIdentifier, "login:::password:select");
                }
            }
        }
    }
}
