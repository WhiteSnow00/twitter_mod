// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestPicker$JsonInterest$$JsonObjectMapper extends JsonMapper<JsonInterestPicker$JsonInterest>
{
    public static JsonInterestPicker$JsonInterest _parse(final khe khe) throws IOException {
        final JsonInterestPicker$JsonInterest jsonInterestPicker$JsonInterest = new JsonInterestPicker$JsonInterest();
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
            parseField(jsonInterestPicker$JsonInterest, d, khe);
            khe.m0();
        }
        return jsonInterestPicker$JsonInterest;
    }
    
    public static void _serialize(final JsonInterestPicker$JsonInterest jsonInterestPicker$JsonInterest, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("id", jsonInterestPicker$JsonInterest.b);
        tfe.u0("name", jsonInterestPicker$JsonInterest.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonInterestPicker$JsonInterest jsonInterestPicker$JsonInterest, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonInterestPicker$JsonInterest.b = khe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonInterestPicker$JsonInterest.a = khe.T((String)null);
        }
    }
    
    public JsonInterestPicker$JsonInterest parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonInterestPicker$JsonInterest jsonInterestPicker$JsonInterest, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonInterestPicker$JsonInterest, tfe, b);
    }
}
