// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonTrendDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo.JsonTrendDetails>
{
    public static JsonClientEventInfo.JsonTrendDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo.JsonTrendDetails jsonTrendDetails = new JsonClientEventInfo.JsonTrendDetails();
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
            parseField(jsonTrendDetails, d, qhe);
            qhe.m0();
        }
        return jsonTrendDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo.JsonTrendDetails jsonTrendDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("impressionId", jsonTrendDetails.a);
        yfe.u0("impressionToken", jsonTrendDetails.b);
        yfe.u0("position", jsonTrendDetails.c);
        yfe.u0("trendName", jsonTrendDetails.d);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo.JsonTrendDetails jsonTrendDetails, final String s, final qhe qhe) throws IOException {
        if ("impressionId".equals(s)) {
            jsonTrendDetails.a = qhe.T((String)null);
        }
        else if ("impressionToken".equals(s)) {
            jsonTrendDetails.b = qhe.T((String)null);
        }
        else if ("position".equals(s)) {
            jsonTrendDetails.c = qhe.T((String)null);
        }
        else if ("trendName".equals(s)) {
            jsonTrendDetails.d = qhe.T((String)null);
        }
    }
    
    public JsonClientEventInfo.JsonTrendDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo.JsonTrendDetails jsonTrendDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTrendDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo.JsonTrendDetails)o, yfe, b);
    }
}
