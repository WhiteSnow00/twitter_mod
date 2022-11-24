// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonApiRequestSuccessResponse$$JsonObjectMapper extends JsonMapper<JsonApiRequestSuccessResponse>
{
    public static JsonApiRequestSuccessResponse _parse(final qhe qhe) throws IOException {
        final JsonApiRequestSuccessResponse jsonApiRequestSuccessResponse = new JsonApiRequestSuccessResponse();
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
            parseField(jsonApiRequestSuccessResponse, d, qhe);
            qhe.m0();
        }
        return jsonApiRequestSuccessResponse;
    }
    
    public static void _serialize(final JsonApiRequestSuccessResponse jsonApiRequestSuccessResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("success", jsonApiRequestSuccessResponse.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonApiRequestSuccessResponse jsonApiRequestSuccessResponse, final String s, final qhe qhe) throws IOException {
        if ("success".equals(s)) {
            jsonApiRequestSuccessResponse.a = qhe.l();
        }
    }
    
    public JsonApiRequestSuccessResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonApiRequestSuccessResponse jsonApiRequestSuccessResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonApiRequestSuccessResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonApiRequestSuccessResponse)o, yfe, b);
    }
}
