import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hds implements vsd$a<Object, ids>
{
    public final wcs F0;
    
    public hds(final wcs f0) {
        e0e.f((Object)f0, "taskEndpointRepository");
        this.F0 = f0;
    }
    
    public final void b(final ag6<Object, ids> ag6, final xsc<ids, zbv> xsc) {
        e0e.f((Object)ag6, "request");
        final List n1 = wlr.N1((CharSequence)((gh0)ag6).h0().a.toString(), new String[] { "?" });
        final boolean b = false;
        final String s = n1.get(0);
        final rmv b2 = ita.b();
        e0e.e((Object)b2, "getCurrent()");
        final boolean q = b2.q("ocf_2fa_enrollment_bouncer_enabled", false);
        final boolean b3 = b2.q("zazu_native_report_flow_tweets_enabled", false) || b2.q("zazu_native_report_flow_profile_enabled", false) || b2.q("zazu_native_report_flow_lists_enabled", false);
        int n2 = 0;
        Label_0146: {
            if (!q || !e0e.a((Object)"/1.1/onboarding/bounce.json", (Object)s)) {
                n2 = (b ? 1 : 0);
                if (!b3) {
                    break Label_0146;
                }
                n2 = (b ? 1 : 0);
                if (!e0e.a((Object)"/1.1/report/flow.json", (Object)s)) {
                    break Label_0146;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            final ids ids = (ids)xsc.g;
            if (ids != null) {
                final ncs a = ids.a;
                if (a != null) {
                    final String a2 = a.a;
                    if (a2 != null) {
                        this.F0.a(a2, s);
                    }
                }
            }
        }
    }
}
