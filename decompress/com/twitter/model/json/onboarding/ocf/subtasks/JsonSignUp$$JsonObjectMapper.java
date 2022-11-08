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
    public static JsonSignUp _parse(final khe khe) throws IOException {
        final JsonSignUp jsonSignUp = new JsonSignUp();
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
            parseField(jsonSignUp, d, khe);
            khe.m0();
        }
        return jsonSignUp;
    }
    
    public static void _serialize(final JsonSignUp jsonSignUp, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("birthday_explanation", jsonSignUp.g);
        tfe.u0("birthday_hint", jsonSignUp.f);
        if (jsonSignUp.o != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSignUp.o, tfe, true);
        }
        tfe.u0("email_hint", jsonSignUp.d);
        if (jsonSignUp.l != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUp.l, "email_next_link", true, tfe);
        }
        tfe.e("ignore_birthday", jsonSignUp.k);
        if (jsonSignUp.n != null) {
            tfe.i("js_instrumentation");
            JsonSignUp$JsonJsInstrumentationConfig$$JsonObjectMapper._serialize(jsonSignUp.n, tfe, true);
        }
        if (jsonSignUp.m != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUp.m, "login_next_link", true, tfe);
        }
        tfe.u0("name_hint", jsonSignUp.b);
        if (jsonSignUp.j != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUp.j, "next_link", true, tfe);
        }
        tfe.u0("phone_email_hint", jsonSignUp.e);
        tfe.u0("phone_hint", jsonSignUp.c);
        tfe.u0("primary_text", jsonSignUp.a);
        tfe.u0("use_email_text", jsonSignUp.i);
        tfe.u0("use_phone_text", jsonSignUp.h);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSignUp jsonSignUp, final String s, final khe khe) throws IOException {
        if ("birthday_explanation".equals(s)) {
            jsonSignUp.g = khe.T((String)null);
        }
        else if ("birthday_hint".equals(s)) {
            jsonSignUp.f = khe.T((String)null);
        }
        else if ("component_collection".equals(s)) {
            jsonSignUp.o = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("email_hint".equals(s)) {
            jsonSignUp.d = khe.T((String)null);
        }
        else if ("email_next_link".equals(s)) {
            jsonSignUp.l = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("ignore_birthday".equals(s)) {
            jsonSignUp.k = khe.k();
        }
        else if ("js_instrumentation".equals(s)) {
            jsonSignUp.n = JsonSignUp$JsonJsInstrumentationConfig$$JsonObjectMapper._parse(khe);
        }
        else if ("login_next_link".equals(s)) {
            jsonSignUp.m = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("name_hint".equals(s)) {
            jsonSignUp.b = khe.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonSignUp.j = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("phone_email_hint".equals(s)) {
            jsonSignUp.e = khe.T((String)null);
        }
        else if ("phone_hint".equals(s)) {
            jsonSignUp.c = khe.T((String)null);
        }
        else if ("primary_text".equals(s)) {
            jsonSignUp.a = khe.T((String)null);
        }
        else if ("use_email_text".equals(s)) {
            jsonSignUp.i = khe.T((String)null);
        }
        else if ("use_phone_text".equals(s)) {
            jsonSignUp.h = khe.T((String)null);
        }
    }
    
    public JsonSignUp parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSignUp jsonSignUp, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSignUp, tfe, b);
    }
}
