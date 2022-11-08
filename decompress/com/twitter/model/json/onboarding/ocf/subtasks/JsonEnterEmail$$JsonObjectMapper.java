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

public final class JsonEnterEmail$$JsonObjectMapper extends JsonMapper<JsonEnterEmail>
{
    public static JsonEnterEmail _parse(final khe khe) throws IOException {
        final JsonEnterEmail jsonEnterEmail = new JsonEnterEmail();
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
            parseField(jsonEnterEmail, d, khe);
            khe.m0();
        }
        return jsonEnterEmail;
    }
    
    public static void _serialize(final JsonEnterEmail jsonEnterEmail, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonEnterEmail.h != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterEmail.h, tfe, true);
        }
        if (jsonEnterEmail.d != null) {
            LoganSquare.typeConverterFor((Class)fqp.class).serialize((Object)jsonEnterEmail.d, "discoverability_setting", true, tfe);
        }
        tfe.u0("hint_text", jsonEnterEmail.c);
        if (jsonEnterEmail.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterEmail.e, "next_link", true, tfe);
        }
        if (jsonEnterEmail.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterEmail.a, tfe, true);
        }
        if (jsonEnterEmail.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterEmail.b, tfe, true);
        }
        final ArrayList g = jsonEnterEmail.g;
        if (g != null) {
            final Iterator g2 = q1a.g(tfe, "settings", g);
            while (g2.hasNext()) {
                final fqp fqp = g2.next();
                if (fqp != null) {
                    LoganSquare.typeConverterFor((Class)fqp.class).serialize((Object)fqp, "lslocalsettingsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonEnterEmail.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterEmail.f, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterEmail jsonEnterEmail, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonEnterEmail.h = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("discoverability_setting".equals(s)) {
            jsonEnterEmail.d = (fqp)LoganSquare.typeConverterFor((Class)fqp.class).parse(khe);
        }
        else if ("hint_text".equals(s)) {
            jsonEnterEmail.c = khe.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonEnterEmail.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonEnterEmail.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonEnterEmail.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("settings".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList g = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final fqp fqp = (fqp)LoganSquare.typeConverterFor((Class)fqp.class).parse(khe);
                    if (fqp != null) {
                        g.add(fqp);
                    }
                }
                jsonEnterEmail.g = g;
            }
            else {
                jsonEnterEmail.g = null;
            }
        }
        else if ("skip_link".equals(s)) {
            jsonEnterEmail.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonEnterEmail parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterEmail jsonEnterEmail, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterEmail, tfe, b);
    }
}
