// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterUsername$$JsonObjectMapper extends JsonMapper<JsonEnterUsername>
{
    public static JsonEnterUsername _parse(final tge tge) throws IOException {
        final JsonEnterUsername jsonEnterUsername = new JsonEnterUsername();
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
            parseField(jsonEnterUsername, d, tge);
            tge.l0();
        }
        return jsonEnterUsername;
    }
    
    public static void _serialize(final JsonEnterUsername jsonEnterUsername, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonEnterUsername.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterUsername.f, "cancel_link", true, afe);
        }
        if (jsonEnterUsername.h != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterUsername.h, afe, true);
        }
        final ArrayList d = jsonEnterUsername.d;
        if (d != null) {
            final Iterator a = br.A(afe, "detail_texts", d);
            while (a.hasNext()) {
                final JsonOcfRichText jsonOcfRichText = a.next();
                if (jsonOcfRichText != null) {
                    JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfRichText, afe, true);
                }
            }
            afe.f();
        }
        afe.t0("hint", jsonEnterUsername.c);
        if (jsonEnterUsername.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterUsername.e, "next_link", true, afe);
        }
        if (jsonEnterUsername.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterUsername.a, afe, true);
        }
        if (jsonEnterUsername.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterUsername.b, afe, true);
        }
        if (jsonEnterUsername.g != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterUsername.g, "skip_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEnterUsername jsonEnterUsername, final String s, final tge tge) throws IOException {
        if ("cancel_link".equals(s)) {
            jsonEnterUsername.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("component_collection".equals(s)) {
            jsonEnterUsername.h = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_texts".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonOcfRichText parse = JsonOcfRichText$$JsonObjectMapper._parse(tge);
                    if (parse != null) {
                        d.add(parse);
                    }
                }
                jsonEnterUsername.d = d;
            }
            else {
                jsonEnterUsername.d = null;
            }
        }
        else if ("hint".equals(s)) {
            jsonEnterUsername.c = tge.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonEnterUsername.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonEnterUsername.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonEnterUsername.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("skip_link".equals(s)) {
            jsonEnterUsername.g = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonEnterUsername parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEnterUsername jsonEnterUsername, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEnterUsername, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEnterUsername)o, afe, b);
    }
}
