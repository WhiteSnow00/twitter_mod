// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.features.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeature$$JsonObjectMapper extends JsonMapper<JsonFeature>
{
    public static JsonFeature _parse(final khe khe) throws IOException {
        final JsonFeature jsonFeature = new JsonFeature();
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
            parseField(jsonFeature, d, khe);
            khe.m0();
        }
        return jsonFeature;
    }
    
    public static void _serialize(final JsonFeature jsonFeature, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonFeature.b != null) {
            tfe.i("config");
            JsonFeatureConfig$$JsonObjectMapper._serialize(jsonFeature.b, tfe, true);
        }
        tfe.u0("rest_id", jsonFeature.a);
        if (jsonFeature.c != null) {
            LoganSquare.typeConverterFor((Class)juv.class).serialize((Object)jsonFeature.c, "undoTweet", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFeature jsonFeature, final String s, final khe khe) throws IOException {
        if ("config".equals(s)) {
            jsonFeature.b = JsonFeatureConfig$$JsonObjectMapper._parse(khe);
        }
        else if ("rest_id".equals(s)) {
            jsonFeature.a = khe.T((String)null);
        }
        else if ("undoTweet".equals(s)) {
            jsonFeature.c = (juv)LoganSquare.typeConverterFor((Class)juv.class).parse(khe);
        }
    }
    
    public JsonFeature parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFeature jsonFeature, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFeature, tfe, b);
    }
}
