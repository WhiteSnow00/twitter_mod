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
    public static JsonEnterEmail _parse(final tge tge) throws IOException {
        final JsonEnterEmail jsonEnterEmail = new JsonEnterEmail();
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
            parseField(jsonEnterEmail, d, tge);
            tge.l0();
        }
        return jsonEnterEmail;
    }
    
    public static void _serialize(final JsonEnterEmail jsonEnterEmail, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonEnterEmail.h != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterEmail.h, afe, true);
        }
        if (jsonEnterEmail.d != null) {
            LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)jsonEnterEmail.d, "discoverability_setting", true, afe);
        }
        afe.t0("hint_text", jsonEnterEmail.c);
        if (jsonEnterEmail.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterEmail.e, "next_link", true, afe);
        }
        if (jsonEnterEmail.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterEmail.a, afe, true);
        }
        if (jsonEnterEmail.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterEmail.b, afe, true);
        }
        final ArrayList g = jsonEnterEmail.g;
        if (g != null) {
            final Iterator a = br.A(afe, "settings", g);
            while (a.hasNext()) {
                final wqp wqp = a.next();
                if (wqp != null) {
                    LoganSquare.typeConverterFor((Class)wqp.class).serialize((Object)wqp, "lslocalsettingsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonEnterEmail.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterEmail.f, "skip_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEnterEmail jsonEnterEmail, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonEnterEmail.h = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("discoverability_setting".equals(s)) {
            jsonEnterEmail.d = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
        }
        else if ("hint_text".equals(s)) {
            jsonEnterEmail.c = tge.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonEnterEmail.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonEnterEmail.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonEnterEmail.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("settings".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList g = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final wqp wqp = (wqp)LoganSquare.typeConverterFor((Class)wqp.class).parse(tge);
                    if (wqp != null) {
                        g.add(wqp);
                    }
                }
                jsonEnterEmail.g = g;
            }
            else {
                jsonEnterEmail.g = null;
            }
        }
        else if ("skip_link".equals(s)) {
            jsonEnterEmail.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonEnterEmail parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEnterEmail jsonEnterEmail, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEnterEmail, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEnterEmail)o, afe, b);
    }
}
