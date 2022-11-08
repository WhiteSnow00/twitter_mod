// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEmailVerification$$JsonObjectMapper extends JsonMapper<JsonEmailVerification>
{
    public static JsonEmailVerification _parse(final khe khe) throws IOException {
        final JsonEmailVerification jsonEmailVerification = new JsonEmailVerification();
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
            parseField(jsonEmailVerification, d, khe);
            khe.m0();
        }
        return jsonEmailVerification;
    }
    
    public static void _serialize(final JsonEmailVerification jsonEmailVerification, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonEmailVerification.h != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEmailVerification.h, "cancel_link", true, tfe);
        }
        tfe.T("code_length", jsonEmailVerification.k);
        if (jsonEmailVerification.l != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEmailVerification.l, tfe, true);
        }
        if (jsonEmailVerification.c != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEmailVerification.c, tfe, true);
        }
        if (jsonEmailVerification.e != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonEmailVerification.e, "email", true, tfe);
        }
        if (jsonEmailVerification.i != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEmailVerification.i, "fail_link", true, tfe);
        }
        tfe.u0("hint_text", jsonEmailVerification.d);
        if (jsonEmailVerification.f != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonEmailVerification.f, "name", true, tfe);
        }
        if (jsonEmailVerification.g != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEmailVerification.g, "next_link", true, tfe);
        }
        if (jsonEmailVerification.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEmailVerification.a, tfe, true);
        }
        if (jsonEmailVerification.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEmailVerification.b, tfe, true);
        }
        tfe.e("verification_status_polling_enabled", jsonEmailVerification.j);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEmailVerification jsonEmailVerification, final String s, final khe khe) throws IOException {
        if ("cancel_link".equals(s)) {
            jsonEmailVerification.h = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else {
            final boolean equals = "code_length".equals(s);
            final Integer n = null;
            if (equals) {
                Integer value;
                if (khe.e() == lje.U0) {
                    value = n;
                }
                else {
                    value = khe.z();
                }
                jsonEmailVerification.k = value;
            }
            else if ("component_collection".equals(s)) {
                jsonEmailVerification.l = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
            }
            else if ("detail_text".equals(s)) {
                jsonEmailVerification.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
            }
            else if ("email".equals(s)) {
                jsonEmailVerification.e = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
            }
            else if ("fail_link".equals(s)) {
                jsonEmailVerification.i = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
            }
            else if ("hint_text".equals(s)) {
                jsonEmailVerification.d = khe.T((String)null);
            }
            else if ("name".equals(s)) {
                jsonEmailVerification.f = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
            }
            else if ("next_link".equals(s)) {
                jsonEmailVerification.g = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
            }
            else if ("primary_text".equals(s)) {
                jsonEmailVerification.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
            }
            else if ("secondary_text".equals(s)) {
                jsonEmailVerification.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
            }
            else if ("verification_status_polling_enabled".equals(s)) {
                jsonEmailVerification.j = khe.k();
            }
        }
    }
    
    public JsonEmailVerification parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEmailVerification jsonEmailVerification, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEmailVerification, tfe, b);
    }
}
