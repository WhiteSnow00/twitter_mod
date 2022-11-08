// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.condition;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnableConditionData$$JsonObjectMapper extends JsonMapper<JsonEnableConditionData>
{
    public static JsonEnableConditionData _parse(final khe khe) throws IOException {
        final JsonEnableConditionData jsonEnableConditionData = new JsonEnableConditionData();
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
            parseField(jsonEnableConditionData, d, khe);
            khe.m0();
        }
        return jsonEnableConditionData;
    }
    
    public static void _serialize(final JsonEnableConditionData jsonEnableConditionData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonEnableConditionData.a != null) {
            tfe.i("boolean_all_true_data");
            JsonBooleanAllTrueData$$JsonObjectMapper._serialize(jsonEnableConditionData.a, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnableConditionData jsonEnableConditionData, final String s, final khe khe) throws IOException {
        if ("boolean_all_true_data".equals(s)) {
            jsonEnableConditionData.a = JsonBooleanAllTrueData$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonEnableConditionData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnableConditionData jsonEnableConditionData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnableConditionData, tfe, b);
    }
}
