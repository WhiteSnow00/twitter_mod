// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCarouselBroadcastItem$$JsonObjectMapper extends JsonMapper<JsonCarouselBroadcastItem>
{
    public static JsonCarouselBroadcastItem _parse(final tge tge) throws IOException {
        final JsonCarouselBroadcastItem jsonCarouselBroadcastItem = new JsonCarouselBroadcastItem();
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
            parseField(jsonCarouselBroadcastItem, d, tge);
            tge.l0();
        }
        return jsonCarouselBroadcastItem;
    }
    
    public static void _serialize(final JsonCarouselBroadcastItem jsonCarouselBroadcastItem, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("id", jsonCarouselBroadcastItem.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCarouselBroadcastItem jsonCarouselBroadcastItem, final String s, final tge tge) throws IOException {
        if ("id".equals(s)) {
            jsonCarouselBroadcastItem.a = tge.T((String)null);
        }
    }
    
    public JsonCarouselBroadcastItem parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCarouselBroadcastItem jsonCarouselBroadcastItem, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCarouselBroadcastItem, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCarouselBroadcastItem)o, afe, b);
    }
}
