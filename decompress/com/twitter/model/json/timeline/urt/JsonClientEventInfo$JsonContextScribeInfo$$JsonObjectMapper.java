// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonContextScribeInfo$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo.JsonContextScribeInfo>
{
    public static JsonClientEventInfo.JsonContextScribeInfo _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo.JsonContextScribeInfo jsonContextScribeInfo = new JsonClientEventInfo.JsonContextScribeInfo();
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
            parseField(jsonContextScribeInfo, d, qhe);
            qhe.m0();
        }
        return jsonContextScribeInfo;
    }
    
    public static void _serialize(final JsonClientEventInfo.JsonContextScribeInfo jsonContextScribeInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonContextScribeInfo.b != null) {
            LoganSquare.typeConverterFor((Class)khe.class).serialize((Object)jsonContextScribeInfo.b, "isLastPosition", true, yfe);
        }
        yfe.u0("position", jsonContextScribeInfo.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo.JsonContextScribeInfo jsonContextScribeInfo, final String s, final qhe qhe) throws IOException {
        if ("isLastPosition".equals(s)) {
            jsonContextScribeInfo.b = (khe)LoganSquare.typeConverterFor((Class)khe.class).parse(qhe);
        }
        else if ("position".equals(s)) {
            jsonContextScribeInfo.a = qhe.T((String)null);
        }
    }
    
    public JsonClientEventInfo.JsonContextScribeInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo.JsonContextScribeInfo jsonContextScribeInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonContextScribeInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo.JsonContextScribeInfo)o, yfe, b);
    }
}
