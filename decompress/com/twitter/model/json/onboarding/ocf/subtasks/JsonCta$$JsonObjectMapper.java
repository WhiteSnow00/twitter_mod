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

public final class JsonCta$$JsonObjectMapper extends JsonMapper<JsonCta>
{
    public static final v43 BUTTON_LOCATION_TYPE_CONVERTER;
    public static final h53 BUTTON_STYLE_TYPE_CONVERTER;
    public static final e77 CTA_STYLE_TYPE_CONVERTER;
    public static final oes TEXT_ALIGNMENT_TYPE_CONVERTER;
    
    static {
        BUTTON_STYLE_TYPE_CONVERTER = new h53();
        CTA_STYLE_TYPE_CONVERTER = new e77();
        TEXT_ALIGNMENT_TYPE_CONVERTER = new oes();
        BUTTON_LOCATION_TYPE_CONVERTER = new v43();
    }
    
    public static JsonCta _parse(final tge tge) throws IOException {
        final JsonCta jsonCta = new JsonCta();
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
            parseField(jsonCta, d, tge);
            tge.l0();
        }
        return jsonCta;
    }
    
    public static void _serialize(final JsonCta jsonCta, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.BUTTON_LOCATION_TYPE_CONVERTER).serialize((Object)jsonCta.j, "button_location", true, afe);
        final ArrayList m = jsonCta.m;
        if (m != null) {
            final Iterator a = br.A(afe, "buttons", m);
            while (a.hasNext()) {
                final jcj jcj = a.next();
                if (jcj != null) {
                    LoganSquare.typeConverterFor((Class)jcj.class).serialize((Object)jcj, "lslocalbuttonsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonCta.o != null) {
            afe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonCta.o, afe, true);
        }
        if (jsonCta.d != null) {
            afe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonCta.d, afe, true);
        }
        if (jsonCta.n != null) {
            afe.i("footer_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonCta.n, afe, true);
        }
        if (jsonCta.a != null) {
            LoganSquare.typeConverterFor((Class)oej.class).serialize((Object)jsonCta.a, "header", true, afe);
        }
        if (jsonCta.l != null) {
            LoganSquare.typeConverterFor((Class)pdj.class).serialize((Object)jsonCta.l, "header_image", true, afe);
        }
        if (jsonCta.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonCta.e, "primary_action_link", true, afe);
        }
        final h53 button_STYLE_TYPE_CONVERTER = JsonCta$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER;
        ((StringBasedTypeConverter)button_STYLE_TYPE_CONVERTER).serialize((Object)jsonCta.g, "primary_action_style", true, afe);
        if (jsonCta.b != null) {
            afe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonCta.b, afe, true);
        }
        if (jsonCta.f != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonCta.f, "secondary_action_link", true, afe);
        }
        ((StringBasedTypeConverter)button_STYLE_TYPE_CONVERTER).serialize((Object)jsonCta.h, "secondary_action_style", true, afe);
        if (jsonCta.c != null) {
            afe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonCta.c, afe, true);
        }
        ((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.CTA_STYLE_TYPE_CONVERTER).serialize((Object)jsonCta.k, "style", true, afe);
        ((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.TEXT_ALIGNMENT_TYPE_CONVERTER).serialize((Object)jsonCta.i, "text_alignment", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCta jsonCta, final String s, final tge tge) throws IOException {
        if ("button_location".equals(s)) {
            jsonCta.j = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.BUTTON_LOCATION_TYPE_CONVERTER).parse(tge);
        }
        else if ("buttons".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList m = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final jcj jcj = (jcj)LoganSquare.typeConverterFor((Class)jcj.class).parse(tge);
                    if (jcj != null) {
                        m.add(jcj);
                    }
                }
                jsonCta.m = m;
            }
            else {
                jsonCta.m = null;
            }
        }
        else if ("component_collection".equals(s)) {
            jsonCta.o = JsonOcfComponentCollection$$JsonObjectMapper._parse(tge);
        }
        else if ("detail_text".equals(s)) {
            jsonCta.d = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("footer_text".equals(s)) {
            jsonCta.n = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("header".equals(s)) {
            jsonCta.a = (oej)LoganSquare.typeConverterFor((Class)oej.class).parse(tge);
        }
        else if ("header_image".equals(s)) {
            jsonCta.l = (pdj)LoganSquare.typeConverterFor((Class)pdj.class).parse(tge);
        }
        else if ("primary_action_link".equals(s)) {
            jsonCta.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("primary_action_style".equals(s)) {
            jsonCta.g = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).parse(tge);
        }
        else if ("primary_text".equals(s)) {
            jsonCta.b = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("secondary_action_link".equals(s)) {
            jsonCta.f = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("secondary_action_style".equals(s)) {
            jsonCta.h = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).parse(tge);
        }
        else if ("secondary_text".equals(s)) {
            jsonCta.c = JsonOcfRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("style".equals(s)) {
            jsonCta.k = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.CTA_STYLE_TYPE_CONVERTER).parse(tge);
        }
        else if ("text_alignment".equals(s)) {
            jsonCta.i = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.TEXT_ALIGNMENT_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonCta parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCta jsonCta, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCta, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCta)o, afe, b);
    }
}
