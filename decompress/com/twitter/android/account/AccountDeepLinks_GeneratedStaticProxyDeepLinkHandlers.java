// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.account;

import android.os.BaseBundle;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class AccountDeepLinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent AccountDeepLinks_deepLinkToSwitchAccounts(final Context context, final Bundle bundle) {
        final mgv e = caa.e();
        final adw m = e.m();
        if (m.g()) {
            ((uew)e).i(m.j().a);
        }
        return rc8.c(context, (spa)new qh(context, 0));
    }
    
    public static Intent AccountDeepLinks_deepLinkToTeamInvitations(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new ph(context, 0));
    }
    
    public static Intent ConnectPeopleDeepLinks_deepLinkToPeopleDiscovery(final Context context) {
        return rc8.c(context, (spa)new zf6(context, 0));
    }
    
    public static Intent FeatureSwitchDeepLinks_deepLinkToApplyFeatureSwitches(final Context context, final Bundle bundle) {
        if (((BaseBundle)bundle).getString("deep_link_uri") != null) {
            wk0.b().t();
        }
        return an.a().a(context, mfg.b(mfg.a));
    }
    
    public static Intent PrivacyDeepLinks_deepLinkToPrivacy(final Context context, final Bundle bundle) {
        final Uri a = f0l.a;
        return an.a().a(context, new vmx(f0l.b));
    }
    
    public static Intent PrivacyDeepLinks_deepLinkToTermsOfService(final Context context, final Bundle bundle) {
        final Uri a = f0l.a;
        return an.a().a(context, new vmx(f0l.a));
    }
    
    public static Intent TimelineDeepLinks_deepLinkToOpenPreviewTimeline(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new kx9(context, ((BaseBundle)bundle).getString("id"), (Object)((BaseBundle)bundle).getString("account_id"), 2));
    }
    
    public static Intent TimelineDeepLinks_deepLinkToQuoteTweetsTimeline(final Context context, final Bundle bundle) {
        final long o = ikr.o(((BaseBundle)bundle).getString("tweet_id"), 0L);
        final bn a = an.a();
        final mvl$a mvl$a = new mvl$a(context.getResources());
        mvl$a.c = o;
        return a.a(context, ((n4j)mvl$a).e());
    }
    
    public static Intent TopicsDeepLinks_deepLinkToInterestTopicLandingPage(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new jot(context, (Object)bundle, 1));
    }
    
    public static Intent TrendsDeepLinks_deeplinkToAppTrends(final Context context, final Bundle bundle) {
        return rc8.b(context, (spa)new zrl((Object)context, 1));
    }
    
    public static Intent TweetAnalyticsDeepLinks_deeplinkToAnalytics(final Context context, final Bundle bundle) {
        return rc8.b(context, (spa)new kdu(bundle, context, 0));
    }
    
    public static Intent UserTwitterDataDeepLinks_deepLinkToUserTwitterData(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new xjw((Object)context, 0));
    }
}
