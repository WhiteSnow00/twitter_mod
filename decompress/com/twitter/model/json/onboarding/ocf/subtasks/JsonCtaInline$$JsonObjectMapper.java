// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCtaInline$$JsonObjectMapper extends JsonMapper<JsonCtaInline>
{
    public static JsonCtaInline _parse(final khe khe) throws IOException {
        final JsonCtaInline jsonCtaInline = new JsonCtaInline();
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
            parseField(jsonCtaInline, d, khe);
            khe.m0();
        }
        return jsonCtaInline;
    }
    
    public static void _serialize(final JsonCtaInline jsonCtaInline, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonCtaInline.c != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonCtaInline.c, tfe, true);
        }
        if (jsonCtaInline.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonCtaInline.b, "primary_action_link", true, tfe);
        }
        tfe.u0("primary_text", jsonCtaInline.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCtaInline jsonCtaInline, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonCtaInline.c = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("primary_action_link".equals(s)) {
            jsonCtaInline.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonCtaInline.a = khe.T((String)null);
        }
    }
    
    public JsonCtaInline parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCtaInline jsonCtaInline, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCtaInline, tfe, b);
    }
}
