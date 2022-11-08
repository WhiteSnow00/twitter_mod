// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonStickerVariants$$JsonObjectMapper extends JsonMapper<JsonStickerVariants>
{
    public static JsonStickerVariants _parse(final khe khe) throws IOException {
        final JsonStickerVariants jsonStickerVariants = new JsonStickerVariants();
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
            parseField(jsonStickerVariants, d, khe);
            khe.m0();
        }
        return jsonStickerVariants;
    }
    
    public static void _serialize(final JsonStickerVariants jsonStickerVariants, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.P("aspect_ratio", jsonStickerVariants.f);
        if (jsonStickerVariants.a != null) {
            LoganSquare.typeConverterFor((Class)ggr.class).serialize((Object)jsonStickerVariants.a, "raw", true, tfe);
        }
        if (jsonStickerVariants.b != null) {
            LoganSquare.typeConverterFor((Class)ggr.class).serialize((Object)jsonStickerVariants.b, "size_1x", true, tfe);
        }
        if (jsonStickerVariants.c != null) {
            LoganSquare.typeConverterFor((Class)ggr.class).serialize((Object)jsonStickerVariants.c, "size_2x", true, tfe);
        }
        if (jsonStickerVariants.d != null) {
            LoganSquare.typeConverterFor((Class)ggr.class).serialize((Object)jsonStickerVariants.d, "size_3x", true, tfe);
        }
        if (jsonStickerVariants.e != null) {
            LoganSquare.typeConverterFor((Class)ggr.class).serialize((Object)jsonStickerVariants.e, "size_4x", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonStickerVariants jsonStickerVariants, final String s, final khe khe) throws IOException {
        if ("aspect_ratio".equals(s)) {
            jsonStickerVariants.f = (float)khe.p();
        }
        else if ("raw".equals(s)) {
            jsonStickerVariants.a = (ggr)LoganSquare.typeConverterFor((Class)ggr.class).parse(khe);
        }
        else if ("size_1x".equals(s)) {
            jsonStickerVariants.b = (ggr)LoganSquare.typeConverterFor((Class)ggr.class).parse(khe);
        }
        else if ("size_2x".equals(s)) {
            jsonStickerVariants.c = (ggr)LoganSquare.typeConverterFor((Class)ggr.class).parse(khe);
        }
        else if ("size_3x".equals(s)) {
            jsonStickerVariants.d = (ggr)LoganSquare.typeConverterFor((Class)ggr.class).parse(khe);
        }
        else if ("size_4x".equals(s)) {
            jsonStickerVariants.e = (ggr)LoganSquare.typeConverterFor((Class)ggr.class).parse(khe);
        }
    }
    
    public JsonStickerVariants parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonStickerVariants jsonStickerVariants, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonStickerVariants, tfe, b);
    }
}
