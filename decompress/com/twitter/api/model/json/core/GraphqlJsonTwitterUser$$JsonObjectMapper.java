// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class GraphqlJsonTwitterUser$$JsonObjectMapper extends JsonMapper<GraphqlJsonTwitterUser>
{
    public static GraphqlJsonTwitterUser _parse(final khe khe) throws IOException {
        final GraphqlJsonTwitterUser graphqlJsonTwitterUser = new GraphqlJsonTwitterUser();
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
            parseField(graphqlJsonTwitterUser, d, khe);
            khe.m0();
        }
        return graphqlJsonTwitterUser;
    }
    
    public static void _serialize(final GraphqlJsonTwitterUser graphqlJsonTwitterUser, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.e("dm_muting", graphqlJsonTwitterUser.n0);
        tfe.e("exclusive_tweet_following", graphqlJsonTwitterUser.s0);
        tfe.e("has_nft_avatar", graphqlJsonTwitterUser.B0);
        tfe.e("has_twitter_article", graphqlJsonTwitterUser.z0);
        tfe.e("verified_phone_status", graphqlJsonTwitterUser.C0);
        tfe.e("is_blue_verified", graphqlJsonTwitterUser.D0);
        tfe.e("is_profile_translatable", graphqlJsonTwitterUser.l0);
        tfe.e("is_trusted_friends_list_member", graphqlJsonTwitterUser.y0);
        if (graphqlJsonTwitterUser.m0 != null) {
            tfe.i("legacy");
            GraphqlJsonTwitterUser$JsonGraphQlLegacyTwitterUser$$JsonObjectMapper._serialize(graphqlJsonTwitterUser.m0, tfe, true);
        }
        tfe.e("private_super_following", graphqlJsonTwitterUser.r0);
        if (graphqlJsonTwitterUser.A0 != null) {
            LoganSquare.typeConverterFor((Class)v3l.class).serialize((Object)graphqlJsonTwitterUser.A0, "professional", true, tfe);
        }
        tfe.e("smart_blocked_by", graphqlJsonTwitterUser.u0);
        tfe.e("smart_blocking", graphqlJsonTwitterUser.v0);
        tfe.W("smart_blocking_expiration", graphqlJsonTwitterUser.w0);
        tfe.e("space_device_following", graphqlJsonTwitterUser.x0);
        tfe.e("super_follow_eligible", graphqlJsonTwitterUser.o0);
        tfe.e("super_followed_by", graphqlJsonTwitterUser.p0);
        tfe.e("super_following", graphqlJsonTwitterUser.q0);
        if (graphqlJsonTwitterUser.t0 != null) {
            LoganSquare.typeConverterFor((Class)fdt.class).serialize((Object)graphqlJsonTwitterUser.t0, "tipjar", true, tfe);
        }
        if (graphqlJsonTwitterUser.k0 != null) {
            LoganSquare.typeConverterFor((Class)kdw.class).serialize((Object)graphqlJsonTwitterUser.k0, "affiliates_highlighted_label", true, tfe);
        }
        RestJsonTwitterUser$$JsonObjectMapper._serialize((RestJsonTwitterUser)graphqlJsonTwitterUser, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final GraphqlJsonTwitterUser graphqlJsonTwitterUser, final String s, final khe khe) throws IOException {
        final boolean equals = "dm_muting".equals(s);
        final Boolean b = null;
        final Boolean b2 = null;
        final Boolean b3 = null;
        final Boolean b4 = null;
        final Boolean b5 = null;
        final Boolean b6 = null;
        final Boolean b7 = null;
        final Boolean b8 = null;
        final Long n = null;
        final Boolean b9 = null;
        final Boolean b10 = null;
        final Boolean b11 = null;
        final Boolean b12 = null;
        final Boolean b13 = null;
        final Boolean b14 = null;
        final Boolean b15 = null;
        if (equals) {
            Boolean value;
            if (khe.e() == lje.U0) {
                value = b15;
            }
            else {
                value = khe.k();
            }
            graphqlJsonTwitterUser.n0 = value;
        }
        else if ("exclusive_tweet_following".equals(s)) {
            Boolean value2;
            if (khe.e() == lje.U0) {
                value2 = b;
            }
            else {
                value2 = khe.k();
            }
            graphqlJsonTwitterUser.s0 = value2;
        }
        else if (!"has_nft_avatar".equals(s) && !"ext_has_nft_avatar".equals(s)) {
            if ("has_twitter_article".equals(s)) {
                Boolean value3;
                if (khe.e() == lje.U0) {
                    value3 = b2;
                }
                else {
                    value3 = khe.k();
                }
                graphqlJsonTwitterUser.z0 = value3;
            }
            else if ("verified_phone_status".equals(s)) {
                Boolean value4;
                if (khe.e() == lje.U0) {
                    value4 = b3;
                }
                else {
                    value4 = khe.k();
                }
                graphqlJsonTwitterUser.C0 = value4;
            }
            else if (!"is_blue_verified".equals(s) && !"ext_is_blue_verified".equals(s)) {
                if ("is_profile_translatable".equals(s)) {
                    Boolean value5;
                    if (khe.e() == lje.U0) {
                        value5 = b4;
                    }
                    else {
                        value5 = khe.k();
                    }
                    graphqlJsonTwitterUser.l0 = value5;
                }
                else if ("is_trusted_friends_list_member".equals(s)) {
                    Boolean value6;
                    if (khe.e() == lje.U0) {
                        value6 = b5;
                    }
                    else {
                        value6 = khe.k();
                    }
                    graphqlJsonTwitterUser.y0 = value6;
                }
                else if ("legacy".equals(s)) {
                    graphqlJsonTwitterUser.m0 = GraphqlJsonTwitterUser$JsonGraphQlLegacyTwitterUser$$JsonObjectMapper._parse(khe);
                }
                else if ("private_super_following".equals(s)) {
                    Boolean value7;
                    if (khe.e() == lje.U0) {
                        value7 = b6;
                    }
                    else {
                        value7 = khe.k();
                    }
                    graphqlJsonTwitterUser.r0 = value7;
                }
                else if ("professional".equals(s)) {
                    graphqlJsonTwitterUser.A0 = (v3l)LoganSquare.typeConverterFor((Class)v3l.class).parse(khe);
                }
                else if ("smart_blocked_by".equals(s)) {
                    Boolean value8;
                    if (khe.e() == lje.U0) {
                        value8 = b7;
                    }
                    else {
                        value8 = khe.k();
                    }
                    graphqlJsonTwitterUser.u0 = value8;
                }
                else if ("smart_blocking".equals(s)) {
                    Boolean value9;
                    if (khe.e() == lje.U0) {
                        value9 = b8;
                    }
                    else {
                        value9 = khe.k();
                    }
                    graphqlJsonTwitterUser.v0 = value9;
                }
                else if ("smart_blocking_expiration".equals(s)) {
                    Long value10;
                    if (khe.e() == lje.U0) {
                        value10 = n;
                    }
                    else {
                        value10 = khe.L();
                    }
                    graphqlJsonTwitterUser.w0 = value10;
                }
                else if ("space_device_following".equals(s)) {
                    Boolean value11;
                    if (khe.e() == lje.U0) {
                        value11 = b9;
                    }
                    else {
                        value11 = khe.k();
                    }
                    graphqlJsonTwitterUser.x0 = value11;
                }
                else if ("super_follow_eligible".equals(s)) {
                    Boolean value12;
                    if (khe.e() == lje.U0) {
                        value12 = b10;
                    }
                    else {
                        value12 = khe.k();
                    }
                    graphqlJsonTwitterUser.o0 = value12;
                }
                else if ("super_followed_by".equals(s)) {
                    Boolean value13;
                    if (khe.e() == lje.U0) {
                        value13 = b11;
                    }
                    else {
                        value13 = khe.k();
                    }
                    graphqlJsonTwitterUser.p0 = value13;
                }
                else if ("super_following".equals(s)) {
                    Boolean value14;
                    if (khe.e() == lje.U0) {
                        value14 = b12;
                    }
                    else {
                        value14 = khe.k();
                    }
                    graphqlJsonTwitterUser.q0 = value14;
                }
                else if ("tipjar".equals(s)) {
                    graphqlJsonTwitterUser.t0 = (fdt)LoganSquare.typeConverterFor((Class)fdt.class).parse(khe);
                }
                else if ("affiliates_highlighted_label".equals(s)) {
                    graphqlJsonTwitterUser.k0 = (kdw)LoganSquare.typeConverterFor((Class)kdw.class).parse(khe);
                }
                else {
                    RestJsonTwitterUser$$JsonObjectMapper.parseField((RestJsonTwitterUser)graphqlJsonTwitterUser, s, khe);
                }
            }
            else {
                Boolean value15;
                if (khe.e() == lje.U0) {
                    value15 = b13;
                }
                else {
                    value15 = khe.k();
                }
                graphqlJsonTwitterUser.D0 = value15;
            }
        }
        else {
            Boolean value16;
            if (khe.e() == lje.U0) {
                value16 = b14;
            }
            else {
                value16 = khe.k();
            }
            graphqlJsonTwitterUser.B0 = value16;
        }
    }
    
    public GraphqlJsonTwitterUser parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final GraphqlJsonTwitterUser graphqlJsonTwitterUser, final tfe tfe, final boolean b) throws IOException {
        _serialize(graphqlJsonTwitterUser, tfe, b);
    }
}
