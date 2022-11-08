// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBooleanSettingsInputData$$JsonObjectMapper extends JsonMapper<JsonBooleanSettingsInputData>
{
    public static JsonBooleanSettingsInputData _parse(final khe khe) throws IOException {
        final JsonBooleanSettingsInputData jsonBooleanSettingsInputData = new JsonBooleanSettingsInputData();
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
            parseField(jsonBooleanSettingsInputData, d, khe);
            khe.m0();
        }
        return jsonBooleanSettingsInputData;
    }
    
    public static void _serialize(final JsonBooleanSettingsInputData jsonBooleanSettingsInputData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.e("result", jsonBooleanSettingsInputData.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonBooleanSettingsInputData jsonBooleanSettingsInputData, final String s, final khe khe) throws IOException {
        if ("result".equals(s)) {
            jsonBooleanSettingsInputData.a = khe.k();
        }
    }
    
    public JsonBooleanSettingsInputData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonBooleanSettingsInputData jsonBooleanSettingsInputData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonBooleanSettingsInputData, tfe, b);
    }
}
