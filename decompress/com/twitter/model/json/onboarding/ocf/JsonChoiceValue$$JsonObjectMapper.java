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
    public static JsonChoiceValue _parse(final qhe qhe) throws IOException {
        final JsonChoiceValue jsonChoiceValue = new JsonChoiceValue();
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
            parseField(jsonChoiceValue, d, qhe);
            qhe.m0();
        }
        return jsonChoiceValue;
    }
    
    public static void _serialize(final JsonChoiceValue jsonChoiceValue, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonChoiceValue.d != null) {
            yfe.i("icon");
            JsonOcfHorizonIcon$$JsonObjectMapper._serialize(jsonChoiceValue.d, yfe, true);
        }
        yfe.u0("id", jsonChoiceValue.a);
        if (jsonChoiceValue.c != null) {
            yfe.i("subtext");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceValue.c, yfe, true);
        }
        if (jsonChoiceValue.b != null) {
            yfe.i("text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceValue.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonChoiceValue jsonChoiceValue, final String s, final qhe qhe) throws IOException {
        if ("icon".equals(s)) {
            jsonChoiceValue.d = JsonOcfHorizonIcon$$JsonObjectMapper._parse(qhe);
        }
        else if ("id".equals(s)) {
            jsonChoiceValue.a = qhe.T((String)null);
        }
        else if ("subtext".equals(s)) {
            jsonChoiceValue.c = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
        else if ("text".equals(s)) {
            jsonChoiceValue.b = JsonOcfRichText$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonChoiceValue parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonChoiceValue jsonChoiceValue, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonChoiceValue, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonChoiceValue)o, yfe, b);
    }
}
