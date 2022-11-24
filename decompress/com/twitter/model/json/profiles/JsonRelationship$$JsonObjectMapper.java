// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRelationship$$JsonObjectMapper extends JsonMapper<JsonRelationship>
{
    public static JsonRelationship _parse(final qhe qhe) throws IOException {
        final JsonRelationship jsonRelationship = new JsonRelationship();
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
            parseField(jsonRelationship, d, qhe);
            qhe.m0();
        }
        return jsonRelationship;
    }
    
    public static void _serialize(final JsonRelationship jsonRelationship, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonRelationship.a != null) {
            yfe.i("relationship");
            JsonRelationship$JsonInnerRelationship$$JsonObjectMapper._serialize(jsonRelationship.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonRelationship jsonRelationship, final String s, final qhe qhe) throws IOException {
        if ("relationship".equals(s)) {
            jsonRelationship.a = JsonRelationship$JsonInnerRelationship$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonRelationship parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonRelationship jsonRelationship, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonRelationship, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonRelationship)o, yfe, b);
    }
}
