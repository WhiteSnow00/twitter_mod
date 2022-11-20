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
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        Intent intent;
        if (g63.W()) {
            intent = rc8.c(context, (spa)new vmo(context, bundle, 4));
            czd.e((Object)intent, "{\n            DeepLinkUt\u2026)\n            }\n        }");
        }
        else {
            intent = ((Activity)context).getIntent();
            czd.e((Object)intent, "{\n            (context a\u2026ctivity).intent\n        }");
        }
        return intent;
    }
    
    public static Intent SafetyModePreviewDeepLinks_openSafetyModeFlaggedTweets(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final String string = ((BaseBundle)bundle).getString("user_id");
        Long value;
        if (string != null) {
            value = Long.parseLong(string);
        }
        else {
            value = null;
        }
        Intent intent;
        if (g63.W() && value != null) {
            intent = rc8.c(context, (spa)new nqo(context, value, bundle));
            czd.e((Object)intent, "{\n            DeepLinkUt\u2026)\n            }\n        }");
        }
        else {
            intent = ((Activity)context).getIntent();
            czd.e((Object)intent, "{\n            (context a\u2026ctivity).intent\n        }");
        }
        return intent;
    }
    
    public static Intent SafetyModePreviewDeepLinks_openSafetyModePreview(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final byte[] byteArray = bundle.getByteArray("ref_event_namespace");
        Objects.requireNonNull(vba.Companion);
        final vba vba = (vba)klp.a(byteArray, (rlp)vba$b.b);
        String a = null;
        Label_0056: {
            if (vba != null) {
                a = vba.a;
                if (a != null) {
                    break Label_0056;
                }
            }
            a = "notification";
        }
        Intent intent;
        if (g63.W()) {
            intent = rc8.c(context, (spa)new kx9(context, a, (Object)bundle, 1));
            czd.e((Object)intent, "{\n            DeepLinkUt\u2026)\n            }\n        }");
        }
        else {
            intent = ((Activity)context).getIntent();
            czd.e((Object)intent, "{\n            (context a\u2026ctivity).intent\n        }");
        }
        return intent;
    }
}
