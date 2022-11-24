// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.safety;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSafetyModeSettings$$JsonObjectMapper extends JsonMapper<JsonSafetyModeSettings>
{
    public static JsonSafetyModeSettings _parse(final qhe qhe) throws IOException {
        final JsonSafetyModeSettings jsonSafetyModeSettings = new JsonSafetyModeSettings();
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
            parseField(jsonSafetyModeSettings, d, qhe);
            qhe.m0();
        }
        return jsonSafetyModeSettings;
    }
    
    public static void _serialize(final JsonSafetyModeSettings jsonSafetyModeSettings, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonSafetyModeSettings.b != null) {
            LoganSquare.typeConverterFor((Class)dro.class).serialize((Object)jsonSafetyModeSettings.b, "duration", true, yfe);
        }
        yfe.e("enabled", jsonSafetyModeSettings.a);
        yfe.W("expiration_timestamp_ms", (long)jsonSafetyModeSettings.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSafetyModeSettings jsonSafetyModeSettings, final String s, final qhe qhe) throws IOException {
        if ("duration".equals(s)) {
            jsonSafetyModeSettings.b = (dro)LoganSquare.typeConverterFor((Class)dro.class).parse(qhe);
        }
        else if ("enabled".equals(s)) {
            jsonSafetyModeSettings.a = qhe.l();
        }
        else if ("expiration_timestamp_ms".equals(s)) {
            Long value;
            if (qhe.e() == rje.X0) {
                value = null;
            }
            else {
                value = qhe.L();
            }
            jsonSafetyModeSettings.c = value;
        }
    }
    
    public JsonSafetyModeSettings parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSafetyModeSettings jsonSafetyModeSettings, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSafetyModeSettings, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSafetyModeSettings)o, yfe, b);
    }
}
