// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.hero.di;

import java.util.Objects;
import android.app.Activity;

public final class HeroObjectGraph_ImplicitObjectSubgraph_SSM_Private_Provide3Factory implements wqa<qn>
{
    public static qn a(qn w, final Activity activity) {
        final HeroObjectGraph.a a = (HeroObjectGraph.a)ca7.u((Class)HeroObjectGraph.a.class);
        zzd.f((Object)w, "activityLifecycle");
        zzd.f((Object)activity, "activity");
        w = w.w(activity);
        Objects.requireNonNull(w, "Cannot return null from a non-@Nullable @Provides method");
        return w;
    }
    
    public final Object get() {
        throw null;
    }
}
