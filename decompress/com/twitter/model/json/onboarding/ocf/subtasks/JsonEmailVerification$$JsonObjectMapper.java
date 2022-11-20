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
    public static JsonEmailVerification _parse(final tge tge) throws IOException {
        final JsonEmailVerification jsonEmailVerification = new JsonEmailVerification();
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
            parseField(jsonEmailVerification, d, tge);
            tge.l0();
        }
        return jsonEmailVerification;
    }
    
    public static void _serialize(final JsonEmailVerification jsonEmailVerification, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonEmailVerification.h != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEmailVerification.h, "cancel_link", true, afe);
        }
        afe.T("code_length", (int)jsonEmailVerification.k);
        if (jsonEmailVerification.l != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEmailVerification.l, afe, true);
        }
        if (jsonEmailVerification.c != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEmailVerification.c, afe, true);
        }
        if (jsonEmailVerification.e != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonEmailVerification.e, "email", true, afe);
        }
        if (jsonEmailVerification.i != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEmailVerification.i, "fail_link", true, afe);
        }
        afe.t0("hint_text", jsonEmailVerification.d);
        if (jsonEmailVerification.f != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonEmailVerification.f, "name", true, afe);
        }
        if (jsonEmailVerification.g != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEmailVerification.g, "next_link", true, afe);
        }
        if (jsonEmailVerification.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEmailVerification.a, afe, true);
        }
        if (jsonEmailVerification.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEmailVerification.b, afe, true);
        }
        afe.e("verification_status_polling_enabled", jsonEmailVerification.j);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEmailVerification jsonEmailVerification, final String s, final tge tge) throws IOException {
        if ("cancel_link".equals(s)) {
            jsonEmailVerification.h = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else {
            final boolean equals = "code_length".equals(s);
            final Integer n = null;
            if (equals) {
                Integer value;
                if (tge.e() == vie.V0) {
                    value = n;
                }
                else {
                    value = tge.y();
                }
                jsonEmailVerification.k = value;
            }
            else if ("component_collection".equals(s)) {
                jsonEmailVerification.l = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
            }
            else if ("detail_text".equals(s)) {
                jsonEmailVerification.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
            }
            else if ("email".equals(s)) {
                jsonEmailVerification.e = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
            }
            else if ("fail_link".equals(s)) {
                jsonEmailVerification.i = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
            }
            else if ("hint_text".equals(s)) {
                jsonEmailVerification.d = tge.T((String)null);
            }
            else if ("name".equals(s)) {
                jsonEmailVerification.f = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
            }
            else if ("next_link".equals(s)) {
                jsonEmailVerification.g = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
            }
            else if ("primary_text".equals(s)) {
                jsonEmailVerification.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
            }
            else if ("secondary_text".equals(s)) {
                jsonEmailVerification.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
            }
            else if ("verification_status_polling_enabled".equals(s)) {
                jsonEmailVerification.j = tge.k();
            }
        }
    }
    
    public JsonEmailVerification parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEmailVerification jsonEmailVerification, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEmailVerification, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEmailVerification)o, afe, b);
    }
}
