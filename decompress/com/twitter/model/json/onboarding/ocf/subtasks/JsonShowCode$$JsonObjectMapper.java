// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonShowCode$$JsonObjectMapper extends JsonMapper<JsonShowCode>
{
    public static final y3q SHOW_CODE_STYLE_TYPE_CONVERTER;
    
    static {
        SHOW_CODE_STYLE_TYPE_CONVERTER = new y3q();
    }
    
    public static JsonShowCode _parse(final tge tge) throws IOException {
        final JsonShowCode jsonShowCode = new JsonShowCode();
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
            parseField(jsonShowCode, d, tge);
            tge.l0();
        }
        return jsonShowCode;
    }
    
    public static void _serialize(final JsonShowCode jsonShowCode, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("code", jsonShowCode.c);
        if (jsonShowCode.g != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonShowCode.g, afe, true);
        }
        if (jsonShowCode.d != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonShowCode.d, afe, true);
        }
        if (jsonShowCode.a != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonShowCode.a, "header", true, afe);
        }
        if (jsonShowCode.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonShowCode.e, "next_link", true, afe);
        }
        if (jsonShowCode.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonShowCode.f, "skip_link", true, afe);
        }
        final x3q b2 = jsonShowCode.b;
        if (b2 != null) {
            ((StringBasedTypeConverter)JsonShowCode$$JsonObjectMapper.SHOW_CODE_STYLE_TYPE_CONVERTER).serialize((Object)b2, "style", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonShowCode jsonShowCode, final String s, final tge tge) throws IOException {
        if ("code".equals(s)) {
            jsonShowCode.c = tge.T((String)null);
        }
        else if ("component_collection".equals(s)) {
            jsonShowCode.g = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonShowCode.d = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("header".equals(s)) {
            jsonShowCode.a = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonShowCode.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("skip_link".equals(s)) {
            jsonShowCode.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("style".equals(s)) {
            jsonShowCode.b = (x3q)((StringBasedTypeConverter)JsonShowCode$$JsonObjectMapper.SHOW_CODE_STYLE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonShowCode parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonShowCode jsonShowCode, final afe afe, final boolean b) throws IOException {
        _serialize(jsonShowCode, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonShowCode)o, afe, b);
    }
}
