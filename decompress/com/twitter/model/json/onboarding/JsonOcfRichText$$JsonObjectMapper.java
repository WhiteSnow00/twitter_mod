// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfRichText$$JsonObjectMapper extends JsonMapper<JsonOcfRichText>
{
    public static final hks TEXT_SIZE_TYPE_CONVERTER;
    public static final mks TEXT_STYLE_TYPE_CONVERTER;
    
    static {
        TEXT_STYLE_TYPE_CONVERTER = new mks();
        TEXT_SIZE_TYPE_CONVERTER = new hks();
    }
    
    public static JsonOcfRichText _parse(final qhe qhe) throws IOException {
        final JsonOcfRichText jsonOcfRichText = new JsonOcfRichText();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonOcfRichText, d, qhe);
            qhe.m0();
        }
        return jsonOcfRichText;
    }
    
    public static void _serialize(final JsonOcfRichText jsonOcfRichText, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList b2 = jsonOcfRichText.b;
        if (b2 != null) {
            final Iterator e = d10.E(yfe, "entities", b2);
            while (e.hasNext()) {
                final JsonOcfEntity jsonOcfEntity = e.next();
                if (jsonOcfEntity != null) {
                    JsonOcfEntity$$JsonObjectMapper._serialize(jsonOcfEntity, yfe, true);
                }
            }
            yfe.f();
        }
        ((StringBasedTypeConverter)JsonOcfRichText$$JsonObjectMapper.TEXT_SIZE_TYPE_CONVERTER).serialize((Object)jsonOcfRichText.e, "size", true, yfe);
        ((StringBasedTypeConverter)JsonOcfRichText$$JsonObjectMapper.TEXT_STYLE_TYPE_CONVERTER).serialize((Object)jsonOcfRichText.d, "style", true, yfe);
        final ArrayList c = jsonOcfRichText.c;
        if (c != null) {
            final Iterator e2 = d10.E(yfe, "styling_ranges", c);
            while (e2.hasNext()) {
                final JsonOcfStylingRange jsonOcfStylingRange = e2.next();
                if (jsonOcfStylingRange != null) {
                    JsonOcfStylingRange$$JsonObjectMapper._serialize(jsonOcfStylingRange, yfe, true);
                }
            }
            yfe.f();
        }
        yfe.u0("text", jsonOcfRichText.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfRichText jsonOcfRichText, final String s, final qhe qhe) throws IOException {
        if ("entities".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList b = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonOcfEntity parse = JsonOcfEntity$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        b.add(parse);
                    }
                }
                jsonOcfRichText.b = b;
            }
            else {
                jsonOcfRichText.b = null;
            }
        }
        else if ("size".equals(s)) {
            jsonOcfRichText.e = (int)((StringBasedTypeConverter)JsonOcfRichText$$JsonObjectMapper.TEXT_SIZE_TYPE_CONVERTER).parse(qhe);
        }
        else if ("style".equals(s)) {
            jsonOcfRichText.d = (int)((StringBasedTypeConverter)JsonOcfRichText$$JsonObjectMapper.TEXT_STYLE_TYPE_CONVERTER).parse(qhe);
        }
        else if ("styling_ranges".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonOcfStylingRange parse2 = JsonOcfStylingRange$$JsonObjectMapper._parse(qhe);
                    if (parse2 != null) {
                        c.add(parse2);
                    }
                }
                jsonOcfRichText.c = c;
            }
            else {
                jsonOcfRichText.c = null;
            }
        }
        else if ("text".equals(s)) {
            jsonOcfRichText.a = qhe.T((String)null);
        }
    }
    
    public JsonOcfRichText parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfRichText jsonOcfRichText, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfRichText, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfRichText)o, yfe, b);
    }
}
