// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topics.management;

import android.os.BaseBundle;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class TopicDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent TopicDeepLinks_deepLinkToOpenTopicManagement(final Context context, final Bundle bundle) {
        final Intent intent = new Intent();
        intent.putExtras(bundle);
        return rc8.c(context, (spa)new rlt(context, (Object)intent, 0));
    }
    
    public static Intent TopicDeepLinks_deepLinkToTopicsPage(final Context context, final Bundle bundle) {
        final String string = ((BaseBundle)bundle).getString("screen_name");
        jee.k(string);
        return rc8.c(context, (spa)new f94(context, (Object)string, 1));
    }
}
