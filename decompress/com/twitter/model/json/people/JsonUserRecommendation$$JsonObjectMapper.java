// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.people;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserRecommendation$$JsonObjectMapper extends JsonMapper<JsonUserRecommendation>
{
    public static JsonUserRecommendation _parse(final qhe qhe) throws IOException {
        final JsonUserRecommendation jsonUserRecommendation = new JsonUserRecommendation();
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
            parseField(jsonUserRecommendation, d, qhe);
            qhe.m0();
        }
        return jsonUserRecommendation;
    }
    
    public static void _serialize(final JsonUserRecommendation jsonUserRecommendation, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("checked_by_default", jsonUserRecommendation.d);
        yfe.u0("social_text", jsonUserRecommendation.b);
        yfe.u0("tracking_token", jsonUserRecommendation.c);
        if (jsonUserRecommendation.a != null) {
            LoganSquare.typeConverterFor((Class)qgv.class).serialize((Object)jsonUserRecommendation.a, "user", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserRecommendation jsonUserRecommendation, final String s, final qhe qhe) throws IOException {
        if ("checked_by_default".equals(s)) {
            jsonUserRecommendation.d = qhe.l();
        }
        else if ("social_text".equals(s)) {
            jsonUserRecommendation.b = qhe.T((String)null);
        }
        else if ("tracking_token".equals(s)) {
            jsonUserRecommendation.c = qhe.T((String)null);
        }
        else if ("user".equals(s)) {
            jsonUserRecommendation.a = (qgv)LoganSquare.typeConverterFor((Class)qgv.class).parse(qhe);
        }
    }
    
    public JsonUserRecommendation parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserRecommendation jsonUserRecommendation, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserRecommendation, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserRecommendation)o, yfe, b);
    }
}
