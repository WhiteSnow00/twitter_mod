// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.twitter.model.json.core.JsonViewer$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonViewerQuery$$JsonObjectMapper extends JsonMapper<JsonViewerQuery>
{
    public static final dde JSON_ALT_TEXT_PROMPT_TYPE_CONVERTER;
    public static final ijw USER_TYPE_TYPE_CONVERTER;
    
    static {
        USER_TYPE_TYPE_CONVERTER = new ijw();
        JSON_ALT_TEXT_PROMPT_TYPE_CONVERTER = new dde();
    }
    
    public static JsonViewerQuery _parse(final khe khe) throws IOException {
        final JsonViewerQuery jsonViewerQuery = new JsonViewerQuery();
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
            parseField(jsonViewerQuery, d, khe);
            khe.m0();
        }
        return jsonViewerQuery;
    }
    
    public static void _serialize(final JsonViewerQuery jsonViewerQuery, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final uy c = jsonViewerQuery.c;
        if (c != null) {
            ((StringBasedTypeConverter)JsonViewerQuery$$JsonObjectMapper.JSON_ALT_TEXT_PROMPT_TYPE_CONVERTER).serialize((Object)c, "altTextPromptType", true, tfe);
        }
        final fjw b2 = jsonViewerQuery.b;
        if (b2 != null) {
            ((StringBasedTypeConverter)JsonViewerQuery$$JsonObjectMapper.USER_TYPE_TYPE_CONVERTER).serialize((Object)b2, "userType", true, tfe);
        }
        if (jsonViewerQuery.a != null) {
            tfe.i("viewer");
            JsonViewer$$JsonObjectMapper._serialize(jsonViewerQuery.a, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonViewerQuery jsonViewerQuery, final String s, final khe khe) throws IOException {
        if ("altTextPromptType".equals(s)) {
            jsonViewerQuery.c = (uy)((StringBasedTypeConverter)JsonViewerQuery$$JsonObjectMapper.JSON_ALT_TEXT_PROMPT_TYPE_CONVERTER).parse(khe);
        }
        else if ("userType".equals(s)) {
            jsonViewerQuery.b = (fjw)((StringBasedTypeConverter)JsonViewerQuery$$JsonObjectMapper.USER_TYPE_TYPE_CONVERTER).parse(khe);
        }
        else if ("viewer".equals(s)) {
            jsonViewerQuery.a = JsonViewer$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonViewerQuery parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonViewerQuery jsonViewerQuery, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonViewerQuery, tfe, b);
    }
}
