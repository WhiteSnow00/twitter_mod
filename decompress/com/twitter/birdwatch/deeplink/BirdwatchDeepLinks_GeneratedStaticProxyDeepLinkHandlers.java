// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.birdwatch.deeplink;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class BirdwatchDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent BirdwatchDeepLinks_deepLinkToBirdwatchHistoryPage(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new zwb(bundle, context, 4));
    }
    
    public static Intent BirdwatchDeepLinks_deepLinkToBirdwatchNotePage(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new p5p(bundle, context, 2));
    }
    
    public static Intent BirdwatchDeepLinks_deepLinkToBirdwatchTweetPage(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new gmo((Object)bundle, context, 2));
    }
}
