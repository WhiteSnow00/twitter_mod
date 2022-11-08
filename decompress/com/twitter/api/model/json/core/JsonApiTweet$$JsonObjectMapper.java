// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.twitter.model.json.unifiedcard.JsonGraphQlUnifiedCard$$JsonObjectMapper;
import com.twitter.model.json.card.JsonGraphQlCard$$JsonObjectMapper;
import com.twitter.api.model.json.trustedfriends.JsonTrustedFriendsMetadata$$JsonObjectMapper;
import com.twitter.api.model.json.trustedfriends.JsonTrustedFriendsInfo$$JsonObjectMapper;
import com.twitter.api.model.json.superfollow.JsonUserLegacyScreenName$$JsonObjectMapper;
import com.twitter.model.json.core.JsonTweetQuickPromoteEligibility$$JsonObjectMapper;
import com.twitter.model.json.replyvoting.JsonReplyVotingPerspective$$JsonObjectMapper;
import com.twitter.api.model.json.reactions.JsonGraphQlTweetReactionTypeMap$$JsonObjectMapper;
import com.twitter.api.model.json.reactions.JsonReactionPerspective$$JsonObjectMapper;
import com.twitter.api.model.json.superfollow.JsonExclusiveTweetInfo$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonApiTweet$$JsonObjectMapper extends JsonMapper<JsonApiTweet>
{
    public static final pr9 EDIT_CONTROL_CONVERTER;
    
    static {
        EDIT_CONTROL_CONVERTER = new pr9();
    }
    
    public static JsonApiTweet _parse(final khe khe) throws IOException {
        final JsonApiTweet jsonApiTweet = new JsonApiTweet();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonApiTweet, d, khe);
            khe.m0();
        }
        return jsonApiTweet;
    }
    
    public static void _serialize(final JsonApiTweet jsonApiTweet, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonApiTweet.j0 != null) {
            LoganSquare.typeConverterFor((Class)pz1.class).serialize((Object)jsonApiTweet.j0, "ext_birdwatch_pivot", true, tfe);
        }
        if (jsonApiTweet.l0 != null) {
            LoganSquare.typeConverterFor((Class)lh5.class).serialize((Object)jsonApiTweet.l0, "community", true, tfe);
        }
        if (jsonApiTweet.Y != null) {
            tfe.i("core");
            JsonApiTweet$JsonGraphQlTweetCore$$JsonObjectMapper._serialize(jsonApiTweet.Y, tfe, true);
        }
        final ir9 p3 = jsonApiTweet.p0;
        if (p3 == null) {
            if (jsonApiTweet.u0 != null) {
                tfe.i("exclusive_tweet_info");
                JsonExclusiveTweetInfo$$JsonObjectMapper._serialize(jsonApiTweet.u0, tfe, true);
            }
            if (jsonApiTweet.g0 != null) {
                LoganSquare.typeConverterFor((Class)hir.class).serialize((Object)jsonApiTweet.g0, "ext", true, tfe);
            }
            tfe.e("ext_has_birdwatch_notes", jsonApiTweet.i0);
            tfe.W("id_str", jsonApiTweet.b0);
            if (jsonApiTweet.w0 != null) {
                tfe.i("reaction_perspective");
                JsonReactionPerspective$$JsonObjectMapper._serialize(jsonApiTweet.w0, tfe, true);
            }
            if (jsonApiTweet.v0 != null) {
                tfe.i("reaction_metadata");
                JsonGraphQlTweetReactionTypeMap$$JsonObjectMapper._serialize(jsonApiTweet.v0, tfe, true);
            }
            if (jsonApiTweet.y0 != null) {
                tfe.i("downvote_perspective");
                JsonReplyVotingPerspective$$JsonObjectMapper._serialize(jsonApiTweet.y0, tfe, true);
            }
            if (jsonApiTweet.x0 != null) {
                tfe.i("quick_promote_eligibility");
                JsonTweetQuickPromoteEligibility$$JsonObjectMapper._serialize(jsonApiTweet.x0, tfe, true);
            }
            if (jsonApiTweet.V != null) {
                tfe.i("legacy");
                JsonApiTweet$JsonGraphQlLegacyApiTweet$$JsonObjectMapper._serialize(jsonApiTweet.V, tfe, true);
            }
            if (jsonApiTweet.s0 != null) {
                LoganSquare.typeConverterFor((Class)mcf.class).serialize((Object)jsonApiTweet.s0, "ext_limited_action_results", true, tfe);
            }
            if (jsonApiTweet.q0 != null) {
                LoganSquare.typeConverterFor((Class)ayk.class).serialize((Object)jsonApiTweet.q0, "ext_previous_counts", true, tfe);
            }
            if (jsonApiTweet.a0 != null) {
                LoganSquare.typeConverterFor((Class)rh0$a.class).serialize((Object)jsonApiTweet.a0, "quoted_status", true, tfe);
            }
            if (jsonApiTweet.Z != null) {
                LoganSquare.typeConverterFor((Class)apu$a.class).serialize((Object)jsonApiTweet.Z, "quoted_status_result", true, tfe);
            }
            tfe.W("rest_id", jsonApiTweet.U);
            if (jsonApiTweet.e0 != null) {
                LoganSquare.typeConverterFor((Class)rh0.class).serialize((Object)jsonApiTweet.e0, "retweeted_status", true, tfe);
            }
            tfe.u0("retweeted_status_id_str", jsonApiTweet.f0);
            if (jsonApiTweet.t0 != null) {
                tfe.i("super_follows_conversation_user_results");
                JsonUserLegacyScreenName$$JsonObjectMapper._serialize(jsonApiTweet.t0, tfe, true);
            }
            tfe.u0("text", jsonApiTweet.c0);
            if (jsonApiTweet.z0 != null) {
                tfe.i("trusted_friends_info_result");
                JsonTrustedFriendsInfo$$JsonObjectMapper._serialize(jsonApiTweet.z0, tfe, true);
            }
            if (jsonApiTweet.A0 != null) {
                tfe.i("ext_trusted_friends_metadata");
                JsonTrustedFriendsMetadata$$JsonObjectMapper._serialize(jsonApiTweet.A0, tfe, true);
            }
            if (jsonApiTweet.W != null) {
                tfe.i("tweet_card");
                JsonGraphQlCard$$JsonObjectMapper._serialize(jsonApiTweet.W, tfe, true);
            }
            if (jsonApiTweet.m0 != null) {
                LoganSquare.typeConverterFor((Class)odu.class).serialize((Object)jsonApiTweet.m0, "community_relationship", true, tfe);
            }
            if (jsonApiTweet.r0 != null) {
                LoganSquare.typeConverterFor((Class)oeu.class).serialize((Object)jsonApiTweet.r0, "conversation_context", true, tfe);
            }
            if (jsonApiTweet.X != null) {
                tfe.i("unified_card");
                JsonGraphQlUnifiedCard$$JsonObjectMapper._serialize(jsonApiTweet.X, tfe, true);
            }
            if (jsonApiTweet.o0 != null) {
                LoganSquare.typeConverterFor((Class)nzv.class).serialize((Object)jsonApiTweet.o0, "unmention_data", true, tfe);
            }
            if (jsonApiTweet.n0 != null) {
                LoganSquare.typeConverterFor((Class)fzv.class).serialize((Object)jsonApiTweet.n0, "unmention_info", true, tfe);
            }
            if (jsonApiTweet.d0 != null) {
                LoganSquare.typeConverterFor((Class)hfv.class).serialize((Object)jsonApiTweet.d0, "user", true, tfe);
            }
            tfe.W("view_count", jsonApiTweet.h0);
            if (jsonApiTweet.k0 != null) {
                LoganSquare.typeConverterFor((Class)efx.class).serialize((Object)jsonApiTweet.k0, "ext_voice_info", true, tfe);
            }
            BaseJsonApiTweet$$JsonObjectMapper._serialize((BaseJsonApiTweet)jsonApiTweet, tfe, false);
            if (b) {
                tfe.h();
            }
            return;
        }
        ((twj<ir9>)JsonApiTweet$$JsonObjectMapper.EDIT_CONTROL_CONVERTER).serialize(p3, "ext_edit_control", true, tfe);
        throw null;
    }
    
    public static void parseField(final JsonApiTweet jsonApiTweet, final String s, final khe khe) throws IOException {
        if (!"ext_birdwatch_pivot".equals(s) && !"birdwatch_pivot".equals(s)) {
            if ("community".equals(s)) {
                jsonApiTweet.l0 = (lh5)LoganSquare.typeConverterFor((Class)lh5.class).parse(khe);
            }
            else if ("core".equals(s)) {
                jsonApiTweet.Y = JsonApiTweet$JsonGraphQlTweetCore$$JsonObjectMapper._parse(khe);
            }
            else if (!"ext_edit_control".equals(s) && !"edit_control".equals(s)) {
                if ("exclusive_tweet_info".equals(s)) {
                    jsonApiTweet.u0 = JsonExclusiveTweetInfo$$JsonObjectMapper._parse(khe);
                }
                else if ("ext".equals(s)) {
                    jsonApiTweet.g0 = (hir)LoganSquare.typeConverterFor((Class)hir.class).parse(khe);
                }
                else if (!"ext_has_birdwatch_notes".equals(s) && !"has_birdwatch_notes".equals(s)) {
                    if (!"id_str".equals(s) && !"id".equals(s)) {
                        if ("reaction_perspective".equals(s)) {
                            jsonApiTweet.w0 = JsonReactionPerspective$$JsonObjectMapper._parse(khe);
                        }
                        else if ("reaction_metadata".equals(s)) {
                            jsonApiTweet.v0 = JsonGraphQlTweetReactionTypeMap$$JsonObjectMapper._parse(khe);
                        }
                        else if (!"downvote_perspective".equals(s) && !"ext_replyvoting_downvote_perspective".equals(s)) {
                            if ("quick_promote_eligibility".equals(s)) {
                                jsonApiTweet.x0 = JsonTweetQuickPromoteEligibility$$JsonObjectMapper._parse(khe);
                            }
                            else if ("legacy".equals(s)) {
                                jsonApiTweet.V = JsonApiTweet$JsonGraphQlLegacyApiTweet$$JsonObjectMapper._parse(khe);
                            }
                            else if (!"ext_limited_action_results".equals(s) && !"limited_action_results".equals(s)) {
                                if (!"ext_previous_counts".equals(s) && !"previous_counts".equals(s)) {
                                    if ("quoted_status".equals(s)) {
                                        jsonApiTweet.a0 = (rh0$a)LoganSquare.typeConverterFor((Class)rh0$a.class).parse(khe);
                                    }
                                    else if ("quoted_status_result".equals(s)) {
                                        jsonApiTweet.Z = (apu$a)LoganSquare.typeConverterFor((Class)apu$a.class).parse(khe);
                                    }
                                    else if ("rest_id".equals(s)) {
                                        jsonApiTweet.U = khe.L();
                                    }
                                    else if ("retweeted_status".equals(s)) {
                                        jsonApiTweet.e0 = (rh0)LoganSquare.typeConverterFor((Class)rh0.class).parse(khe);
                                    }
                                    else if ("retweeted_status_id_str".equals(s)) {
                                        jsonApiTweet.f0 = khe.T((String)null);
                                    }
                                    else if ("super_follows_conversation_user_results".equals(s)) {
                                        jsonApiTweet.t0 = JsonUserLegacyScreenName$$JsonObjectMapper._parse(khe);
                                    }
                                    else if ("text".equals(s)) {
                                        jsonApiTweet.c0 = khe.T((String)null);
                                    }
                                    else if ("trusted_friends_info_result".equals(s)) {
                                        jsonApiTweet.z0 = JsonTrustedFriendsInfo$$JsonObjectMapper._parse(khe);
                                    }
                                    else if ("ext_trusted_friends_metadata".equals(s)) {
                                        jsonApiTweet.A0 = JsonTrustedFriendsMetadata$$JsonObjectMapper._parse(khe);
                                    }
                                    else if ("tweet_card".equals(s)) {
                                        jsonApiTweet.W = JsonGraphQlCard$$JsonObjectMapper._parse(khe);
                                    }
                                    else if ("community_relationship".equals(s)) {
                                        jsonApiTweet.m0 = (odu)LoganSquare.typeConverterFor((Class)odu.class).parse(khe);
                                    }
                                    else if ("conversation_context".equals(s)) {
                                        jsonApiTweet.r0 = (oeu)LoganSquare.typeConverterFor((Class)oeu.class).parse(khe);
                                    }
                                    else if ("unified_card".equals(s)) {
                                        jsonApiTweet.X = JsonGraphQlUnifiedCard$$JsonObjectMapper._parse(khe);
                                    }
                                    else if ("unmention_data".equals(s)) {
                                        jsonApiTweet.o0 = (nzv)LoganSquare.typeConverterFor((Class)nzv.class).parse(khe);
                                    }
                                    else if ("unmention_info".equals(s)) {
                                        jsonApiTweet.n0 = (fzv)LoganSquare.typeConverterFor((Class)fzv.class).parse(khe);
                                    }
                                    else if ("user".equals(s)) {
                                        jsonApiTweet.d0 = (hfv)LoganSquare.typeConverterFor((Class)hfv.class).parse(khe);
                                    }
                                    else if (!"view_count".equals(s) && !"ext_view_count".equals(s)) {
                                        if (!"ext_voice_info".equals(s) && !"voice_info".equals(s)) {
                                            BaseJsonApiTweet$$JsonObjectMapper.parseField((BaseJsonApiTweet)jsonApiTweet, s, khe);
                                        }
                                        else {
                                            jsonApiTweet.k0 = (efx)LoganSquare.typeConverterFor((Class)efx.class).parse(khe);
                                        }
                                    }
                                    else {
                                        jsonApiTweet.h0 = khe.L();
                                    }
                                }
                                else {
                                    jsonApiTweet.q0 = (ayk)LoganSquare.typeConverterFor((Class)ayk.class).parse(khe);
                                }
                            }
                            else {
                                jsonApiTweet.s0 = (mcf)LoganSquare.typeConverterFor((Class)mcf.class).parse(khe);
                            }
                        }
                        else {
                            jsonApiTweet.y0 = JsonReplyVotingPerspective$$JsonObjectMapper._parse(khe);
                        }
                    }
                    else {
                        jsonApiTweet.b0 = khe.L();
                    }
                }
                else {
                    jsonApiTweet.i0 = khe.k();
                }
            }
            else {
                jsonApiTweet.p0 = (ir9)((age)JsonApiTweet$$JsonObjectMapper.EDIT_CONTROL_CONVERTER).parse(khe);
            }
        }
        else {
            jsonApiTweet.j0 = (pz1)LoganSquare.typeConverterFor((Class)pz1.class).parse(khe);
        }
    }
    
    public JsonApiTweet parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonApiTweet jsonApiTweet, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonApiTweet, tfe, b);
    }
}
