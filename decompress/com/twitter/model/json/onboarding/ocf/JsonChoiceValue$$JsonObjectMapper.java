// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfHorizonIcon$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonChoiceValue$$JsonObjectMapper extends JsonMapper<JsonChoiceValue>
{
    public static JsonChoiceValue _parse(final khe khe) throws IOException {
        final JsonChoiceValue jsonChoiceValue = new JsonChoiceValue();
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
            parseField(jsonChoiceValue, d, khe);
            khe.m0();
        }
        return jsonChoiceValue;
    }
    
    public static void _serialize(final JsonChoiceValue jsonChoiceValue, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonChoiceValue.d != null) {
            tfe.i("icon");
            JsonOcfHorizonIcon$$JsonObjectMapper._serialize(jsonChoiceValue.d, tfe, true);
        }
        tfe.u0("id", jsonChoiceValue.a);
        if (jsonChoiceValue.c != null) {
            tfe.i("subtext");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceValue.c, tfe, true);
        }
        if (jsonChoiceValue.b != null) {
            tfe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceValue.b, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonChoiceValue jsonChoiceValue, final String s, final khe khe) throws IOException {
        if ("icon".equals(s)) {
            jsonChoiceValue.d = JsonOcfHorizonIcon$$JsonObjectMapper._parse(khe);
        }
        else if ("id".equals(s)) {
            jsonChoiceValue.a = khe.T((String)null);
        }
        else if ("subtext".equals(s)) {
            jsonChoiceValue.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("text".equals(s)) {
            jsonChoiceValue.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonChoiceValue parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonChoiceValue jsonChoiceValue, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonChoiceValue, tfe, b);
    }
}
