// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterPhoneSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonEnterPhoneSubtaskInput>
{
    public static JsonEnterPhoneSubtaskInput _parse(final khe khe) throws IOException {
        final JsonEnterPhoneSubtaskInput jsonEnterPhoneSubtaskInput = new JsonEnterPhoneSubtaskInput();
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
            parseField(jsonEnterPhoneSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonEnterPhoneSubtaskInput;
    }
    
    public static void _serialize(final JsonEnterPhoneSubtaskInput jsonEnterPhoneSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("country_code", jsonEnterPhoneSubtaskInput.c);
        tfe.e("discoverability_value", jsonEnterPhoneSubtaskInput.d);
        tfe.u0("phone_number", jsonEnterPhoneSubtaskInput.b);
        final List e = jsonEnterPhoneSubtaskInput.e;
        if (e != null) {
            final Iterator f = x30.F(tfe, "setting_responses", e);
            while (f.hasNext()) {
                final JsonSettingResponseWithKey jsonSettingResponseWithKey = f.next();
                if (jsonSettingResponseWithKey != null) {
                    JsonSettingResponseWithKey$$JsonObjectMapper._serialize(jsonSettingResponseWithKey, tfe, true);
                }
            }
            tfe.f();
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonEnterPhoneSubtaskInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterPhoneSubtaskInput jsonEnterPhoneSubtaskInput, final String s, final khe khe) throws IOException {
        if ("country_code".equals(s)) {
            jsonEnterPhoneSubtaskInput.c = khe.T((String)null);
        }
        else if ("discoverability_value".equals(s)) {
            jsonEnterPhoneSubtaskInput.d = khe.k();
        }
        else if ("phone_number".equals(s)) {
            jsonEnterPhoneSubtaskInput.b = khe.T((String)null);
        }
        else if ("setting_responses".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList e = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonSettingResponseWithKey parse = JsonSettingResponseWithKey$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        e.add(parse);
                    }
                }
                jsonEnterPhoneSubtaskInput.e = e;
            }
            else {
                jsonEnterPhoneSubtaskInput.e = null;
            }
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonEnterPhoneSubtaskInput, s, khe);
        }
    }
    
    public JsonEnterPhoneSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterPhoneSubtaskInput jsonEnterPhoneSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterPhoneSubtaskInput, tfe, b);
    }
}
