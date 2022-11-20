// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonInterestPicker$$JsonObjectMapper extends JsonMapper<JsonInterestPicker>
{
    public static final zvd INTEREST_SOURCE_TYPE_CONVERTER;
    
    static {
        INTEREST_SOURCE_TYPE_CONVERTER = new zvd();
    }
    
    public static JsonInterestPicker _parse(final tge tge) throws IOException {
        final JsonInterestPicker jsonInterestPicker = new JsonInterestPicker();
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
            parseField(jsonInterestPicker, d, tge);
            tge.l0();
        }
        return jsonInterestPicker;
    }
    
    public static void _serialize(final JsonInterestPicker jsonInterestPicker, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonInterestPicker.l != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonInterestPicker.l, afe, true);
        }
        afe.t0("custom_interests_header", jsonInterestPicker.g);
        final String h = jsonInterestPicker.h;
        if (h != null) {
            ((StringBasedTypeConverter)JsonInterestPicker$$JsonObjectMapper.INTEREST_SOURCE_TYPE_CONVERTER).serialize((Object)h, "custom_interests_source", true, afe);
        }
        final ArrayList d = jsonInterestPicker.d;
        if (d != null) {
            final Iterator a = br.A(afe, "groups", d);
            while (a.hasNext()) {
                final uud uud = a.next();
                if (uud != null) {
                    LoganSquare.typeConverterFor((Class)uud.class).serialize((Object)uud, "lslocalgroupsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.e("hide_search", jsonInterestPicker.k);
        afe.t0("hint", jsonInterestPicker.f);
        if (jsonInterestPicker.i != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonInterestPicker.i, "next_link", true, afe);
        }
        if (jsonInterestPicker.a != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonInterestPicker.a, afe, true);
        }
        if (jsonInterestPicker.c != null) {
            afe.i("search_header_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonInterestPicker.c, afe, true);
        }
        if (jsonInterestPicker.b != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonInterestPicker.b, afe, true);
        }
        final ArrayList e = jsonInterestPicker.e;
        if (e != null) {
            final Iterator a2 = br.A(afe, "selected_items", e);
            while (a2.hasNext()) {
                afe.r0((String)a2.next());
            }
            afe.f();
        }
        if (jsonInterestPicker.j != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonInterestPicker.j, "skip_link", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonInterestPicker jsonInterestPicker, final String s, final tge tge) throws IOException {
        if ("component_collection".equals(s)) {
            jsonInterestPicker.l = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("custom_interests_header".equals(s)) {
            jsonInterestPicker.g = tge.T((String)null);
        }
        else if ("custom_interests_source".equals(s)) {
            jsonInterestPicker.h = (String)((StringBasedTypeConverter)JsonInterestPicker$$JsonObjectMapper.INTEREST_SOURCE_TYPE_CONVERTER).parse(tge);
        }
        else if ("groups".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final uud uud = (uud)LoganSquare.typeConverterFor((Class)uud.class).parse(tge);
                    if (uud != null) {
                        d.add(uud);
                    }
                }
                jsonInterestPicker.d = d;
            }
            else {
                jsonInterestPicker.d = null;
            }
        }
        else if ("hide_search".equals(s)) {
            jsonInterestPicker.k = tge.k();
        }
        else if ("hint".equals(s)) {
            jsonInterestPicker.f = tge.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonInterestPicker.i = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonInterestPicker.a = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("search_header_text".equals(s)) {
            jsonInterestPicker.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonInterestPicker.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("selected_items".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t = tge.T((String)null);
                    if (t != null) {
                        e.add(t);
                    }
                }
                jsonInterestPicker.e = e;
            }
            else {
                jsonInterestPicker.e = null;
            }
        }
        else if ("skip_link".equals(s)) {
            jsonInterestPicker.j = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
    }
    
    public JsonInterestPicker parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonInterestPicker jsonInterestPicker, final afe afe, final boolean b) throws IOException {
        _serialize(jsonInterestPicker, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonInterestPicker)o, afe, b);
    }
}
