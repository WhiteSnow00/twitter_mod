// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.people;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSingleUserRecommendation$$JsonObjectMapper extends JsonMapper<JsonSingleUserRecommendation>
{
    public static JsonSingleUserRecommendation _parse(final qhe qhe) throws IOException {
        final JsonSingleUserRecommendation jsonSingleUserRecommendation = new JsonSingleUserRecommendation();
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
            parseField(jsonSingleUserRecommendation, d, qhe);
            qhe.m0();
        }
        return jsonSingleUserRecommendation;
    }
    
    public static void _serialize(final JsonSingleUserRecommendation jsonSingleUserRecommendation, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("is_device_follow", jsonSingleUserRecommendation.c);
        yfe.u0("token", jsonSingleUserRecommendation.b);
        if (jsonSingleUserRecommendation.s() != null) {
            LoganSquare.typeConverterFor((Class)qgv.class).serialize((Object)jsonSingleUserRecommendation.s(), "user", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSingleUserRecommendation jsonSingleUserRecommendation, final String s, final qhe qhe) throws IOException {
        if ("is_device_follow".equals(s)) {
            jsonSingleUserRecommendation.c = qhe.l();
        }
        else if ("token".equals(s)) {
            jsonSingleUserRecommendation.b = qhe.T((String)null);
        }
        else if ("user".equals(s)) {
            jsonSingleUserRecommendation.a = (qgv)LoganSquare.typeConverterFor((Class)qgv.class).parse(qhe);
        }
    }
    
    public JsonSingleUserRecommendation parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSingleUserRecommendation jsonSingleUserRecommendation, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSingleUserRecommendation, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSingleUserRecommendation)o, yfe, b);
    }
}
