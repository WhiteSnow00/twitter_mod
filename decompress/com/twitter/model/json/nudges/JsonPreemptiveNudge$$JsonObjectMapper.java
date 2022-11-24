// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPreemptiveNudge$$JsonObjectMapper extends JsonMapper<JsonPreemptiveNudge>
{
    public static final xhe JSON_PREEMPTIVE_NUDGE_TYPE_CONVERTER;
    
    static {
        JSON_PREEMPTIVE_NUDGE_TYPE_CONVERTER = new xhe();
    }
    
    public static JsonPreemptiveNudge _parse(final qhe qhe) throws IOException {
        final JsonPreemptiveNudge jsonPreemptiveNudge = new JsonPreemptiveNudge();
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
            parseField(jsonPreemptiveNudge, d, qhe);
            qhe.m0();
        }
        return jsonPreemptiveNudge;
    }
    
    public static void _serialize(final JsonPreemptiveNudge jsonPreemptiveNudge, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonPreemptiveNudge.b);
        final tvk a = jsonPreemptiveNudge.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonPreemptiveNudge$$JsonObjectMapper.JSON_PREEMPTIVE_NUDGE_TYPE_CONVERTER).serialize((Object)a, "nudge_type", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonPreemptiveNudge jsonPreemptiveNudge, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonPreemptiveNudge.b = qhe.T((String)null);
        }
        else if ("nudge_type".equals(s)) {
            jsonPreemptiveNudge.a = (tvk)((StringBasedTypeConverter)JsonPreemptiveNudge$$JsonObjectMapper.JSON_PREEMPTIVE_NUDGE_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonPreemptiveNudge parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonPreemptiveNudge jsonPreemptiveNudge, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonPreemptiveNudge, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonPreemptiveNudge)o, yfe, b);
    }
}
