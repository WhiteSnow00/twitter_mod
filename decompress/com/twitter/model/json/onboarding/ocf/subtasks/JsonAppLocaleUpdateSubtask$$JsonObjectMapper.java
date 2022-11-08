// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAppLocaleUpdateSubtask$$JsonObjectMapper extends JsonMapper<JsonAppLocaleUpdateSubtask>
{
    public static JsonAppLocaleUpdateSubtask _parse(final khe khe) throws IOException {
        final JsonAppLocaleUpdateSubtask jsonAppLocaleUpdateSubtask = new JsonAppLocaleUpdateSubtask();
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
            parseField(jsonAppLocaleUpdateSubtask, d, khe);
            khe.m0();
        }
        return jsonAppLocaleUpdateSubtask;
    }
    
    public static void _serialize(final JsonAppLocaleUpdateSubtask jsonAppLocaleUpdateSubtask, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonAppLocaleUpdateSubtask.b != null) {
            LoganSquare.typeConverterFor((Class)hn0.class).serialize((Object)jsonAppLocaleUpdateSubtask.b, "locale", true, tfe);
        }
        if (jsonAppLocaleUpdateSubtask.a != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonAppLocaleUpdateSubtask.a, "next_link", true, tfe);
        }
        tfe.e("persist_locale", jsonAppLocaleUpdateSubtask.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonAppLocaleUpdateSubtask jsonAppLocaleUpdateSubtask, final String s, final khe khe) throws IOException {
        if ("locale".equals(s)) {
            jsonAppLocaleUpdateSubtask.b = (hn0)LoganSquare.typeConverterFor((Class)hn0.class).parse(khe);
        }
        else if ("next_link".equals(s)) {
            jsonAppLocaleUpdateSubtask.a = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("persist_locale".equals(s)) {
            jsonAppLocaleUpdateSubtask.c = khe.k();
        }
    }
    
    public JsonAppLocaleUpdateSubtask parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonAppLocaleUpdateSubtask jsonAppLocaleUpdateSubtask, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonAppLocaleUpdateSubtask, tfe, b);
    }
}
