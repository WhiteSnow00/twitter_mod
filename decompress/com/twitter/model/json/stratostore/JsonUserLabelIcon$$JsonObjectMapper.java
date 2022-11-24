// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserLabelIcon$$JsonObjectMapper extends JsonMapper<JsonUserLabelIcon>
{
    public static JsonUserLabelIcon _parse(final qhe qhe) throws IOException {
        final JsonUserLabelIcon jsonUserLabelIcon = new JsonUserLabelIcon();
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
            parseField(jsonUserLabelIcon, d, qhe);
            qhe.m0();
        }
        return jsonUserLabelIcon;
    }
    
    public static void _serialize(final JsonUserLabelIcon jsonUserLabelIcon, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("iconType", jsonUserLabelIcon.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonUserLabelIcon jsonUserLabelIcon, final String s, final qhe qhe) throws IOException {
        if ("iconType".equals(s)) {
            jsonUserLabelIcon.a = qhe.T((String)null);
        }
    }
    
    public JsonUserLabelIcon parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonUserLabelIcon jsonUserLabelIcon, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonUserLabelIcon, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonUserLabelIcon)o, yfe, b);
    }
}
