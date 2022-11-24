// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfImageConfig$$JsonObjectMapper extends JsonMapper<JsonOcfImageConfig>
{
    public static final y8d IMAGE_RENDER_TYPE_CONVERTER;
    
    static {
        IMAGE_RENDER_TYPE_CONVERTER = new y8d();
    }
    
    public static JsonOcfImageConfig _parse(final qhe qhe) throws IOException {
        final JsonOcfImageConfig jsonOcfImageConfig = new JsonOcfImageConfig();
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
            parseField(jsonOcfImageConfig, d, qhe);
            qhe.m0();
        }
        return jsonOcfImageConfig;
    }
    
    public static void _serialize(final JsonOcfImageConfig jsonOcfImageConfig, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonOcfImageConfig.a != null) {
            LoganSquare.typeConverterFor((Class)bej.class).serialize((Object)jsonOcfImageConfig.a, "image", true, yfe);
        }
        ((StringBasedTypeConverter)JsonOcfImageConfig$$JsonObjectMapper.IMAGE_RENDER_TYPE_CONVERTER).serialize((Object)jsonOcfImageConfig.b, "image_type", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfImageConfig jsonOcfImageConfig, final String s, final qhe qhe) throws IOException {
        if ("image".equals(s)) {
            jsonOcfImageConfig.a = (bej)LoganSquare.typeConverterFor((Class)bej.class).parse(qhe);
        }
        else if ("image_type".equals(s)) {
            jsonOcfImageConfig.b = (int)((StringBasedTypeConverter)JsonOcfImageConfig$$JsonObjectMapper.IMAGE_RENDER_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonOcfImageConfig parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfImageConfig jsonOcfImageConfig, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfImageConfig, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfImageConfig)o, yfe, b);
    }
}
