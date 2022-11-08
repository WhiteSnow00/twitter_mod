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
    public static JsonEnterDate _parse(final khe khe) throws IOException {
        final JsonEnterDate jsonEnterDate = new JsonEnterDate();
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
            parseField(jsonEnterDate, d, khe);
            khe.m0();
        }
        return jsonEnterDate;
    }
    
    public static void _serialize(final JsonEnterDate jsonEnterDate, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonEnterDate.k != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonEnterDate.k, tfe, true);
        }
        if (jsonEnterDate.b != null) {
            LoganSquare.typeConverterFor((Class)kcj.class).serialize((Object)jsonEnterDate.b, "date", true, tfe);
        }
        if (jsonEnterDate.h != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterDate.h, tfe, true);
        }
        if (jsonEnterDate.a != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonEnterDate.a, "header", true, tfe);
        }
        tfe.u0("hint_text", jsonEnterDate.g);
        if (jsonEnterDate.f != null) {
            tfe.i("max_date_error");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterDate.f, tfe, true);
        }
        if (jsonEnterDate.e != null) {
            tfe.i("min_date_error");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonEnterDate.e, tfe, true);
        }
        if (jsonEnterDate.i != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterDate.i, "next_link", true, tfe);
        }
        if (jsonEnterDate.c != null) {
            LoganSquare.typeConverterFor((Class)ga8.class).serialize((Object)jsonEnterDate.c, "selectable_interval", true, tfe);
        }
        if (jsonEnterDate.j != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonEnterDate.j, "skip_link", true, tfe);
        }
        if (jsonEnterDate.d != null) {
            LoganSquare.typeConverterFor((Class)ga8.class).serialize((Object)jsonEnterDate.d, "valid_interval", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonEnterDate jsonEnterDate, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonEnterDate.k = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("date".equals(s)) {
            jsonEnterDate.b = (kcj)LoganSquare.typeConverterFor((Class)kcj.class).parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonEnterDate.h = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("header".equals(s)) {
            jsonEnterDate.a = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("hint_text".equals(s)) {
            jsonEnterDate.g = khe.T((String)null);
        }
        else if ("max_date_error".equals(s)) {
            jsonEnterDate.f = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("min_date_error".equals(s)) {
            jsonEnterDate.e = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonEnterDate.i = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("selectable_interval".equals(s)) {
            jsonEnterDate.c = (ga8)LoganSquare.typeConverterFor((Class)ga8.class).parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonEnterDate.j = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("valid_interval".equals(s)) {
            jsonEnterDate.d = (ga8)LoganSquare.typeConverterFor((Class)ga8.class).parse(khe);
        }
    }
    
    public JsonEnterDate parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonEnterDate jsonEnterDate, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonEnterDate, tfe, b);
    }
}
