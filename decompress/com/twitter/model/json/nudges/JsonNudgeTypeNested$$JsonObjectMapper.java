// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNudgeTypeNested$$JsonObjectMapper extends JsonMapper<JsonNudgeTypeNested>
{
    public static final fhe JSON_NUDGE_TYPE_NESTED_CONVERTER;
    
    static {
        JSON_NUDGE_TYPE_NESTED_CONVERTER = new fhe();
    }
    
    public static JsonNudgeTypeNested _parse(final qhe qhe) throws IOException {
        final JsonNudgeTypeNested jsonNudgeTypeNested = new JsonNudgeTypeNested();
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
            parseField(jsonNudgeTypeNested, d, qhe);
            qhe.m0();
        }
        return jsonNudgeTypeNested;
    }
    
    public static void _serialize(final JsonNudgeTypeNested jsonNudgeTypeNested, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final h2j a = jsonNudgeTypeNested.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonNudgeTypeNested$$JsonObjectMapper.JSON_NUDGE_TYPE_NESTED_CONVERTER).serialize((Object)a, "__typename", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNudgeTypeNested jsonNudgeTypeNested, final String s, final qhe qhe) throws IOException {
        if ("__typename".equals(s)) {
            jsonNudgeTypeNested.a = (h2j)((StringBasedTypeConverter)JsonNudgeTypeNested$$JsonObjectMapper.JSON_NUDGE_TYPE_NESTED_CONVERTER).parse(qhe);
        }
    }
    
    public JsonNudgeTypeNested parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNudgeTypeNested jsonNudgeTypeNested, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNudgeTypeNested, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNudgeTypeNested)o, yfe, b);
    }
}
