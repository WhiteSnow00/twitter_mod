// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.educationprompts.deeplinks;

import java.util.Objects;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class EducationPromptsDeeplinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent EducationPromptsDeeplinks_openSafetyEducationPrompt(final Context context, final Bundle bundle) {
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
            a = "";
        }
        final Intent c = gd8.c(context, (vqa<Intent>)new xx9(context, a, bundle));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026)\n            }\n        }");
        return c;
    }
}
