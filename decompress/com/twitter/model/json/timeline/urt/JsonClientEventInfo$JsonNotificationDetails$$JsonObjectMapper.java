// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonNotificationDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo.JsonNotificationDetails>
{
    public static JsonClientEventInfo.JsonNotificationDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo.JsonNotificationDetails jsonNotificationDetails = new JsonClientEventInfo.JsonNotificationDetails();
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
            parseField(jsonNotificationDetails, d, qhe);
            qhe.m0();
        }
        return jsonNotificationDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo.JsonNotificationDetails jsonNotificationDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("impressionId", jsonNotificationDetails.a);
        yfe.u0("metadata", jsonNotificationDetails.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo.JsonNotificationDetails jsonNotificationDetails, final String s, final qhe qhe) throws IOException {
        if ("impressionId".equals(s)) {
            jsonNotificationDetails.a = qhe.T((String)null);
        }
        else if ("metadata".equals(s)) {
            jsonNotificationDetails.b = qhe.T((String)null);
        }
    }
    
    public JsonClientEventInfo.JsonNotificationDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo.JsonNotificationDetails jsonNotificationDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNotificationDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo.JsonNotificationDetails)o, yfe, b);
    }
}
