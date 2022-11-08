// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.data.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVerificationPolicyViolation$$JsonObjectMapper extends JsonMapper<JsonVerificationPolicyViolation>
{
    public static JsonVerificationPolicyViolation _parse(final khe khe) throws IOException {
        final JsonVerificationPolicyViolation jsonVerificationPolicyViolation = new JsonVerificationPolicyViolation();
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
            parseField(jsonVerificationPolicyViolation, d, khe);
            khe.m0();
        }
        return jsonVerificationPolicyViolation;
    }
    
    public static void _serialize(final JsonVerificationPolicyViolation jsonVerificationPolicyViolation, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonVerificationPolicyViolation.c != null) {
            LoganSquare.typeConverterFor((Class)pqw.class).serialize((Object)jsonVerificationPolicyViolation.c, "violation_category", true, tfe);
        }
        if (jsonVerificationPolicyViolation.b != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonVerificationPolicyViolation.b, "violation_desc", true, tfe);
        }
        if (jsonVerificationPolicyViolation.d != null) {
            LoganSquare.typeConverterFor((Class)qqw.class).serialize((Object)jsonVerificationPolicyViolation.d, "violation_status", true, tfe);
        }
        tfe.u0("violation_title", jsonVerificationPolicyViolation.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonVerificationPolicyViolation jsonVerificationPolicyViolation, final String s, final khe khe) throws IOException {
        if ("violation_category".equals(s)) {
            jsonVerificationPolicyViolation.c = (pqw)LoganSquare.typeConverterFor((Class)pqw.class).parse(khe);
        }
        else if ("violation_desc".equals(s)) {
            jsonVerificationPolicyViolation.b = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("violation_status".equals(s)) {
            jsonVerificationPolicyViolation.d = (qqw)LoganSquare.typeConverterFor((Class)qqw.class).parse(khe);
        }
        else if ("violation_title".equals(s)) {
            jsonVerificationPolicyViolation.a = khe.T((String)null);
        }
    }
    
    public JsonVerificationPolicyViolation parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonVerificationPolicyViolation jsonVerificationPolicyViolation, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonVerificationPolicyViolation, tfe, b);
    }
}
