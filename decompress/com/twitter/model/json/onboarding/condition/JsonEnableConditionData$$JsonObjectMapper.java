// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.condition;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnableConditionData$$JsonObjectMapper extends JsonMapper<JsonEnableConditionData>
{
    public static JsonEnableConditionData _parse(final qhe qhe) throws IOException {
        final JsonEnableConditionData jsonEnableConditionData = new JsonEnableConditionData();
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
            parseField(jsonEnableConditionData, d, qhe);
            qhe.m0();
        }
        return jsonEnableConditionData;
    }
    
    public static void _serialize(final JsonEnableConditionData jsonEnableConditionData, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonEnableConditionData.a != null) {
            yfe.i("boolean_all_true_data");
            JsonBooleanAllTrueData$$JsonObjectMapper._serialize(jsonEnableConditionData.a, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonEnableConditionData jsonEnableConditionData, final String s, final qhe qhe) throws IOException {
        if ("boolean_all_true_data".equals(s)) {
            jsonEnableConditionData.a = JsonBooleanAllTrueData$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonEnableConditionData parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonEnableConditionData jsonEnableConditionData, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonEnableConditionData, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonEnableConditionData)o, yfe, b);
    }
}
