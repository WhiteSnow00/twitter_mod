// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRecommendationsPayload$$JsonObjectMapper extends JsonMapper<JsonRecommendationsPayload>
{
    public static JsonRecommendationsPayload _parse(final qhe qhe) throws IOException {
        final JsonRecommendationsPayload jsonRecommendationsPayload = new JsonRecommendationsPayload();
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
            parseField(jsonRecommendationsPayload, d, qhe);
            qhe.m0();
        }
        return jsonRecommendationsPayload;
    }
    
    public static void _serialize(final JsonRecommendationsPayload jsonRecommendationsPayload, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("impression_id", jsonRecommendationsPayload.a);
        yfe.u0("media_url", jsonRecommendationsPayload.g);
        yfe.u0("scribe_target", jsonRecommendationsPayload.e);
        yfe.u0("profile_pic_url", jsonRecommendationsPayload.f);
        yfe.u0("text", jsonRecommendationsPayload.c);
        yfe.u0("title", jsonRecommendationsPayload.b);
        yfe.u0("uri", jsonRecommendationsPayload.d);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonRecommendationsPayload jsonRecommendationsPayload, final String s, final qhe qhe) throws IOException {
        if ("impression_id".equals(s)) {
            jsonRecommendationsPayload.a = qhe.T((String)null);
        }
        else if ("media_url".equals(s)) {
            jsonRecommendationsPayload.g = qhe.T((String)null);
        }
        else if ("scribe_target".equals(s)) {
            jsonRecommendationsPayload.e = qhe.T((String)null);
        }
        else if ("profile_pic_url".equals(s)) {
            jsonRecommendationsPayload.f = qhe.T((String)null);
        }
        else if ("text".equals(s)) {
            jsonRecommendationsPayload.c = qhe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonRecommendationsPayload.b = qhe.T((String)null);
        }
        else if ("uri".equals(s)) {
            jsonRecommendationsPayload.d = qhe.T((String)null);
        }
    }
    
    public JsonRecommendationsPayload parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonRecommendationsPayload jsonRecommendationsPayload, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonRecommendationsPayload, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonRecommendationsPayload)o, yfe, b);
    }
}
