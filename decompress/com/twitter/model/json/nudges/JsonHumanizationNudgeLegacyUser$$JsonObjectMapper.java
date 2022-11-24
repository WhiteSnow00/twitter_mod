// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHumanizationNudgeLegacyUser$$JsonObjectMapper extends JsonMapper<JsonHumanizationNudgeLegacyUser>
{
    public static JsonHumanizationNudgeLegacyUser _parse(final qhe qhe) throws IOException {
        final JsonHumanizationNudgeLegacyUser jsonHumanizationNudgeLegacyUser = new JsonHumanizationNudgeLegacyUser();
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
            parseField(jsonHumanizationNudgeLegacyUser, d, qhe);
            qhe.m0();
        }
        return jsonHumanizationNudgeLegacyUser;
    }
    
    public static void _serialize(final JsonHumanizationNudgeLegacyUser jsonHumanizationNudgeLegacyUser, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("description", jsonHumanizationNudgeLegacyUser.d);
        yfe.u0("id_str", jsonHumanizationNudgeLegacyUser.a);
        yfe.u0("name", jsonHumanizationNudgeLegacyUser.c);
        yfe.u0("profile_image_url_https", jsonHumanizationNudgeLegacyUser.e);
        yfe.u0("screen_name", jsonHumanizationNudgeLegacyUser.b);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonHumanizationNudgeLegacyUser jsonHumanizationNudgeLegacyUser, final String s, final qhe qhe) throws IOException {
        if ("description".equals(s)) {
            jsonHumanizationNudgeLegacyUser.d = qhe.T((String)null);
        }
        else if ("id_str".equals(s)) {
            jsonHumanizationNudgeLegacyUser.a = qhe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonHumanizationNudgeLegacyUser.c = qhe.T((String)null);
        }
        else if ("profile_image_url_https".equals(s)) {
            jsonHumanizationNudgeLegacyUser.e = qhe.T((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonHumanizationNudgeLegacyUser.b = qhe.T((String)null);
        }
    }
    
    public JsonHumanizationNudgeLegacyUser parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonHumanizationNudgeLegacyUser jsonHumanizationNudgeLegacyUser, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonHumanizationNudgeLegacyUser, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonHumanizationNudgeLegacyUser)o, yfe, b);
    }
}
