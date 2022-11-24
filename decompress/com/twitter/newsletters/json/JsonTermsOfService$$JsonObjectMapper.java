// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTermsOfService$$JsonObjectMapper extends JsonMapper<JsonTermsOfService>
{
    public static JsonTermsOfService _parse(final qhe qhe) throws IOException {
        final JsonTermsOfService jsonTermsOfService = new JsonTermsOfService();
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
            parseField(jsonTermsOfService, d, qhe);
            qhe.m0();
        }
        return jsonTermsOfService;
    }
    
    public static void _serialize(final JsonTermsOfService jsonTermsOfService, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("privacy_policy_url", jsonTermsOfService.b);
        yfe.u0("terms_of_service_url", jsonTermsOfService.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTermsOfService jsonTermsOfService, final String s, final qhe qhe) throws IOException {
        if ("privacy_policy_url".equals(s)) {
            jsonTermsOfService.b = qhe.T((String)null);
        }
        else if ("terms_of_service_url".equals(s)) {
            jsonTermsOfService.a = qhe.T((String)null);
        }
    }
    
    public JsonTermsOfService parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTermsOfService jsonTermsOfService, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTermsOfService, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTermsOfService)o, yfe, b);
    }
}
