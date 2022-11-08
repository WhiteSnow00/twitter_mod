// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFetchPersistedDataSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonFetchPersistedDataSubtaskInput>
{
    public static final jhe JSON_OPTIONAL_STRING_TYPE_CONVERTER;
    
    static {
        JSON_OPTIONAL_STRING_TYPE_CONVERTER = new jhe();
    }
    
    public static JsonFetchPersistedDataSubtaskInput _parse(final khe khe) throws IOException {
        final JsonFetchPersistedDataSubtaskInput jsonFetchPersistedDataSubtaskInput = new JsonFetchPersistedDataSubtaskInput();
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
            parseField(jsonFetchPersistedDataSubtaskInput, d, khe);
            khe.m0();
        }
        return jsonFetchPersistedDataSubtaskInput;
    }
    
    public static void _serialize(final JsonFetchPersistedDataSubtaskInput jsonFetchPersistedDataSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final String c = jsonFetchPersistedDataSubtaskInput.c;
        if (c != null) {
            JsonFetchPersistedDataSubtaskInput$$JsonObjectMapper.JSON_OPTIONAL_STRING_TYPE_CONVERTER.a(c, "one_tap_password", tfe);
        }
        final String b2 = jsonFetchPersistedDataSubtaskInput.b;
        if (b2 != null) {
            JsonFetchPersistedDataSubtaskInput$$JsonObjectMapper.JSON_OPTIONAL_STRING_TYPE_CONVERTER.a(b2, "one_tap_user_identifier", tfe);
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonFetchPersistedDataSubtaskInput, tfe, false);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFetchPersistedDataSubtaskInput jsonFetchPersistedDataSubtaskInput, final String s, final khe khe) throws IOException {
        if ("one_tap_password".equals(s)) {
            Objects.requireNonNull(JsonFetchPersistedDataSubtaskInput$$JsonObjectMapper.JSON_OPTIONAL_STRING_TYPE_CONVERTER);
            jsonFetchPersistedDataSubtaskInput.c = khe.P();
        }
        else if ("one_tap_user_identifier".equals(s)) {
            Objects.requireNonNull(JsonFetchPersistedDataSubtaskInput$$JsonObjectMapper.JSON_OPTIONAL_STRING_TYPE_CONVERTER);
            jsonFetchPersistedDataSubtaskInput.b = khe.P();
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonFetchPersistedDataSubtaskInput, s, khe);
        }
    }
    
    public JsonFetchPersistedDataSubtaskInput parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFetchPersistedDataSubtaskInput jsonFetchPersistedDataSubtaskInput, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFetchPersistedDataSubtaskInput, tfe, b);
    }
}
