// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonDismissBehavior$$JsonObjectMapper extends JsonMapper<JsonDismissBehavior>
{
    public static JsonDismissBehavior _parse(final tge tge) throws IOException {
        final JsonDismissBehavior jsonDismissBehavior = new JsonDismissBehavior();
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
            parseField(jsonDismissBehavior, d, tge);
            tge.l0();
        }
        return jsonDismissBehavior;
    }
    
    public static void _serialize(final JsonDismissBehavior jsonDismissBehavior, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonDismissBehavior.a != null) {
            LoganSquare.typeConverterFor((Class)oxm.class).serialize((Object)jsonDismissBehavior.a, "feedbackMessage", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonDismissBehavior jsonDismissBehavior, final String s, final tge tge) throws IOException {
        if ("feedbackMessage".equals(s)) {
            jsonDismissBehavior.a = (oxm)LoganSquare.typeConverterFor((Class)oxm.class).parse(tge);
        }
    }
    
    public JsonDismissBehavior parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonDismissBehavior jsonDismissBehavior, final afe afe, final boolean b) throws IOException {
        _serialize(jsonDismissBehavior, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonDismissBehavior)o, afe, b);
    }
}
