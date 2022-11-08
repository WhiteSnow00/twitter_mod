// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.data.json;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonVerificationPolicyViolationsModel$$JsonObjectMapper extends JsonMapper<JsonVerificationPolicyViolationsModel>
{
    public static JsonVerificationPolicyViolationsModel _parse(final khe khe) throws IOException {
        final JsonVerificationPolicyViolationsModel jsonVerificationPolicyViolationsModel = new JsonVerificationPolicyViolationsModel();
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
            parseField(jsonVerificationPolicyViolationsModel, d, khe);
            khe.m0();
        }
        return jsonVerificationPolicyViolationsModel;
    }
    
    public static void _serialize(final JsonVerificationPolicyViolationsModel jsonVerificationPolicyViolationsModel, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("button_text", jsonVerificationPolicyViolationsModel.d);
        tfe.W("debadge_timestamp_ms", jsonVerificationPolicyViolationsModel.a);
        if (jsonVerificationPolicyViolationsModel.b != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonVerificationPolicyViolationsModel.b, "violation_modal_desc", true, tfe);
        }
        tfe.u0("violation_modal_title", jsonVerificationPolicyViolationsModel.c);
        final ArrayList e = jsonVerificationPolicyViolationsModel.e;
        if (e != null) {
            final Iterator g = q1a.g(tfe, "violations", e);
            while (g.hasNext()) {
                final JsonVerificationPolicyViolation jsonVerificationPolicyViolation = g.next();
                if (jsonVerificationPolicyViolation != null) {
                    JsonVerificationPolicyViolation$$JsonObjectMapper._serialize(jsonVerificationPolicyViolation, tfe, true);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonVerificationPolicyViolationsModel jsonVerificationPolicyViolationsModel, final String s, final khe khe) throws IOException {
        if ("button_text".equals(s)) {
            jsonVerificationPolicyViolationsModel.d = khe.T((String)null);
        }
        else if ("debadge_timestamp_ms".equals(s)) {
            jsonVerificationPolicyViolationsModel.a = khe.L();
        }
        else if ("violation_modal_desc".equals(s)) {
            jsonVerificationPolicyViolationsModel.b = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("violation_modal_title".equals(s)) {
            jsonVerificationPolicyViolationsModel.c = khe.T((String)null);
        }
        else if ("violations".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList e = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonVerificationPolicyViolation parse = JsonVerificationPolicyViolation$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        e.add(parse);
                    }
                }
                jsonVerificationPolicyViolationsModel.e = e;
            }
            else {
                jsonVerificationPolicyViolationsModel.e = null;
            }
        }
    }
    
    public JsonVerificationPolicyViolationsModel parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonVerificationPolicyViolationsModel jsonVerificationPolicyViolationsModel, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonVerificationPolicyViolationsModel, tfe, b);
    }
}
