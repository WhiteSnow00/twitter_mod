// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOriginalImage$$JsonObjectMapper extends JsonMapper<JsonOriginalImage>
{
    public static JsonOriginalImage _parse(final khe khe) throws IOException {
        final JsonOriginalImage jsonOriginalImage = new JsonOriginalImage();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonOriginalImage, d, khe);
            khe.m0();
        }
        return jsonOriginalImage;
    }
    
    public static void _serialize(final JsonOriginalImage jsonOriginalImage, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonOriginalImage.a != null) {
            LoganSquare.typeConverterFor((Class)moj.class).serialize((Object)jsonOriginalImage.a, "original_info", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOriginalImage jsonOriginalImage, final String s, final khe khe) throws IOException {
        if ("original_info".equals(s)) {
            jsonOriginalImage.a = (moj)LoganSquare.typeConverterFor((Class)moj.class).parse(khe);
        }
    }
    
    public JsonOriginalImage parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOriginalImage jsonOriginalImage, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOriginalImage, tfe, b);
    }
}
