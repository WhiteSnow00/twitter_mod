// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

import android.os.Bundle;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/twitter/brandedlikepreview/BrandedLikePreviewActivity;", "Lvmd;", "<init>", "()V", "feature.tfa.branded-like-preview.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BrandedLikePreviewActivity extends vmd
{
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (!asa.b().b("branded_like_preview_enabled", false)) {
            this.finish();
        }
    }
}
