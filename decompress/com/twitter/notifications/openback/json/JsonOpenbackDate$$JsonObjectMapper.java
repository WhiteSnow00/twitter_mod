// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.openback.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOpenbackDate$$JsonObjectMapper extends JsonMapper<JsonOpenbackDate>
{
    public static JsonOpenbackDate _parse(final qhe qhe) throws IOException {
        final JsonOpenbackDate jsonOpenbackDate = new JsonOpenbackDate();
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
            parseField(jsonOpenbackDate, d, qhe);
            qhe.m0();
        }
        return jsonOpenbackDate;
    }
    
    public static void _serialize(final JsonOpenbackDate jsonOpenbackDate, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("end", jsonOpenbackDate.b);
        yfe.u0("start", jsonOpenbackDate.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOpenbackDate jsonOpenbackDate, final String s, final qhe qhe) throws IOException {
        if ("end".equals(s)) {
            jsonOpenbackDate.b = qhe.T((String)null);
        }
        else if ("start".equals(s)) {
            jsonOpenbackDate.a = qhe.T((String)null);
        }
    }
    
    public JsonOpenbackDate parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOpenbackDate jsonOpenbackDate, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOpenbackDate, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOpenbackDate)o, yfe, b);
    }
}
