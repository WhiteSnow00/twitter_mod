// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfButton$$JsonObjectMapper extends JsonMapper<JsonOcfButton>
{
    public static final a63 BUTTON_STYLE_TYPE_CONVERTER;
    
    static {
        BUTTON_STYLE_TYPE_CONVERTER = new a63();
    }
    
    public static JsonOcfButton _parse(final qhe qhe) throws IOException {
        final JsonOcfButton jsonOcfButton = new JsonOcfButton();
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
            parseField(jsonOcfButton, d, qhe);
            qhe.m0();
        }
        return jsonOcfButton;
    }
    
    public static void _serialize(final JsonOcfButton jsonOcfButton, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonOcfButton.d != null) {
            LoganSquare.typeConverterFor((Class)zdj.class).serialize((Object)jsonOcfButton.d, "icon", true, yfe);
        }
        if (jsonOcfButton.a != null) {
            LoganSquare.typeConverterFor((Class)dtv.class).serialize((Object)jsonOcfButton.a, "navigation_link", true, yfe);
        }
        if (jsonOcfButton.b != null) {
            LoganSquare.typeConverterFor((Class)rkp.class).serialize((Object)jsonOcfButton.b, "separator", true, yfe);
        }
        ((StringBasedTypeConverter)JsonOcfButton$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).serialize((Object)jsonOcfButton.c, "style", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfButton jsonOcfButton, final String s, final qhe qhe) throws IOException {
        if ("icon".equals(s)) {
            jsonOcfButton.d = (zdj)LoganSquare.typeConverterFor((Class)zdj.class).parse(qhe);
        }
        else if ("navigation_link".equals(s)) {
            jsonOcfButton.a = (dtv)LoganSquare.typeConverterFor((Class)dtv.class).parse(qhe);
        }
        else if ("separator".equals(s)) {
            jsonOcfButton.b = (rkp)LoganSquare.typeConverterFor((Class)rkp.class).parse(qhe);
        }
        else if ("style".equals(s)) {
            jsonOcfButton.c = (int)((StringBasedTypeConverter)JsonOcfButton$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonOcfButton parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfButton jsonOcfButton, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfButton, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfButton)o, yfe, b);
    }
}
