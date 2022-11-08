// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation.deeplink;

import android.os.BaseBundle;
import java.util.Objects;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class SafetyModePreviewDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent SafetyModePreviewDeepLinks_openSafetyModeFlaggedAccounts(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        Intent intent;
        if (oyz.Y()) {
            intent = gd8.c(context, (vqa<Intent>)new hmo(context, bundle, 2));
            zzd.e((Object)intent, "{\n            DeepLinkUt\u2026)\n            }\n        }");
        }
        else {
            intent = ((Activity)context).getIntent();
            zzd.e((Object)intent, "{\n            (context a\u2026ctivity).intent\n        }");
        }
        return intent;
    }
    
    public static Intent SafetyModePreviewDeepLinks_openSafetyModeFlaggedTweets(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final String string = ((BaseBundle)bundle).getString("user_id");
        Long value;
        if (string != null) {
            value = Long.parseLong(string);
        }
        else {
            value = null;
        }
        Intent intent;
        if (oyz.Y() && value != null) {
            intent = gd8.c(context, (vqa<Intent>)new tpo(context, value, bundle));
            zzd.e((Object)intent, "{\n            DeepLinkUt\u2026)\n            }\n        }");
        }
        else {
            intent = ((Activity)context).getIntent();
            zzd.e((Object)intent, "{\n            (context a\u2026ctivity).intent\n        }");
        }
        return intent;
    }
    
    public static Intent SafetyModePreviewDeepLinks_openSafetyModePreview(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final byte[] byteArray = bundle.getByteArray("ref_event_namespace");
        Objects.requireNonNull(nca.Companion);
        final nca nca = (nca)tkp.a(byteArray, (alp)nca.b.b);
        String a = null;
        Label_0056: {
            if (nca != null) {
                a = nca.a;
                if (a != null) {
                    break Label_0056;
                }
            }
            a = "notification";
        }
        Intent intent;
        if (oyz.Y()) {
            intent = gd8.c(context, (vqa<Intent>)new upo(context, a, bundle));
            zzd.e((Object)intent, "{\n            DeepLinkUt\u2026)\n            }\n        }");
        }
        else {
            intent = ((Activity)context).getIntent();
            zzd.e((Object)intent, "{\n            (context a\u2026ctivity).intent\n        }");
        }
        return intent;
    }
}
