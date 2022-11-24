// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.sensitivemedia;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserSensitiveMediaSettings$$JsonObjectMapper extends JsonMapper<JsonUserSensitiveMediaSettings>
{
    public static JsonUserSensitiveMediaSettings _parse(final qhe qhe) throws IOException {
        final JsonUserSensitiveMediaSettings jsonUserSensitiveMediaSettings = new JsonUserSensitiveMediaSettings();
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
            parseField(jsonUserSensitiveMediaSettings, d, qhe);
            qhe.m0();
        }
        return jsonUserSensitiveMediaSettings;
    }
    
    public static void _serialize(final JsonUserSensitiveMediaSettings jsonUserSensitiveMediaSettings, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("can_user_allow_sensitive_content", jsonUserSensitiveMediaSettings.b);
        jsonUserSensitiveMediaSettings.t();
        LoganSquare.typeConverterFor((Class)jjp.class).serialize((Object)jsonUserSensitiveMediaSettings.t(), "sensitive_media_settings", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserSensitiveMediaSettings jsonUserSensitiveMediaSettings, final String s, final qhe qhe) throws IOException {
        if ("can_user_allow_sensitive_content".equals(s)) {
            jsonUserSensitiveMediaSettings.b = qhe.l();
        }
        else if ("sensitive_media_settings".equals(s)) {
            final jjp a = (jjp)LoganSquare.typeConverterFor((Class)jjp.class).parse(qhe);
            Objects.requireNonNull(jsonUserSensitiveMediaSettings);
            e0e.f((Object)a, "<set-?>");
            jsonUserSensitiveMediaSettings.a = a;
        }
    }
    
    public JsonUserSensitiveMediaSettings parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserSensitiveMediaSettings jsonUserSensitiveMediaSettings, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserSensitiveMediaSettings, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserSensitiveMediaSettings)o, yfe, b);
    }
}
