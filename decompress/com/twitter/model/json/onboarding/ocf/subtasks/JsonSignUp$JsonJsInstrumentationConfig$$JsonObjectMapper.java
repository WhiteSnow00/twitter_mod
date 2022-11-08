// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSignUp$JsonJsInstrumentationConfig$$JsonObjectMapper extends JsonMapper<JsonSignUp.JsonJsInstrumentationConfig>
{
    public static JsonSignUp.JsonJsInstrumentationConfig _parse(final khe khe) throws IOException {
        final JsonSignUp.JsonJsInstrumentationConfig jsonJsInstrumentationConfig = new JsonSignUp.JsonJsInstrumentationConfig();
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
            parseField(jsonJsInstrumentationConfig, d, khe);
            khe.m0();
        }
        return jsonJsInstrumentationConfig;
    }
    
    public static void _serialize(final JsonSignUp.JsonJsInstrumentationConfig jsonJsInstrumentationConfig, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("url", jsonJsInstrumentationConfig.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSignUp.JsonJsInstrumentationConfig jsonJsInstrumentationConfig, final String s, final khe khe) throws IOException {
        if ("url".equals(s)) {
            jsonJsInstrumentationConfig.a = khe.T((String)null);
        }
    }
    
    public JsonSignUp.JsonJsInstrumentationConfig parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSignUp.JsonJsInstrumentationConfig jsonJsInstrumentationConfig, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonJsInstrumentationConfig, tfe, b);
    }
}
