// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDateInterval$$JsonObjectMapper extends JsonMapper<JsonDateInterval>
{
    public static JsonDateInterval _parse(final qhe qhe) throws IOException {
        final JsonDateInterval jsonDateInterval = new JsonDateInterval();
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
            parseField(jsonDateInterval, d, qhe);
            qhe.m0();
        }
        return jsonDateInterval;
    }
    
    public static void _serialize(final JsonDateInterval jsonDateInterval, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonDateInterval.b != null) {
            LoganSquare.typeConverterFor((Class)sa8.class).serialize((Object)jsonDateInterval.b, "max", true, yfe);
        }
        if (jsonDateInterval.a != null) {
            LoganSquare.typeConverterFor((Class)sa8.class).serialize((Object)jsonDateInterval.a, "min", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonDateInterval jsonDateInterval, final String s, final qhe qhe) throws IOException {
        if ("max".equals(s)) {
            jsonDateInterval.b = (sa8)LoganSquare.typeConverterFor((Class)sa8.class).parse(qhe);
        }
        else if ("min".equals(s)) {
            jsonDateInterval.a = (sa8)LoganSquare.typeConverterFor((Class)sa8.class).parse(qhe);
        }
    }
    
    public JsonDateInterval parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonDateInterval jsonDateInterval, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonDateInterval, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonDateInterval)o, yfe, b);
    }
}
