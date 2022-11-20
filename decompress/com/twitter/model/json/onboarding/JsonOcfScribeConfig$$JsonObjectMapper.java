// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfScribeConfig$$JsonObjectMapper extends JsonMapper<JsonOcfScribeConfig>
{
    public static JsonOcfScribeConfig _parse(final tge tge) throws IOException {
        final JsonOcfScribeConfig jsonOcfScribeConfig = new JsonOcfScribeConfig();
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
            parseField(jsonOcfScribeConfig, d, tge);
            tge.l0();
        }
        return jsonOcfScribeConfig;
    }
    
    public static void _serialize(final JsonOcfScribeConfig jsonOcfScribeConfig, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("action", jsonOcfScribeConfig.e);
        afe.t0("component", jsonOcfScribeConfig.c);
        afe.t0("element", jsonOcfScribeConfig.d);
        afe.t0("page", jsonOcfScribeConfig.a);
        afe.t0("section", jsonOcfScribeConfig.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfScribeConfig jsonOcfScribeConfig, final String s, final tge tge) throws IOException {
        if ("action".equals(s)) {
            jsonOcfScribeConfig.e = tge.T((String)null);
        }
        else if ("component".equals(s)) {
            jsonOcfScribeConfig.c = tge.T((String)null);
        }
        else if ("element".equals(s)) {
            jsonOcfScribeConfig.d = tge.T((String)null);
        }
        else if ("page".equals(s)) {
            jsonOcfScribeConfig.a = tge.T((String)null);
        }
        else if ("section".equals(s)) {
            jsonOcfScribeConfig.b = tge.T((String)null);
        }
    }
    
    public JsonOcfScribeConfig parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfScribeConfig jsonOcfScribeConfig, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfScribeConfig, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfScribeConfig)o, afe, b);
    }
}
