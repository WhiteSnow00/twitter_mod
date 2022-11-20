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
    public static final h53 BUTTON_STYLE_TYPE_CONVERTER;
    
    static {
        BUTTON_STYLE_TYPE_CONVERTER = new h53();
    }
    
    public static JsonOcfButton _parse(final tge tge) throws IOException {
        final JsonOcfButton jsonOcfButton = new JsonOcfButton();
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
            parseField(jsonOcfButton, d, tge);
            tge.l0();
        }
        return jsonOcfButton;
    }
    
    public static void _serialize(final JsonOcfButton jsonOcfButton, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonOcfButton.d != null) {
            LoganSquare.typeConverterFor((Class)mdj.class).serialize((Object)jsonOcfButton.d, "icon", true, afe);
        }
        if (jsonOcfButton.a != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonOcfButton.a, "navigation_link", true, afe);
        }
        if (jsonOcfButton.b != null) {
            LoganSquare.typeConverterFor((Class)vjp.class).serialize((Object)jsonOcfButton.b, "separator", true, afe);
        }
        ((StringBasedTypeConverter)JsonOcfButton$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).serialize((Object)jsonOcfButton.c, "style", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfButton jsonOcfButton, final String s, final tge tge) throws IOException {
        if ("icon".equals(s)) {
            jsonOcfButton.d = (mdj)LoganSquare.typeConverterFor((Class)mdj.class).parse(tge);
        }
        else if ("navigation_link".equals(s)) {
            jsonOcfButton.a = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("separator".equals(s)) {
            jsonOcfButton.b = (vjp)LoganSquare.typeConverterFor((Class)vjp.class).parse(tge);
        }
        else if ("style".equals(s)) {
            jsonOcfButton.c = (int)((StringBasedTypeConverter)JsonOcfButton$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonOcfButton parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfButton jsonOcfButton, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfButton, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfButton)o, afe, b);
    }
}
