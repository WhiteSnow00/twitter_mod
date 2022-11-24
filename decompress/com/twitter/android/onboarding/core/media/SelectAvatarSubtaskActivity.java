// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.media;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import com.twitter.android.onboarding.core.media.di.view.SelectAvatarSubtaskViewObjectGraph;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/twitter/android/onboarding/core/media/SelectAvatarSubtaskActivity;", "Lvnd;", "<init>", "()V", "feature.tfa.onboarding.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class SelectAvatarSubtaskActivity extends vnd
{
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final rdp w = ((SelectAvatarSubtaskViewObjectGraph)((x9)this.b1()).n()).w();
        Objects.requireNonNull(w);
        if (n == 3 && intent != null) {
            final Uri data = intent.getData();
            if (data != null) {
                final Context b = w.b;
                final e2h j0 = e2h.J0;
                w.a.K0.a(dwg.f(b, data).G((rk6)new zna((stb)new qdp(w), 7), (rk6)lvb.e));
            }
        }
    }
}
