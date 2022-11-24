// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfImage$$JsonObjectMapper extends JsonMapper<JsonOcfImage>
{
    public static JsonOcfImage _parse(final qhe qhe) throws IOException {
        final JsonOcfImage jsonOcfImage = new JsonOcfImage();
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
            parseField(jsonOcfImage, d, qhe);
            qhe.m0();
        }
        return jsonOcfImage;
    }
    
    public static void _serialize(final JsonOcfImage jsonOcfImage, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonOcfImage.a != null) {
            LoganSquare.typeConverterFor((Class)b8d.class).serialize((Object)jsonOcfImage.a, "image_info", true, yfe);
        }
        yfe.u0("placeholder", jsonOcfImage.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfImage jsonOcfImage, final String s, final qhe qhe) throws IOException {
        if ("image_info".equals(s)) {
            jsonOcfImage.a = (b8d)LoganSquare.typeConverterFor((Class)b8d.class).parse(qhe);
        }
        else if ("placeholder".equals(s)) {
            jsonOcfImage.b = qhe.T((String)null);
        }
    }
    
    public JsonOcfImage parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfImage jsonOcfImage, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfImage, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfImage)o, yfe, b);
    }
}
