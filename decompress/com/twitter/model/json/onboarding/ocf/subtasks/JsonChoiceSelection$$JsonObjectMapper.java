// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfRichText$$JsonObjectMapper;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection$$JsonObjectMapper;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonChoiceSelection$$JsonObjectMapper extends JsonMapper<JsonChoiceSelection>
{
    public static final m84 CHOICE_SELECTION_STYLE_TYPE_CONVERTER;
    
    static {
        CHOICE_SELECTION_STYLE_TYPE_CONVERTER = new m84();
    }
    
    public static JsonChoiceSelection _parse(final tge tge) throws IOException {
        final JsonChoiceSelection jsonChoiceSelection = new JsonChoiceSelection();
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
            parseField(jsonChoiceSelection, d, tge);
            tge.l0();
        }
        return jsonChoiceSelection;
    }
    
    public static void _serialize(final JsonChoiceSelection jsonChoiceSelection, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList a = jsonChoiceSelection.a;
        if (a != null) {
            final Iterator a2 = br.A(afe, "choices", a);
            while (a2.hasNext()) {
                final v84 v84 = a2.next();
                if (v84 != null) {
                    LoganSquare.typeConverterFor((Class)v84.class).serialize((Object)v84, "lslocalchoicesElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonChoiceSelection.o != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonChoiceSelection.o, afe, true);
        }
        if (jsonChoiceSelection.i != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceSelection.i, afe, true);
        }
        if (jsonChoiceSelection.n != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonChoiceSelection.n, "header", true, afe);
        }
        if (jsonChoiceSelection.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonChoiceSelection.e, "next_link", true, afe);
        }
        if (jsonChoiceSelection.g != null) {
            LoganSquare.typeConverterFor((Class)cbi.class).serialize((Object)jsonChoiceSelection.g, "next_link_options", true, afe);
        }
        if (jsonChoiceSelection.m != null) {
            LoganSquare.typeConverterFor((Class)ydj.class).serialize((Object)jsonChoiceSelection.m, "primary_selection", true, afe);
        }
        if (jsonChoiceSelection.c != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceSelection.c, afe, true);
        }
        if (jsonChoiceSelection.k != null) {
            LoganSquare.typeConverterFor((Class)k84.class).serialize((Object)jsonChoiceSelection.k, "search", true, afe);
        }
        if (jsonChoiceSelection.d != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceSelection.d, afe, true);
        }
        final ArrayList h = jsonChoiceSelection.h;
        if (h != null) {
            final Iterator a3 = br.A(afe, "selected_choices", h);
            while (a3.hasNext()) {
                afe.r0((String)a3.next());
            }
            afe.f();
        }
        afe.t0("selection_type", jsonChoiceSelection.b);
        if (jsonChoiceSelection.l != null) {
            LoganSquare.typeConverterFor((Class)noh.class).serialize((Object)jsonChoiceSelection.l, "show_more", true, afe);
        }
        if (jsonChoiceSelection.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonChoiceSelection.f, "skip_link", true, afe);
        }
        final l84 j = jsonChoiceSelection.j;
        if (j != null) {
            ((StringBasedTypeConverter)JsonChoiceSelection$$JsonObjectMapper.CHOICE_SELECTION_STYLE_TYPE_CONVERTER).serialize((Object)j, "style", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonChoiceSelection jsonChoiceSelection, final String s, final tge tge) throws IOException {
        if ("choices".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList a = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final v84 v84 = (v84)LoganSquare.typeConverterFor((Class)v84.class).parse(tge);
                    if (v84 != null) {
                        a.add(v84);
                    }
                }
                jsonChoiceSelection.a = a;
            }
            else {
                jsonChoiceSelection.a = null;
            }
        }
        else if ("component_collection".equals(s)) {
            jsonChoiceSelection.o = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonChoiceSelection.i = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("header".equals(s)) {
            jsonChoiceSelection.n = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonChoiceSelection.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("next_link_options".equals(s)) {
            jsonChoiceSelection.g = (cbi)LoganSquare.typeConverterFor((Class)cbi.class).parse(tge);
        }
        else if ("primary_selection".equals(s)) {
            jsonChoiceSelection.m = (ydj)LoganSquare.typeConverterFor((Class)ydj.class).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonChoiceSelection.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("search".equals(s)) {
            jsonChoiceSelection.k = (k84)LoganSquare.typeConverterFor((Class)k84.class).parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonChoiceSelection.d = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("selected_choices".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList h = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t = tge.T((String)null);
                    if (t != null) {
                        h.add(t);
                    }
                }
                jsonChoiceSelection.h = h;
            }
            else {
                jsonChoiceSelection.h = null;
            }
        }
        else if ("selection_type".equals(s)) {
            jsonChoiceSelection.b = tge.T((String)null);
        }
        else if ("show_more".equals(s)) {
            jsonChoiceSelection.l = (noh)LoganSquare.typeConverterFor((Class)noh.class).parse(tge);
        }
        else if ("skip_link".equals(s)) {
            jsonChoiceSelection.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("style".equals(s)) {
            jsonChoiceSelection.j = (l84)((StringBasedTypeConverter)JsonChoiceSelection$$JsonObjectMapper.CHOICE_SELECTION_STYLE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonChoiceSelection parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonChoiceSelection jsonChoiceSelection, final afe afe, final boolean b) throws IOException {
        _serialize(jsonChoiceSelection, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonChoiceSelection)o, afe, b);
    }
}
