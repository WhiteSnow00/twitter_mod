// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfFooter$$JsonObjectMapper extends JsonMapper<JsonOcfFooter>
{
    public static final JsonOcfFooter.a STYLE_TYPE_CONVERTER;
    
    static {
        STYLE_TYPE_CONVERTER = new JsonOcfFooter.a();
    }
    
    public static JsonOcfFooter _parse(final khe khe) throws IOException {
        final JsonOcfFooter jsonOcfFooter = new JsonOcfFooter();
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
            parseField(jsonOcfFooter, d, khe);
            khe.m0();
        }
        return jsonOcfFooter;
    }
    
    public static void _serialize(final JsonOcfFooter jsonOcfFooter, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final zcj$b a = jsonOcfFooter.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonOcfFooter$$JsonObjectMapper.STYLE_TYPE_CONVERTER).serialize((Object)a, "style", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOcfFooter jsonOcfFooter, final String s, final khe khe) throws IOException {
        if ("style".equals(s)) {
            jsonOcfFooter.a = (zcj$b)((StringBasedTypeConverter)JsonOcfFooter$$JsonObjectMapper.STYLE_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonOcfFooter parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOcfFooter jsonOcfFooter, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOcfFooter, tfe, b);
    }
}
