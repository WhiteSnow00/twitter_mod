// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineResponse$$JsonObjectMapper extends JsonMapper<JsonTimelineResponse>
{
    public static JsonTimelineResponse _parse(final tge tge) throws IOException {
        final JsonTimelineResponse jsonTimelineResponse = new JsonTimelineResponse();
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
            parseField(jsonTimelineResponse, d, tge);
            tge.l0();
        }
        return jsonTimelineResponse;
    }
    
    public static void _serialize(final JsonTimelineResponse jsonTimelineResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonTimelineResponse.a != null) {
            LoganSquare.typeConverterFor((Class)w3c$a.class).serialize((Object)jsonTimelineResponse.a, "globalObjects", true, afe);
        }
        if (jsonTimelineResponse.b != null) {
            LoganSquare.typeConverterFor((Class)xrs.class).serialize((Object)jsonTimelineResponse.b, "timeline", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineResponse jsonTimelineResponse, final String s, final tge tge) throws IOException {
        if ("globalObjects".equals(s)) {
            jsonTimelineResponse.a = (w3c$a)LoganSquare.typeConverterFor((Class)w3c$a.class).parse(tge);
        }
        else if ("timeline".equals(s)) {
            jsonTimelineResponse.b = (xrs)LoganSquare.typeConverterFor((Class)xrs.class).parse(tge);
        }
    }
    
    public JsonTimelineResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineResponse jsonTimelineResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineResponse)o, afe, b);
    }
}
