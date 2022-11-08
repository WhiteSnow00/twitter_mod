// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTLargePrompt$$JsonObjectMapper extends JsonMapper<JsonURTLargePrompt>
{
    public static JsonURTLargePrompt _parse(final khe khe) throws IOException {
        final JsonURTLargePrompt jsonURTLargePrompt = new JsonURTLargePrompt();
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
            parseField(jsonURTLargePrompt, d, khe);
            khe.m0();
        }
        return jsonURTLargePrompt;
    }
    
    public static void _serialize(final JsonURTLargePrompt jsonURTLargePrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("headerText", jsonURTLargePrompt.a);
        if (jsonURTLargePrompt.b != null) {
            LoganSquare.typeConverterFor((Class)fpv.class).serialize((Object)jsonURTLargePrompt.b, "primaryButtonAction", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTLargePrompt jsonURTLargePrompt, final String s, final khe khe) throws IOException {
        if (!"headerText".equals(s) && !"largeHeaderText".equals(s)) {
            if ("primaryButtonAction".equals(s) || "largePrimaryButtonAction".equals(s)) {
                jsonURTLargePrompt.b = (fpv)LoganSquare.typeConverterFor((Class)fpv.class).parse(khe);
            }
        }
        else {
            jsonURTLargePrompt.a = khe.T((String)null);
        }
    }
    
    public JsonURTLargePrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTLargePrompt jsonURTLargePrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTLargePrompt, tfe, b);
    }
}
