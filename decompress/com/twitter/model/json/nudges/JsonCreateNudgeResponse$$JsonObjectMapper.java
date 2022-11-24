// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCreateNudgeResponse$$JsonObjectMapper extends JsonMapper<JsonCreateNudgeResponse>
{
    public static JsonCreateNudgeResponse _parse(final qhe qhe) throws IOException {
        final JsonCreateNudgeResponse jsonCreateNudgeResponse = new JsonCreateNudgeResponse();
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
            parseField(jsonCreateNudgeResponse, d, qhe);
            qhe.m0();
        }
        return jsonCreateNudgeResponse;
    }
    
    public static void _serialize(final JsonCreateNudgeResponse jsonCreateNudgeResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonCreateNudgeResponse.b != null) {
            LoganSquare.typeConverterFor((Class)l0j.class).serialize((Object)jsonCreateNudgeResponse.b, "experimental_nudge", true, yfe);
        }
        if (jsonCreateNudgeResponse.a != null) {
            LoganSquare.typeConverterFor((Class)l0j.class).serialize((Object)jsonCreateNudgeResponse.a, "nudge", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCreateNudgeResponse jsonCreateNudgeResponse, final String s, final qhe qhe) throws IOException {
        if ("experimental_nudge".equals(s)) {
            jsonCreateNudgeResponse.b = (l0j)LoganSquare.typeConverterFor((Class)l0j.class).parse(qhe);
        }
        else if ("nudge".equals(s)) {
            jsonCreateNudgeResponse.a = (l0j)LoganSquare.typeConverterFor((Class)l0j.class).parse(qhe);
        }
    }
    
    public JsonCreateNudgeResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCreateNudgeResponse jsonCreateNudgeResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCreateNudgeResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCreateNudgeResponse)o, yfe, b);
    }
}
