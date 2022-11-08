import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f7f implements gow
{
    public final Map<String, Boolean> c() {
        final hlv b = dta.b();
        zzd.e((Object)b, "getAdditionalVariables$lambda$0");
        return vkg.p1(vkg.k1(new gvj[] { new gvj((Object)"includeHasBirdwatchNotes", (Object)b.b("birdwatch_consumption_enabled", false)), new gvj((Object)"includeVoiceInfo", (Object)b.b("android_audio_voice_info_consumption_enabled", false)), new gvj((Object)"include_tweet_quick_promote_eligibility", (Object)ck1.m()), new gvj((Object)"includeUnmentionInfo", (Object)b.b("dont_mention_me_view_api_enabled", false)), new gvj((Object)"includeTrustedFriendsFields", (Object)b.b("trusted_friends_api_enabled", false)), new gvj((Object)"includeUnifiedCard", (Object)b.b("graphql_unified_card_enabled", false)) }), vkg.k1(new gvj[] { new gvj((Object)"include_has_nft", (Object)b.b("creator_android_nft_avatar_gql_include_enabled", false)), new gvj((Object)"include_viewer_quick_promote_eligibility", (Object)ck1.m()), new gvj((Object)"includeSpaceDeviceFollowing", (Object)b.b("android_audio_spaces_device_follow_api_enabled", false)), new gvj((Object)"includeUserType", (Object)b.b("signupless_include_user_type", false)) }));
    }
}
