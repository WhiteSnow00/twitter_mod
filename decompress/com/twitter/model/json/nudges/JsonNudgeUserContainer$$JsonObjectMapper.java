// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonNudgeUserContainer$$JsonObjectMapper extends JsonMapper<JsonNudgeUserContainer>
{
    public static JsonNudgeUserContainer _parse(final qhe qhe) throws IOException {
        final JsonNudgeUserContainer jsonNudgeUserContainer = new JsonNudgeUserContainer();
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
            parseField(jsonNudgeUserContainer, d, qhe);
            qhe.m0();
        }
        return jsonNudgeUserContainer;
    }
    
    public static void _serialize(final JsonNudgeUserContainer jsonNudgeUserContainer, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonNudgeUserContainer.a != null) {
            yfe.i("user");
            JsonHumanizationNudgeUser$$JsonObjectMapper._serialize(jsonNudgeUserContainer.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonNudgeUserContainer jsonNudgeUserContainer, final String s, final qhe qhe) throws IOException {
        if ("user".equals(s)) {
            jsonNudgeUserContainer.a = JsonHumanizationNudgeUser$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonNudgeUserContainer parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonNudgeUserContainer jsonNudgeUserContainer, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonNudgeUserContainer, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonNudgeUserContainer)o, yfe, b);
    }
}
