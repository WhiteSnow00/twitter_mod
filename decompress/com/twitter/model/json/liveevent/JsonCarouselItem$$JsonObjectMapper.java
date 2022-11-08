// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCarouselItem$$JsonObjectMapper extends JsonMapper<JsonCarouselItem>
{
    public static JsonCarouselItem _parse(final khe khe) throws IOException {
        final JsonCarouselItem jsonCarouselItem = new JsonCarouselItem();
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
            parseField(jsonCarouselItem, d, khe);
            khe.m0();
        }
        return jsonCarouselItem;
    }
    
    public static void _serialize(final JsonCarouselItem jsonCarouselItem, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonCarouselItem.d != null) {
            LoganSquare.typeConverterFor((Class)fpf.class).serialize((Object)jsonCarouselItem.d, "audiospace", true, tfe);
        }
        if (jsonCarouselItem.c != null) {
            LoganSquare.typeConverterFor((Class)zl3.class).serialize((Object)jsonCarouselItem.c, "broadcast", true, tfe);
        }
        if (jsonCarouselItem.f != null) {
            LoganSquare.typeConverterFor((Class)mdq.class).serialize((Object)jsonCarouselItem.f, "fallback_slate", true, tfe);
        }
        tfe.u0("entry_id", jsonCarouselItem.a);
        if (jsonCarouselItem.h != null) {
            LoganSquare.typeConverterFor((Class)moh.class).serialize((Object)jsonCarouselItem.h, "moment", true, tfe);
        }
        tfe.e("selected", jsonCarouselItem.b);
        if (jsonCarouselItem.g != null) {
            LoganSquare.typeConverterFor((Class)mdq.class).serialize((Object)jsonCarouselItem.g, "slate", true, tfe);
        }
        if (jsonCarouselItem.i != null) {
            LoganSquare.typeConverterFor((Class)um3.class).serialize((Object)jsonCarouselItem.i, "social_proof", true, tfe);
        }
        if (jsonCarouselItem.e != null) {
            LoganSquare.typeConverterFor((Class)rmu.class).serialize((Object)jsonCarouselItem.e, "tweet_media", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCarouselItem jsonCarouselItem, final String s, final khe khe) throws IOException {
        if ("audiospace".equals(s)) {
            jsonCarouselItem.d = (fpf)LoganSquare.typeConverterFor((Class)fpf.class).parse(khe);
        }
        else if ("broadcast".equals(s)) {
            jsonCarouselItem.c = (zl3)LoganSquare.typeConverterFor((Class)zl3.class).parse(khe);
        }
        else if ("fallback_slate".equals(s)) {
            jsonCarouselItem.f = (mdq)LoganSquare.typeConverterFor((Class)mdq.class).parse(khe);
        }
        else if ("entry_id".equals(s)) {
            jsonCarouselItem.a = khe.T((String)null);
        }
        else if ("moment".equals(s)) {
            jsonCarouselItem.h = (moh)LoganSquare.typeConverterFor((Class)moh.class).parse(khe);
        }
        else if ("selected".equals(s)) {
            jsonCarouselItem.b = khe.k();
        }
        else if ("slate".equals(s)) {
            jsonCarouselItem.g = (mdq)LoganSquare.typeConverterFor((Class)mdq.class).parse(khe);
        }
        else if ("social_proof".equals(s)) {
            jsonCarouselItem.i = (um3)LoganSquare.typeConverterFor((Class)um3.class).parse(khe);
        }
        else if ("tweet_media".equals(s)) {
            jsonCarouselItem.e = (rmu)LoganSquare.typeConverterFor((Class)rmu.class).parse(khe);
        }
    }
    
    public JsonCarouselItem parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCarouselItem jsonCarouselItem, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCarouselItem, tfe, b);
    }
}
