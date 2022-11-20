// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelinePlace$$JsonObjectMapper extends JsonMapper<JsonTimelinePlace>
{
    public static JsonTimelinePlace _parse(final tge tge) throws IOException {
        final JsonTimelinePlace jsonTimelinePlace = new JsonTimelinePlace();
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
            parseField(jsonTimelinePlace, d, tge);
            tge.l0();
        }
        return jsonTimelinePlace;
    }
    
    public static void _serialize(final JsonTimelinePlace jsonTimelinePlace, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("placeId", jsonTimelinePlace.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelinePlace jsonTimelinePlace, final String s, final tge tge) throws IOException {
        if ("placeId".equals(s)) {
            jsonTimelinePlace.a = tge.T((String)null);
        }
    }
    
    public JsonTimelinePlace parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelinePlace jsonTimelinePlace, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelinePlace, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelinePlace)o, afe, b);
    }
}
