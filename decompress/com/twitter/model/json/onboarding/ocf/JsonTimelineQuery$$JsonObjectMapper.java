// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineQuery$$JsonObjectMapper extends JsonMapper<JsonTimelineQuery>
{
    public static JsonTimelineQuery _parse(final khe khe) throws IOException {
        final JsonTimelineQuery jsonTimelineQuery = new JsonTimelineQuery();
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
            parseField(jsonTimelineQuery, d, khe);
            khe.m0();
        }
        return jsonTimelineQuery;
    }
    
    public static void _serialize(final JsonTimelineQuery jsonTimelineQuery, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("timeline_context", jsonTimelineQuery.b);
        tfe.u0("timeline_key", jsonTimelineQuery.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineQuery jsonTimelineQuery, final String s, final khe khe) throws IOException {
        if ("timeline_context".equals(s)) {
            jsonTimelineQuery.b = khe.T((String)null);
        }
        else if ("timeline_key".equals(s)) {
            jsonTimelineQuery.a = khe.T((String)null);
        }
    }
    
    public JsonTimelineQuery parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineQuery jsonTimelineQuery, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTimelineQuery, tfe, b);
    }
}
