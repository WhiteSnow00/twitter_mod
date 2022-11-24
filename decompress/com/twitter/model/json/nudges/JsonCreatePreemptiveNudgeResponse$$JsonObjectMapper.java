// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCreatePreemptiveNudgeResponse$$JsonObjectMapper extends JsonMapper<JsonCreatePreemptiveNudgeResponse>
{
    public static JsonCreatePreemptiveNudgeResponse _parse(final qhe qhe) throws IOException {
        final JsonCreatePreemptiveNudgeResponse jsonCreatePreemptiveNudgeResponse = new JsonCreatePreemptiveNudgeResponse();
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
            parseField(jsonCreatePreemptiveNudgeResponse, d, qhe);
            qhe.m0();
        }
        return jsonCreatePreemptiveNudgeResponse;
    }
    
    public static void _serialize(final JsonCreatePreemptiveNudgeResponse jsonCreatePreemptiveNudgeResponse, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonCreatePreemptiveNudgeResponse.a != null) {
            LoganSquare.typeConverterFor((Class)tuk.class).serialize((Object)jsonCreatePreemptiveNudgeResponse.a, "nudge", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCreatePreemptiveNudgeResponse jsonCreatePreemptiveNudgeResponse, final String s, final qhe qhe) throws IOException {
        if ("nudge".equals(s)) {
            jsonCreatePreemptiveNudgeResponse.a = (tuk)LoganSquare.typeConverterFor((Class)tuk.class).parse(qhe);
        }
    }
    
    public JsonCreatePreemptiveNudgeResponse parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCreatePreemptiveNudgeResponse jsonCreatePreemptiveNudgeResponse, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCreatePreemptiveNudgeResponse, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCreatePreemptiveNudgeResponse)o, yfe, b);
    }
}
