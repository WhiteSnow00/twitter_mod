// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserLabel$$JsonObjectMapper extends JsonMapper<JsonUserLabel>
{
    public static JsonUserLabel _parse(final qhe qhe) throws IOException {
        final JsonUserLabel jsonUserLabel = new JsonUserLabel();
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
            parseField(jsonUserLabel, d, qhe);
            qhe.m0();
        }
        return jsonUserLabel;
    }
    
    public static void _serialize(final JsonUserLabel jsonUserLabel, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonUserLabel.b != null) {
            LoganSquare.typeConverterFor((Class)hpj.class).serialize((Object)jsonUserLabel.b, "badge", true, yfe);
        }
        yfe.u0("description", jsonUserLabel.a);
        if (jsonUserLabel.d != null) {
            yfe.i("icon");
            JsonUserLabelIcon$$JsonObjectMapper._serialize(jsonUserLabel.d, yfe, true);
        }
        if (jsonUserLabel.f != null) {
            LoganSquare.typeConverterFor((Class)fym.class).serialize((Object)jsonUserLabel.f, "longDescription", true, yfe);
        }
        if (jsonUserLabel.c != null) {
            LoganSquare.typeConverterFor((Class)c9t.class).serialize((Object)jsonUserLabel.c, "url", true, yfe);
        }
        yfe.u0("userLabelType", jsonUserLabel.e);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserLabel jsonUserLabel, final String s, final qhe qhe) throws IOException {
        if ("badge".equals(s)) {
            jsonUserLabel.b = (hpj)LoganSquare.typeConverterFor((Class)hpj.class).parse(qhe);
        }
        else if ("description".equals(s)) {
            jsonUserLabel.a = qhe.T((String)null);
        }
        else if ("icon".equals(s)) {
            jsonUserLabel.d = JsonUserLabelIcon$$JsonObjectMapper._parse(qhe);
        }
        else if ("longDescription".equals(s)) {
            jsonUserLabel.f = (fym)LoganSquare.typeConverterFor((Class)fym.class).parse(qhe);
        }
        else if ("url".equals(s)) {
            jsonUserLabel.c = (c9t)LoganSquare.typeConverterFor((Class)c9t.class).parse(qhe);
        }
        else if ("userLabelType".equals(s)) {
            jsonUserLabel.e = qhe.T((String)null);
        }
    }
    
    public JsonUserLabel parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserLabel jsonUserLabel, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserLabel, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserLabel)o, yfe, b);
    }
}
