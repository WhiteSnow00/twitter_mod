// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCreatePreemptiveNudgeOptions$$JsonObjectMapper extends JsonMapper<JsonCreatePreemptiveNudgeOptions>
{
    public static JsonCreatePreemptiveNudgeOptions _parse(final qhe qhe) throws IOException {
        final JsonCreatePreemptiveNudgeOptions jsonCreatePreemptiveNudgeOptions = new JsonCreatePreemptiveNudgeOptions();
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
            parseField(jsonCreatePreemptiveNudgeOptions, d, qhe);
            qhe.m0();
        }
        return jsonCreatePreemptiveNudgeOptions;
    }
    
    public static void _serialize(final JsonCreatePreemptiveNudgeOptions jsonCreatePreemptiveNudgeOptions, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.e("enable_nudge_testing_keyword", jsonCreatePreemptiveNudgeOptions.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonCreatePreemptiveNudgeOptions jsonCreatePreemptiveNudgeOptions, final String s, final qhe qhe) throws IOException {
        if ("enable_nudge_testing_keyword".equals(s)) {
            jsonCreatePreemptiveNudgeOptions.a = qhe.l();
        }
    }
    
    public JsonCreatePreemptiveNudgeOptions parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonCreatePreemptiveNudgeOptions jsonCreatePreemptiveNudgeOptions, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonCreatePreemptiveNudgeOptions, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonCreatePreemptiveNudgeOptions)o, yfe, b);
    }
}
