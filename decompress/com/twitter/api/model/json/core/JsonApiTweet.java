// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.twitter.model.json.unifiedcard.BaseJsonUnifiedCard;
import com.twitter.api.model.json.trustedfriends.JsonTrustedFriendsMetadata$JsonTrustedFriendsMetadataWrapper;
import java.util.LinkedHashMap;
import com.twitter.api.model.json.superfollow.JsonUserLegacyWrapper;
import com.twitter.model.json.core.JsonEnrichments;
import com.twitter.model.vibe.Vibe;
import java.util.Objects;
import java.util.Map;
import android.text.TextUtils;
import com.twitter.api.model.json.trustedfriends.JsonTrustedFriendsInfo;
import com.twitter.model.json.replyvoting.JsonReplyVotingPerspective;
import com.twitter.model.json.core.JsonTweetQuickPromoteEligibility;
import com.twitter.api.model.json.reactions.JsonReactionPerspective;
import com.twitter.api.model.json.reactions.JsonGraphQlTweetReactionTypeMap;
import com.twitter.api.model.json.superfollow.JsonExclusiveTweetInfo;
import com.twitter.api.model.json.superfollow.JsonUserLegacyScreenName;
import com.twitter.model.json.unifiedcard.JsonGraphQlUnifiedCard;
import com.twitter.model.json.card.JsonGraphQlCard;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.api.model.json.trustedfriends.JsonTrustedFriendsMetadata;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonApiTweet extends BaseJsonApiTweet
{
    @JsonField(name = { "ext_trusted_friends_metadata" })
    public JsonTrustedFriendsMetadata A0;
    @JsonField
    public long U;
    @JsonField
    public JsonGraphQlLegacyApiTweet V;
    @JsonField
    public JsonGraphQlCard W;
    @JsonField
    public JsonGraphQlUnifiedCard X;
    @JsonField
    public JsonApiTweet.JsonApiTweet$JsonGraphQlTweetCore Y;
    @JsonField(name = { "quoted_status_result" })
    public upu.a Z;
    @JsonField
    public nh0$a a0;
    @JsonField(name = { "id_str", "id" })
    public long b0;
    @JsonField
    public String c0;
    @JsonField
    public cgv d0;
    @JsonField
    public nh0 e0;
    @JsonField
    public String f0;
    @JsonField
    public bjr g0;
    @JsonField(name = { "view_count", "ext_view_count" })
    public long h0;
    @JsonField(name = { "ext_has_birdwatch_notes", "has_birdwatch_notes" })
    public boolean i0;
    @JsonField(name = { "ext_birdwatch_pivot", "birdwatch_pivot" })
    public jz1 j0;
    @JsonField(name = { "ext_voice_info", "voice_info" })
    public yfx k0;
    @JsonField(name = { "community" })
    public tg5 l0;
    @JsonField(name = { "community_relationship" })
    public heu m0;
    @JsonField(name = { "unmention_info" })
    public wzv n0;
    @JsonField(name = { "unmention_data" })
    public e0w o0;
    @JsonField(name = { "ext_edit_control", "edit_control" }, typeConverter = xq9.class)
    public qq9 p0;
    @JsonField(name = { "ext_previous_counts", "previous_counts" })
    public iyk q0;
    @JsonField(name = { "conversation_context" })
    public hfu r0;
    @JsonField(name = { "ext_limited_action_results", "limited_action_results" })
    public ybf s0;
    @JsonField
    public JsonUserLegacyScreenName t0;
    @JsonField
    public JsonExclusiveTweetInfo u0;
    @JsonField(name = { "reaction_metadata" })
    public JsonGraphQlTweetReactionTypeMap v0;
    @JsonField(name = { "reaction_perspective" })
    public JsonReactionPerspective w0;
    @JsonField(name = { "quick_promote_eligibility" })
    public JsonTweetQuickPromoteEligibility x0;
    @JsonField(name = { "downvote_perspective", "ext_replyvoting_downvote_perspective" })
    public JsonReplyVotingPerspective y0;
    @JsonField(name = { "trusted_friends_info_result" })
    public JsonTrustedFriendsInfo z0;
    
    public JsonApiTweet() {
        this.U = -1L;
        this.b0 = -1L;
    }
    
    public final /* bridge */ n4j t() {
        return (n4j)this.v();
    }
    
    public final nh0$a v() {
        final long u = this.U;
        wzv t = null;
        final ozl ozl = null;
        if (u != -1L) {
            final JsonApiTweet.JsonApiTweet$JsonGraphQlTweetCore y = this.Y;
            cgv d;
            if (y != null) {
                d = toe.d(y.a);
            }
            else {
                d = null;
            }
            final JsonGraphQlLegacyApiTweet v = this.V;
            nh0$a nh0$a;
            if (v != null) {
                if (v.w() == null) {
                    final JsonGraphQlCard w = this.W;
                    if (w != null) {
                        this.V.a = w.a;
                    }
                    final JsonEnrichments r = super.R;
                    if (r != null) {
                        this.V.R = r;
                    }
                    final Vibe s = super.S;
                    if (s != null) {
                        this.V.S = s;
                    }
                    final JsonGraphQlLegacyApiTweet v2 = this.V;
                    v2.c = super.c;
                    final e0w o0 = this.o0;
                    wzv wzv;
                    if (o0 != null) {
                        wzv = o0.a;
                    }
                    else {
                        wzv = this.n0;
                    }
                    final ybf s2 = this.s0;
                    if (s2 != null) {
                        v2.T = s2;
                    }
                    final eku$a h = v2.h;
                    if (h != null) {
                        h.g = wzv;
                    }
                    final nh0$a v3 = v2.v();
                    final vf3.b j0 = v3.J0;
                    if (j0 != null) {
                        j0.b = this.U;
                        j0.L = this.j0;
                        j0.J = this.i0;
                        j0.K = this.k0;
                        j0.R = this.l0;
                        j0.S = this.m0;
                        j0.Y = this.p0;
                        j0.Z = this.q0;
                        j0.T = wzv;
                        j0.a0 = this.r0;
                        j0.b0 = this.s0;
                        j0.s(this.h0);
                        final JsonUserLegacyScreenName t2 = this.t0;
                        if (t2 != null) {
                            final JsonUserLegacyWrapper a = t2.a;
                            if (a != null) {
                                j0.M = a.a.c;
                            }
                        }
                        final JsonExclusiveTweetInfo u2 = this.u0;
                        if (u2 != null) {
                            final JsonUserLegacyWrapper a2 = u2.a.a;
                            if (a2 != null) {
                                j0.P = a2.a.c;
                            }
                        }
                        final JsonTrustedFriendsInfo z0 = this.z0;
                        if (z0 != null) {
                            final JsonUserLegacyScreenName a3 = z0.a;
                            if (a3 != null) {
                                j0.N = a3.a.a.c;
                            }
                            else if (!TextUtils.isEmpty((CharSequence)z0.b)) {
                                j0.N = "";
                            }
                        }
                        final JsonGraphQlTweetReactionTypeMap v4 = this.v0;
                        if (v4 != null && j0.O == null) {
                            final JsonReactionPerspective w2 = this.w0;
                            ozl a4 = ozl;
                            if (w2 != null) {
                                a4 = w2.a;
                            }
                            final mpu$a mpu$a = new mpu$a();
                            mpu$a.p((Map)v4.a);
                            final LinkedHashMap a5 = ((mpu)((n4j)mpu$a).e()).a;
                            Objects.requireNonNull(a5);
                            j0.O = new oyl(a4, (Map)a5);
                        }
                        final JsonTweetQuickPromoteEligibility x0 = this.x0;
                        if (x0 != null) {
                            j0.U = x0.t();
                        }
                        final JsonReplyVotingPerspective y2 = this.y0;
                        if (y2 != null) {
                            j0.V = y2.a;
                        }
                        final JsonGraphQlUnifiedCard x2 = this.X;
                        if (x2 != null) {
                            final ti3 d2 = ((BaseJsonUnifiedCard)x2).d;
                            if (d2 != null && d2 != ti3.E0) {
                                j0.v = x2.v();
                            }
                        }
                    }
                    v3.r(d);
                    v3.q(this.w(), this.V.x);
                    nh0$a = v3;
                }
                else {
                    final nh0 w3 = this.V.w();
                    final qum$a c = new qum$a();
                    c.a = this.U;
                    long b;
                    if (d != null) {
                        b = d.D0;
                    }
                    else {
                        b = ikr.o(this.V.G, -1L);
                    }
                    c.b = b;
                    if (d != null) {
                        c.c = d.K0;
                        c.d = d.c();
                        c.f = d.I1;
                    }
                    final nh0$a nh0$a2 = new nh0$a(w3);
                    final vf3.b b2 = new vf3.b(w3.I0);
                    b2.h = this.V.C;
                    b2.C = c;
                    nh0$a2.p(b2);
                    nh0$a2.q(w3.G0, this.V.x);
                    nh0$a2.M0 = this.V.w;
                    nh0$a2.H0 = rif.v((Object)d);
                    nh0$a = nh0$a2;
                }
            }
            else {
                final nh0$a nh0$a3 = new nh0$a();
                final vf3.b b3 = new vf3.b();
                b3.b = this.U;
                nh0$a3.p(b3);
                nh0$a3.r(d);
                nh0$a = nh0$a3;
            }
            return nh0$a;
        }
        final nh0 e0 = this.e0;
        nh0$a nh0$a4;
        if (e0 == null) {
            final bjr g0 = this.g0;
            if (g0 != null) {
                final wzv g2 = (wzv)g0.a((Class)wzv.class);
                final eku$a h2 = super.h;
                t = g2;
                if (h2 != null) {
                    h2.g = g2;
                    t = g2;
                }
            }
            final nh0$a u3 = this.u(this.c0, this.d0);
            final vf3.b j2 = u3.J0;
            if (j2 != null) {
                j2.b = this.b0;
                j2.J = this.i0;
                j2.L = this.j0;
                j2.K = this.k0;
                j2.R = this.l0;
                j2.S = this.m0;
                j2.Y = this.p0;
                j2.Z = this.q0;
                j2.T = t;
                j2.a0 = this.r0;
                j2.b0 = this.s0;
                j2.s(this.h0);
                final bjr g3 = this.g0;
                if (g3 != null) {
                    final jyu jyu = (jyu)g3.a((Class)jyu.class);
                    if (jyu != null) {
                        j2.s(jyu.a);
                    }
                    final uvr uvr = (uvr)this.g0.a((Class)uvr.class);
                    if (uvr != null) {
                        j2.M = uvr.f;
                        j2.P = uvr.g;
                    }
                    final Vibe x3 = (Vibe)this.g0.a((Class)Vibe.class);
                    if (x3 != null) {
                        j2.X = x3;
                    }
                    j2.b0 = (ybf)this.g0.a((Class)ybf.class);
                }
                final JsonTweetQuickPromoteEligibility x4 = this.x0;
                if (x4 != null) {
                    j2.U = x4.t();
                }
                final JsonReplyVotingPerspective y3 = this.y0;
                if (y3 != null) {
                    j2.V = y3.a;
                }
                final JsonTrustedFriendsMetadata a6 = this.A0;
                if (a6 != null) {
                    final JsonTrustedFriendsMetadata$JsonTrustedFriendsMetadataWrapper a7 = a6.a;
                    if (a7 != null) {
                        j2.N = a7.b;
                    }
                    else if (a6.b != null) {
                        j2.N = "";
                    }
                }
            }
            u3.r(this.d0);
            u3.F0 = this.f0;
            u3.q(this.w(), super.x);
            nh0$a4 = u3;
        }
        else {
            final qum$a c2 = new qum$a();
            c2.a = this.b0;
            final cgv d3 = this.d0;
            long b4;
            if (d3 != null) {
                b4 = d3.D0;
            }
            else {
                b4 = ikr.o(super.G, -1L);
            }
            c2.b = b4;
            final cgv d4 = this.d0;
            if (d4 != null) {
                c2.c = d4.K0;
                c2.d = d4.c();
                c2.f = this.d0.I1;
            }
            nh0$a4 = new nh0$a(e0);
            final vf3.b b5 = new vf3.b(e0.I0);
            b5.C = c2;
            nh0$a4.p(b5);
            nh0$a4.q(e0.G0, super.x);
            nh0$a4.M0 = super.w;
            nh0$a4.H0 = rif.v((Object)this.d0);
        }
        return nh0$a4;
    }
    
    public final upu w() {
        if (this.a0 == null) {
            this.a0 = i48.n(this.Z);
        }
        final upu o = i48.o(this.Z);
        if (o != null) {
            return o;
        }
        final nh0$a a0 = this.a0;
        if (a0 != null && a0.l()) {
            return (upu)((n4j)this.a0).e();
        }
        return null;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonGraphQlLegacyApiTweet extends BaseJsonApiTweet
    {
        @JsonField
        public upu.a U;
        
        public final /* bridge */ n4j t() {
            return (n4j)this.v();
        }
        
        public final nh0$a v() {
            final nh0 w = this.w();
            if (w == null) {
                return this.u((String)null, (cgv)null);
            }
            return new nh0$a(w);
        }
        
        public final nh0 w() {
            return i48.l(this.U);
        }
    }
}
