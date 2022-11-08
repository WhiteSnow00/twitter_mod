import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ubs implements psd$a<Object, vbs>
{
    public final jbs C0;
    
    public ubs(final jbs c0) {
        zzd.f((Object)c0, "taskEndpointRepository");
        this.C0 = c0;
    }
    
    public final void b(final of6<Object, vbs> of6, final tsc<vbs, pav> tsc) {
        zzd.f((Object)of6, "request");
        final List k1 = gkr.K1((CharSequence)of6.h0().a.toString(), new String[] { "?" });
        final boolean b = false;
        final String s = k1.get(0);
        final hlv b2 = dta.b();
        zzd.e((Object)b2, "getCurrent()");
        final boolean q = b2.q("ocf_2fa_enrollment_bouncer_enabled", false);
        final boolean b3 = b2.q("zazu_native_report_flow_tweets_enabled", false) || b2.q("zazu_native_report_flow_profile_enabled", false) || b2.q("zazu_native_report_flow_lists_enabled", false);
        int n = 0;
        Label_0146: {
            if (!q || !zzd.a((Object)"/1.1/onboarding/bounce.json", (Object)s)) {
                n = (b ? 1 : 0);
                if (!b3) {
                    break Label_0146;
                }
                n = (b ? 1 : 0);
                if (!zzd.a((Object)"/1.1/report/flow.json", (Object)s)) {
                    break Label_0146;
                }
            }
            n = 1;
        }
        if (n != 0) {
            final vbs vbs = (vbs)tsc.g;
            if (vbs != null) {
                final abs a = vbs.a;
                if (a != null) {
                    final String a2 = a.a;
                    if (a2 != null) {
                        this.C0.a(a2, s);
                    }
                }
            }
        }
    }
}
