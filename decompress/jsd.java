import android.os.BaseBundle;
import android.os.Bundle;
import com.twitter.analytics.tracking.InstallationReferrer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsd implements gsd
{
    public final String a;
    public final InstallationReferrer b;
    
    public jsd(final InstallationReferrer b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int n) {
        if (n == 0) {
            try {
                final yng b = this.b.d.b();
                final String string = ((BaseBundle)b.D0).getString("install_referrer");
                final long long1 = ((BaseBundle)b.D0).getLong("referrer_click_timestamp_seconds");
                final long long2 = ((BaseBundle)b.D0).getLong("install_begin_timestamp_seconds");
                wk0.b().d();
                this.b.d.a();
                m40 m40;
                if (!ikr.g((CharSequence)string) && long1 == 0L && long2 == 0L) {
                    m40 = null;
                }
                else {
                    m40 = new m40(string, long1, long2);
                }
                if (asa.d().b("onboarding_attribution_service_google_licensing_enabled", false)) {
                    InstallationReferrer.a(this.b, string, m40, this.a);
                }
                else {
                    this.b.b(string, m40, this.a, null);
                }
            }
            catch (final Exception ex) {
                m8a.c(new h8a((Throwable)ex));
            }
        }
    }
}
