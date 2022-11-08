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
    public static JsonEnterUsername _parse(final khe khe) throws IOException {
        final JsonEnterUsername jsonEnterUsername = new JsonEnterUsername();
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
            parseField(jsonEnterUsername, d, khe);
            khe.m0();
        }
        return jsonEnterUsername;
    }
    
    public static void _serialize(final JsonEnterUsername jsonEnterUsername, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonEnterUsername.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterUsername.f, "cancel_link", true, tfe);
        }
        if (jsonEnterUsername.h != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterUsername.h, tfe, true);
        }
        final ArrayList d = jsonEnterUsername.d;
        if (d != null) {
            final Iterator g = q1a.g(tfe, "detail_texts", d);
            while (g.hasNext()) {
                final JsonOcfRichText jsonOcfRichText = g.next();
                if (jsonOcfRichText != null) {
                    JsonOcfRichText$$JsonObjectMapper._serialize(jsonOcfRichText, tfe, true);
                }
            }
            tfe.f();
        }
        tfe.u0("hint", jsonEnterUsername.c);
        if (jsonEnterUsername.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterUsername.e, "next_link", true, tfe);
        }
        if (jsonEnterUsername.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterUsername.a, tfe, true);
        }
        if (jsonEnterUsername.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterUsername.b, tfe, true);
        }
        if (jsonEnterUsername.g != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterUsername.g, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterUsername jsonEnterUsername, final String s, final khe khe) throws IOException {
        if ("cancel_link".equals(s)) {
            jsonEnterUsername.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("component_collection".equals(s)) {
            jsonEnterUsername.h = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_texts".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonOcfRichText parse = JsonOcfRichText$$JsonObjectMapper._parse(khe);
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
            jsonEnterUsername.c = khe.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonEnterUsername.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonEnterUsername.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonEnterUsername.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonEnterUsername.g = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonEnterUsername parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterUsername jsonEnterUsername, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterUsername, tfe, b);
    }
}
