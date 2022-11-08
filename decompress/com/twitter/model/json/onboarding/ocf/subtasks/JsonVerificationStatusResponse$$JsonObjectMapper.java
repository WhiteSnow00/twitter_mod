// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVerificationStatusResponse$$JsonObjectMapper extends JsonMapper<JsonVerificationStatusResponse>
{
    public static JsonVerificationStatusResponse _parse(final khe khe) throws IOException {
        final JsonVerificationStatusResponse jsonVerificationStatusResponse = new JsonVerificationStatusResponse();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonVerificationStatusResponse, d, khe);
            khe.m0();
        }
        return jsonVerificationStatusResponse;
    }
    
    public static void _serialize(final JsonVerificationStatusResponse jsonVerificationStatusResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("pin_code", jsonVerificationStatusResponse.b);
        tfe.e("verified", jsonVerificationStatusResponse.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonVerificationStatusResponse jsonVerificationStatusResponse, final String s, final khe khe) throws IOException {
        if ("pin_code".equals(s)) {
            jsonVerificationStatusResponse.b = khe.T((String)null);
        }
        else if ("verified".equals(s)) {
            jsonVerificationStatusResponse.a = khe.k();
        }
    }
    
    public JsonVerificationStatusResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonVerificationStatusResponse jsonVerificationStatusResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonVerificationStatusResponse, tfe, b);
    }
}
