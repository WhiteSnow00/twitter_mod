// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTTombstoneCTA$$JsonObjectMapper extends JsonMapper<JsonURTTombstoneCTA>
{
    public static JsonURTTombstoneCTA _parse(final tge tge) throws IOException {
        final JsonURTTombstoneCTA jsonURTTombstoneCTA = new JsonURTTombstoneCTA();
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
            parseField(jsonURTTombstoneCTA, d, tge);
            tge.l0();
        }
        return jsonURTTombstoneCTA;
    }
    
    public static void _serialize(final JsonURTTombstoneCTA jsonURTTombstoneCTA, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("text", jsonURTTombstoneCTA.a);
        if (jsonURTTombstoneCTA.b != null) {
            LoganSquare.typeConverterFor((Class)i8t.class).serialize((Object)jsonURTTombstoneCTA.b, "url", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonURTTombstoneCTA jsonURTTombstoneCTA, final String s, final tge tge) throws IOException {
        if ("text".equals(s)) {
            jsonURTTombstoneCTA.a = tge.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonURTTombstoneCTA.b = (i8t)LoganSquare.typeConverterFor((Class)i8t.class).parse(tge);
        }
    }
    
    public JsonURTTombstoneCTA parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTTombstoneCTA jsonURTTombstoneCTA, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTTombstoneCTA, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTTombstoneCTA)o, afe, b);
    }
}
