// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSecurityKeyEnrollment$$JsonObjectMapper extends JsonMapper<JsonSecurityKeyEnrollment>
{
    public static JsonSecurityKeyEnrollment _parse(final tge tge) throws IOException {
        final JsonSecurityKeyEnrollment jsonSecurityKeyEnrollment = new JsonSecurityKeyEnrollment();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonSecurityKeyEnrollment, d, tge);
            tge.l0();
        }
        return jsonSecurityKeyEnrollment;
    }
    
    public static void _serialize(final JsonSecurityKeyEnrollment jsonSecurityKeyEnrollment, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("challenge", jsonSecurityKeyEnrollment.a);
        if (jsonSecurityKeyEnrollment.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSecurityKeyEnrollment.c, "fail_link", true, afe);
        }
        if (jsonSecurityKeyEnrollment.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSecurityKeyEnrollment.b, "next_link", true, afe);
        }
        if (jsonSecurityKeyEnrollment.d != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSecurityKeyEnrollment.d, "unsupported_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSecurityKeyEnrollment jsonSecurityKeyEnrollment, final String s, final tge tge) throws IOException {
        if ("challenge".equals(s)) {
            jsonSecurityKeyEnrollment.a = tge.T((String)null);
        }
        else if ("fail_link".equals(s)) {
            jsonSecurityKeyEnrollment.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonSecurityKeyEnrollment.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("unsupported_link".equals(s)) {
            jsonSecurityKeyEnrollment.d = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonSecurityKeyEnrollment parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSecurityKeyEnrollment jsonSecurityKeyEnrollment, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSecurityKeyEnrollment, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSecurityKeyEnrollment)o, afe, b);
    }
}
