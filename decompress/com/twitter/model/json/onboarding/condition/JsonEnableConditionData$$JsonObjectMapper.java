// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.condition;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnableConditionData$$JsonObjectMapper extends JsonMapper<JsonEnableConditionData>
{
    public static JsonEnableConditionData _parse(final tge tge) throws IOException {
        final JsonEnableConditionData jsonEnableConditionData = new JsonEnableConditionData();
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
            parseField(jsonEnableConditionData, d, tge);
            tge.l0();
        }
        return jsonEnableConditionData;
    }
    
    public static void _serialize(final JsonEnableConditionData jsonEnableConditionData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonEnableConditionData.a != null) {
            afe.i("boolean_all_true_data");
            JsonBooleanAllTrueData$$JsonObjectMapper._serialize(jsonEnableConditionData.a, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEnableConditionData jsonEnableConditionData, final String s, final tge tge) throws IOException {
        if ("boolean_all_true_data".equals(s)) {
            jsonEnableConditionData.a = JsonBooleanAllTrueData$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonEnableConditionData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEnableConditionData jsonEnableConditionData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEnableConditionData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEnableConditionData)o, afe, b);
    }
}
