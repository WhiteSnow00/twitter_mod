import android.content.DialogInterface;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfp implements ax8
{
    public final OcfEventReporter F0;
    
    public kfp(final mrt mrt, final OcfEventReporter f0) {
        this.F0 = f0;
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        if (n == 100) {
            this.F0.b(new fg4(new String[] { "onboarding", "topics_selector", null, "cart", "dismiss" }), null);
        }
    }
}
