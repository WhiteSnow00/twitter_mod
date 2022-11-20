// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSignUp$$JsonObjectMapper extends JsonMapper<JsonSignUp>
{
    public static JsonSignUp _parse(final tge tge) throws IOException {
        final JsonSignUp jsonSignUp = new JsonSignUp();
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
            parseField(jsonSignUp, d, tge);
            tge.l0();
        }
        return jsonSignUp;
    }
    
    public static void _serialize(final JsonSignUp jsonSignUp, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("birthday_explanation", jsonSignUp.g);
        afe.t0("birthday_hint", jsonSignUp.f);
        if (jsonSignUp.o != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSignUp.o, afe, true);
        }
        afe.t0("email_hint", jsonSignUp.d);
        if (jsonSignUp.l != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUp.l, "email_next_link", true, afe);
        }
        afe.e("ignore_birthday", jsonSignUp.k);
        if (jsonSignUp.n != null) {
            afe.i("js_instrumentation");
            JsonSignUp$JsonJsInstrumentationConfig$$JsonObjectMapper._serialize(jsonSignUp.n, afe, true);
        }
        if (jsonSignUp.m != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUp.m, "login_next_link", true, afe);
        }
        afe.t0("name_hint", jsonSignUp.b);
        if (jsonSignUp.j != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUp.j, "next_link", true, afe);
        }
        afe.t0("phone_email_hint", jsonSignUp.e);
        afe.t0("phone_hint", jsonSignUp.c);
        afe.t0("primary_text", jsonSignUp.a);
        afe.t0("use_email_text", jsonSignUp.i);
        afe.t0("use_phone_text", jsonSignUp.h);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSignUp jsonSignUp, final String s, final tge tge) throws IOException {
        if ("birthday_explanation".equals(s)) {
            jsonSignUp.g = tge.T((String)null);
        }
        else if ("birthday_hint".equals(s)) {
            jsonSignUp.f = tge.T((String)null);
        }
        else if ("component_collection".equals(s)) {
            jsonSignUp.o = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("email_hint".equals(s)) {
            jsonSignUp.d = tge.T((String)null);
        }
        else if ("email_next_link".equals(s)) {
            jsonSignUp.l = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("ignore_birthday".equals(s)) {
            jsonSignUp.k = tge.k();
        }
        else if ("js_instrumentation".equals(s)) {
            jsonSignUp.n = JsonSignUp$JsonJsInstrumentationConfig$$JsonObjectMapper._parse(tge);
        }
        else if ("login_next_link".equals(s)) {
            jsonSignUp.m = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("name_hint".equals(s)) {
            jsonSignUp.b = tge.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonSignUp.j = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("phone_email_hint".equals(s)) {
            jsonSignUp.e = tge.T((String)null);
        }
        else if ("phone_hint".equals(s)) {
            jsonSignUp.c = tge.T((String)null);
        }
        else if ("primary_text".equals(s)) {
            jsonSignUp.a = tge.T((String)null);
        }
        else if ("use_email_text".equals(s)) {
            jsonSignUp.i = tge.T((String)null);
        }
        else if ("use_phone_text".equals(s)) {
            jsonSignUp.h = tge.T((String)null);
        }
    }
    
    public JsonSignUp parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSignUp jsonSignUp, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSignUp, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSignUp)o, afe, b);
    }
}
