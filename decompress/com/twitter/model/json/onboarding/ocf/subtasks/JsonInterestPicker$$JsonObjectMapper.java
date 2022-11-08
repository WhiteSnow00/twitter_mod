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
    public static final wwd INTEREST_SOURCE_TYPE_CONVERTER;
    
    static {
        INTEREST_SOURCE_TYPE_CONVERTER = new wwd();
    }
    
    public static JsonInterestPicker _parse(final khe khe) throws IOException {
        final JsonInterestPicker jsonInterestPicker = new JsonInterestPicker();
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
            parseField(jsonInterestPicker, d, khe);
            khe.m0();
        }
        return jsonInterestPicker;
    }
    
    public static void _serialize(final JsonInterestPicker jsonInterestPicker, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonInterestPicker.l != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonInterestPicker.l, tfe, true);
        }
        tfe.u0("custom_interests_header", jsonInterestPicker.g);
        final String h = jsonInterestPicker.h;
        if (h != null) {
            ((StringBasedTypeConverter)JsonInterestPicker$$JsonObjectMapper.INTEREST_SOURCE_TYPE_CONVERTER).serialize((Object)h, "custom_interests_source", true, tfe);
        }
        final ArrayList d = jsonInterestPicker.d;
        if (d != null) {
            final Iterator g = q1a.g(tfe, "groups", d);
            while (g.hasNext()) {
                final rvd rvd = g.next();
                if (rvd != null) {
                    LoganSquare.typeConverterFor((Class)rvd.class).serialize((Object)rvd, "lslocalgroupsElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.e("hide_search", jsonInterestPicker.k);
        tfe.u0("hint", jsonInterestPicker.f);
        if (jsonInterestPicker.i != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonInterestPicker.i, "next_link", true, tfe);
        }
        if (jsonInterestPicker.a != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonInterestPicker.a, tfe, true);
        }
        if (jsonInterestPicker.c != null) {
            tfe.i("search_header_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonInterestPicker.c, tfe, true);
        }
        if (jsonInterestPicker.b != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonInterestPicker.b, tfe, true);
        }
        final ArrayList e = jsonInterestPicker.e;
        if (e != null) {
            final Iterator g2 = q1a.g(tfe, "selected_items", e);
            while (g2.hasNext()) {
                tfe.s0((String)g2.next());
            }
            tfe.f();
        }
        if (jsonInterestPicker.j != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonInterestPicker.j, "skip_link", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonInterestPicker jsonInterestPicker, final String s, final khe khe) throws IOException {
        if ("component_collection".equals(s)) {
            jsonInterestPicker.l = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("custom_interests_header".equals(s)) {
            jsonInterestPicker.g = khe.T((String)null);
        }
        else if ("custom_interests_source".equals(s)) {
            jsonInterestPicker.h = (String)((StringBasedTypeConverter)JsonInterestPicker$$JsonObjectMapper.INTEREST_SOURCE_TYPE_CONVERTER).parse(khe);
        }
        else if ("groups".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList d = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final rvd rvd = (rvd)LoganSquare.typeConverterFor((Class)rvd.class).parse(khe);
                    if (rvd != null) {
                        d.add(rvd);
                    }
                }
                jsonInterestPicker.d = d;
            }
            else {
                jsonInterestPicker.d = null;
            }
        }
        else if ("hide_search".equals(s)) {
            jsonInterestPicker.k = khe.k();
        }
        else if ("hint".equals(s)) {
            jsonInterestPicker.f = khe.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonInterestPicker.i = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonInterestPicker.a = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("search_header_text".equals(s)) {
            jsonInterestPicker.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonInterestPicker.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("selected_items".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList e = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final String t = khe.T((String)null);
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
            jsonInterestPicker.j = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
    }
    
    public JsonInterestPicker parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonInterestPicker jsonInterestPicker, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonInterestPicker, tfe, b);
    }
}
