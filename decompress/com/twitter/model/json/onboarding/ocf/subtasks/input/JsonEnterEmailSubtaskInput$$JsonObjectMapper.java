// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterEmailSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonEnterEmailSubtaskInput>
{
    public static JsonEnterEmailSubtaskInput _parse(final khe khe) throws IOException {
        final JsonEnterEmailSubtaskInput jsonEnterEmailSubtaskInput = new JsonEnterEmailSubtaskInput();
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
            parseField(jsonEnterEmailSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonEnterEmailSubtaskInput;
    }
    
    public static void _serialize(final JsonEnterEmailSubtaskInput jsonEnterEmailSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.e("discoverability_value", jsonEnterEmailSubtaskInput.c);
        tfe.u0("email", jsonEnterEmailSubtaskInput.b);
        final List d = jsonEnterEmailSubtaskInput.d;
        if (d != null) {
            final Iterator f = x30.F(tfe, "setting_responses", d);
            while (f.hasNext()) {
                final JsonSettingResponseWithKey jsonSettingResponseWithKey = f.next();
                if (jsonSettingResponseWithKey != null) {
                    JsonSettingResponseWithKey$$JsonObjectMapper._serialize(jsonSettingResponseWithKey, tfe, true);
                }
            }
            tfe.f();
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonEnterEmailSubtaskInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterEmailSubtaskInput jsonEnterEmailSubtaskInput, final String s, final khe khe) throws IOException {
        if ("discoverability_value".equals(s)) {
            jsonEnterEmailSubtaskInput.c = khe.k();
        }
        else if ("email".equals(s)) {
            jsonEnterEmailSubtaskInput.b = khe.T((String)null);
        }
        else if ("setting_responses".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonSettingResponseWithKey parse = JsonSettingResponseWithKey$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        d.add(parse);
                    }
                }
                jsonEnterEmailSubtaskInput.d = d;
            }
            else {
                jsonEnterEmailSubtaskInput.d = null;
            }
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonEnterEmailSubtaskInput, s, khe);
        }
    }
    
    public JsonEnterEmailSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterEmailSubtaskInput jsonEnterEmailSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterEmailSubtaskInput, tfe, b);
    }
}
