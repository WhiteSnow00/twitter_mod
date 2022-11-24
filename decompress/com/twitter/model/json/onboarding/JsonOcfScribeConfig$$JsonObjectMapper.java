// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfScribeConfig$$JsonObjectMapper extends JsonMapper<JsonOcfScribeConfig>
{
    public static JsonOcfScribeConfig _parse(final qhe qhe) throws IOException {
        final JsonOcfScribeConfig jsonOcfScribeConfig = new JsonOcfScribeConfig();
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
            parseField(jsonOcfScribeConfig, d, qhe);
            qhe.m0();
        }
        return jsonOcfScribeConfig;
    }
    
    public static void _serialize(final JsonOcfScribeConfig jsonOcfScribeConfig, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("action", jsonOcfScribeConfig.e);
        yfe.u0("component", jsonOcfScribeConfig.c);
        yfe.u0("element", jsonOcfScribeConfig.d);
        yfe.u0("page", jsonOcfScribeConfig.a);
        yfe.u0("section", jsonOcfScribeConfig.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfScribeConfig jsonOcfScribeConfig, final String s, final qhe qhe) throws IOException {
        if ("action".equals(s)) {
            jsonOcfScribeConfig.e = qhe.T((String)null);
        }
        else if ("component".equals(s)) {
            jsonOcfScribeConfig.c = qhe.T((String)null);
        }
        else if ("element".equals(s)) {
            jsonOcfScribeConfig.d = qhe.T((String)null);
        }
        else if ("page".equals(s)) {
            jsonOcfScribeConfig.a = qhe.T((String)null);
        }
        else if ("section".equals(s)) {
            jsonOcfScribeConfig.b = qhe.T((String)null);
        }
    }
    
    public JsonOcfScribeConfig parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfScribeConfig jsonOcfScribeConfig, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfScribeConfig, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfScribeConfig)o, yfe, b);
    }
}
