// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.media;

import android.net.Uri;
import android.content.Context;
import com.twitter.onboarding.ocf.media.SelectBannerSubtaskViewHost;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/twitter/android/onboarding/core/media/SelectBannerSubtaskActivity;", "Lvnd;", "<init>", "()V", "feature.tfa.onboarding.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class SelectBannerSubtaskActivity extends vnd
{
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final eo6 r = ((sml)k5b.b((y2e)this)).R();
        e0e.d((Object)r, "null cannot be cast to non-null type com.twitter.onboarding.ocf.media.SelectBannerSubtaskViewHost");
        final SelectBannerSubtaskViewHost selectBannerSubtaskViewHost = (SelectBannerSubtaskViewHost)r;
        if (n == 3 && intent != null) {
            final Uri data = intent.getData();
            if (data != null) {
                final vnd n3 = selectBannerSubtaskViewHost.N0;
                final e2h j0 = e2h.J0;
                final bbq f = dwg.f((Context)n3, data);
                final bep bep = new bep(selectBannerSubtaskViewHost);
                f.c((bdq)bep);
                selectBannerSubtaskViewHost.P0.a((b39)bep);
            }
        }
    }
}
