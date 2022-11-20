// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfStylingRange$$JsonObjectMapper extends JsonMapper<JsonOcfStylingRange>
{
    public static final rlr STYLING_TYPE_TYPE_CONVERTER;
    
    static {
        STYLING_TYPE_TYPE_CONVERTER = new rlr();
    }
    
    public static JsonOcfStylingRange _parse(final tge tge) throws IOException {
        final JsonOcfStylingRange jsonOcfStylingRange = new JsonOcfStylingRange();
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
            parseField(jsonOcfStylingRange, d, tge);
            tge.l0();
        }
        return jsonOcfStylingRange;
    }
    
    public static void _serialize(final JsonOcfStylingRange jsonOcfStylingRange, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("from_index", jsonOcfStylingRange.a);
        afe.T("to_index", jsonOcfStylingRange.b);
        ((StringBasedTypeConverter)JsonOcfStylingRange$$JsonObjectMapper.STYLING_TYPE_TYPE_CONVERTER).serialize((Object)jsonOcfStylingRange.c, "type", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfStylingRange jsonOcfStylingRange, final String s, final tge tge) throws IOException {
        if ("from_index".equals(s)) {
            jsonOcfStylingRange.a = tge.y();
        }
        else if ("to_index".equals(s)) {
            jsonOcfStylingRange.b = tge.y();
        }
        else if ("type".equals(s)) {
            jsonOcfStylingRange.c = (int)((StringBasedTypeConverter)JsonOcfStylingRange$$JsonObjectMapper.STYLING_TYPE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonOcfStylingRange parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfStylingRange jsonOcfStylingRange, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfStylingRange, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfStylingRange)o, afe, b);
    }
}
