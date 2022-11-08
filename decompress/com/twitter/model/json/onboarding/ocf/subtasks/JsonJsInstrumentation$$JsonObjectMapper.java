// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonJsInstrumentation$$JsonObjectMapper extends JsonMapper<JsonJsInstrumentation>
{
    public static JsonJsInstrumentation _parse(final khe khe) throws IOException {
        final JsonJsInstrumentation jsonJsInstrumentation = new JsonJsInstrumentation();
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
            parseField(jsonJsInstrumentation, d, khe);
            khe.m0();
        }
        return jsonJsInstrumentation;
    }
    
    public static void _serialize(final JsonJsInstrumentation jsonJsInstrumentation, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonJsInstrumentation.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonJsInstrumentation.c, "next_link", true, tfe);
        }
        tfe.T("timeout_ms", jsonJsInstrumentation.b);
        tfe.u0("url", jsonJsInstrumentation.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonJsInstrumentation jsonJsInstrumentation, final String s, final khe khe) throws IOException {
        if ("next_link".equals(s)) {
            jsonJsInstrumentation.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("timeout_ms".equals(s)) {
            jsonJsInstrumentation.b = khe.z();
        }
        else if ("url".equals(s)) {
            jsonJsInstrumentation.a = khe.T((String)null);
        }
    }
    
    public JsonJsInstrumentation parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonJsInstrumentation jsonJsInstrumentation, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonJsInstrumentation, tfe, b);
    }
}
