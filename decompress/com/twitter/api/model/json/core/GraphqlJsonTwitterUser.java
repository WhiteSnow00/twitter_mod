// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class GraphqlJsonTwitterUser extends RestJsonTwitterUser
{
    @JsonField(name = { "professional" })
    public e4l A0;
    @JsonField(name = { "has_nft_avatar", "ext_has_nft_avatar" })
    public Boolean B0;
    @JsonField(name = { "verified_phone_status" })
    public Boolean C0;
    @JsonField(name = { "is_blue_verified", "ext_is_blue_verified" })
    public Boolean D0;
    @JsonField(name = { "affiliates_highlighted_label" })
    public xdw k0;
    @JsonField(name = { "is_profile_translatable" })
    public Boolean l0;
    @JsonField
    public JsonGraphQlLegacyTwitterUser m0;
    @JsonField(name = { "dm_muting" })
    public Boolean n0;
    @JsonField(name = { "super_follow_eligible" })
    public Boolean o0;
    @JsonField(name = { "super_followed_by" })
    public Boolean p0;
    @JsonField(name = { "super_following" })
    public Boolean q0;
    @JsonField(name = { "private_super_following" })
    public Boolean r0;
    @JsonField(name = { "exclusive_tweet_following" })
    public Boolean s0;
    @JsonField(name = { "tipjar" })
    public udt t0;
    @JsonField(name = { "smart_blocked_by" })
    public Boolean u0;
    @JsonField(name = { "smart_blocking" })
    public Boolean v0;
    @JsonField(name = { "smart_blocking_expiration" })
    public Long w0;
    @JsonField(name = { "space_device_following" })
    public Boolean x0;
    @JsonField(name = { "is_trusted_friends_list_member" })
    public Boolean y0;
    @JsonField(name = { "has_twitter_article" })
    public Boolean z0;
    
    @JsonObject
    public static class JsonGraphQlLegacyTwitterUser extends RestJsonTwitterUser
    {
    }
}
