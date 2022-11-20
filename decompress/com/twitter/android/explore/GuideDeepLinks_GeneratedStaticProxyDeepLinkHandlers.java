// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.explore;

import android.os.BaseBundle;
import com.twitter.android.settings.TrendsPrefActivity;
import com.twitter.android.explore.settings.ExploreSettingsActivity;
import java.io.Serializable;
import com.twitter.android.trends.TrendsLocationsActivity;
import com.twitter.android.explore.locations.ExploreLocationsActivity;
import android.net.Uri;
import com.twitter.model.liveevent.LiveEventConfiguration;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class GuideDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent GuideDeepLinks_deepLinkToCategoryGuide(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new p9c((Object)bundle, context, 0));
    }
    
    public static Intent GuideDeepLinks_deepLinkToExploreTabs(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new kdu(bundle, context, 1));
    }
    
    public static Intent GuideDeepLinks_deepLinkToGuideLocationsSettings(final Context context) {
        return an.a().a(context, new yja());
    }
    
    public static Intent GuideDeepLinks_deepLinkToGuideSettings(final Context context) {
        return an.a().a(context, new yka());
    }
    
    public static rcs GuideDeepLinks_deepLinkToLiveEventPage(final Context context, final Bundle bundle) {
        if (asa.b().b("live_event_experience_enabled", true)) {
            final String string = ((BaseBundle)bundle).getString("id", "INVALID_ID");
            if (!"INVALID_ID".equals(string)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("events/timeline/");
                sb.append(string);
                final Intent a = an.a().a(context, new evf((LiveEventConfiguration)((n4j)azf.b(Uri.parse(sb.toString()))).e()));
                return m1f.d().Z0().a(context, a, "moments", a);
            }
        }
        return null;
    }
    
    public static rcs RuxLandingPagesDeepLinks_deepLinkToRuxLandingPage(final Context context, final Bundle bundle) {
        return m1f.d().Z0().a(context, rc8.c(context, (spa)new umo(bundle, context, 0)), ((BaseBundle)bundle).getString("tab"), (Intent)null);
    }
    
    public static Intent RuxLandingPagesDeepLinks_deepLinktoTweetDetailsWithRuxContext(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new vmo(bundle, context, 0));
    }
    
    public static Intent TopicLandingPagesDeepLinks_deepLinkToNewsTopicPage(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new jot(bundle, context, 0));
    }
    
    public static Intent TopicLandingPagesDeepLinks_deepLinkToSemanticCoreTopicPage(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new hot(bundle, context, 0));
    }
    
    public static Intent TopicLandingPagesDeepLinks_deepLinkToSimClusterTopicPage(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new kdu(bundle, context, 2));
    }
    
    public static Intent TopicLandingPagesDeepLinks_deepLinkToTttTopicPage(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new iot(bundle, context, 0));
    }
    
    public static Intent TopicLandingPagesDeepLinks_deepLinkToTweetTopicPage(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new p9c((Object)bundle, context, 1));
    }
    
    public static Intent TrendsSettingsDeepLinks_deepLinkToTrendsLocationsSettings(final Context context, final Bundle bundle) {
        Serializable s;
        if (s9c.b()) {
            s = ExploreLocationsActivity.class;
        }
        else {
            s = TrendsLocationsActivity.class;
        }
        return rc8.c(context, (spa)new cw4(context, (Class)s));
    }
    
    public static Intent TrendsSettingsDeepLinks_deepLinkToTrendsSettings(final Context context, final Bundle bundle) {
        Serializable s;
        if (s9c.b()) {
            s = ExploreSettingsActivity.class;
        }
        else {
            s = TrendsPrefActivity.class;
        }
        return rc8.c(context, (spa)new g9l(context, (Object)s, 7));
    }
}
