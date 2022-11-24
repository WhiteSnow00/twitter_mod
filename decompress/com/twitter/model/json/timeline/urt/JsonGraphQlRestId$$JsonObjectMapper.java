// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGraphQlRestId$$JsonObjectMapper extends JsonMapper<JsonGraphQlRestId>
{
    public static JsonGraphQlRestId _parse(final qhe qhe) throws IOException {
        final JsonGraphQlRestId jsonGraphQlRestId = new JsonGraphQlRestId();
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
            parseField(jsonGraphQlRestId, d, qhe);
            qhe.m0();
        }
        return jsonGraphQlRestId;
    }
    
    public static void _serialize(final JsonGraphQlRestId jsonGraphQlRestId, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("rest_id", jsonGraphQlRestId.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonGraphQlRestId jsonGraphQlRestId, final String s, final qhe qhe) throws IOException {
        if ("rest_id".equals(s)) {
            jsonGraphQlRestId.a = qhe.L();
        }
    }
    
    public JsonGraphQlRestId parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonGraphQlRestId jsonGraphQlRestId, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonGraphQlRestId, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonGraphQlRestId)o, yfe, b);
    }
}
