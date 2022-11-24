// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.profiles;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRelationship$JsonInnerRelationship$$JsonObjectMapper extends JsonMapper<JsonRelationship.JsonInnerRelationship>
{
    public static JsonRelationship.JsonInnerRelationship _parse(final qhe qhe) throws IOException {
        final JsonRelationship.JsonInnerRelationship jsonInnerRelationship = new JsonRelationship.JsonInnerRelationship();
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
            parseField(jsonInnerRelationship, d, qhe);
            qhe.m0();
        }
        return jsonInnerRelationship;
    }
    
    public static void _serialize(final JsonRelationship.JsonInnerRelationship jsonInnerRelationship, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonInnerRelationship.a != null) {
            LoganSquare.typeConverterFor((Class)acm.class).serialize((Object)jsonInnerRelationship.a, "source", true, yfe);
        }
        if (jsonInnerRelationship.b != null) {
            LoganSquare.typeConverterFor((Class)acm.class).serialize((Object)jsonInnerRelationship.b, "target", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonRelationship.JsonInnerRelationship jsonInnerRelationship, final String s, final qhe qhe) throws IOException {
        if ("source".equals(s)) {
            jsonInnerRelationship.a = (acm)LoganSquare.typeConverterFor((Class)acm.class).parse(qhe);
        }
        else if ("target".equals(s)) {
            jsonInnerRelationship.b = (acm)LoganSquare.typeConverterFor((Class)acm.class).parse(qhe);
        }
    }
    
    public JsonRelationship.JsonInnerRelationship parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonRelationship.JsonInnerRelationship jsonInnerRelationship, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonInnerRelationship, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonRelationship.JsonInnerRelationship)o, yfe, b);
    }
}
