// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPasswordEntry$$JsonObjectMapper extends JsonMapper<JsonPasswordEntry>
{
    public static final rej OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER;
    public static final icw USER_IDENTIFIER_DISPLAY_TYPE_CONVERTER;
    
    static {
        USER_IDENTIFIER_DISPLAY_TYPE_CONVERTER = new icw();
        OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER = new rej();
    }
    
    public static JsonPasswordEntry _parse(final tge tge) throws IOException {
        final JsonPasswordEntry jsonPasswordEntry = new JsonPasswordEntry();
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
            parseField(jsonPasswordEntry, d, tge);
            tge.l0();
        }
        return jsonPasswordEntry;
    }
    
    public static void _serialize(final JsonPasswordEntry jsonPasswordEntry, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList u = jsonPasswordEntry.u;
        if (u != null) {
            final Iterator a = br.A(afe, "action_buttons", u);
            while (a.hasNext()) {
                final jcj jcj = a.next();
                if (jcj != null) {
                    LoganSquare.typeConverterFor((Class)jcj.class).serialize((Object)jcj, "lslocalaction_buttonsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonPasswordEntry.v != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonPasswordEntry.v, afe, true);
        }
        if (jsonPasswordEntry.t != null) {
            LoganSquare.typeConverterFor((Class)pej.class).serialize((Object)jsonPasswordEntry.t, "confirm_password_field", true, afe);
        }
        afe.t0("email", jsonPasswordEntry.g);
        if (jsonPasswordEntry.q != null) {
            LoganSquare.typeConverterFor((Class)edj.class).serialize((Object)jsonPasswordEntry.q, "footer", true, afe);
        }
        if (jsonPasswordEntry.a != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonPasswordEntry.a, "header", true, afe);
        }
        afe.t0("hint", jsonPasswordEntry.d);
        afe.t0("name", jsonPasswordEntry.e);
        if (jsonPasswordEntry.s != null) {
            LoganSquare.typeConverterFor((Class)pej.class).serialize((Object)jsonPasswordEntry.s, "new_password_field", true, afe);
        }
        if (jsonPasswordEntry.i != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonPasswordEntry.i, "next_link", true, afe);
        }
        final qej p3 = jsonPasswordEntry.p;
        if (p3 != null) {
            ((StringBasedTypeConverter)JsonPasswordEntry$$JsonObjectMapper.OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER).serialize((Object)p3, "os_content_type", true, afe);
        }
        afe.t0("password_confirmation_hint", jsonPasswordEntry.n);
        if (jsonPasswordEntry.o != null) {
            afe.i("password_confirmation_mismatch_message");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPasswordEntry.o, afe, true);
        }
        if (jsonPasswordEntry.r != null) {
            LoganSquare.typeConverterFor((Class)pej.class).serialize((Object)jsonPasswordEntry.r, "password_field", true, afe);
        }
        afe.t0("phone", jsonPasswordEntry.h);
        if (jsonPasswordEntry.b != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPasswordEntry.b, afe, true);
        }
        if (jsonPasswordEntry.c != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPasswordEntry.c, afe, true);
        }
        afe.e("show_password_confirmation", jsonPasswordEntry.m);
        if (jsonPasswordEntry.j != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonPasswordEntry.j, "skip_link", true, afe);
        }
        afe.e("skip_password_validation", jsonPasswordEntry.k);
        ((StringBasedTypeConverter)JsonPasswordEntry$$JsonObjectMapper.USER_IDENTIFIER_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonPasswordEntry.l, "user_identifier_display_type", true, afe);
        afe.t0("username", jsonPasswordEntry.f);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonPasswordEntry jsonPasswordEntry, final String s, final tge tge) throws IOException {
        if ("action_buttons".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList u = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final jcj jcj = (jcj)LoganSquare.typeConverterFor((Class)jcj.class).parse(tge);
                    if (jcj != null) {
                        u.add(jcj);
                    }
                }
                jsonPasswordEntry.u = u;
            }
            else {
                jsonPasswordEntry.u = null;
            }
        }
        else if ("component_collection".equals(s)) {
            jsonPasswordEntry.v = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("confirm_password_field".equals(s)) {
            jsonPasswordEntry.t = (pej)LoganSquare.typeConverterFor((Class)pej.class).parse(tge);
        }
        else if ("email".equals(s)) {
            jsonPasswordEntry.g = tge.T((String)null);
        }
        else if ("footer".equals(s)) {
            jsonPasswordEntry.q = (edj)LoganSquare.typeConverterFor((Class)edj.class).parse(tge);
        }
        else if ("header".equals(s)) {
            jsonPasswordEntry.a = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("hint".equals(s)) {
            jsonPasswordEntry.d = tge.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonPasswordEntry.e = tge.T((String)null);
        }
        else if ("new_password_field".equals(s)) {
            jsonPasswordEntry.s = (pej)LoganSquare.typeConverterFor((Class)pej.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonPasswordEntry.i = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("os_content_type".equals(s)) {
            jsonPasswordEntry.p = (qej)((StringBasedTypeConverter)JsonPasswordEntry$$JsonObjectMapper.OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER).parse(tge);
        }
        else if ("password_confirmation_hint".equals(s)) {
            jsonPasswordEntry.n = tge.T((String)null);
        }
        else if ("password_confirmation_mismatch_message".equals(s)) {
            jsonPasswordEntry.o = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("password_field".equals(s)) {
            jsonPasswordEntry.r = (pej)LoganSquare.typeConverterFor((Class)pej.class).parse(tge);
        }
        else if ("phone".equals(s)) {
            jsonPasswordEntry.h = tge.T((String)null);
        }
        else if ("primary_text".equals(s)) {
            jsonPasswordEntry.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonPasswordEntry.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("show_password_confirmation".equals(s)) {
            jsonPasswordEntry.m = tge.k();
        }
        else if ("skip_link".equals(s)) {
            jsonPasswordEntry.j = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("skip_password_validation".equals(s)) {
            jsonPasswordEntry.k = tge.k();
        }
        else if ("user_identifier_display_type".equals(s)) {
            jsonPasswordEntry.l = (int)((StringBasedTypeConverter)JsonPasswordEntry$$JsonObjectMapper.USER_IDENTIFIER_DISPLAY_TYPE_CONVERTER).parse(tge);
        }
        else if ("username".equals(s)) {
            jsonPasswordEntry.f = tge.T((String)null);
        }
    }
    
    public JsonPasswordEntry parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonPasswordEntry jsonPasswordEntry, final afe afe, final boolean b) throws IOException {
        _serialize(jsonPasswordEntry, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonPasswordEntry)o, afe, b);
    }
}
