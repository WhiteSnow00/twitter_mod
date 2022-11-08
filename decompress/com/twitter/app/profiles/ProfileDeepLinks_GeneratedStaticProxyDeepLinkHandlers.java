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
        return gd8.c(context, (vqa<Intent>)new t8l(context, 0));
    }
    
    public static Intent ProfileDeepLinks_deepLinkToEnableDeviceFollow(final Context context, final Bundle bundle) {
        return gd8.b(context, (vqa<Intent>)new p5p(bundle, context, 1));
    }
    
    public static Intent ProfileDeepLinks_deepLinkToFavorites(final Context context, final Bundle bundle) {
        return gd8.b(context, (vqa<Intent>)new u8l(context, 0));
    }
    
    public static Intent ProfileDeepLinks_deepLinkToUserFavorites(final Context context, final Bundle bundle) {
        return gd8.b(context, (vqa<Intent>)new zwb(bundle, context, 2));
    }
}
