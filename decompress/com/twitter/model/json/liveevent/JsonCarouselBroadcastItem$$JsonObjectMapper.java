// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCarouselBroadcastItem$$JsonObjectMapper extends JsonMapper<JsonCarouselBroadcastItem>
{
    public static JsonCarouselBroadcastItem _parse(final khe khe) throws IOException {
        final JsonCarouselBroadcastItem jsonCarouselBroadcastItem = new JsonCarouselBroadcastItem();
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
            parseField(jsonCarouselBroadcastItem, d, khe);
            khe.m0();
        }
        return jsonCarouselBroadcastItem;
    }
    
    public static void _serialize(final JsonCarouselBroadcastItem jsonCarouselBroadcastItem, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("id", jsonCarouselBroadcastItem.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCarouselBroadcastItem jsonCarouselBroadcastItem, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonCarouselBroadcastItem.a = khe.T((String)null);
        }
    }
    
    public JsonCarouselBroadcastItem parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCarouselBroadcastItem jsonCarouselBroadcastItem, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCarouselBroadcastItem, tfe, b);
    }
}
