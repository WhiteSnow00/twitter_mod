// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.settings;

import android.os.BaseBundle;
import android.net.Uri;
import com.twitter.deeplink.implementation.UrlInterpreterActivity;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.account.navigation.LoginArgs;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;

public class AccessibilitySettingsDeeplinks_GeneratedStaticProxyDeepLinkHandlers
{
    public static Intent AccessibilitySettingsDeeplinks_deepLinkToLanguageSettings(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new rlt(tm6.Companion.a(), context));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026ttingsViewArgs)\n        }");
        return c;
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToAccessibilitySettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new ri(context, 1));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToAccountSettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new ri(context, 0));
    }
    
    public static rcs AccountSettingDeepLinks_deepLinkToAddOrUpdatePhone(final Context context, final Bundle bundle) {
        return m1f.d().Z0().a(context, rc8.c(context, (spa)new f9l((Object)context, 2)), "home", (Intent)null);
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToAutoblockedUsers(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new f9l((Object)context, 1));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToBlockedUsers(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new zrl((Object)context, 2));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToChangePassword(final Context context, final Bundle bundle) {
        final um6 x8 = sm6.a().x8();
        Intent intent;
        if (UserIdentifier.getCurrent().isLoggedOutUser()) {
            intent = LoginArgs.attachExtraIntent(x8.a(context, (ContentViewArgs)new LoginArgs(false, (String)null, (String)null, false, (String)null, (rf8)null)), new Intent(context, (Class)UrlInterpreterActivity.class).setData(Uri.parse(((BaseBundle)bundle).getString("deep_link_uri"))));
        }
        else {
            intent = rc8.c(context, (spa)new f94((Object)x8, context, 2));
        }
        return intent;
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToConnectedApps(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new zf6(context, 1));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToDeviceSessions(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new qh(context, 2));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToFlaggedTweets(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new j6p(context, bundle, 2));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToLoginVerificationSettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new si(context, 0));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToSafetyModeSettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new e9l(context, 2));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToSecuritySettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new e9l(context, 1));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToSessions(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new ph(context, 1));
    }
    
    public static rcs AccountSettingDeepLinks_deepLinkToUpdateEmail(final Context context, final Bundle bundle) {
        return m1f.d().Z0().a(context, rc8.c(context, (spa)new ti(context, 1)), "home", (Intent)null);
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToUsernameSettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new ti(context, 0));
    }
    
    public static Intent DataSettingsDeepLinks_deepLinkToDataSettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new ti(context, 2));
    }
    
    public static Intent PersonalizationSettingsDeepLinks_deepLinkToPersonalizationSettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new qh(context, 3));
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToAdsPreferences(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new ti(context, 3));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026esSettingsViewArgs)\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToAudienceAndTagging(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new zrl((Object)context, 3));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026ngSettingsViewArgs)\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToDMSettings(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new e9l(context, 3));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026ingsActivityArgs())\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToLocationInfo(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new ri(context, 2));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026onSettingsViewArgs)\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToMuteAndBlock(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new ph(context, 2));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026dBlockActivityArgs)\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToReplySettings(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        Intent intent;
        if (asa.b().b("toxic_reply_filter_settings_enabled", false)) {
            intent = rc8.c(context, (spa)new zf6(context, 2));
            czd.e((Object)intent, "{\n        DeepLinkUtils.\u2026ViewArgs)\n        }\n    }");
        }
        else {
            intent = rc8.a(context);
            czd.e((Object)intent, "{\n        DeepLinkUtils.\u2026backIntent(context)\n    }");
        }
        return intent;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToSafetySettings(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new f9l((Object)context, 3));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026tyArgs(),\n        )\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToSettingsApplications(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final String string = context.getString(2131952056);
        czd.e((Object)string, "context.getString(com.tw\u2026ng.apps_and_sessions_url)");
        final String string2 = context.getString(2131957702);
        czd.e((Object)string2, "context.getString(com.tw\u2026ssions_apps_and_sessions)");
        final Intent c = rc8.c(context, (spa)new szk(context, string2, string));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026              )\n        }");
        return c;
    }
    
    public static Intent RemoveContactsSettingsDeepLink_deepLinkToRemoveContactsSettings(final Context context, final Bundle bundle) {
        return rc8.c(context, (spa)new zrl((Object)context, 4));
    }
    
    public static Intent SettingsRootDeepLinks_deepLinkToSettings(final Context context, final Bundle bundle) {
        czd.f((Object)context, "context");
        czd.f((Object)bundle, "extras");
        final Intent c = rc8.c(context, (spa)new f9l((Object)context, 4));
        czd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026mpatActivityArgs())\n    }");
        return c;
    }
}
