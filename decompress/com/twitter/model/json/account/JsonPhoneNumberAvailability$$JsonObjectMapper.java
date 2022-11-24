// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPhoneNumberAvailability$$JsonObjectMapper extends JsonMapper<JsonPhoneNumberAvailability>
{
    public static JsonPhoneNumberAvailability _parse(final qhe qhe) throws IOException {
        final JsonPhoneNumberAvailability jsonPhoneNumberAvailability = new JsonPhoneNumberAvailability();
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
            parseField(jsonPhoneNumberAvailability, d, qhe);
            qhe.m0();
        }
        return jsonPhoneNumberAvailability;
    }
    
    public static void _serialize(final JsonPhoneNumberAvailability jsonPhoneNumberAvailability, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("available", jsonPhoneNumberAvailability.b);
        yfe.e("valid", jsonPhoneNumberAvailability.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPhoneNumberAvailability jsonPhoneNumberAvailability, final String s, final qhe qhe) throws IOException {
        if ("available".equals(s)) {
            jsonPhoneNumberAvailability.b = qhe.l();
        }
        else if ("valid".equals(s)) {
            jsonPhoneNumberAvailability.a = qhe.l();
        }
    }
    
    public JsonPhoneNumberAvailability parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPhoneNumberAvailability jsonPhoneNumberAvailability, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPhoneNumberAvailability, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPhoneNumberAvailability)o, yfe, b);
    }
}
