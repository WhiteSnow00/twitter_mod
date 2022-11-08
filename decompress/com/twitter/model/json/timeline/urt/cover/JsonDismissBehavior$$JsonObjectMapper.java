// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDismissBehavior$$JsonObjectMapper extends JsonMapper<JsonDismissBehavior>
{
    public static JsonDismissBehavior _parse(final khe khe) throws IOException {
        final JsonDismissBehavior jsonDismissBehavior = new JsonDismissBehavior();
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
            parseField(jsonDismissBehavior, d, khe);
            khe.m0();
        }
        return jsonDismissBehavior;
    }
    
    public static void _serialize(final JsonDismissBehavior jsonDismissBehavior, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonDismissBehavior.a != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonDismissBehavior.a, "feedbackMessage", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonDismissBehavior jsonDismissBehavior, final String s, final khe khe) throws IOException {
        if ("feedbackMessage".equals(s)) {
            jsonDismissBehavior.a = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
    }
    
    public JsonDismissBehavior parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonDismissBehavior jsonDismissBehavior, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonDismissBehavior, tfe, b);
    }
}
