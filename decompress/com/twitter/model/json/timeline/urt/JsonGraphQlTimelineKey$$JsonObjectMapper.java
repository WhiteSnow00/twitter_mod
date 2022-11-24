// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGraphQlTimelineKey$$JsonObjectMapper extends JsonMapper<JsonGraphQlTimelineKey>
{
    public static JsonGraphQlTimelineKey _parse(final qhe qhe) throws IOException {
        final JsonGraphQlTimelineKey jsonGraphQlTimelineKey = new JsonGraphQlTimelineKey();
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
            parseField(jsonGraphQlTimelineKey, d, qhe);
            qhe.m0();
        }
        return jsonGraphQlTimelineKey;
    }
    
    public static void _serialize(final JsonGraphQlTimelineKey jsonGraphQlTimelineKey, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonGraphQlTimelineKey.a);
        if (jsonGraphQlTimelineKey.b != null) {
            LoganSquare.typeConverterFor((Class)rss.a.class).serialize((Object)jsonGraphQlTimelineKey.b, "timeline", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonGraphQlTimelineKey jsonGraphQlTimelineKey, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonGraphQlTimelineKey.a = qhe.T((String)null);
        }
        else if ("timeline".equals(s)) {
            jsonGraphQlTimelineKey.b = (rss.a)LoganSquare.typeConverterFor((Class)rss.a.class).parse(qhe);
        }
    }
    
    public JsonGraphQlTimelineKey parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonGraphQlTimelineKey jsonGraphQlTimelineKey, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonGraphQlTimelineKey, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonGraphQlTimelineKey)o, yfe, b);
    }
}
