// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHumanizationNudgeMutualTopic$$JsonObjectMapper extends JsonMapper<JsonHumanizationNudgeMutualTopic>
{
    public static JsonHumanizationNudgeMutualTopic _parse(final qhe qhe) throws IOException {
        final JsonHumanizationNudgeMutualTopic jsonHumanizationNudgeMutualTopic = new JsonHumanizationNudgeMutualTopic();
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
            parseField(jsonHumanizationNudgeMutualTopic, d, qhe);
            qhe.m0();
        }
        return jsonHumanizationNudgeMutualTopic;
    }
    
    public static void _serialize(final JsonHumanizationNudgeMutualTopic jsonHumanizationNudgeMutualTopic, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("name", jsonHumanizationNudgeMutualTopic.a);
        yfe.u0("topic_id", jsonHumanizationNudgeMutualTopic.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonHumanizationNudgeMutualTopic jsonHumanizationNudgeMutualTopic, final String s, final qhe qhe) throws IOException {
        if ("name".equals(s)) {
            jsonHumanizationNudgeMutualTopic.a = qhe.T((String)null);
        }
        else if ("topic_id".equals(s)) {
            jsonHumanizationNudgeMutualTopic.b = qhe.T((String)null);
        }
    }
    
    public JsonHumanizationNudgeMutualTopic parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonHumanizationNudgeMutualTopic jsonHumanizationNudgeMutualTopic, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonHumanizationNudgeMutualTopic, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonHumanizationNudgeMutualTopic)o, yfe, b);
    }
}
