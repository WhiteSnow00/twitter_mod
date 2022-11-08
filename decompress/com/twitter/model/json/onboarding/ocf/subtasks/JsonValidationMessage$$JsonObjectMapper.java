// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonValidationMessage$$JsonObjectMapper extends JsonMapper<JsonValidationMessage>
{
    public static final JsonValidationMessage.a MESSAGE_TYPE_TYPE_CONVERTER;
    
    static {
        MESSAGE_TYPE_TYPE_CONVERTER = new JsonValidationMessage.a();
    }
    
    public static JsonValidationMessage _parse(final khe khe) throws IOException {
        final JsonValidationMessage jsonValidationMessage = new JsonValidationMessage();
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
            parseField(jsonValidationMessage, d, khe);
            khe.m0();
        }
        return jsonValidationMessage;
    }
    
    public static void _serialize(final JsonValidationMessage jsonValidationMessage, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final lnw.b a = jsonValidationMessage.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonValidationMessage$$JsonObjectMapper.MESSAGE_TYPE_TYPE_CONVERTER).serialize((Object)a, "message_type", true, tfe);
        }
        if (jsonValidationMessage.b != null) {
            tfe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonValidationMessage.b, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonValidationMessage jsonValidationMessage, final String s, final khe khe) throws IOException {
        if ("message_type".equals(s)) {
            jsonValidationMessage.a = (lnw.b)((StringBasedTypeConverter)JsonValidationMessage$$JsonObjectMapper.MESSAGE_TYPE_TYPE_CONVERTER).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonValidationMessage.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonValidationMessage parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonValidationMessage jsonValidationMessage, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonValidationMessage, tfe, b);
    }
}
