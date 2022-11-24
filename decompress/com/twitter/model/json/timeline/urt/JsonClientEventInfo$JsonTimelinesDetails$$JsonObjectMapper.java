// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonTimelinesDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo.JsonTimelinesDetails>
{
    public static JsonClientEventInfo.JsonTimelinesDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo.JsonTimelinesDetails jsonTimelinesDetails = new JsonClientEventInfo.JsonTimelinesDetails();
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
            parseField(jsonTimelinesDetails, d, qhe);
            qhe.m0();
        }
        return jsonTimelinesDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo.JsonTimelinesDetails jsonTimelinesDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("controllerData", jsonTimelinesDetails.b);
        yfe.u0("injectionType", jsonTimelinesDetails.a);
        yfe.u0("sourceData", jsonTimelinesDetails.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo.JsonTimelinesDetails jsonTimelinesDetails, final String s, final qhe qhe) throws IOException {
        if ("controllerData".equals(s)) {
            jsonTimelinesDetails.b = qhe.T((String)null);
        }
        else if ("injectionType".equals(s)) {
            jsonTimelinesDetails.a = qhe.T((String)null);
        }
        else if ("sourceData".equals(s)) {
            jsonTimelinesDetails.c = qhe.T((String)null);
        }
    }
    
    public JsonClientEventInfo.JsonTimelinesDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo.JsonTimelinesDetails jsonTimelinesDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTimelinesDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo.JsonTimelinesDetails)o, yfe, b);
    }
}
