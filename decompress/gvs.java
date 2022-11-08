// 
// Decompiled by Procyon v0.6.0
// 

public final class gvs
{
    public gvs(final lcv<nws> lcv, final boolean b, final t3a t3a, final z7x z7x, final zoi<nws> zoi) {
        final hlv c = dta.c();
        boolean b2 = true;
        if (!c.b("livepipeline_client_enabled", true) || !dta.c().b("livepipeline_tweetengagement_enabled", true) || dcs.A()) {
            b2 = false;
        }
        if (b2 && b) {
            final k6m h0 = lcv.H0;
            pf8.r(t3a);
            new q6t((gnf)h0, t3a, gp.b(), z7x, wau.c(), (vqa)new fvs((Object)zoi, 0));
        }
    }
}
