// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topics.picker.deeplink;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class TopicsPickerDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent TopicsPickerDeepLinks_deepLinkToTopicsPicker(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new kdu(bundle, context, 4));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026)\n            }\n        }");
        return c;
    }
}
