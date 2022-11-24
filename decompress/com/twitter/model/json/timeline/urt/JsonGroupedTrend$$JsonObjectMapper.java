// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGroupedTrend$$JsonObjectMapper extends JsonMapper<JsonGroupedTrend>
{
    public static JsonGroupedTrend _parse(final qhe qhe) throws IOException {
        final JsonGroupedTrend jsonGroupedTrend = new JsonGroupedTrend();
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
            parseField(jsonGroupedTrend, d, qhe);
            qhe.m0();
        }
        return jsonGroupedTrend;
    }
    
    public static void _serialize(final JsonGroupedTrend jsonGroupedTrend, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("name", jsonGroupedTrend.a);
        if (jsonGroupedTrend.b != null) {
            LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonGroupedTrend.b, "url", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonGroupedTrend jsonGroupedTrend, final String s, final qhe qhe) throws IOException {
        if ("name".equals(s)) {
            jsonGroupedTrend.a = qhe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonGroupedTrend.b = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
        }
    }
    
    public JsonGroupedTrend parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonGroupedTrend jsonGroupedTrend, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonGroupedTrend, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonGroupedTrend)o, yfe, b);
    }
}
