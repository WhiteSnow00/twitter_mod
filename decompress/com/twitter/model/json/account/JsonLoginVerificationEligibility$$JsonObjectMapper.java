// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLoginVerificationEligibility$$JsonObjectMapper extends JsonMapper<JsonLoginVerificationEligibility>
{
    public static JsonLoginVerificationEligibility _parse(final qhe qhe) throws IOException {
        final JsonLoginVerificationEligibility jsonLoginVerificationEligibility = new JsonLoginVerificationEligibility();
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
            parseField(jsonLoginVerificationEligibility, d, qhe);
            qhe.m0();
        }
        return jsonLoginVerificationEligibility;
    }
    
    public static void _serialize(final JsonLoginVerificationEligibility jsonLoginVerificationEligibility, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("enrolled_elsewhere", jsonLoginVerificationEligibility.b);
        yfe.u0("enrolled", jsonLoginVerificationEligibility.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonLoginVerificationEligibility jsonLoginVerificationEligibility, final String s, final qhe qhe) throws IOException {
        if ("enrolled_elsewhere".equals(s)) {
            jsonLoginVerificationEligibility.b = qhe.l();
        }
        else if ("enrolled".equals(s)) {
            jsonLoginVerificationEligibility.a = qhe.T((String)null);
        }
    }
    
    public JsonLoginVerificationEligibility parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonLoginVerificationEligibility jsonLoginVerificationEligibility, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonLoginVerificationEligibility, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonLoginVerificationEligibility)o, yfe, b);
    }
}
