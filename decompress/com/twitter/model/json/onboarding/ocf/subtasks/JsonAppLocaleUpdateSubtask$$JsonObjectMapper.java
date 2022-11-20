// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAppLocaleUpdateSubtask$$JsonObjectMapper extends JsonMapper<JsonAppLocaleUpdateSubtask>
{
    public static JsonAppLocaleUpdateSubtask _parse(final tge tge) throws IOException {
        final JsonAppLocaleUpdateSubtask jsonAppLocaleUpdateSubtask = new JsonAppLocaleUpdateSubtask();
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
            parseField(jsonAppLocaleUpdateSubtask, d, tge);
            tge.l0();
        }
        return jsonAppLocaleUpdateSubtask;
    }
    
    public static void _serialize(final JsonAppLocaleUpdateSubtask jsonAppLocaleUpdateSubtask, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonAppLocaleUpdateSubtask.b != null) {
            LoganSquare.typeConverterFor((Class)cn0.class).serialize((Object)jsonAppLocaleUpdateSubtask.b, "locale", true, afe);
        }
        if (jsonAppLocaleUpdateSubtask.a != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonAppLocaleUpdateSubtask.a, "next_link", true, afe);
        }
        afe.e("persist_locale", jsonAppLocaleUpdateSubtask.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAppLocaleUpdateSubtask jsonAppLocaleUpdateSubtask, final String s, final tge tge) throws IOException {
        if ("locale".equals(s)) {
            jsonAppLocaleUpdateSubtask.b = (cn0)LoganSquare.typeConverterFor((Class)cn0.class).parse(tge);
        }
        else if ("next_link".equals(s)) {
            jsonAppLocaleUpdateSubtask.a = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("persist_locale".equals(s)) {
            jsonAppLocaleUpdateSubtask.c = tge.k();
        }
    }
    
    public JsonAppLocaleUpdateSubtask parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAppLocaleUpdateSubtask jsonAppLocaleUpdateSubtask, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAppLocaleUpdateSubtask, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAppLocaleUpdateSubtask)o, afe, b);
    }
}
