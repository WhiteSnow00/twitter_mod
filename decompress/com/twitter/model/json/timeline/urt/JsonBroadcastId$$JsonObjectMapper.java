// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBroadcastId$$JsonObjectMapper extends JsonMapper<JsonBroadcastId>
{
    public static JsonBroadcastId _parse(final qhe qhe) throws IOException {
        final JsonBroadcastId jsonBroadcastId = new JsonBroadcastId();
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
            parseField(jsonBroadcastId, d, qhe);
            qhe.m0();
        }
        return jsonBroadcastId;
    }
    
    public static void _serialize(final JsonBroadcastId jsonBroadcastId, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonBroadcastId.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonBroadcastId jsonBroadcastId, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonBroadcastId.a = qhe.T((String)null);
        }
    }
    
    public JsonBroadcastId parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonBroadcastId jsonBroadcastId, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonBroadcastId, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonBroadcastId)o, yfe, b);
    }
}
