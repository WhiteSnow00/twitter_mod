// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHumanizationNudgeUser$$JsonObjectMapper extends JsonMapper<JsonHumanizationNudgeUser>
{
    public static JsonHumanizationNudgeUser _parse(final qhe qhe) throws IOException {
        final JsonHumanizationNudgeUser jsonHumanizationNudgeUser = new JsonHumanizationNudgeUser();
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
            parseField(jsonHumanizationNudgeUser, d, qhe);
            qhe.m0();
        }
        return jsonHumanizationNudgeUser;
    }
    
    public static void _serialize(final JsonHumanizationNudgeUser jsonHumanizationNudgeUser, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonHumanizationNudgeUser.a != null) {
            yfe.i("legacy");
            JsonHumanizationNudgeLegacyUser$$JsonObjectMapper._serialize(jsonHumanizationNudgeUser.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonHumanizationNudgeUser jsonHumanizationNudgeUser, final String s, final qhe qhe) throws IOException {
        if ("legacy".equals(s)) {
            jsonHumanizationNudgeUser.a = JsonHumanizationNudgeLegacyUser$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonHumanizationNudgeUser parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonHumanizationNudgeUser jsonHumanizationNudgeUser, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonHumanizationNudgeUser, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonHumanizationNudgeUser)o, yfe, b);
    }
}
