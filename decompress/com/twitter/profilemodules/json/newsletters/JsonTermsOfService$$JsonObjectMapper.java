// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTermsOfService$$JsonObjectMapper extends JsonMapper<JsonTermsOfService>
{
    public static JsonTermsOfService _parse(final tge tge) throws IOException {
        final JsonTermsOfService jsonTermsOfService = new JsonTermsOfService();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonTermsOfService, d, tge);
            tge.l0();
        }
        return jsonTermsOfService;
    }
    
    public static void _serialize(final JsonTermsOfService jsonTermsOfService, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("privacy_policy_url", jsonTermsOfService.b);
        afe.t0("terms_of_service_url", jsonTermsOfService.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTermsOfService jsonTermsOfService, final String s, final tge tge) throws IOException {
        if ("privacy_policy_url".equals(s)) {
            jsonTermsOfService.b = tge.T((String)null);
        }
        else if ("terms_of_service_url".equals(s)) {
            jsonTermsOfService.a = tge.T((String)null);
        }
    }
    
    public JsonTermsOfService parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTermsOfService jsonTermsOfService, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTermsOfService, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTermsOfService)o, afe, b);
    }
}
