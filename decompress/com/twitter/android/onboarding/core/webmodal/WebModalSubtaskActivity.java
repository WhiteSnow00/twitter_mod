// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.webmodal;

import android.os.BaseBundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "Lcom/twitter/android/onboarding/core/webmodal/WebModalSubtaskActivity;", "Lvnd;", "Lb0u;", "<init>", "()V", "Companion", "a", "feature.tfa.onboarding.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class WebModalSubtaskActivity extends vnd implements b0u
{
    public static final WebModalSubtaskActivity.WebModalSubtaskActivity$a Companion;
    
    static {
        Companion = new WebModalSubtaskActivity.WebModalSubtaskActivity$a();
    }
    
    public final void onCreate(final Bundle bundle) {
        final Bundle extras = ((Activity)this).getIntent().getExtras();
        boolean b = true;
        if (extras == null || !((BaseBundle)extras).containsKey("extra_target_link")) {
            b = false;
        }
        if (b) {
            this.finish();
            final Bundle extras2 = ((Activity)this).getIntent().getExtras();
            String string;
            if (extras2 != null) {
                string = ((BaseBundle)extras2).getString("deep_link_uri");
            }
            else {
                string = null;
            }
            r9a.d((Throwable)new IllegalArgumentException(mqb.l("Unexpected WebModal onNewIntent: finishing. ", string)));
        }
        super.onCreate(bundle);
    }
    
    public final void onNewIntent(Intent putExtras) {
        e0e.f((Object)putExtras, "intent");
        putExtras = ((Activity)this).getIntent().putExtras(putExtras);
        e0e.e((Object)putExtras, "getIntent().putExtras(intent)");
        super.onNewIntent(putExtras);
    }
}
