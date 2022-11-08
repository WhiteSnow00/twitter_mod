// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.twitter.model.json.timeline.urt.d;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTInlinePrompt$$JsonObjectMapper extends JsonMapper<JsonURTInlinePrompt>
{
    public static final d TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER;
    
    static {
        TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER = new d();
    }
    
    public static JsonURTInlinePrompt _parse(final khe khe) throws IOException {
        final JsonURTInlinePrompt jsonURTInlinePrompt = new JsonURTInlinePrompt();
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
            parseField(jsonURTInlinePrompt, d, khe);
            khe.m0();
        }
        return jsonURTInlinePrompt;
    }
    
    public static void _serialize(final JsonURTInlinePrompt jsonURTInlinePrompt, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonURTInlinePrompt.d != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTInlinePrompt.d, "bodyRichText", true, tfe);
        }
        tfe.u0("bodyText", jsonURTInlinePrompt.c);
        if (jsonURTInlinePrompt.b != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonURTInlinePrompt.b, "headerRichText", true, tfe);
        }
        tfe.u0("headerText", jsonURTInlinePrompt.a);
        if (jsonURTInlinePrompt.e != null) {
            LoganSquare.typeConverterFor((Class)fpv.class).serialize((Object)jsonURTInlinePrompt.e, "primaryButtonAction", true, tfe);
        }
        if (jsonURTInlinePrompt.f != null) {
            LoganSquare.typeConverterFor((Class)fpv.class).serialize((Object)jsonURTInlinePrompt.f, "secondaryButtonAction", true, tfe);
        }
        final d4t g = jsonURTInlinePrompt.g;
        if (g == null) {
            if (jsonURTInlinePrompt.h != null) {
                LoganSquare.typeConverterFor((Class)m8t.class).serialize((Object)jsonURTInlinePrompt.h, "userFacepile", true, tfe);
            }
            if (b) {
                tfe.h();
            }
            return;
        }
        ((twj<d4t>)JsonURTInlinePrompt$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).serialize(g, "socialContext", true, tfe);
        throw null;
    }
    
    public static void parseField(final JsonURTInlinePrompt jsonURTInlinePrompt, final String s, final khe khe) throws IOException {
        if (!"bodyRichText".equals(s) && !"inlineBodyRichText".equals(s)) {
            if (!"bodyText".equals(s) && !"inlineBodyText".equals(s)) {
                if (!"headerRichText".equals(s) && !"inlineHeaderRichText".equals(s)) {
                    if (!"headerText".equals(s) && !"inlineHeaderText".equals(s)) {
                        if (!"primaryButtonAction".equals(s) && !"inlinePrimaryButtonAction".equals(s)) {
                            if (!"secondaryButtonAction".equals(s) && !"inlineSecondaryButtonAction".equals(s)) {
                                if (!"socialContext".equals(s) && !"inlineSocialContext".equals(s)) {
                                    if ("userFacepile".equals(s) || "inlineTimelineUserFacepile".equals(s)) {
                                        jsonURTInlinePrompt.h = (m8t)LoganSquare.typeConverterFor((Class)m8t.class).parse(khe);
                                    }
                                }
                                else {
                                    jsonURTInlinePrompt.g = (d4t)((age)JsonURTInlinePrompt$$JsonObjectMapper.TIMELINE_SOCIAL_CONTEXT_UNION_CONVERTER).parse(khe);
                                }
                            }
                            else {
                                jsonURTInlinePrompt.f = (fpv)LoganSquare.typeConverterFor((Class)fpv.class).parse(khe);
                            }
                        }
                        else {
                            jsonURTInlinePrompt.e = (fpv)LoganSquare.typeConverterFor((Class)fpv.class).parse(khe);
                        }
                    }
                    else {
                        jsonURTInlinePrompt.a = khe.T((String)null);
                    }
                }
                else {
                    jsonURTInlinePrompt.b = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
                }
            }
            else {
                jsonURTInlinePrompt.c = khe.T((String)null);
            }
        }
        else {
            jsonURTInlinePrompt.d = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
    }
    
    public JsonURTInlinePrompt parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTInlinePrompt jsonURTInlinePrompt, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTInlinePrompt, tfe, b);
    }
}
