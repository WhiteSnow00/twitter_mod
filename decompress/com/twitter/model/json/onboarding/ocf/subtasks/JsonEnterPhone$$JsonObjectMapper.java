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
    public static JsonEnterPhone _parse(final khe khe) throws IOException {
        final JsonEnterPhone jsonEnterPhone = new JsonEnterPhone();
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
            parseField(jsonEnterPhone, d, khe);
            khe.m0();
        }
        return jsonEnterPhone;
    }
    
    public static void _serialize(final JsonEnterPhone jsonEnterPhone, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonEnterPhone.j != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterPhone.j, tfe, true);
        }
        final ArrayList d = jsonEnterPhone.d;
        if (d != null) {
            final Iterator g = q1a.g(tfe, "country_codes", d);
            while (g.hasNext()) {
                final t94 t94 = g.next();
                if (t94 != null) {
                    LoganSquare.typeConverterFor((Class)t94.class).serialize((Object)t94, "lslocalcountry_codesElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("default_country_code", jsonEnterPhone.e);
        if (jsonEnterPhone.f != null) {
            LoganSquare.typeConverterFor((Class)fqp.class).serialize((Object)jsonEnterPhone.f, "discoverability_setting", true, tfe);
        }
        tfe.u0("hint_text", jsonEnterPhone.c);
        if (jsonEnterPhone.g != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterPhone.g, "next_link", true, tfe);
        }
        if (jsonEnterPhone.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterPhone.a, tfe, true);
        }
        if (jsonEnterPhone.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterPhone.b, tfe, true);
        }
        final ArrayList i = jsonEnterPhone.i;
        if (i != null) {
            final Iterator g2 = q1a.g(tfe, "settings", i);
            while (g2.hasNext()) {
                final fqp fqp = g2.next();
                if (fqp != null) {
                    LoganSquare.typeConverterFor((Class)fqp.class).serialize((Object)fqp, "lslocalsettingsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonEnterPhone.h != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterPhone.h, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterPhone jsonEnterPhone, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonEnterPhone.j = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("country_codes".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final t94 t94 = (t94)LoganSquare.typeConverterFor((Class)t94.class).parse(khe);
                    if (t94 != null) {
                        d.add(t94);
                    }
                }
                jsonEnterPhone.d = d;
            }
            else {
                jsonEnterPhone.d = null;
            }
        }
        else if ("default_country_code".equals(s)) {
            jsonEnterPhone.e = khe.T((String)null);
        }
        else if ("discoverability_setting".equals(s)) {
            jsonEnterPhone.f = (fqp)LoganSquare.typeConverterFor((Class)fqp.class).parse(khe);
        }
        else if ("hint_text".equals(s)) {
            jsonEnterPhone.c = khe.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonEnterPhone.g = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonEnterPhone.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonEnterPhone.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("settings".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList i = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final fqp fqp = (fqp)LoganSquare.typeConverterFor((Class)fqp.class).parse(khe);
                    if (fqp != null) {
                        i.add(fqp);
                    }
                }
                jsonEnterPhone.i = i;
            }
            else {
                jsonEnterPhone.i = null;
            }
        }
        else if ("skip_link".equals(s)) {
            jsonEnterPhone.h = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonEnterPhone parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterPhone jsonEnterPhone, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterPhone, tfe, b);
    }
}
