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
    
    public static JsonOcfFooter _parse(final tge tge) throws IOException {
        final JsonOcfFooter jsonOcfFooter = new JsonOcfFooter();
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
            parseField(jsonOcfFooter, d, tge);
            tge.l0();
        }
        return jsonOcfFooter;
    }
    
    public static void _serialize(final JsonOcfFooter jsonOcfFooter, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final edj$b a = jsonOcfFooter.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonOcfFooter$$JsonObjectMapper.STYLE_TYPE_CONVERTER).serialize((Object)a, "style", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfFooter jsonOcfFooter, final String s, final tge tge) throws IOException {
        if ("style".equals(s)) {
            jsonOcfFooter.a = (edj$b)((StringBasedTypeConverter)JsonOcfFooter$$JsonObjectMapper.STYLE_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonOcfFooter parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfFooter jsonOcfFooter, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfFooter, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfFooter)o, afe, b);
    }
}
