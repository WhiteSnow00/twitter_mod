// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTTombstoneCTA$$JsonObjectMapper extends JsonMapper<JsonURTTombstoneCTA>
{
    public static JsonURTTombstoneCTA _parse(final khe khe) throws IOException {
        final JsonURTTombstoneCTA jsonURTTombstoneCTA = new JsonURTTombstoneCTA();
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
            parseField(jsonURTTombstoneCTA, d, khe);
            khe.m0();
        }
        return jsonURTTombstoneCTA;
    }
    
    public static void _serialize(final JsonURTTombstoneCTA jsonURTTombstoneCTA, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("text", jsonURTTombstoneCTA.a);
        if (jsonURTTombstoneCTA.b != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonURTTombstoneCTA.b, "url", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTTombstoneCTA jsonURTTombstoneCTA, final String s, final khe khe) throws IOException {
        if ("text".equals(s)) {
            jsonURTTombstoneCTA.a = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonURTTombstoneCTA.b = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
    }
    
    public JsonURTTombstoneCTA parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTTombstoneCTA jsonURTTombstoneCTA, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTTombstoneCTA, tfe, b);
    }
}
