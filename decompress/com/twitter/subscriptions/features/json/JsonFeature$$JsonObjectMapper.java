// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeature$$JsonObjectMapper extends JsonMapper<JsonFeature>
{
    public static JsonFeature _parse(final qhe qhe) throws IOException {
        final JsonFeature jsonFeature = new JsonFeature();
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
            parseField(jsonFeature, d, qhe);
            qhe.m0();
        }
        return jsonFeature;
    }
    
    public static void _serialize(final JsonFeature jsonFeature, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonFeature.b != null) {
            yfe.i("config");
            JsonFeatureConfig$$JsonObjectMapper._serialize(jsonFeature.b, yfe, true);
        }
        yfe.u0("rest_id", jsonFeature.a);
        if (jsonFeature.c != null) {
            LoganSquare.typeConverterFor((Class)pvv.class).serialize((Object)jsonFeature.c, "undoTweet", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonFeature jsonFeature, final String s, final qhe qhe) throws IOException {
        if ("config".equals(s)) {
            jsonFeature.b = JsonFeatureConfig$$JsonObjectMapper._parse(qhe);
        }
        else if ("rest_id".equals(s)) {
            jsonFeature.a = qhe.T((String)null);
        }
        else if ("undoTweet".equals(s)) {
            jsonFeature.c = (pvv)LoganSquare.typeConverterFor((Class)pvv.class).parse(qhe);
        }
    }
    
    public JsonFeature parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonFeature jsonFeature, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonFeature, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonFeature)o, yfe, b);
    }
}
