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
    public static JsonCtaInline _parse(final tge tge) throws IOException {
        final JsonCtaInline jsonCtaInline = new JsonCtaInline();
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
            parseField(jsonCtaInline, d, tge);
            tge.l0();
        }
        return jsonCtaInline;
    }
    
    public static void _serialize(final JsonCtaInline jsonCtaInline, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonCtaInline.c != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonCtaInline.c, afe, true);
        }
        if (jsonCtaInline.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonCtaInline.b, "primary_action_link", true, afe);
        }
        afe.t0("primary_text", jsonCtaInline.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCtaInline jsonCtaInline, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonCtaInline.c = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("primary_action_link".equals(s)) {
            jsonCtaInline.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonCtaInline.a = tge.T((String)null);
        }
    }
    
    public JsonCtaInline parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCtaInline jsonCtaInline, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCtaInline, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCtaInline)o, afe, b);
    }
}
