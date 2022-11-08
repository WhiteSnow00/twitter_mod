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
    public static JsonPhoneVerification _parse(final khe khe) throws IOException {
        final JsonPhoneVerification jsonPhoneVerification = new JsonPhoneVerification();
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
            parseField(jsonPhoneVerification, d, khe);
            khe.m0();
        }
        return jsonPhoneVerification;
    }
    
    public static void _serialize(final JsonPhoneVerification jsonPhoneVerification, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("auto_verify_hint_text", jsonPhoneVerification.i);
        if (jsonPhoneVerification.g != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonPhoneVerification.g, "cancel_link", true, tfe);
        }
        tfe.T("code_length", jsonPhoneVerification.l);
        if (jsonPhoneVerification.m != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonPhoneVerification.m, tfe, true);
        }
        if (jsonPhoneVerification.c != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPhoneVerification.c, tfe, true);
        }
        if (jsonPhoneVerification.h != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonPhoneVerification.h, "fail_link", true, tfe);
        }
        tfe.u0("hint_text", jsonPhoneVerification.d);
        if (jsonPhoneVerification.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonPhoneVerification.f, "next_link", true, tfe);
        }
        if (jsonPhoneVerification.k != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonPhoneVerification.k, "phone_country_code", true, tfe);
        }
        if (jsonPhoneVerification.e != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonPhoneVerification.e, "phone_number", true, tfe);
        }
        if (jsonPhoneVerification.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPhoneVerification.a, tfe, true);
        }
        if (jsonPhoneVerification.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPhoneVerification.b, tfe, true);
        }
        tfe.e("send_via_voice", jsonPhoneVerification.j);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonPhoneVerification jsonPhoneVerification, final String s, final khe khe) throws IOException {
        final boolean equals = "auto_verify_hint_text".equals(s);
        final Integer n = null;
        if (equals) {
            jsonPhoneVerification.i = khe.T((String)null);
        }
        else if ("cancel_link".equals(s)) {
            jsonPhoneVerification.g = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("code_length".equals(s)) {
            Integer value;
            if (khe.e() == lje.U0) {
                value = n;
            }
            else {
                value = khe.z();
            }
            jsonPhoneVerification.l = value;
        }
        else if ("component_collection".equals(s)) {
            jsonPhoneVerification.m = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonPhoneVerification.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("fail_link".equals(s)) {
            jsonPhoneVerification.h = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("hint_text".equals(s)) {
            jsonPhoneVerification.d = khe.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonPhoneVerification.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("phone_country_code".equals(s)) {
            jsonPhoneVerification.k = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
        }
        else if ("phone_number".equals(s)) {
            jsonPhoneVerification.e = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonPhoneVerification.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonPhoneVerification.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("send_via_voice".equals(s)) {
            jsonPhoneVerification.j = khe.k();
        }
    }
    
    public JsonPhoneVerification parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonPhoneVerification jsonPhoneVerification, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonPhoneVerification, tfe, b);
    }
}
