// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserReactiveTrigger$$JsonObjectMapper extends JsonMapper<JsonUserReactiveTrigger>
{
    public static JsonUserReactiveTrigger _parse(final tge tge) throws IOException {
        final JsonUserReactiveTrigger jsonUserReactiveTrigger = new JsonUserReactiveTrigger();
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
            parseField(jsonUserReactiveTrigger, d, tge);
            tge.l0();
        }
        return jsonUserReactiveTrigger;
    }
    
    public static void _serialize(final JsonUserReactiveTrigger jsonUserReactiveTrigger, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonUserReactiveTrigger.a != null) {
            LoganSquare.typeConverterFor((Class)z1t.class).serialize((Object)jsonUserReactiveTrigger.a, "onFollow", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUserReactiveTrigger jsonUserReactiveTrigger, final String s, final tge tge) throws IOException {
        if ("onFollow".equals(s)) {
            jsonUserReactiveTrigger.a = (z1t)LoganSquare.typeConverterFor((Class)z1t.class).parse(tge);
        }
    }
    
    public JsonUserReactiveTrigger parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUserReactiveTrigger jsonUserReactiveTrigger, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUserReactiveTrigger, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUserReactiveTrigger)o, afe, b);
    }
}
