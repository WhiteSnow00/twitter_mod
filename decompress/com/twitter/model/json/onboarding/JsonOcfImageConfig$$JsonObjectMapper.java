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
    public static final w7d IMAGE_RENDER_TYPE_CONVERTER;
    
    static {
        IMAGE_RENDER_TYPE_CONVERTER = new w7d();
    }
    
    public static JsonOcfImageConfig _parse(final tge tge) throws IOException {
        final JsonOcfImageConfig jsonOcfImageConfig = new JsonOcfImageConfig();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonOcfImageConfig, d, tge);
            tge.l0();
        }
        return jsonOcfImageConfig;
    }
    
    public static void _serialize(final JsonOcfImageConfig jsonOcfImageConfig, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOcfImageConfig.a != null) {
            LoganSquare.typeConverterFor((Class)odj.class).serialize((Object)jsonOcfImageConfig.a, "image", true, afe);
        }
        ((StringBasedTypeConverter)JsonOcfImageConfig$$JsonObjectMapper.IMAGE_RENDER_TYPE_CONVERTER).serialize((Object)jsonOcfImageConfig.b, "image_type", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfImageConfig jsonOcfImageConfig, final String s, final tge tge) throws IOException {
        if ("image".equals(s)) {
            jsonOcfImageConfig.a = (odj)LoganSquare.typeConverterFor((Class)odj.class).parse(tge);
        }
        else if ("image_type".equals(s)) {
            jsonOcfImageConfig.b = (int)((StringBasedTypeConverter)JsonOcfImageConfig$$JsonObjectMapper.IMAGE_RENDER_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonOcfImageConfig parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfImageConfig jsonOcfImageConfig, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfImageConfig, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfImageConfig)o, afe, b);
    }
}
