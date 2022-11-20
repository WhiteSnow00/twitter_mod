// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonEnterDate$$JsonObjectMapper extends JsonMapper<JsonEnterDate>
{
    public static JsonEnterDate _parse(final tge tge) throws IOException {
        final JsonEnterDate jsonEnterDate = new JsonEnterDate();
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
            parseField(jsonEnterDate, d, tge);
            tge.l0();
        }
        return jsonEnterDate;
    }
    
    public static void _serialize(final JsonEnterDate jsonEnterDate, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonEnterDate.k != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterDate.k, afe, true);
        }
        if (jsonEnterDate.b != null) {
            LoganSquare.typeConverterFor((Class)pcj.class).serialize((Object)jsonEnterDate.b, "date", true, afe);
        }
        if (jsonEnterDate.h != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterDate.h, afe, true);
        }
        if (jsonEnterDate.a != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonEnterDate.a, "header", true, afe);
        }
        afe.t0("hint_text", jsonEnterDate.g);
        if (jsonEnterDate.f != null) {
            afe.i("max_date_error");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterDate.f, afe, true);
        }
        if (jsonEnterDate.e != null) {
            afe.i("min_date_error");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterDate.e, afe, true);
        }
        if (jsonEnterDate.i != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterDate.i, "next_link", true, afe);
        }
        if (jsonEnterDate.c != null) {
            LoganSquare.typeConverterFor((Class)q98.class).serialize((Object)jsonEnterDate.c, "selectable_interval", true, afe);
        }
        if (jsonEnterDate.j != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonEnterDate.j, "skip_link", true, afe);
        }
        if (jsonEnterDate.d != null) {
            LoganSquare.typeConverterFor((Class)q98.class).serialize((Object)jsonEnterDate.d, "valid_interval", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonEnterDate jsonEnterDate, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonEnterDate.k = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("date".equals(s)) {
            jsonEnterDate.b = (pcj)LoganSquare.typeConverterFor((Class)pcj.class).parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonEnterDate.h = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("header".equals(s)) {
            jsonEnterDate.a = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("hint_text".equals(s)) {
            jsonEnterDate.g = tge.T((String)null);
        }
        else if ("max_date_error".equals(s)) {
            jsonEnterDate.f = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("min_date_error".equals(s)) {
            jsonEnterDate.e = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonEnterDate.i = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("selectable_interval".equals(s)) {
            jsonEnterDate.c = (q98)LoganSquare.typeConverterFor((Class)q98.class).parse(tge);
        }
        else if ("skip_link".equals(s)) {
            jsonEnterDate.j = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("valid_interval".equals(s)) {
            jsonEnterDate.d = (q98)LoganSquare.typeConverterFor((Class)q98.class).parse(tge);
        }
    }
    
    public JsonEnterDate parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonEnterDate jsonEnterDate, final afe afe, final boolean b) throws IOException {
        _serialize(jsonEnterDate, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonEnterDate)o, afe, b);
    }
}
