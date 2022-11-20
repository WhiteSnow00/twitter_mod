// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonJsInstrumentation$$JsonObjectMapper extends JsonMapper<JsonJsInstrumentation>
{
    public static JsonJsInstrumentation _parse(final tge tge) throws IOException {
        final JsonJsInstrumentation jsonJsInstrumentation = new JsonJsInstrumentation();
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
            parseField(jsonJsInstrumentation, d, tge);
            tge.l0();
        }
        return jsonJsInstrumentation;
    }
    
    public static void _serialize(final JsonJsInstrumentation jsonJsInstrumentation, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonJsInstrumentation.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonJsInstrumentation.c, "next_link", true, afe);
        }
        afe.T("timeout_ms", jsonJsInstrumentation.b);
        afe.t0("url", jsonJsInstrumentation.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonJsInstrumentation jsonJsInstrumentation, final String s, final tge tge) throws IOException {
        if ("next_link".equals(s)) {
            jsonJsInstrumentation.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("timeout_ms".equals(s)) {
            jsonJsInstrumentation.b = tge.y();
        }
        else if ("url".equals(s)) {
            jsonJsInstrumentation.a = tge.T((String)null);
        }
    }
    
    public JsonJsInstrumentation parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonJsInstrumentation jsonJsInstrumentation, final afe afe, final boolean b) throws IOException {
        _serialize(jsonJsInstrumentation, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonJsInstrumentation)o, afe, b);
    }
}
