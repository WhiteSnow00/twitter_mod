// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserReactiveTrigger$$JsonObjectMapper extends JsonMapper<JsonUserReactiveTrigger>
{
    public static JsonUserReactiveTrigger _parse(final khe khe) throws IOException {
        final JsonUserReactiveTrigger jsonUserReactiveTrigger = new JsonUserReactiveTrigger();
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
            parseField(jsonUserReactiveTrigger, d, khe);
            khe.m0();
        }
        return jsonUserReactiveTrigger;
    }
    
    public static void _serialize(final JsonUserReactiveTrigger jsonUserReactiveTrigger, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonUserReactiveTrigger.a != null) {
            LoganSquare.typeConverterFor((Class)j1t.class).serialize((Object)jsonUserReactiveTrigger.a, "onFollow", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUserReactiveTrigger jsonUserReactiveTrigger, final String s, final khe khe) throws IOException {
        if ("onFollow".equals(s)) {
            jsonUserReactiveTrigger.a = (j1t)LoganSquare.typeConverterFor((Class)j1t.class).parse(khe);
        }
    }
    
    public JsonUserReactiveTrigger parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUserReactiveTrigger jsonUserReactiveTrigger, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUserReactiveTrigger, tfe, b);
    }
}
