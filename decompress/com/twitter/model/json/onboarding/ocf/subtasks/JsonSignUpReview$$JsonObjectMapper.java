// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSignUpReview$$JsonObjectMapper extends JsonMapper<JsonSignUpReview>
{
    public static JsonSignUpReview _parse(final tge tge) throws IOException {
        final JsonSignUpReview jsonSignUpReview = new JsonSignUpReview();
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
            parseField(jsonSignUpReview, d, tge);
            tge.l0();
        }
        return jsonSignUpReview;
    }
    
    public static void _serialize(final JsonSignUpReview jsonSignUpReview, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonSignUpReview.f != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonSignUpReview.f, "birthday", true, afe);
        }
        if (jsonSignUpReview.o != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUpReview.o, "birthday_edit_link", true, afe);
        }
        afe.t0("birthday_hint", jsonSignUpReview.u);
        if (jsonSignUpReview.g != null) {
            LoganSquare.typeConverterFor((Class)o98.class).serialize((Object)jsonSignUpReview.g, "birthday_requirement", true, afe);
        }
        if (jsonSignUpReview.v != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSignUpReview.v, afe, true);
        }
        if (jsonSignUpReview.i != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSignUpReview.i, afe, true);
        }
        if (jsonSignUpReview.e != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonSignUpReview.e, "email", true, afe);
        }
        if (jsonSignUpReview.n != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUpReview.n, "email_edit_link", true, afe);
        }
        afe.t0("email_hint", jsonSignUpReview.t);
        if (jsonSignUpReview.k != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUpReview.k, "email_next_link", true, afe);
        }
        afe.e("ignore_birthday", jsonSignUpReview.q);
        if (jsonSignUpReview.p != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUpReview.p, "invalid_birthday_link", true, afe);
        }
        if (jsonSignUpReview.c != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonSignUpReview.c, "name", true, afe);
        }
        if (jsonSignUpReview.l != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUpReview.l, "name_edit_link", true, afe);
        }
        afe.t0("name_hint", jsonSignUpReview.r);
        if (jsonSignUpReview.m != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUpReview.m, "phone_edit_link", true, afe);
        }
        afe.t0("phone_hint", jsonSignUpReview.s);
        if (jsonSignUpReview.j != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonSignUpReview.j, "phone_next_link", true, afe);
        }
        if (jsonSignUpReview.d != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonSignUpReview.d, "phone_number", true, afe);
        }
        afe.t0("primary_text", jsonSignUpReview.a);
        afe.t0("secondary_text", jsonSignUpReview.b);
        if (jsonSignUpReview.h != null) {
            afe.i("sign_in_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSignUpReview.h, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSignUpReview jsonSignUpReview, final String s, final tge tge) throws IOException {
        if ("birthday".equals(s)) {
            jsonSignUpReview.f = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
        }
        else if ("birthday_edit_link".equals(s)) {
            jsonSignUpReview.o = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("birthday_hint".equals(s)) {
            jsonSignUpReview.u = tge.T((String)null);
        }
        else if ("birthday_requirement".equals(s)) {
            jsonSignUpReview.g = (o98)LoganSquare.typeConverterFor((Class)o98.class).parse(tge);
        }
        else if ("component_collection".equals(s)) {
            jsonSignUpReview.v = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonSignUpReview.i = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("email".equals(s)) {
            jsonSignUpReview.e = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
        }
        else if ("email_edit_link".equals(s)) {
            jsonSignUpReview.n = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("email_hint".equals(s)) {
            jsonSignUpReview.t = tge.T((String)null);
        }
        else if ("email_next_link".equals(s)) {
            jsonSignUpReview.k = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("ignore_birthday".equals(s)) {
            jsonSignUpReview.q = tge.k();
        }
        else if ("invalid_birthday_link".equals(s)) {
            jsonSignUpReview.p = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("name".equals(s)) {
            jsonSignUpReview.c = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
        }
        else if ("name_edit_link".equals(s)) {
            jsonSignUpReview.l = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("name_hint".equals(s)) {
            jsonSignUpReview.r = tge.T((String)null);
        }
        else if ("phone_edit_link".equals(s)) {
            jsonSignUpReview.m = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("phone_hint".equals(s)) {
            jsonSignUpReview.s = tge.T((String)null);
        }
        else if ("phone_next_link".equals(s)) {
            jsonSignUpReview.j = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("phone_number".equals(s)) {
            jsonSignUpReview.d = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonSignUpReview.a = tge.T((String)null);
        }
        else if ("secondary_text".equals(s)) {
            jsonSignUpReview.b = tge.T((String)null);
        }
        else if ("sign_in_text".equals(s)) {
            jsonSignUpReview.h = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonSignUpReview parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSignUpReview jsonSignUpReview, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSignUpReview, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSignUpReview)o, afe, b);
    }
}
