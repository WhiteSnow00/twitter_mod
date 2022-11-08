// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTCompactPrompt$$JsonObjectMapper extends JsonMapper<JsonURTCompactPrompt>
{
    public static JsonURTCompactPrompt _parse(final khe khe) throws IOException {
        final JsonURTCompactPrompt jsonURTCompactPrompt = new JsonURTCompactPrompt();
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
            parseField(jsonURTCompactPrompt, d, khe);
            khe.m0();
        }
        return jsonURTCompactPrompt;
    }
    
    public static void _serialize(final JsonURTCompactPrompt jsonURTCompactPrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTCompactPrompt.e != null) {
            LoganSquare.typeConverterFor((Class)apv.class).serialize((Object)jsonURTCompactPrompt.e, "action", true, tfe);
        }
        if (jsonURTCompactPrompt.g != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTCompactPrompt.g, "bodyRichText", true, tfe);
        }
        tfe.u0("bodyText", jsonURTCompactPrompt.b);
        if (jsonURTCompactPrompt.f != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTCompactPrompt.f, "headerRichText", true, tfe);
        }
        tfe.u0("headerText", jsonURTCompactPrompt.a);
        if (jsonURTCompactPrompt.c != null) {
            LoganSquare.typeConverterFor((Class)fpv.class).serialize((Object)jsonURTCompactPrompt.c, "primaryButtonAction", true, tfe);
        }
        if (jsonURTCompactPrompt.d != null) {
            LoganSquare.typeConverterFor((Class)fpv.class).serialize((Object)jsonURTCompactPrompt.d, "secondaryButtonAction", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTCompactPrompt jsonURTCompactPrompt, final String s, final khe khe) throws IOException {
        if (!"action".equals(s) && !"compactAction".equals(s)) {
            if (!"bodyRichText".equals(s) && !"compactBodyRichText".equals(s)) {
                if (!"bodyText".equals(s) && !"compactBodyText".equals(s)) {
                    if (!"headerRichText".equals(s) && !"compactHeaderRichText".equals(s)) {
                        if (!"headerText".equals(s) && !"compactHeaderText".equals(s)) {
                            if (!"primaryButtonAction".equals(s) && !"compactPrimaryButtonAction".equals(s)) {
                                if ("secondaryButtonAction".equals(s) || "compactSecondaryButtonAction".equals(s)) {
                                    jsonURTCompactPrompt.d = (fpv)LoganSquare.typeConverterFor((Class)fpv.class).parse(khe);
                                }
                            }
                            else {
                                jsonURTCompactPrompt.c = (fpv)LoganSquare.typeConverterFor((Class)fpv.class).parse(khe);
                            }
                        }
                        else {
                            jsonURTCompactPrompt.a = khe.T((String)null);
                        }
                    }
                    else {
                        jsonURTCompactPrompt.f = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
                    }
                }
                else {
                    jsonURTCompactPrompt.b = khe.T((String)null);
                }
            }
            else {
                jsonURTCompactPrompt.g = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
            }
        }
        else {
            jsonURTCompactPrompt.e = (apv)LoganSquare.typeConverterFor((Class)apv.class).parse(khe);
        }
    }
    
    public JsonURTCompactPrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTCompactPrompt jsonURTCompactPrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTCompactPrompt, tfe, b);
    }
}
