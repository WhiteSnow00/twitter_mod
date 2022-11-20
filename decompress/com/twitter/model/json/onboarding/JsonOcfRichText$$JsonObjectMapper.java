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
    public static final pjs TEXT_SIZE_TYPE_CONVERTER;
    public static final ujs TEXT_STYLE_TYPE_CONVERTER;
    
    static {
        TEXT_STYLE_TYPE_CONVERTER = new ujs();
        TEXT_SIZE_TYPE_CONVERTER = new pjs();
    }
    
    public static JsonOcfRichText _parse(final tge tge) throws IOException {
        final JsonOcfRichText jsonOcfRichText = new JsonOcfRichText();
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
            parseField(jsonOcfRichText, d, tge);
            tge.l0();
        }
        return jsonOcfRichText;
    }
    
    public static void _serialize(final JsonOcfRichText jsonOcfRichText, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final ArrayList b2 = jsonOcfRichText.b;
        if (b2 != null) {
            final Iterator a = br.A(afe, "entities", b2);
            while (a.hasNext()) {
                final JsonOcfEntity jsonOcfEntity = a.next();
                if (jsonOcfEntity != null) {
                    JsonOcfEntity$$JsonObjectMapper._serialize(jsonOcfEntity, afe, true);
                }
            }
            afe.f();
        }
        ((StringBasedTypeConverter)JsonOcfRichText$$JsonObjectMapper.TEXT_SIZE_TYPE_CONVERTER).serialize((Object)jsonOcfRichText.e, "size", true, afe);
        ((StringBasedTypeConverter)JsonOcfRichText$$JsonObjectMapper.TEXT_STYLE_TYPE_CONVERTER).serialize((Object)jsonOcfRichText.d, "style", true, afe);
        final ArrayList c = jsonOcfRichText.c;
        if (c != null) {
            final Iterator a2 = br.A(afe, "styling_ranges", c);
            while (a2.hasNext()) {
                final JsonOcfStylingRange jsonOcfStylingRange = a2.next();
                if (jsonOcfStylingRange != null) {
                    JsonOcfStylingRange$$JsonObjectMapper._serialize(jsonOcfStylingRange, afe, true);
                }
            }
            afe.f();
        }
        afe.t0("text", jsonOcfRichText.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfRichText jsonOcfRichText, final String s, final tge tge) throws IOException {
        if ("entities".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList b = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonOcfEntity parse = JsonOcfEntity$$JsonObjectMapper._parse(tge);
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
            jsonOcfRichText.e = (int)((StringBasedTypeConverter)JsonOcfRichText$$JsonObjectMapper.TEXT_SIZE_TYPE_CONVERTER).parse(tge);
        }
        else if ("style".equals(s)) {
            jsonOcfRichText.d = (int)((StringBasedTypeConverter)JsonOcfRichText$$JsonObjectMapper.TEXT_STYLE_TYPE_CONVERTER).parse(tge);
        }
        else if ("styling_ranges".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList c = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final JsonOcfStylingRange parse2 = JsonOcfStylingRange$$JsonObjectMapper._parse(tge);
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
            jsonOcfRichText.a = tge.T((String)null);
        }
    }
    
    public JsonOcfRichText parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfRichText jsonOcfRichText, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfRichText, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfRichText)o, afe, b);
    }
}
