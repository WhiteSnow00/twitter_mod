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
            a = "";
        }
        final Intent c = rc8.c(context, (spa)new kx9(context, a, (Object)bundle, 0));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026)\n            }\n        }");
        return c;
    }
}
