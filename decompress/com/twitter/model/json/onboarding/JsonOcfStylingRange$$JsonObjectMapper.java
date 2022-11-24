// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfStylingRange$$JsonObjectMapper extends JsonMapper<JsonOcfStylingRange>
{
    public static final omr STYLING_TYPE_TYPE_CONVERTER;
    
    static {
        STYLING_TYPE_TYPE_CONVERTER = new omr();
    }
    
    public static JsonOcfStylingRange _parse(final qhe qhe) throws IOException {
        final JsonOcfStylingRange jsonOcfStylingRange = new JsonOcfStylingRange();
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
            parseField(jsonOcfStylingRange, d, qhe);
            qhe.m0();
        }
        return jsonOcfStylingRange;
    }
    
    public static void _serialize(final JsonOcfStylingRange jsonOcfStylingRange, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.T("from_index", jsonOcfStylingRange.a);
        yfe.T("to_index", jsonOcfStylingRange.b);
        ((StringBasedTypeConverter)JsonOcfStylingRange$$JsonObjectMapper.STYLING_TYPE_TYPE_CONVERTER).serialize((Object)jsonOcfStylingRange.c, "type", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfStylingRange jsonOcfStylingRange, final String s, final qhe qhe) throws IOException {
        if ("from_index".equals(s)) {
            jsonOcfStylingRange.a = qhe.z();
        }
        else if ("to_index".equals(s)) {
            jsonOcfStylingRange.b = qhe.z();
        }
        else if ("type".equals(s)) {
            jsonOcfStylingRange.c = (int)((StringBasedTypeConverter)JsonOcfStylingRange$$JsonObjectMapper.STYLING_TYPE_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonOcfStylingRange parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfStylingRange jsonOcfStylingRange, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfStylingRange, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfStylingRange)o, yfe, b);
    }
}
