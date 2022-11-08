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
    public static final e53 BUTTON_LOCATION_TYPE_CONVERTER;
    public static final q53 BUTTON_STYLE_TYPE_CONVERTER;
    public static final a87 CTA_STYLE_TYPE_CONVERTER;
    public static final tds TEXT_ALIGNMENT_TYPE_CONVERTER;
    
    static {
        BUTTON_STYLE_TYPE_CONVERTER = new q53();
        CTA_STYLE_TYPE_CONVERTER = new a87();
        TEXT_ALIGNMENT_TYPE_CONVERTER = new tds();
        BUTTON_LOCATION_TYPE_CONVERTER = new e53();
    }
    
    public static JsonCta _parse(final khe khe) throws IOException {
        final JsonCta jsonCta = new JsonCta();
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
            parseField(jsonCta, d, khe);
            khe.m0();
        }
        return jsonCta;
    }
    
    public static void _serialize(final JsonCta jsonCta, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.BUTTON_LOCATION_TYPE_CONVERTER).serialize((Object)jsonCta.j, "button_location", true, tfe);
        final ArrayList m = jsonCta.m;
        if (m != null) {
            final Iterator g = q1a.g(tfe, "buttons", m);
            while (g.hasNext()) {
                final ecj ecj = g.next();
                if (ecj != null) {
                    LoganSquare.typeConverterFor((Class)ecj.class).serialize((Object)ecj, "lslocalbuttonsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (jsonCta.o != null) {
            tfe.i("component_collection");
            JsonOcfComponentCollection$$JsonObjectMapper._serialize(jsonCta.o, tfe, true);
        }
        if (jsonCta.d != null) {
            tfe.i("detail_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonCta.d, tfe, true);
        }
        if (jsonCta.n != null) {
            tfe.i("footer_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonCta.n, tfe, true);
        }
        if (jsonCta.a != null) {
            LoganSquare.typeConverterFor((Class)iej.class).serialize((Object)jsonCta.a, "header", true, tfe);
        }
        if (jsonCta.l != null) {
            LoganSquare.typeConverterFor((Class)kdj.class).serialize((Object)jsonCta.l, "header_image", true, tfe);
        }
        if (jsonCta.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonCta.e, "primary_action_link", true, tfe);
        }
        final q53 button_STYLE_TYPE_CONVERTER = JsonCta$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER;
        ((StringBasedTypeConverter)button_STYLE_TYPE_CONVERTER).serialize((Object)jsonCta.g, "primary_action_style", true, tfe);
        if (jsonCta.b != null) {
            tfe.i("primary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonCta.b, tfe, true);
        }
        if (jsonCta.f != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonCta.f, "secondary_action_link", true, tfe);
        }
        ((StringBasedTypeConverter)button_STYLE_TYPE_CONVERTER).serialize((Object)jsonCta.h, "secondary_action_style", true, tfe);
        if (jsonCta.c != null) {
            tfe.i("secondary_text");
            JsonOcfRichText$$JsonObjectMapper._serialize(jsonCta.c, tfe, true);
        }
        ((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.CTA_STYLE_TYPE_CONVERTER).serialize((Object)jsonCta.k, "style", true, tfe);
        ((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.TEXT_ALIGNMENT_TYPE_CONVERTER).serialize((Object)jsonCta.i, "text_alignment", true, tfe);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCta jsonCta, final String s, final khe khe) throws IOException {
        if ("button_location".equals(s)) {
            jsonCta.j = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.BUTTON_LOCATION_TYPE_CONVERTER).parse(khe);
        }
        else if ("buttons".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList m = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final ecj ecj = (ecj)LoganSquare.typeConverterFor((Class)ecj.class).parse(khe);
                    if (ecj != null) {
                        m.add(ecj);
                    }
                }
                jsonCta.m = m;
            }
            else {
                jsonCta.m = null;
            }
        }
        else if ("component_collection".equals(s)) {
            jsonCta.o = JsonOcfComponentCollection$$JsonObjectMapper._parse(khe);
        }
        else if ("detail_text".equals(s)) {
            jsonCta.d = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("footer_text".equals(s)) {
            jsonCta.n = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("header".equals(s)) {
            jsonCta.a = (iej)LoganSquare.typeConverterFor((Class)iej.class).parse(khe);
        }
        else if ("header_image".equals(s)) {
            jsonCta.l = (kdj)LoganSquare.typeConverterFor((Class)kdj.class).parse(khe);
        }
        else if ("primary_action_link".equals(s)) {
            jsonCta.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("primary_action_style".equals(s)) {
            jsonCta.g = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).parse(khe);
        }
        else if ("primary_text".equals(s)) {
            jsonCta.b = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("secondary_action_link".equals(s)) {
            jsonCta.f = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("secondary_action_style".equals(s)) {
            jsonCta.h = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.BUTTON_STYLE_TYPE_CONVERTER).parse(khe);
        }
        else if ("secondary_text".equals(s)) {
            jsonCta.c = JsonOcfRichText$$JsonObjectMapper._parse(khe);
        }
        else if ("style".equals(s)) {
            jsonCta.k = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.CTA_STYLE_TYPE_CONVERTER).parse(khe);
        }
        else if ("text_alignment".equals(s)) {
            jsonCta.i = (int)((StringBasedTypeConverter)JsonCta$$JsonObjectMapper.TEXT_ALIGNMENT_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonCta parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCta jsonCta, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCta, tfe, b);
    }
}
