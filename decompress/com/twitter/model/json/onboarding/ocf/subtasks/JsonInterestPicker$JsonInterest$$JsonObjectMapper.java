// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestPicker$JsonInterest$$JsonObjectMapper extends JsonMapper<JsonInterestPicker$JsonInterest>
{
    public static JsonInterestPicker$JsonInterest _parse(final tge tge) throws IOException {
        final JsonInterestPicker$JsonInterest jsonInterestPicker$JsonInterest = new JsonInterestPicker$JsonInterest();
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
            parseField(jsonInterestPicker$JsonInterest, d, tge);
            tge.l0();
        }
        return jsonInterestPicker$JsonInterest;
    }
    
    public static void _serialize(final JsonInterestPicker$JsonInterest jsonInterestPicker$JsonInterest, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("id", jsonInterestPicker$JsonInterest.b);
        afe.t0("name", jsonInterestPicker$JsonInterest.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonInterestPicker$JsonInterest jsonInterestPicker$JsonInterest, final String s, final tge tge) throws IOException {
        if ("id".equals(s)) {
            jsonInterestPicker$JsonInterest.b = tge.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonInterestPicker$JsonInterest.a = tge.T((String)null);
        }
    }
    
    public JsonInterestPicker$JsonInterest parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonInterestPicker$JsonInterest jsonInterestPicker$JsonInterest, final afe afe, final boolean b) throws IOException {
        _serialize(jsonInterestPicker$JsonInterest, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonInterestPicker$JsonInterest)o, afe, b);
    }
}
