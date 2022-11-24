// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonConversationDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo.JsonConversationDetails>
{
    public static JsonClientEventInfo.JsonConversationDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo.JsonConversationDetails jsonConversationDetails = new JsonClientEventInfo.JsonConversationDetails();
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
            parseField(jsonConversationDetails, d, qhe);
            qhe.m0();
        }
        return jsonConversationDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo.JsonConversationDetails jsonConversationDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("conversationSection", jsonConversationDetails.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo.JsonConversationDetails jsonConversationDetails, final String s, final qhe qhe) throws IOException {
        if ("conversationSection".equals(s)) {
            jsonConversationDetails.a = qhe.T((String)null);
        }
    }
    
    public JsonClientEventInfo.JsonConversationDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo.JsonConversationDetails jsonConversationDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonConversationDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo.JsonConversationDetails)o, yfe, b);
    }
}
