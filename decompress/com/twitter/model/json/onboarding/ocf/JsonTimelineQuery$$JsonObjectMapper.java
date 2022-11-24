// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineQuery$$JsonObjectMapper extends JsonMapper<JsonTimelineQuery>
{
    public static JsonTimelineQuery _parse(final qhe qhe) throws IOException {
        final JsonTimelineQuery jsonTimelineQuery = new JsonTimelineQuery();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonTimelineQuery, d, qhe);
            qhe.m0();
        }
        return jsonTimelineQuery;
    }
    
    public static void _serialize(final JsonTimelineQuery jsonTimelineQuery, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("timeline_context", jsonTimelineQuery.b);
        yfe.u0("timeline_key", jsonTimelineQuery.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineQuery jsonTimelineQuery, final String s, final qhe qhe) throws IOException {
        if ("timeline_context".equals(s)) {
            jsonTimelineQuery.b = qhe.T((String)null);
        }
        else if ("timeline_key".equals(s)) {
            jsonTimelineQuery.a = qhe.T((String)null);
        }
    }
    
    public JsonTimelineQuery parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTimelineQuery jsonTimelineQuery, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTimelineQuery, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTimelineQuery)o, yfe, b);
    }
}
