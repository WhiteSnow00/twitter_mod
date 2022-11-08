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
    public static final h3q SHOW_CODE_STYLE_TYPE_CONVERTER;
    
    static {
        SHOW_CODE_STYLE_TYPE_CONVERTER = new h3q();
    }
    
    public static JsonShowCode _parse(final khe khe) throws IOException {
        final JsonShowCode jsonShowCode = new JsonShowCode();
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
            parseField(jsonShowCode, d, khe);
            khe.m0();
        }
        return jsonShowCode;
    }
    
    public static void _serialize(final JsonShowCode jsonShowCode, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("code", jsonShowCode.c);
        if (jsonShowCode.g != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonShowCode.g, tfe, true);
        }
        if (jsonShowCode.d != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonShowCode.d, tfe, true);
        }
        if (jsonShowCode.a != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonShowCode.a, "header", true, tfe);
        }
        if (jsonShowCode.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonShowCode.e, "next_link", true, tfe);
        }
        if (jsonShowCode.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonShowCode.f, "skip_link", true, tfe);
        }
        final g3q b2 = jsonShowCode.b;
        if (b2 != null) {
            ((StringBasedTypeConverter)JsonShowCode$$JsonObjectMapper.SHOW_CODE_STYLE_TYPE_CONVERTER).serialize((Object)b2, "style", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonShowCode jsonShowCode, final String s, final khe khe) throws IOException {
        if ("code".equals(s)) {
            jsonShowCode.c = khe.T((String)null);
        }
        else if ("component_collection".equals(s)) {
            jsonShowCode.g = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonShowCode.d = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("header".equals(s)) {
            jsonShowCode.a = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonShowCode.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonShowCode.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("style".equals(s)) {
            jsonShowCode.b = (g3q)((StringBasedTypeConverter)JsonShowCode$$JsonObjectMapper.SHOW_CODE_STYLE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonShowCode parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonShowCode jsonShowCode, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonShowCode, tfe, b);
    }
}
