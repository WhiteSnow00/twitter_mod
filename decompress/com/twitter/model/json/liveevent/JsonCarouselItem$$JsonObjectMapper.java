// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCarouselItem$$JsonObjectMapper extends JsonMapper<JsonCarouselItem>
{
    public static JsonCarouselItem _parse(final tge tge) throws IOException {
        final JsonCarouselItem jsonCarouselItem = new JsonCarouselItem();
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
            parseField(jsonCarouselItem, d, tge);
            tge.l0();
        }
        return jsonCarouselItem;
    }
    
    public static void _serialize(final JsonCarouselItem jsonCarouselItem, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonCarouselItem.d != null) {
            LoganSquare.typeConverterFor((Class)rof.class).serialize((Object)jsonCarouselItem.d, "audiospace", true, afe);
        }
        if (jsonCarouselItem.c != null) {
            LoganSquare.typeConverterFor((Class)hl3.class).serialize((Object)jsonCarouselItem.c, "broadcast", true, afe);
        }
        if (jsonCarouselItem.f != null) {
            LoganSquare.typeConverterFor((Class)deq.class).serialize((Object)jsonCarouselItem.f, "fallback_slate", true, afe);
        }
        afe.t0("entry_id", jsonCarouselItem.a);
        if (jsonCarouselItem.h != null) {
            LoganSquare.typeConverterFor((Class)roh.class).serialize((Object)jsonCarouselItem.h, "moment", true, afe);
        }
        afe.e("selected", jsonCarouselItem.b);
        if (jsonCarouselItem.g != null) {
            LoganSquare.typeConverterFor((Class)deq.class).serialize((Object)jsonCarouselItem.g, "slate", true, afe);
        }
        if (jsonCarouselItem.i != null) {
            LoganSquare.typeConverterFor((Class)dm3.class).serialize((Object)jsonCarouselItem.i, "social_proof", true, afe);
        }
        if (jsonCarouselItem.e != null) {
            LoganSquare.typeConverterFor((Class)lnu.class).serialize((Object)jsonCarouselItem.e, "tweet_media", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCarouselItem jsonCarouselItem, final String s, final tge tge) throws IOException {
        if ("audiospace".equals(s)) {
            jsonCarouselItem.d = (rof)LoganSquare.typeConverterFor((Class)rof.class).parse(tge);
        }
        else if ("broadcast".equals(s)) {
            jsonCarouselItem.c = (hl3)LoganSquare.typeConverterFor((Class)hl3.class).parse(tge);
        }
        else if ("fallback_slate".equals(s)) {
            jsonCarouselItem.f = (deq)LoganSquare.typeConverterFor((Class)deq.class).parse(tge);
        }
        else if ("entry_id".equals(s)) {
            jsonCarouselItem.a = tge.T((String)null);
        }
        else if ("moment".equals(s)) {
            jsonCarouselItem.h = (roh)LoganSquare.typeConverterFor((Class)roh.class).parse(tge);
        }
        else if ("selected".equals(s)) {
            jsonCarouselItem.b = tge.k();
        }
        else if ("slate".equals(s)) {
            jsonCarouselItem.g = (deq)LoganSquare.typeConverterFor((Class)deq.class).parse(tge);
        }
        else if ("social_proof".equals(s)) {
            jsonCarouselItem.i = (dm3)LoganSquare.typeConverterFor((Class)dm3.class).parse(tge);
        }
        else if ("tweet_media".equals(s)) {
            jsonCarouselItem.e = (lnu)LoganSquare.typeConverterFor((Class)lnu.class).parse(tge);
        }
    }
    
    public JsonCarouselItem parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCarouselItem jsonCarouselItem, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCarouselItem, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCarouselItem)o, afe, b);
    }
}
