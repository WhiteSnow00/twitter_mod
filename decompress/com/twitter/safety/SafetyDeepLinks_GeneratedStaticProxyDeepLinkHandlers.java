// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.safety;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class SafetyDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent SafetyDeepLinks_deepLinkToLeaveConversationPrompt(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new i6p(context, bundle, 5));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026tExtras(extras)\n        }");
        return c;
    }
}
