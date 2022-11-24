// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCopyrightViolation$$JsonObjectMapper extends JsonMapper<JsonCopyrightViolation>
{
    public static JsonCopyrightViolation _parse(final qhe qhe) throws IOException {
        final JsonCopyrightViolation jsonCopyrightViolation = new JsonCopyrightViolation();
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
            parseField(jsonCopyrightViolation, d, qhe);
            qhe.m0();
        }
        return jsonCopyrightViolation;
    }
    
    public static void _serialize(final JsonCopyrightViolation jsonCopyrightViolation, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("copyright_holder_name", jsonCopyrightViolation.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCopyrightViolation jsonCopyrightViolation, final String s, final qhe qhe) throws IOException {
        if ("copyright_holder_name".equals(s)) {
            jsonCopyrightViolation.a = qhe.T((String)null);
        }
    }
    
    public JsonCopyrightViolation parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCopyrightViolation jsonCopyrightViolation, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCopyrightViolation, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCopyrightViolation)o, yfe, b);
    }
}
