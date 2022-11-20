// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineQuery$$JsonObjectMapper extends JsonMapper<JsonTimelineQuery>
{
    public static JsonTimelineQuery _parse(final tge tge) throws IOException {
        final JsonTimelineQuery jsonTimelineQuery = new JsonTimelineQuery();
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
            parseField(jsonTimelineQuery, d, tge);
            tge.l0();
        }
        return jsonTimelineQuery;
    }
    
    public static void _serialize(final JsonTimelineQuery jsonTimelineQuery, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("timeline_context", jsonTimelineQuery.b);
        afe.t0("timeline_key", jsonTimelineQuery.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineQuery jsonTimelineQuery, final String s, final tge tge) throws IOException {
        if ("timeline_context".equals(s)) {
            jsonTimelineQuery.b = tge.T((String)null);
        }
        else if ("timeline_key".equals(s)) {
            jsonTimelineQuery.a = tge.T((String)null);
        }
    }
    
    public JsonTimelineQuery parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineQuery jsonTimelineQuery, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTimelineQuery, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineQuery)o, afe, b);
    }
}
