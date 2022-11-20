// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterPhone$$JsonObjectMapper extends JsonMapper<JsonEnterPhone>
{
    public static JsonEnterPhone _parse(final tge tge) throws IOException {
        final JsonEnterPhone jsonEnterPhone = new JsonEnterPhone();
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
            parseField(jsonEnterPhone, d, tge);
            tge.l0();
        }
        return jsonEnterPhone;
    }
    
    public static void _serialize(final JsonEnterPhone jsonEnterPhone, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonEnterPhone.j != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterPhone.j, afe, true);
        }
        final ArrayList d = jsonEnterPhone.d;
        if (d != null) {
            final Iterator a = br.A(afe, "country_codes", d);
            while (a.hasNext()) {
                final v84 v84 = a.next();
                if (v84 != null) {
                    LoganSquare.typeConverterFor((Class)v84.class).serialize((Object)v84, "lslocalcountry_codesElement", false, afe);
                }
            }
            afe.f();
        }
        afe.t0("default_country_code", jsonEnterPhone.e);
        if (jsonEnterPhone.f != null) {
            LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)jsonEnterPhone.f, "discoverability_setting", true, afe);
        }
        afe.t0("hint_text", jsonEnterPhone.c);
        if (jsonEnterPhone.g != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterPhone.g, "next_link", true, afe);
        }
        if (jsonEnterPhone.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterPhone.a, afe, true);
        }
        if (jsonEnterPhone.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterPhone.b, afe, true);
        }
        final ArrayList i = jsonEnterPhone.i;
        if (i != null) {
            final Iterator a2 = br.A(afe, "settings", i);
            while (a2.hasNext()) {
                final wqp wqp = a2.next();
                if (wqp != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp, "lslocalsettingsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonEnterPhone.h != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterPhone.h, "skip_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEnterPhone jsonEnterPhone, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonEnterPhone.j = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("country_codes".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final v84 v84 = (v84)LoganSquare.typeConverterFor((Class)v84.class).parse(tge);
                    if (v84 != null) {
                        d.add(v84);
                    }
                }
                jsonEnterPhone.d = d;
            }
            else {
                jsonEnterPhone.d = null;
            }
        }
        else if ("default_country_code".equals(s)) {
            jsonEnterPhone.e = tge.T((String)null);
        }
        else if ("discoverability_setting".equals(s)) {
            jsonEnterPhone.f = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
        }
        else if ("hint_text".equals(s)) {
            jsonEnterPhone.c = tge.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonEnterPhone.g = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonEnterPhone.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonEnterPhone.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("settings".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList i = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final wqp wqp = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                    if (wqp != null) {
                        i.add(wqp);
                    }
                }
                jsonEnterPhone.i = i;
            }
            else {
                jsonEnterPhone.i = null;
            }
        }
        else if ("skip_link".equals(s)) {
            jsonEnterPhone.h = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonEnterPhone parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEnterPhone jsonEnterPhone, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEnterPhone, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEnterPhone)o, afe, b);
    }
}
