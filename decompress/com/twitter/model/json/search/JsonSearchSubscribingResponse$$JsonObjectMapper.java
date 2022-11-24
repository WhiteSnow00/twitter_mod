// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.search;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSearchSubscribingResponse$$JsonObjectMapper extends JsonMapper<JsonSearchSubscribingResponse>
{
    public static JsonSearchSubscribingResponse _parse(final qhe qhe) throws IOException {
        final JsonSearchSubscribingResponse jsonSearchSubscribingResponse = new JsonSearchSubscribingResponse();
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
            parseField(jsonSearchSubscribingResponse, d, qhe);
            qhe.m0();
        }
        return jsonSearchSubscribingResponse;
    }
    
    public static void _serialize(final JsonSearchSubscribingResponse jsonSearchSubscribingResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("search_check_subscribed", jsonSearchSubscribingResponse.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSearchSubscribingResponse jsonSearchSubscribingResponse, final String s, final qhe qhe) throws IOException {
        if ("search_check_subscribed".equals(s)) {
            jsonSearchSubscribingResponse.a = qhe.l();
        }
    }
    
    public JsonSearchSubscribingResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSearchSubscribingResponse jsonSearchSubscribingResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSearchSubscribingResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSearchSubscribingResponse)o, yfe, b);
    }
}
