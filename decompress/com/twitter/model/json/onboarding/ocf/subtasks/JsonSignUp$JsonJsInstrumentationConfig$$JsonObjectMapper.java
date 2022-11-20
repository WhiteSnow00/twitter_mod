// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSignUp$JsonJsInstrumentationConfig$$JsonObjectMapper extends JsonMapper<JsonSignUp.JsonJsInstrumentationConfig>
{
    public static JsonSignUp.JsonJsInstrumentationConfig _parse(final tge tge) throws IOException {
        final JsonSignUp.JsonJsInstrumentationConfig jsonJsInstrumentationConfig = new JsonSignUp.JsonJsInstrumentationConfig();
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
            parseField(jsonJsInstrumentationConfig, d, tge);
            tge.l0();
        }
        return jsonJsInstrumentationConfig;
    }
    
    public static void _serialize(final JsonSignUp.JsonJsInstrumentationConfig jsonJsInstrumentationConfig, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("url", jsonJsInstrumentationConfig.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSignUp.JsonJsInstrumentationConfig jsonJsInstrumentationConfig, final String s, final tge tge) throws IOException {
        if ("url".equals(s)) {
            jsonJsInstrumentationConfig.a = tge.T((String)null);
        }
    }
    
    public JsonSignUp.JsonJsInstrumentationConfig parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSignUp.JsonJsInstrumentationConfig jsonJsInstrumentationConfig, final afe afe, final boolean b) throws IOException {
        _serialize(jsonJsInstrumentationConfig, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSignUp.JsonJsInstrumentationConfig)o, afe, b);
    }
}
