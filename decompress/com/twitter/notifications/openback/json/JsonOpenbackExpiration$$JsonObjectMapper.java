// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackExpiration$$JsonObjectMapper extends JsonMapper<JsonOpenbackExpiration>
{
    public static JsonOpenbackExpiration _parse(final qhe qhe) throws IOException {
        final JsonOpenbackExpiration jsonOpenbackExpiration = new JsonOpenbackExpiration();
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
            parseField(jsonOpenbackExpiration, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackExpiration;
    }
    
    public static void _serialize(final JsonOpenbackExpiration jsonOpenbackExpiration, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.W("afterDisplay", jsonOpenbackExpiration.a);
        yfe.u0("date", jsonOpenbackExpiration.b);
        yfe.e("fallback", jsonOpenbackExpiration.c);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackExpiration jsonOpenbackExpiration, final String s, final qhe qhe) throws IOException {
        if ("afterDisplay".equals(s)) {
            jsonOpenbackExpiration.a = qhe.L();
        }
        else if ("date".equals(s)) {
            jsonOpenbackExpiration.b = qhe.T((String)null);
        }
        else if ("fallback".equals(s)) {
            jsonOpenbackExpiration.c = qhe.l();
        }
    }
    
    public JsonOpenbackExpiration parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackExpiration jsonOpenbackExpiration, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackExpiration, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackExpiration)o, yfe, b);
    }
}
