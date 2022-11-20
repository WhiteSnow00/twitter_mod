// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfImage$$JsonObjectMapper extends JsonMapper<JsonOcfImage>
{
    public static JsonOcfImage _parse(final tge tge) throws IOException {
        final JsonOcfImage jsonOcfImage = new JsonOcfImage();
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
            parseField(jsonOcfImage, d, tge);
            tge.l0();
        }
        return jsonOcfImage;
    }
    
    public static void _serialize(final JsonOcfImage jsonOcfImage, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOcfImage.a != null) {
            LoganSquare.typeConverterFor((Class)z6d.class).serialize((Object)jsonOcfImage.a, "image_info", true, afe);
        }
        afe.t0("placeholder", jsonOcfImage.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfImage jsonOcfImage, final String s, final tge tge) throws IOException {
        if ("image_info".equals(s)) {
            jsonOcfImage.a = (z6d)LoganSquare.typeConverterFor((Class)z6d.class).parse(tge);
        }
        else if ("placeholder".equals(s)) {
            jsonOcfImage.b = tge.T((String)null);
        }
    }
    
    public JsonOcfImage parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfImage jsonOcfImage, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfImage, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfImage)o, afe, b);
    }
}
