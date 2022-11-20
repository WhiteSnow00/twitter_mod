// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.search.implementation.deeplinks;

import android.os.Bundle;
import android.content.Intent;
import android.content.Context;

public class SearchDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent SearchDeepLinks_deepLinkToSearchSettings(final Context context) {
        czd.f((Object)context, "context");
        final Intent c = rc8.c(context, (spa)new qh(context, 1));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026ingsActivityArgs())\n    }");
        return c;
    }
    
    public static Intent SearchDeepLinks_deepLinkToWebSearchStar(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent b = rc8.b(context, (spa)new i6p(bundle, context, 0));
        czd.e((Object)b, "wrapLogInIfLoggedOutInte\u2026(context)\n        }\n    }");
        return b;
    }
    
    public static Intent SearchDeepLinks_deeplinkToAppSearch(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent b = rc8.b(context, (spa)new p9c((Object)bundle, context, 2));
        czd.e((Object)b, "wrapLogInIfLoggedOutInte\u2026backIntent(context)\n    }");
        return b;
    }
    
    public static Intent SearchDeepLinks_deeplinkToHashTag(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent b = rc8.b(context, (spa)new j6p(bundle, context, 0));
        czd.e((Object)b, "wrapLogInIfLoggedOutInte\u2026(context)\n        }\n    }");
        return b;
    }
    
    public static Intent SearchDeepLinks_deeplinkToWebSearch(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent b = rc8.b(context, (spa)new iot(bundle, context, 1));
        czd.e((Object)b, "wrapLogInIfLoggedOutInte\u2026backIntent(context)\n    }");
        return b;
    }
    
    public static Intent SearchDeepLinks_deeplinkToWebSearchRealtime(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent b = rc8.b(context, (spa)new kdu(bundle, context, 3));
        czd.e((Object)b, "wrapLogInIfLoggedOutInte\u2026(context, args)\n        }");
        return b;
    }
    
    public static Intent SearchDeepLinks_deeplinkToWebUserSearchStar(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent b = rc8.b(context, (spa)new vmo(bundle, context, 1));
        czd.e((Object)b, "wrapLogInIfLoggedOutInte\u2026(context, args)\n        }");
        return b;
    }
}
