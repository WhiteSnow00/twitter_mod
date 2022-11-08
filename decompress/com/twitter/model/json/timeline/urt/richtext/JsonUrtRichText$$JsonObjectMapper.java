// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrtRichText$$JsonObjectMapper extends JsonMapper<JsonUrtRichText>
{
    public static final ywm RICH_TEXT_ALIGNMENT_TYPE_CONVERTER;
    
    static {
        RICH_TEXT_ALIGNMENT_TYPE_CONVERTER = new ywm();
    }
    
    public static JsonUrtRichText _parse(final khe khe) throws IOException {
        final JsonUrtRichText jsonUrtRichText = new JsonUrtRichText();
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
            parseField(jsonUrtRichText, d, khe);
            khe.m0();
        }
        return jsonUrtRichText;
    }
    
    public static void _serialize(final JsonUrtRichText jsonUrtRichText, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonUrtRichText$$JsonObjectMapper.RICH_TEXT_ALIGNMENT_TYPE_CONVERTER).serialize((Object)jsonUrtRichText.c, "alignment", true, tfe);
        final ArrayList b2 = jsonUrtRichText.b;
        if (b2 != null) {
            final Iterator g = q1a.g(tfe, "entities", b2);
            while (g.hasNext()) {
                final JsonUrtRichText$RichTextEntity jsonUrtRichText$RichTextEntity = g.next();
                if (jsonUrtRichText$RichTextEntity != null) {
                    JsonUrtRichText$RichTextEntity$$JsonObjectMapper._serialize(jsonUrtRichText$RichTextEntity, tfe, true);
                }
            }
            tfe.f();
        }
        tfe.u0("text", jsonUrtRichText.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUrtRichText jsonUrtRichText, final String s, final khe khe) throws IOException {
        if ("alignment".equals(s)) {
            jsonUrtRichText.c = (int)((StringBasedTypeConverter)JsonUrtRichText$$JsonObjectMapper.RICH_TEXT_ALIGNMENT_TYPE_CONVERTER).parse(khe);
        }
        else if ("entities".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final JsonUrtRichText$RichTextEntity parse = JsonUrtRichText$RichTextEntity$$JsonObjectMapper._parse(khe);
                    if (parse != null) {
                        b.add(parse);
                    }
                }
                jsonUrtRichText.b = b;
            }
            else {
                jsonUrtRichText.b = null;
            }
        }
        else if ("text".equals(s)) {
            jsonUrtRichText.a = khe.T((String)null);
        }
    }
    
    public JsonUrtRichText parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUrtRichText jsonUrtRichText, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUrtRichText, tfe, b);
    }
}
