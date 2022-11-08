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
    public static final j94 CHOICE_SELECTION_STYLE_TYPE_CONVERTER;
    
    static {
        CHOICE_SELECTION_STYLE_TYPE_CONVERTER = new j94();
    }
    
    public static JsonChoiceSelection _parse(final khe khe) throws IOException {
        final JsonChoiceSelection jsonChoiceSelection = new JsonChoiceSelection();
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
            parseField(jsonChoiceSelection, d, khe);
            khe.m0();
        }
        return jsonChoiceSelection;
    }
    
    public static void _serialize(final JsonChoiceSelection jsonChoiceSelection, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonChoiceSelection.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "choices", a);
            while (g.hasNext()) {
                final t94 t94 = g.next();
                if (t94 != null) {
                    LoganSquare.typeConverterFor((Class)t94.class).serialize((Object)t94, "lslocalchoicesElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonChoiceSelection.o != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonChoiceSelection.o, tfe, true);
        }
        if (jsonChoiceSelection.i != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceSelection.i, tfe, true);
        }
        if (jsonChoiceSelection.n != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonChoiceSelection.n, "header", true, tfe);
        }
        if (jsonChoiceSelection.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonChoiceSelection.e, "next_link", true, tfe);
        }
        if (jsonChoiceSelection.g != null) {
            LoganSquare.typeConverterFor((Class)abi.class).serialize((Object)jsonChoiceSelection.g, "next_link_options", true, tfe);
        }
        if (jsonChoiceSelection.m != null) {
            LoganSquare.typeConverterFor((Class)tdj.class).serialize((Object)jsonChoiceSelection.m, "primary_selection", true, tfe);
        }
        if (jsonChoiceSelection.c != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceSelection.c, tfe, true);
        }
        if (jsonChoiceSelection.k != null) {
            LoganSquare.typeConverterFor((Class)h94.class).serialize((Object)jsonChoiceSelection.k, "search", true, tfe);
        }
        if (jsonChoiceSelection.d != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonChoiceSelection.d, tfe, true);
        }
        final ArrayList h = jsonChoiceSelection.h;
        if (h != null) {
            final Iterator g2 = q1a.g(tfe, "selected_choices", h);
            while (g2.hasNext()) {
                tfe.s0((String)g2.next());
            }
            tfe.f();
        }
        tfe.u0("selection_type", jsonChoiceSelection.b);
        if (jsonChoiceSelection.l != null) {
            LoganSquare.typeConverterFor((Class)ioh.class).serialize((Object)jsonChoiceSelection.l, "show_more", true, tfe);
        }
        if (jsonChoiceSelection.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonChoiceSelection.f, "skip_link", true, tfe);
        }
        final i94 j = jsonChoiceSelection.j;
        if (j != null) {
            ((StringBasedTypeConverter)JsonChoiceSelection$$JsonObjectMapper.CHOICE_SELECTION_STYLE_TYPE_CONVERTER).serialize((Object)j, "style", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonChoiceSelection jsonChoiceSelection, final String s, final khe khe) throws IOException {
        if ("choices".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final t94 t94 = (t94)LoganSquare.typeConverterFor((Class)t94.class).parse(khe);
                    if (t94 != null) {
                        a.add(t94);
                    }
                }
                jsonChoiceSelection.a = a;
            }
            else {
                jsonChoiceSelection.a = null;
            }
        }
        else if ("component_collection".equals(s)) {
            jsonChoiceSelection.o = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonChoiceSelection.i = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("header".equals(s)) {
            jsonChoiceSelection.n = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonChoiceSelection.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("next_link_options".equals(s)) {
            jsonChoiceSelection.g = (abi)LoganSquare.typeConverterFor((Class)abi.class).parse(khe);
        }
        else if ("primary_selection".equals(s)) {
            jsonChoiceSelection.m = (tdj)LoganSquare.typeConverterFor((Class)tdj.class).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonChoiceSelection.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("search".equals(s)) {
            jsonChoiceSelection.k = (h94)LoganSquare.typeConverterFor((Class)h94.class).parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonChoiceSelection.d = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("selected_choices".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList h = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final String t95 = khe.T((String)null);
                    if (t95 != null) {
                        h.add(t95);
                    }
                }
                jsonChoiceSelection.h = h;
            }
            else {
                jsonChoiceSelection.h = null;
            }
        }
        else if ("selection_type".equals(s)) {
            jsonChoiceSelection.b = khe.T((String)null);
        }
        else if ("show_more".equals(s)) {
            jsonChoiceSelection.l = (ioh)LoganSquare.typeConverterFor((Class)ioh.class).parse(khe);
        }
        else if ("skip_link".equals(s)) {
            jsonChoiceSelection.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("style".equals(s)) {
            jsonChoiceSelection.j = (i94)((StringBasedTypeConverter)JsonChoiceSelection$$JsonObjectMapper.CHOICE_SELECTION_STYLE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonChoiceSelection parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonChoiceSelection jsonChoiceSelection, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonChoiceSelection, tfe, b);
    }
}
