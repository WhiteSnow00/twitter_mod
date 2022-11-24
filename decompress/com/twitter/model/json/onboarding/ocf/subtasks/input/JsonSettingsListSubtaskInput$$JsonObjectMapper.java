// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSettingsListSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonSettingsListSubtaskInput>
{
    public static JsonSettingsListSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonSettingsListSubtaskInput jsonSettingsListSubtaskInput = new JsonSettingsListSubtaskInput();
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
            parseField(jsonSettingsListSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonSettingsListSubtaskInput;
    }
    
    public static void _serialize(final JsonSettingsListSubtaskInput jsonSettingsListSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final List b2 = jsonSettingsListSubtaskInput.b;
        if (b2 != null) {
            final Iterator o = ffe.o(yfe, "setting_responses", b2);
            while (o.hasNext()) {
                final JsonSettingResponseWithKey jsonSettingResponseWithKey = o.next();
                if (jsonSettingResponseWithKey != null) {
                    JsonSettingResponseWithKey$$JsonObjectMapper._serialize(jsonSettingResponseWithKey, yfe, true);
                }
            }
            yfe.f();
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonSettingsListSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSettingsListSubtaskInput jsonSettingsListSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("setting_responses".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonSettingResponseWithKey parse = JsonSettingResponseWithKey$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        b.add(parse);
                    }
                }
                jsonSettingsListSubtaskInput.b = b;
            }
            else {
                jsonSettingsListSubtaskInput.b = null;
            }
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonSettingsListSubtaskInput, s, qhe);
        }
    }
    
    public JsonSettingsListSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSettingsListSubtaskInput jsonSettingsListSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSettingsListSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSettingsListSubtaskInput)o, yfe, b);
    }
}
