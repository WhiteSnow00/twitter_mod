import android.app.Dialog;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqt implements mw8
{
    public final OcfEventReporter C0;
    
    public gqt(final eqt eqt, final OcfEventReporter c0) {
        this.C0 = c0;
    }
    
    @Override
    public final void l0(final Dialog dialog, final int n, final int n2) {
        if (n2 == -1 && n == 1) {
            this.C0.b(new zf4(new String[] { "onboarding", "topics_selector", null, "prompt", "dismiss" }), (String)null);
        }
    }
}
