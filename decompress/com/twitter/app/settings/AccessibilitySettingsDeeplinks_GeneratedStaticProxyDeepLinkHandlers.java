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
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final Intent c = gd8.c(context, (vqa<Intent>)new hmo((Object)nn6.Companion.a(), context, 4));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026ttingsViewArgs)\n        }");
        return c;
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToAccessibilitySettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new si(context, 1));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToAccountSettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new si(context, 0));
    }
    
    public static wbs AccountSettingDeepLinks_deepLinkToAddOrUpdatePhone(final Context context, final Bundle bundle) {
        return iqg.b().Z0().a(context, gd8.c(context, (vqa<Intent>)new ti(context, 1)), "home", (Intent)null);
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToAutoblockedUsers(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new ti(context, 0));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToBlockedUsers(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new tg6(context, 2));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToChangePassword(final Context context, final Bundle bundle) {
        final on6 x8 = mn6.a().x8();
        Intent intent;
        if (UserIdentifier.getCurrent().isLoggedOutUser()) {
            intent = LoginArgs.attachExtraIntent(x8.a(context, (ContentViewArgs)new LoginArgs(false, null, null, false, null, null)), new Intent(context, (Class)UrlInterpreterActivity.class).setData(Uri.parse(((BaseBundle)bundle).getString("deep_link_uri"))));
        }
        else {
            intent = gd8.c(context, (vqa<Intent>)new gmo((Object)x8, context, 6));
        }
        return intent;
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToConnectedApps(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new ui(context, 0));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToDeviceSessions(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new ph(context, 1));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToFlaggedTweets(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new zwb(context, bundle, 3));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToLoginVerificationSettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new krl(context, 1));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToSafetyModeSettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new t8l(context, 2));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToSecuritySettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new t8l(context, 1));
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToSessions(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new u8l(context, 1));
    }
    
    public static wbs AccountSettingDeepLinks_deepLinkToUpdateEmail(final Context context, final Bundle bundle) {
        return iqg.b().Z0().a(context, gd8.c(context, (vqa<Intent>)new x1u(context, 2)), "home", (Intent)null);
    }
    
    public static Intent AccountSettingDeepLinks_deepLinkToUsernameSettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new x1u(context, 1));
    }
    
    public static Intent DataSettingsDeepLinks_deepLinkToDataSettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new x1u(context, 3));
    }
    
    public static Intent PersonalizationSettingsDeepLinks_deepLinkToPersonalizationSettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new ph(context, 2));
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToAdsPreferences(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final Intent c = gd8.c(context, (vqa<Intent>)new x1u(context, 4));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026esSettingsViewArgs)\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToAudienceAndTagging(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final Intent c = gd8.c(context, (vqa<Intent>)new tg6(context, 3));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026ngSettingsViewArgs)\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToDMSettings(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final Intent c = gd8.c(context, (vqa<Intent>)new t8l(context, 3));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026ingsActivityArgs())\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToLocationInfo(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final Intent c = gd8.c(context, (vqa<Intent>)new si(context, 2));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026onSettingsViewArgs)\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToMuteAndBlock(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final Intent c = gd8.c(context, (vqa<Intent>)new u8l(context, 2));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026dBlockActivityArgs)\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToReplySettings(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        Intent intent;
        if (dta.b().b("toxic_reply_filter_settings_enabled", false)) {
            intent = gd8.c(context, (vqa<Intent>)new ui(context, 1));
            zzd.e((Object)intent, "{\n        DeepLinkUtils.\u2026ViewArgs)\n        }\n    }");
        }
        else {
            intent = gd8.a(context);
            zzd.e((Object)intent, "{\n        DeepLinkUtils.\u2026backIntent(context)\n    }");
        }
        return intent;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToSafetySettings(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final Intent c = gd8.c(context, (vqa<Intent>)new ti(context, 2));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026tyArgs(),\n        )\n    }");
        return c;
    }
    
    public static Intent PrivacyAndSafetyDeepLinksKt_deepLinkToSettingsApplications(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final String string = context.getString(2131952056);
        zzd.e((Object)string, "context.getString(com.tw\u2026ng.apps_and_sessions_url)");
        final String string2 = context.getString(2131957702);
        zzd.e((Object)string2, "context.getString(com.tw\u2026ssions_apps_and_sessions)");
        final Intent c = gd8.c(context, (vqa<Intent>)new kzk(context, string2, string));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026              )\n        }");
        return c;
    }
    
    public static Intent RemoveContactsSettingsDeepLink_deepLinkToRemoveContactsSettings(final Context context, final Bundle bundle) {
        return gd8.c(context, (vqa<Intent>)new tg6(context, 4));
    }
    
    public static Intent SettingsRootDeepLinks_deepLinkToSettings(final Context context, final Bundle bundle) {
        zzd.f((Object)context, "context");
        zzd.f((Object)bundle, "extras");
        final Intent c = gd8.c(context, (vqa<Intent>)new ti(context, 3));
        zzd.e((Object)c, "wrapLoggedInOnlyIntent(c\u2026mpatActivityArgs())\n    }");
        return c;
    }
}
