// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSecurityKeyEnrollment$$JsonObjectMapper extends JsonMapper<JsonSecurityKeyEnrollment>
{
    public static JsonSecurityKeyEnrollment _parse(final khe khe) throws IOException {
        final JsonSecurityKeyEnrollment jsonSecurityKeyEnrollment = new JsonSecurityKeyEnrollment();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonSecurityKeyEnrollment, d, khe);
            khe.m0();
        }
        return jsonSecurityKeyEnrollment;
    }
    
    public static void _serialize(final JsonSecurityKeyEnrollment jsonSecurityKeyEnrollment, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("challenge", jsonSecurityKeyEnrollment.a);
        if (jsonSecurityKeyEnrollment.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSecurityKeyEnrollment.c, "fail_link", true, tfe);
        }
        if (jsonSecurityKeyEnrollment.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSecurityKeyEnrollment.b, "next_link", true, tfe);
        }
        if (jsonSecurityKeyEnrollment.d != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSecurityKeyEnrollment.d, "unsupported_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSecurityKeyEnrollment jsonSecurityKeyEnrollment, final String s, final khe khe) throws IOException {
        if ("challenge".equals(s)) {
            jsonSecurityKeyEnrollment.a = khe.T((String)null);
        }
        else if ("fail_link".equals(s)) {
            jsonSecurityKeyEnrollment.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonSecurityKeyEnrollment.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("unsupported_link".equals(s)) {
            jsonSecurityKeyEnrollment.d = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonSecurityKeyEnrollment parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSecurityKeyEnrollment jsonSecurityKeyEnrollment, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSecurityKeyEnrollment, tfe, b);
    }
}
