// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTypeaheadResponse$JsonToken$$JsonObjectMapper extends JsonMapper<JsonTypeaheadResponse.JsonToken>
{
    public static JsonTypeaheadResponse.JsonToken _parse(final qhe qhe) throws IOException {
        final JsonTypeaheadResponse.JsonToken jsonToken = new JsonTypeaheadResponse.JsonToken();
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
            parseField(jsonToken, d, qhe);
            qhe.m0();
        }
        return jsonToken;
    }
    
    public static void _serialize(final JsonTypeaheadResponse.JsonToken jsonToken, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("token", jsonToken.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTypeaheadResponse.JsonToken jsonToken, final String s, final qhe qhe) throws IOException {
        if ("token".equals(s)) {
            jsonToken.a = qhe.T((String)null);
        }
    }
    
    public JsonTypeaheadResponse.JsonToken parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTypeaheadResponse.JsonToken jsonToken, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonToken, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTypeaheadResponse.JsonToken)o, yfe, b);
    }
}
