// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.sensitivemedia;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSensitiveMediaSettings$$JsonObjectMapper extends JsonMapper<JsonSensitiveMediaSettings>
{
    public static final hjp SENSITIVE_MEDIA_LEVEL_TYPE_CONVERTER;
    
    static {
        SENSITIVE_MEDIA_LEVEL_TYPE_CONVERTER = new hjp();
    }
    
    public static JsonSensitiveMediaSettings _parse(final qhe qhe) throws IOException {
        final JsonSensitiveMediaSettings jsonSensitiveMediaSettings = new JsonSensitiveMediaSettings();
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
            parseField(jsonSensitiveMediaSettings, d, qhe);
            qhe.m0();
        }
        return jsonSensitiveMediaSettings;
    }
    
    public static void _serialize(final JsonSensitiveMediaSettings jsonSensitiveMediaSettings, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        jsonSensitiveMediaSettings.t();
        final hjp sensitive_MEDIA_LEVEL_TYPE_CONVERTER = JsonSensitiveMediaSettings$$JsonObjectMapper.SENSITIVE_MEDIA_LEVEL_TYPE_CONVERTER;
        ((StringBasedTypeConverter)sensitive_MEDIA_LEVEL_TYPE_CONVERTER).serialize((Object)jsonSensitiveMediaSettings.t(), "view_adult_content", true, yfe);
        jsonSensitiveMediaSettings.u();
        ((StringBasedTypeConverter)sensitive_MEDIA_LEVEL_TYPE_CONVERTER).serialize((Object)jsonSensitiveMediaSettings.u(), "view_other_content", true, yfe);
        jsonSensitiveMediaSettings.v();
        ((StringBasedTypeConverter)sensitive_MEDIA_LEVEL_TYPE_CONVERTER).serialize((Object)jsonSensitiveMediaSettings.v(), "view_violent_content", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSensitiveMediaSettings jsonSensitiveMediaSettings, final String s, final qhe qhe) throws IOException {
        if ("view_adult_content".equals(s)) {
            final gjp a = (gjp)((StringBasedTypeConverter)JsonSensitiveMediaSettings$$JsonObjectMapper.SENSITIVE_MEDIA_LEVEL_TYPE_CONVERTER).parse(qhe);
            Objects.requireNonNull(jsonSensitiveMediaSettings);
            e0e.f((Object)a, "<set-?>");
            jsonSensitiveMediaSettings.a = a;
        }
        else if ("view_other_content".equals(s)) {
            final gjp c = (gjp)((StringBasedTypeConverter)JsonSensitiveMediaSettings$$JsonObjectMapper.SENSITIVE_MEDIA_LEVEL_TYPE_CONVERTER).parse(qhe);
            Objects.requireNonNull(jsonSensitiveMediaSettings);
            e0e.f((Object)c, "<set-?>");
            jsonSensitiveMediaSettings.c = c;
        }
        else if ("view_violent_content".equals(s)) {
            final gjp b = (gjp)((StringBasedTypeConverter)JsonSensitiveMediaSettings$$JsonObjectMapper.SENSITIVE_MEDIA_LEVEL_TYPE_CONVERTER).parse(qhe);
            Objects.requireNonNull(jsonSensitiveMediaSettings);
            e0e.f((Object)b, "<set-?>");
            jsonSensitiveMediaSettings.b = b;
        }
    }
    
    public JsonSensitiveMediaSettings parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSensitiveMediaSettings jsonSensitiveMediaSettings, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSensitiveMediaSettings, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSensitiveMediaSettings)o, yfe, b);
    }
}
