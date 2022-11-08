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
    public static final lej OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER;
    public static final xbw USER_IDENTIFIER_DISPLAY_TYPE_CONVERTER;
    
    static {
        USER_IDENTIFIER_DISPLAY_TYPE_CONVERTER = new xbw();
        OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER = new lej();
    }
    
    public static JsonPasswordEntry _parse(final khe khe) throws IOException {
        final JsonPasswordEntry jsonPasswordEntry = new JsonPasswordEntry();
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
            parseField(jsonPasswordEntry, d, khe);
            khe.m0();
        }
        return jsonPasswordEntry;
    }
    
    public static void _serialize(final JsonPasswordEntry jsonPasswordEntry, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList u = jsonPasswordEntry.u;
        if (u != null) {
            final Iterator g = q1a.g(tfe, "action_buttons", u);
            while (g.hasNext()) {
                final ecj ecj = g.next();
                if (ecj != null) {
                    LoganSquare.typeConverterFor((Class)ecj.class).serialize((Object)ecj, "lslocalaction_buttonsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonPasswordEntry.v != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonPasswordEntry.v, tfe, true);
        }
        if (jsonPasswordEntry.t != null) {
            LoganSquare.typeConverterFor((Class)jej.class).serialize((Object)jsonPasswordEntry.t, "confirm_password_field", true, tfe);
        }
        tfe.u0("email", jsonPasswordEntry.g);
        if (jsonPasswordEntry.q != null) {
            LoganSquare.typeConverterFor((Class)zcj.class).serialize((Object)jsonPasswordEntry.q, "footer", true, tfe);
        }
        if (jsonPasswordEntry.a != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonPasswordEntry.a, "header", true, tfe);
        }
        tfe.u0("hint", jsonPasswordEntry.d);
        tfe.u0("name", jsonPasswordEntry.e);
        if (jsonPasswordEntry.s != null) {
            LoganSquare.typeConverterFor((Class)jej.class).serialize((Object)jsonPasswordEntry.s, "new_password_field", true, tfe);
        }
        if (jsonPasswordEntry.i != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonPasswordEntry.i, "next_link", true, tfe);
        }
        final kej p3 = jsonPasswordEntry.p;
        if (p3 != null) {
            ((StringBasedTypeConverter)JsonPasswordEntry$$JsonObjectMapper.OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER).serialize((Object)p3, "os_content_type", true, tfe);
        }
        tfe.u0("password_confirmation_hint", jsonPasswordEntry.n);
        if (jsonPasswordEntry.o != null) {
            tfe.i("password_confirmation_mismatch_message");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPasswordEntry.o, tfe, true);
        }
        if (jsonPasswordEntry.r != null) {
            LoganSquare.typeConverterFor((Class)jej.class).serialize((Object)jsonPasswordEntry.r, "password_field", true, tfe);
        }
        tfe.u0("phone", jsonPasswordEntry.h);
        if (jsonPasswordEntry.b != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPasswordEntry.b, tfe, true);
        }
        if (jsonPasswordEntry.c != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonPasswordEntry.c, tfe, true);
        }
        tfe.e("show_password_confirmation", jsonPasswordEntry.m);
        if (jsonPasswordEntry.j != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonPasswordEntry.j, "skip_link", true, tfe);
        }
        tfe.e("skip_password_validation", jsonPasswordEntry.k);
        ((StringBasedTypeConverter)JsonPasswordEntry$$JsonObjectMapper.USER_IDENTIFIER_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonPasswordEntry.l, "user_identifier_display_type", true, tfe);
        tfe.u0("username", jsonPasswordEntry.f);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonPasswordEntry jsonPasswordEntry, final String s, final khe khe) throws IOException {
        if ("action_buttons".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList u = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final ecj ecj = (ecj)LoganSquare.typeConverterFor((Class)ecj.class).parse(khe);
                    if (ecj != null) {
                        u.add(ecj);
                    }
                }
                jsonPasswordEntry.u = u;
            }
            else {
                jsonPasswordEntry.u = null;
            }
        }
        else if ("component_collection".equals(s)) {
            jsonPasswordEntry.v = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("confirm_password_field".equals(s)) {
            jsonPasswordEntry.t = (jej)LoganSquare.typeConverterFor((Class)jej.class).parse(khe);
        }
        else if ("email".equals(s)) {
            jsonPasswordEntry.g = khe.T((String)null);
        }
        else if ("footer".equals(s)) {
            jsonPasswordEntry.q = (zcj)LoganSquare.typeConverterFor((Class)zcj.class).parse(khe);
        }
        else if ("header".equals(s)) {
            jsonPasswordEntry.a = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("hint".equals(s)) {
            jsonPasswordEntry.d = khe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonPasswordEntry.e = khe.T((String)null);
        }
        else if ("new_password_field".equals(s)) {
            jsonPasswordEntry.s = (jej)LoganSquare.typeConverterFor((Class)jej.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonPasswordEntry.i = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("os_content_type".equals(s)) {
            jsonPasswordEntry.p = (kej)((StringBasedTypeConverter)JsonPasswordEntry$$JsonObjectMapper.OCF_TEXT_FIELD_CONTENT_TYPE_CONVERTER).parse(khe);
        }
        else if ("password_confirmation_hint".equals(s)) {
            jsonPasswordEntry.n = khe.T((String)null);
        }
        else if ("password_confirmation_mismatch_message".equals(s)) {
            jsonPasswordEntry.o = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("password_field".equals(s)) {
            jsonPasswordEntry.r = (jej)LoganSquare.typeConverterFor((Class)jej.class).parse(khe);
        }
        else if ("phone".equals(s)) {
            jsonPasswordEntry.h = khe.T((String)null);
        }
        else if ("primary_text".equals(s)) {
            jsonPasswordEntry.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonPasswordEntry.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("show_password_confirmation".equals(s)) {
            jsonPasswordEntry.m = khe.k();
        }
        else if ("skip_link".equals(s)) {
            jsonPasswordEntry.j = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("skip_password_validation".equals(s)) {
            jsonPasswordEntry.k = khe.k();
        }
        else if ("user_identifier_display_type".equals(s)) {
            jsonPasswordEntry.l = (int)((StringBasedTypeConverter)JsonPasswordEntry$$JsonObjectMapper.USER_IDENTIFIER_DISPLAY_TYPE_CONVERTER).parse(khe);
        }
        else if ("username".equals(s)) {
            jsonPasswordEntry.f = khe.T((String)null);
        }
    }
    
    public JsonPasswordEntry parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonPasswordEntry jsonPasswordEntry, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonPasswordEntry, tfe, b);
    }
}
