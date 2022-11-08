// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUrlNavigateBehavior$$JsonObjectMapper extends JsonMapper<JsonUrlNavigateBehavior>
{
    public static JsonUrlNavigateBehavior _parse(final khe khe) throws IOException {
        final JsonUrlNavigateBehavior jsonUrlNavigateBehavior = new JsonUrlNavigateBehavior();
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
            parseField(jsonUrlNavigateBehavior, d, khe);
            khe.m0();
        }
        return jsonUrlNavigateBehavior;
    }
    
    public static void _serialize(final JsonUrlNavigateBehavior jsonUrlNavigateBehavior, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonUrlNavigateBehavior.a != null) {
            LoganSquare.typeConverterFor((Class)q7t.class).serialize((Object)jsonUrlNavigateBehavior.a, "url", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonUrlNavigateBehavior jsonUrlNavigateBehavior, final String s, final khe khe) throws IOException {
        if ("url".equals(s)) {
            jsonUrlNavigateBehavior.a = (q7t)LoganSquare.typeConverterFor((Class)q7t.class).parse(khe);
        }
    }
    
    public JsonUrlNavigateBehavior parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonUrlNavigateBehavior jsonUrlNavigateBehavior, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonUrlNavigateBehavior, tfe, b);
    }
}
