// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAvailability$$JsonObjectMapper extends JsonMapper<JsonAvailability>
{
    public static JsonAvailability _parse(final qhe qhe) throws IOException {
        final JsonAvailability jsonAvailability = new JsonAvailability();
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
            parseField(jsonAvailability, d, qhe);
            qhe.m0();
        }
        return jsonAvailability;
    }
    
    public static void _serialize(final JsonAvailability jsonAvailability, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("msg", jsonAvailability.b);
        yfe.e("taken", jsonAvailability.c);
        yfe.e("valid", jsonAvailability.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonAvailability jsonAvailability, final String s, final qhe qhe) throws IOException {
        if ("msg".equals(s)) {
            jsonAvailability.b = qhe.T((String)null);
        }
        else if ("taken".equals(s)) {
            jsonAvailability.c = qhe.l();
        }
        else if ("valid".equals(s)) {
            jsonAvailability.a = qhe.l();
        }
    }
    
    public JsonAvailability parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonAvailability jsonAvailability, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonAvailability, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonAvailability)o, yfe, b);
    }
}
