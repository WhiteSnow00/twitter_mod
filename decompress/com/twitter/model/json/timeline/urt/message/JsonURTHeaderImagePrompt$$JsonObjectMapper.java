// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTHeaderImagePrompt$$JsonObjectMapper extends JsonMapper<JsonURTHeaderImagePrompt>
{
    public static JsonURTHeaderImagePrompt _parse(final khe khe) throws IOException {
        final JsonURTHeaderImagePrompt jsonURTHeaderImagePrompt = new JsonURTHeaderImagePrompt();
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
            parseField(jsonURTHeaderImagePrompt, d, khe);
            khe.m0();
        }
        return jsonURTHeaderImagePrompt;
    }
    
    public static void _serialize(final JsonURTHeaderImagePrompt jsonURTHeaderImagePrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTHeaderImagePrompt.h != null) {
            LoganSquare.typeConverterFor((Class)apv.class).serialize((Object)jsonURTHeaderImagePrompt.h, "action", true, tfe);
        }
        if (jsonURTHeaderImagePrompt.d != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTHeaderImagePrompt.d, "bodyRichText", true, tfe);
        }
        tfe.u0("bodyText", jsonURTHeaderImagePrompt.c);
        if (jsonURTHeaderImagePrompt.e != null) {
            LoganSquare.typeConverterFor((Class)dpv.class).serialize((Object)jsonURTHeaderImagePrompt.e, "headerImage", true, tfe);
        }
        if (jsonURTHeaderImagePrompt.b != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTHeaderImagePrompt.b, "headerRichText", true, tfe);
        }
        tfe.u0("headerText", jsonURTHeaderImagePrompt.a);
        if (jsonURTHeaderImagePrompt.f != null) {
            LoganSquare.typeConverterFor((Class)fpv.class).serialize((Object)jsonURTHeaderImagePrompt.f, "primaryButtonAction", true, tfe);
        }
        if (jsonURTHeaderImagePrompt.g != null) {
            LoganSquare.typeConverterFor((Class)fpv.class).serialize((Object)jsonURTHeaderImagePrompt.g, "secondaryButtonAction", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTHeaderImagePrompt jsonURTHeaderImagePrompt, final String s, final khe khe) throws IOException {
        if ("action".equals(s)) {
            jsonURTHeaderImagePrompt.h = (apv)LoganSquare.typeConverterFor((Class)apv.class).parse(khe);
        }
        else if ("bodyRichText".equals(s)) {
            jsonURTHeaderImagePrompt.d = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("bodyText".equals(s)) {
            jsonURTHeaderImagePrompt.c = khe.T((String)null);
        }
        else if ("headerImage".equals(s)) {
            jsonURTHeaderImagePrompt.e = (dpv)LoganSquare.typeConverterFor((Class)dpv.class).parse(khe);
        }
        else if ("headerRichText".equals(s)) {
            jsonURTHeaderImagePrompt.b = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("headerText".equals(s)) {
            jsonURTHeaderImagePrompt.a = khe.T((String)null);
        }
        else if ("primaryButtonAction".equals(s)) {
            jsonURTHeaderImagePrompt.f = (fpv)LoganSquare.typeConverterFor((Class)fpv.class).parse(khe);
        }
        else if ("secondaryButtonAction".equals(s)) {
            jsonURTHeaderImagePrompt.g = (fpv)LoganSquare.typeConverterFor((Class)fpv.class).parse(khe);
        }
    }
    
    public JsonURTHeaderImagePrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTHeaderImagePrompt jsonURTHeaderImagePrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTHeaderImagePrompt, tfe, b);
    }
}
