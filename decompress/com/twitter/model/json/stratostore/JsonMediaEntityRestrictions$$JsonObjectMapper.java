// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.stratostore;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaEntityRestrictions$$JsonObjectMapper extends JsonMapper<JsonMediaEntityRestrictions>
{
    public static JsonMediaEntityRestrictions _parse(final qhe qhe) throws IOException {
        final JsonMediaEntityRestrictions jsonMediaEntityRestrictions = new JsonMediaEntityRestrictions();
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
            parseField(jsonMediaEntityRestrictions, d, qhe);
            qhe.m0();
        }
        return jsonMediaEntityRestrictions;
    }
    
    public static void _serialize(final JsonMediaEntityRestrictions jsonMediaEntityRestrictions, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("isDmca", jsonMediaEntityRestrictions.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonMediaEntityRestrictions jsonMediaEntityRestrictions, final String s, final qhe qhe) throws IOException {
        if ("isDmca".equals(s)) {
            jsonMediaEntityRestrictions.a = qhe.l();
        }
    }
    
    public JsonMediaEntityRestrictions parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonMediaEntityRestrictions jsonMediaEntityRestrictions, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonMediaEntityRestrictions, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonMediaEntityRestrictions)o, yfe, b);
    }
}
