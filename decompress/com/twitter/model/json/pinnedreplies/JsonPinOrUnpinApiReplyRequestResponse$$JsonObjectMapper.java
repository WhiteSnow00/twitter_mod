// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pinnedreplies;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPinOrUnpinApiReplyRequestResponse$$JsonObjectMapper extends JsonMapper<JsonPinOrUnpinApiReplyRequestResponse>
{
    public static JsonPinOrUnpinApiReplyRequestResponse _parse(final qhe qhe) throws IOException {
        final JsonPinOrUnpinApiReplyRequestResponse jsonPinOrUnpinApiReplyRequestResponse = new JsonPinOrUnpinApiReplyRequestResponse();
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
            parseField(jsonPinOrUnpinApiReplyRequestResponse, d, qhe);
            qhe.m0();
        }
        return jsonPinOrUnpinApiReplyRequestResponse;
    }
    
    public static void _serialize(final JsonPinOrUnpinApiReplyRequestResponse jsonPinOrUnpinApiReplyRequestResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("success", jsonPinOrUnpinApiReplyRequestResponse.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPinOrUnpinApiReplyRequestResponse jsonPinOrUnpinApiReplyRequestResponse, final String s, final qhe qhe) throws IOException {
        if ("success".equals(s)) {
            jsonPinOrUnpinApiReplyRequestResponse.a = qhe.l();
        }
    }
    
    public JsonPinOrUnpinApiReplyRequestResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPinOrUnpinApiReplyRequestResponse jsonPinOrUnpinApiReplyRequestResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPinOrUnpinApiReplyRequestResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPinOrUnpinApiReplyRequestResponse)o, yfe, b);
    }
}
