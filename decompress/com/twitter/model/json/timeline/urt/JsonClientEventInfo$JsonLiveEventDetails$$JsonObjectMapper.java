// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonLiveEventDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo.JsonLiveEventDetails>
{
    public static JsonClientEventInfo.JsonLiveEventDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo.JsonLiveEventDetails jsonLiveEventDetails = new JsonClientEventInfo.JsonLiveEventDetails();
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
            parseField(jsonLiveEventDetails, d, qhe);
            qhe.m0();
        }
        return jsonLiveEventDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo.JsonLiveEventDetails jsonLiveEventDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("eventId", jsonLiveEventDetails.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo.JsonLiveEventDetails jsonLiveEventDetails, final String s, final qhe qhe) throws IOException {
        if ("eventId".equals(s)) {
            jsonLiveEventDetails.a = qhe.T((String)null);
        }
    }
    
    public JsonClientEventInfo.JsonLiveEventDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo.JsonLiveEventDetails jsonLiveEventDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo.JsonLiveEventDetails)o, yfe, b);
    }
}
