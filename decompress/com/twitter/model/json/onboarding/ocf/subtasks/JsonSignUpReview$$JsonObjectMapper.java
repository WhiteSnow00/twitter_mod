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
    public static JsonSignUpReview _parse(final khe khe) throws IOException {
        final JsonSignUpReview jsonSignUpReview = new JsonSignUpReview();
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
            parseField(jsonSignUpReview, d, khe);
            khe.m0();
        }
        return jsonSignUpReview;
    }
    
    public static void _serialize(final JsonSignUpReview jsonSignUpReview, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonSignUpReview.f != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonSignUpReview.f, "birthday", true, tfe);
        }
        if (jsonSignUpReview.o != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUpReview.o, "birthday_edit_link", true, tfe);
        }
        tfe.u0("birthday_hint", jsonSignUpReview.u);
        if (jsonSignUpReview.g != null) {
            LoganSquare.typeConverterFor((Class)ea8.class).serialize((Object)jsonSignUpReview.g, "birthday_requirement", true, tfe);
        }
        if (jsonSignUpReview.v != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonSignUpReview.v, tfe, true);
        }
        if (jsonSignUpReview.i != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSignUpReview.i, tfe, true);
        }
        if (jsonSignUpReview.e != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonSignUpReview.e, "email", true, tfe);
        }
        if (jsonSignUpReview.n != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUpReview.n, "email_edit_link", true, tfe);
        }
        tfe.u0("email_hint", jsonSignUpReview.t);
        if (jsonSignUpReview.k != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUpReview.k, "email_next_link", true, tfe);
        }
        tfe.e("ignore_birthday", jsonSignUpReview.q);
        if (jsonSignUpReview.p != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUpReview.p, "invalid_birthday_link", true, tfe);
        }
        if (jsonSignUpReview.c != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonSignUpReview.c, "name", true, tfe);
        }
        if (jsonSignUpReview.l != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUpReview.l, "name_edit_link", true, tfe);
        }
        tfe.u0("name_hint", jsonSignUpReview.r);
        if (jsonSignUpReview.m != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUpReview.m, "phone_edit_link", true, tfe);
        }
        tfe.u0("phone_hint", jsonSignUpReview.s);
        if (jsonSignUpReview.j != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonSignUpReview.j, "phone_next_link", true, tfe);
        }
        if (jsonSignUpReview.d != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonSignUpReview.d, "phone_number", true, tfe);
        }
        tfe.u0("primary_text", jsonSignUpReview.a);
        tfe.u0("secondary_text", jsonSignUpReview.b);
        if (jsonSignUpReview.h != null) {
            tfe.i("sign_in_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonSignUpReview.h, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSignUpReview jsonSignUpReview, final String s, final khe khe) throws IOException {
        if ("birthday".equals(s)) {
            jsonSignUpReview.f = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
        }
        else if ("birthday_edit_link".equals(s)) {
            jsonSignUpReview.o = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("birthday_hint".equals(s)) {
            jsonSignUpReview.u = khe.T((String)null);
        }
        else if ("birthday_requirement".equals(s)) {
            jsonSignUpReview.g = (ea8)LoganSquare.typeConverterFor((Class)ea8.class).parse(khe);
        }
        else if ("component_collection".equals(s)) {
            jsonSignUpReview.v = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonSignUpReview.i = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("email".equals(s)) {
            jsonSignUpReview.e = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
        }
        else if ("email_edit_link".equals(s)) {
            jsonSignUpReview.n = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("email_hint".equals(s)) {
            jsonSignUpReview.t = khe.T((String)null);
        }
        else if ("email_next_link".equals(s)) {
            jsonSignUpReview.k = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("ignore_birthday".equals(s)) {
            jsonSignUpReview.q = khe.k();
        }
        else if ("invalid_birthday_link".equals(s)) {
            jsonSignUpReview.p = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("name".equals(s)) {
            jsonSignUpReview.c = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
        }
        else if ("name_edit_link".equals(s)) {
            jsonSignUpReview.l = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("name_hint".equals(s)) {
            jsonSignUpReview.r = khe.T((String)null);
        }
        else if ("phone_edit_link".equals(s)) {
            jsonSignUpReview.m = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("phone_hint".equals(s)) {
            jsonSignUpReview.s = khe.T((String)null);
        }
        else if ("phone_next_link".equals(s)) {
            jsonSignUpReview.j = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("phone_number".equals(s)) {
            jsonSignUpReview.d = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonSignUpReview.a = khe.T((String)null);
        }
        else if ("secondary_text".equals(s)) {
            jsonSignUpReview.b = khe.T((String)null);
        }
        else if ("sign_in_text".equals(s)) {
            jsonSignUpReview.h = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonSignUpReview parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSignUpReview jsonSignUpReview, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSignUpReview, tfe, b);
    }
}
