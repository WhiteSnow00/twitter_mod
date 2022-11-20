// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.settings.overview;

import com.twitter.business.settings.overview.di.ProfessionalSettingsRetainedObjectGraph;
import android.content.Intent;
import com.twitter.business.settings.overview.di.ProfessionalSettingsViewObjectGraph$b;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/twitter/business/settings/overview/ProfessionalSettingsActivity;", "Lvmd;", "<init>", "()V", "feature.tfa.business.settings.overview_release" }, k = 1, mv = { 1, 7, 1 })
public final class ProfessionalSettingsActivity extends vmd
{
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final bai f2 = ((hbi)nh.c((mdc)this, (Class)ProfessionalSettingsViewObjectGraph$b.class)).f2();
        czd.c((Object)f2);
        czd.c((Object)f2.f());
    }
    
    public final void onNewIntent(final Intent intent) {
        czd.f((Object)intent, "intent");
        super.onNewIntent(intent);
        ((ProfessionalSettingsRetainedObjectGraph)w1e.g((x1e)this)).y0().onNext((Object)h5l$d.a);
    }
}
