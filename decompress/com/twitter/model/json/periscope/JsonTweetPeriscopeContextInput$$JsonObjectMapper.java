// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.periscope;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetPeriscopeContextInput$$JsonObjectMapper extends JsonMapper<JsonTweetPeriscopeContextInput>
{
    public static JsonTweetPeriscopeContextInput _parse(final qhe qhe) throws IOException {
        final JsonTweetPeriscopeContextInput jsonTweetPeriscopeContextInput = new JsonTweetPeriscopeContextInput();
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
            parseField(jsonTweetPeriscopeContextInput, d, qhe);
            qhe.m0();
        }
        return jsonTweetPeriscopeContextInput;
    }
    
    public static void _serialize(final JsonTweetPeriscopeContextInput jsonTweetPeriscopeContextInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("is_live", jsonTweetPeriscopeContextInput.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTweetPeriscopeContextInput jsonTweetPeriscopeContextInput, final String s, final qhe qhe) throws IOException {
        if ("is_live".equals(s)) {
            jsonTweetPeriscopeContextInput.a = qhe.l();
        }
    }
    
    public JsonTweetPeriscopeContextInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTweetPeriscopeContextInput jsonTweetPeriscopeContextInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTweetPeriscopeContextInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTweetPeriscopeContextInput)o, yfe, b);
    }
}
