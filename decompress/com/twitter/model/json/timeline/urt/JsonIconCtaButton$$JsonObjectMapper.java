// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonIconCtaButton$$JsonObjectMapper extends JsonMapper<JsonIconCtaButton>
{
    public static final cle JSON_U_R_T_ICON_TYPE_CONVERTER;
    
    static {
        JSON_U_R_T_ICON_TYPE_CONVERTER = new cle();
    }
    
    public static JsonIconCtaButton _parse(final qhe qhe) throws IOException {
        final JsonIconCtaButton jsonIconCtaButton = new JsonIconCtaButton();
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
            parseField(jsonIconCtaButton, d, qhe);
            qhe.m0();
        }
        return jsonIconCtaButton;
    }
    
    public static void _serialize(final JsonIconCtaButton jsonIconCtaButton, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("accessibilityLabel", jsonIconCtaButton.b);
        final dqv a = jsonIconCtaButton.a;
        if (a != null) {
            JsonIconCtaButton$$JsonObjectMapper.JSON_U_R_T_ICON_TYPE_CONVERTER.serialize((Object)a, "buttonIcon", true, yfe);
        }
        if (jsonIconCtaButton.c != null) {
            LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonIconCtaButton.c, "url", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonIconCtaButton jsonIconCtaButton, final String s, final qhe qhe) throws IOException {
        if ("accessibilityLabel".equals(s)) {
            jsonIconCtaButton.b = qhe.T((String)null);
        }
        else if ("buttonIcon".equals(s)) {
            jsonIconCtaButton.a = (dqv)JsonIconCtaButton$$JsonObjectMapper.JSON_U_R_T_ICON_TYPE_CONVERTER.parse(qhe);
        }
        else if ("url".equals(s)) {
            jsonIconCtaButton.c = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
        }
    }
    
    public JsonIconCtaButton parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonIconCtaButton jsonIconCtaButton, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonIconCtaButton, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonIconCtaButton)o, yfe, b);
    }
}
