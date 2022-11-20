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
    public static JsonChoiceValue _parse(final tge tge) throws IOException {
        final JsonChoiceValue jsonChoiceValue = new JsonChoiceValue();
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
            parseField(jsonChoiceValue, d, tge);
            tge.l0();
        }
        return jsonChoiceValue;
    }
    
    public static void _serialize(final JsonChoiceValue jsonChoiceValue, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonChoiceValue.d != null) {
            afe.i("icon");
            JsonOcfHorizonIcon$$JsonObjectMapper._serialize(jsonChoiceValue.d, afe, true);
        }
        afe.t0("id", jsonChoiceValue.a);
        if (jsonChoiceValue.c != null) {
            afe.i("subtext");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceValue.c, afe, true);
        }
        if (jsonChoiceValue.b != null) {
            afe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceValue.b, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonChoiceValue jsonChoiceValue, final String s, final tge tge) throws IOException {
        if ("icon".equals(s)) {
            jsonChoiceValue.d = JsonOcfHorizonIcon$$JsonObjectMapper._parse(tge);
        }
        else if ("id".equals(s)) {
            jsonChoiceValue.a = tge.T((String)null);
        }
        else if ("subtext".equals(s)) {
            jsonChoiceValue.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("text".equals(s)) {
            jsonChoiceValue.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonChoiceValue parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonChoiceValue jsonChoiceValue, final afe afe, final boolean b) throws IOException {
        _serialize(jsonChoiceValue, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonChoiceValue)o, afe, b);
    }
}
