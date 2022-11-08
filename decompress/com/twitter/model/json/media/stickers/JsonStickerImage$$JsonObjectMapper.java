// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonStickerImage$$JsonObjectMapper extends JsonMapper<JsonStickerImage>
{
    public static JsonStickerImage _parse(final khe khe) throws IOException {
        final JsonStickerImage jsonStickerImage = new JsonStickerImage();
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
            parseField(jsonStickerImage, d, khe);
            khe.m0();
        }
        return jsonStickerImage;
    }
    
    public static void _serialize(final JsonStickerImage jsonStickerImage, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("byte_count", jsonStickerImage.c);
        tfe.T("height", jsonStickerImage.a);
        tfe.u0("type", jsonStickerImage.e);
        tfe.u0("url", jsonStickerImage.d);
        tfe.T("width", jsonStickerImage.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonStickerImage jsonStickerImage, final String s, final khe khe) throws IOException {
        if ("byte_count".equals(s)) {
            jsonStickerImage.c = khe.L();
        }
        else if ("height".equals(s)) {
            jsonStickerImage.a = khe.z();
        }
        else if ("type".equals(s)) {
            jsonStickerImage.e = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonStickerImage.d = khe.T((String)null);
        }
        else if ("width".equals(s)) {
            jsonStickerImage.b = khe.z();
        }
    }
    
    public JsonStickerImage parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonStickerImage jsonStickerImage, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonStickerImage, tfe, b);
    }
}
