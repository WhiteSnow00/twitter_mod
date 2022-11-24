// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonModuleFooter$$JsonObjectMapper extends JsonMapper<JsonModuleFooter>
{
    public static final oge JSON_MODULE_FOOTER_DISPLAY_TYPE_CONVERTER;
    
    static {
        JSON_MODULE_FOOTER_DISPLAY_TYPE_CONVERTER = new oge();
    }
    
    public static JsonModuleFooter _parse(final qhe qhe) throws IOException {
        final JsonModuleFooter jsonModuleFooter = new JsonModuleFooter();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonModuleFooter, d, qhe);
            qhe.m0();
        }
        return jsonModuleFooter;
    }
    
    public static void _serialize(final JsonModuleFooter jsonModuleFooter, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("dismissAfterInteraction", jsonModuleFooter.d);
        ((StringBasedTypeConverter)JsonModuleFooter$$JsonObjectMapper.JSON_MODULE_FOOTER_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonModuleFooter.e, "displayType", true, yfe);
        if (jsonModuleFooter.c != null) {
            LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonModuleFooter.c, "landingUrl", true, yfe);
        }
        yfe.u0("text", jsonModuleFooter.a);
        yfe.u0("url", jsonModuleFooter.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonModuleFooter jsonModuleFooter, final String s, final qhe qhe) throws IOException {
        if ("dismissAfterInteraction".equals(s)) {
            jsonModuleFooter.d = qhe.l();
        }
        else if ("displayType".equals(s)) {
            jsonModuleFooter.e = (int)((StringBasedTypeConverter)JsonModuleFooter$$JsonObjectMapper.JSON_MODULE_FOOTER_DISPLAY_TYPE_CONVERTER).parse(qhe);
        }
        else if ("landingUrl".equals(s)) {
            jsonModuleFooter.c = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
        }
        else if ("text".equals(s)) {
            jsonModuleFooter.a = qhe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonModuleFooter.b = qhe.T((String)null);
        }
    }
    
    public JsonModuleFooter parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonModuleFooter jsonModuleFooter, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonModuleFooter, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonModuleFooter)o, yfe, b);
    }
}
