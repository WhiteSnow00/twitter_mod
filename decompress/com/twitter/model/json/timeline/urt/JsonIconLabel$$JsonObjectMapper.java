// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonIconLabel$$JsonObjectMapper extends JsonMapper<JsonIconLabel>
{
    public static final cle JSON_U_R_T_ICON_TYPE_CONVERTER;
    
    static {
        JSON_U_R_T_ICON_TYPE_CONVERTER = new cle();
    }
    
    public static JsonIconLabel _parse(final qhe qhe) throws IOException {
        final JsonIconLabel jsonIconLabel = new JsonIconLabel();
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
            parseField(jsonIconLabel, d, qhe);
            qhe.m0();
        }
        return jsonIconLabel;
    }
    
    public static void _serialize(final JsonIconLabel jsonIconLabel, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final dqv a = jsonIconLabel.a;
        if (a != null) {
            JsonIconLabel$$JsonObjectMapper.JSON_U_R_T_ICON_TYPE_CONVERTER.serialize((Object)a, "icon", true, yfe);
        }
        if (jsonIconLabel.b != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonIconLabel.b, "iconLabelText", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonIconLabel jsonIconLabel, final String s, final qhe qhe) throws IOException {
        if ("icon".equals(s)) {
            jsonIconLabel.a = (dqv)JsonIconLabel$$JsonObjectMapper.JSON_U_R_T_ICON_TYPE_CONVERTER.parse(qhe);
        }
        else if ("iconLabelText".equals(s)) {
            jsonIconLabel.b = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
        }
    }
    
    public JsonIconLabel parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonIconLabel jsonIconLabel, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonIconLabel, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonIconLabel)o, yfe, b);
    }
}
