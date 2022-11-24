// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingResponseWithKey$JsonSettingResponseData$$JsonObjectMapper extends JsonMapper<JsonSettingResponseWithKey.JsonSettingResponseData>
{
    public static JsonSettingResponseWithKey.JsonSettingResponseData _parse(final qhe qhe) throws IOException {
        final JsonSettingResponseWithKey.JsonSettingResponseData jsonSettingResponseData = new JsonSettingResponseWithKey.JsonSettingResponseData();
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
            parseField(jsonSettingResponseData, d, qhe);
            qhe.m0();
        }
        return jsonSettingResponseData;
    }
    
    public static void _serialize(final JsonSettingResponseWithKey.JsonSettingResponseData jsonSettingResponseData, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonSettingResponseData.a != null) {
            yfe.i("boolean_data");
            JsonBooleanSettingsInputData$$JsonObjectMapper._serialize(jsonSettingResponseData.a, yfe, true);
        }
        if (jsonSettingResponseData.b != null) {
            yfe.i("list_data");
            JsonListSettingsInputData$$JsonObjectMapper._serialize(jsonSettingResponseData.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSettingResponseWithKey.JsonSettingResponseData jsonSettingResponseData, final String s, final qhe qhe) throws IOException {
        if ("boolean_data".equals(s)) {
            jsonSettingResponseData.a = JsonBooleanSettingsInputData$$JsonObjectMapper._parse(qhe);
        }
        else if ("list_data".equals(s)) {
            jsonSettingResponseData.b = JsonListSettingsInputData$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonSettingResponseWithKey.JsonSettingResponseData parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSettingResponseWithKey.JsonSettingResponseData jsonSettingResponseData, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSettingResponseData, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSettingResponseWithKey.JsonSettingResponseData)o, yfe, b);
    }
}
