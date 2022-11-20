// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.professionalhome.di;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class ProfessionalHomeDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent ProfessionalHomeDeepLinks_deepLinkToProfessionalHome(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new ph(context, 3));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026tentViewArgs())\n        }");
        return c;
    }
}
