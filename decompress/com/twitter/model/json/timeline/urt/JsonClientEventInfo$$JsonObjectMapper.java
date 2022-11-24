// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo>
{
    public static JsonClientEventInfo _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo jsonClientEventInfo = new JsonClientEventInfo();
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
            parseField(jsonClientEventInfo, d, qhe);
            qhe.m0();
        }
        return jsonClientEventInfo;
    }
    
    public static void _serialize(final JsonClientEventInfo jsonClientEventInfo, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("action", jsonClientEventInfo.d);
        yfe.u0("component", jsonClientEventInfo.a);
        yfe.u0("element", jsonClientEventInfo.b);
        yfe.u0("entityToken", jsonClientEventInfo.e);
        if (jsonClientEventInfo.c != null) {
            yfe.i("details");
            JsonClientEventInfo$JsonClientEventDetails$$JsonObjectMapper._serialize(jsonClientEventInfo.c, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo jsonClientEventInfo, final String s, final qhe qhe) throws IOException {
        if ("action".equals(s)) {
            jsonClientEventInfo.d = qhe.T((String)null);
        }
        else if ("component".equals(s)) {
            jsonClientEventInfo.a = qhe.T((String)null);
        }
        else if ("element".equals(s)) {
            jsonClientEventInfo.b = qhe.T((String)null);
        }
        else if ("entityToken".equals(s)) {
            jsonClientEventInfo.e = qhe.T((String)null);
        }
        else if ("details".equals(s)) {
            jsonClientEventInfo.c = JsonClientEventInfo$JsonClientEventDetails$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonClientEventInfo parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo jsonClientEventInfo, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonClientEventInfo, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo)o, yfe, b);
    }
}
