// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPhoneVerification$$JsonObjectMapper extends JsonMapper<JsonPhoneVerification>
{
    public static JsonPhoneVerification _parse(final tge tge) throws IOException {
        final JsonPhoneVerification jsonPhoneVerification = new JsonPhoneVerification();
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
            parseField(jsonPhoneVerification, d, tge);
            tge.l0();
        }
        return jsonPhoneVerification;
    }
    
    public static void _serialize(final JsonPhoneVerification jsonPhoneVerification, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("auto_verify_hint_text", jsonPhoneVerification.i);
        if (jsonPhoneVerification.g != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonPhoneVerification.g, "cancel_link", true, afe);
        }
        afe.T("code_length", (int)jsonPhoneVerification.l);
        if (jsonPhoneVerification.m != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonPhoneVerification.m, afe, true);
        }
        if (jsonPhoneVerification.c != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPhoneVerification.c, afe, true);
        }
        if (jsonPhoneVerification.h != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonPhoneVerification.h, "fail_link", true, afe);
        }
        afe.t0("hint_text", jsonPhoneVerification.d);
        if (jsonPhoneVerification.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonPhoneVerification.f, "next_link", true, afe);
        }
        if (jsonPhoneVerification.k != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonPhoneVerification.k, "phone_country_code", true, afe);
        }
        if (jsonPhoneVerification.e != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonPhoneVerification.e, "phone_number", true, afe);
        }
        if (jsonPhoneVerification.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPhoneVerification.a, afe, true);
        }
        if (jsonPhoneVerification.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPhoneVerification.b, afe, true);
        }
        afe.e("send_via_voice", jsonPhoneVerification.j);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonPhoneVerification jsonPhoneVerification, final String s, final tge tge) throws IOException {
        final boolean equals = "auto_verify_hint_text".equals(s);
        final Integer n = null;
        if (equals) {
            jsonPhoneVerification.i = tge.T((String)null);
        }
        else if ("cancel_link".equals(s)) {
            jsonPhoneVerification.g = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("code_length".equals(s)) {
            Integer value;
            if (tge.e() == vie.V0) {
                value = n;
            }
            else {
                value = tge.y();
            }
            jsonPhoneVerification.l = value;
        }
        else if ("component_collection".equals(s)) {
            jsonPhoneVerification.m = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonPhoneVerification.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("fail_link".equals(s)) {
            jsonPhoneVerification.h = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("hint_text".equals(s)) {
            jsonPhoneVerification.d = tge.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonPhoneVerification.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("phone_country_code".equals(s)) {
            jsonPhoneVerification.k = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
        }
        else if ("phone_number".equals(s)) {
            jsonPhoneVerification.e = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonPhoneVerification.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonPhoneVerification.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("send_via_voice".equals(s)) {
            jsonPhoneVerification.j = tge.k();
        }
    }
    
    public JsonPhoneVerification parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonPhoneVerification jsonPhoneVerification, final afe afe, final boolean b) throws IOException {
        _serialize(jsonPhoneVerification, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonPhoneVerification)o, afe, b);
    }
}
