// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class ProfileDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent ProfileDeepLinks_deepLinkToEditProfileActivity(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new f9l((Object)context, 0));
    }
    
    public static Intent ProfileDeepLinks_deepLinkToEnableDeviceFollow(final Context context, final Bundle bundle) {
        return rc8.b(context, (spa)new i6p(bundle, context, 1));
    }
    
    public static Intent ProfileDeepLinks_deepLinkToFavorites(final Context context, final Bundle bundle) {
        return rc8.b(context, (spa)new e9l(context, 0));
    }
    
    public static Intent ProfileDeepLinks_deepLinkToUserFavorites(final Context context, final Bundle bundle) {
        return rc8.b(context, (spa)new g9l(bundle, context, 0));
    }
}
