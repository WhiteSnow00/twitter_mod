// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonStratostoreError$$JsonObjectMapper extends JsonMapper<JsonStratostoreError>
{
    public static JsonStratostoreError _parse(final qhe qhe) throws IOException {
        final JsonStratostoreError jsonStratostoreError = new JsonStratostoreError();
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
            parseField(jsonStratostoreError, d, qhe);
            qhe.m0();
        }
        return jsonStratostoreError;
    }
    
    public static void _serialize(final JsonStratostoreError jsonStratostoreError, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("code", jsonStratostoreError.a);
        yfe.u0("message", jsonStratostoreError.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonStratostoreError jsonStratostoreError, final String s, final qhe qhe) throws IOException {
        if ("code".equals(s)) {
            jsonStratostoreError.a = qhe.z();
        }
        else if ("message".equals(s)) {
            jsonStratostoreError.b = qhe.T((String)null);
        }
    }
    
    public JsonStratostoreError parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonStratostoreError jsonStratostoreError, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonStratostoreError, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonStratostoreError)o, yfe, b);
    }
}
