// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSuperFollowMetadata$$JsonObjectMapper extends JsonMapper<JsonSuperFollowMetadata>
{
    public static JsonSuperFollowMetadata _parse(final qhe qhe) throws IOException {
        final JsonSuperFollowMetadata jsonSuperFollowMetadata = new JsonSuperFollowMetadata();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonSuperFollowMetadata, d, qhe);
            qhe.m0();
        }
        return jsonSuperFollowMetadata;
    }
    
    public static void _serialize(final JsonSuperFollowMetadata jsonSuperFollowMetadata, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("exclusiveTweetCreatorScreenName", jsonSuperFollowMetadata.g);
        yfe.e("exclusiveTweetFollowing", jsonSuperFollowMetadata.e);
        yfe.e("privateSuperFollowing", jsonSuperFollowMetadata.d);
        yfe.e("superFollowEligible", jsonSuperFollowMetadata.a);
        yfe.e("superFollowedBy", jsonSuperFollowMetadata.b);
        yfe.e("superFollowing", jsonSuperFollowMetadata.c);
        yfe.u0("superFollowsConversationUserScreenName", jsonSuperFollowMetadata.f);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSuperFollowMetadata jsonSuperFollowMetadata, final String s, final qhe qhe) throws IOException {
        if ("exclusiveTweetCreatorScreenName".equals(s)) {
            jsonSuperFollowMetadata.g = qhe.T((String)null);
        }
        else if ("exclusiveTweetFollowing".equals(s)) {
            jsonSuperFollowMetadata.e = qhe.l();
        }
        else if ("privateSuperFollowing".equals(s)) {
            jsonSuperFollowMetadata.d = qhe.l();
        }
        else if ("superFollowEligible".equals(s)) {
            jsonSuperFollowMetadata.a = qhe.l();
        }
        else if ("superFollowedBy".equals(s)) {
            jsonSuperFollowMetadata.b = qhe.l();
        }
        else if ("superFollowing".equals(s)) {
            jsonSuperFollowMetadata.c = qhe.l();
        }
        else if ("superFollowsConversationUserScreenName".equals(s)) {
            jsonSuperFollowMetadata.f = qhe.T((String)null);
        }
    }
    
    public JsonSuperFollowMetadata parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSuperFollowMetadata jsonSuperFollowMetadata, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSuperFollowMetadata, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSuperFollowMetadata)o, yfe, b);
    }
}
