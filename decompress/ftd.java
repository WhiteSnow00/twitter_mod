import android.os.BaseBundle;
import android.os.Bundle;
import com.twitter.analytics.tracking.InstallationReferrer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftd implements ctd
{
    public final /* synthetic */ String a;
    public final /* synthetic */ InstallationReferrer b;
    
    public ftd(final InstallationReferrer b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int n) {
        if (n == 0) {
            try {
                final zng b = this.b.d.b();
                final String string = ((BaseBundle)b.C0).getString("install_referrer");
                final long long1 = ((BaseBundle)b.C0).getLong("referrer_click_timestamp_seconds");
                final long long2 = ((BaseBundle)b.C0).getLong("install_begin_timestamp_seconds");
                bl0.a().d();
                this.b.d.a();
                o40 o40;
                if (!pjr.g((CharSequence)string) && long1 == 0L && long2 == 0L) {
                    o40 = null;
                }
                else {
                    o40 = new o40(string, long1, long2);
                }
                if (dta.d().b("onboarding_attribution_service_google_licensing_enabled", false)) {
                    InstallationReferrer.a(this.b, string, o40, this.a);
                }
                else {
                    this.b.b(string, o40, this.a, (r5c)null);
                }
            }
            catch (final Exception ex) {
                e9a.c(new z8a((Throwable)ex));
            }
        }
    }
}
