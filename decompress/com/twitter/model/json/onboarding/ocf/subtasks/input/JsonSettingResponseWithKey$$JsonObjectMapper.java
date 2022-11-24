// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingResponseWithKey$$JsonObjectMapper extends JsonMapper<JsonSettingResponseWithKey>
{
    public static JsonSettingResponseWithKey _parse(final qhe qhe) throws IOException {
        final JsonSettingResponseWithKey jsonSettingResponseWithKey = new JsonSettingResponseWithKey();
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
            parseField(jsonSettingResponseWithKey, d, qhe);
            qhe.m0();
        }
        return jsonSettingResponseWithKey;
    }
    
    public static void _serialize(final JsonSettingResponseWithKey jsonSettingResponseWithKey, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("key", jsonSettingResponseWithKey.a);
        if (jsonSettingResponseWithKey.b != null) {
            yfe.i("response_data");
            JsonSettingResponseWithKey$JsonSettingResponseData$$JsonObjectMapper._serialize(jsonSettingResponseWithKey.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSettingResponseWithKey jsonSettingResponseWithKey, final String s, final qhe qhe) throws IOException {
        if ("key".equals(s)) {
            jsonSettingResponseWithKey.a = qhe.T((String)null);
        }
        else if ("response_data".equals(s)) {
            jsonSettingResponseWithKey.b = JsonSettingResponseWithKey$JsonSettingResponseData$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonSettingResponseWithKey parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSettingResponseWithKey jsonSettingResponseWithKey, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSettingResponseWithKey, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSettingResponseWithKey)o, yfe, b);
    }
}
