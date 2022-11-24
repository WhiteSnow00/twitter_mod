// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCreateHumanizationNudgeResponse$$JsonObjectMapper extends JsonMapper<JsonCreateHumanizationNudgeResponse>
{
    public static JsonCreateHumanizationNudgeResponse _parse(final qhe qhe) throws IOException {
        final JsonCreateHumanizationNudgeResponse jsonCreateHumanizationNudgeResponse = new JsonCreateHumanizationNudgeResponse();
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
            parseField(jsonCreateHumanizationNudgeResponse, d, qhe);
            qhe.m0();
        }
        return jsonCreateHumanizationNudgeResponse;
    }
    
    public static void _serialize(final JsonCreateHumanizationNudgeResponse jsonCreateHumanizationNudgeResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonCreateHumanizationNudgeResponse.a != null) {
            LoganSquare.typeConverterFor((Class)ktc.class).serialize((Object)jsonCreateHumanizationNudgeResponse.a, "nudge", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCreateHumanizationNudgeResponse jsonCreateHumanizationNudgeResponse, final String s, final qhe qhe) throws IOException {
        if ("nudge".equals(s)) {
            jsonCreateHumanizationNudgeResponse.a = (ktc)LoganSquare.typeConverterFor((Class)ktc.class).parse(qhe);
        }
    }
    
    public JsonCreateHumanizationNudgeResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCreateHumanizationNudgeResponse jsonCreateHumanizationNudgeResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCreateHumanizationNudgeResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCreateHumanizationNudgeResponse)o, yfe, b);
    }
}
