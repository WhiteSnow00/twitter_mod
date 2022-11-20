// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOriginalImage$$JsonObjectMapper extends JsonMapper<JsonOriginalImage>
{
    public static JsonOriginalImage _parse(final tge tge) throws IOException {
        final JsonOriginalImage jsonOriginalImage = new JsonOriginalImage();
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
            parseField(jsonOriginalImage, d, tge);
            tge.l0();
        }
        return jsonOriginalImage;
    }
    
    public static void _serialize(final JsonOriginalImage jsonOriginalImage, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOriginalImage.a != null) {
            LoganSquare.typeConverterFor((Class)soj.class).serialize((Object)jsonOriginalImage.a, "original_info", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOriginalImage jsonOriginalImage, final String s, final tge tge) throws IOException {
        if ("original_info".equals(s)) {
            jsonOriginalImage.a = (soj)LoganSquare.typeConverterFor((Class)soj.class).parse(tge);
        }
    }
    
    public JsonOriginalImage parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOriginalImage jsonOriginalImage, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOriginalImage, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOriginalImage)o, afe, b);
    }
}
