// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAppLocaleUpdateSubtask$JsonAppLocale$$JsonObjectMapper extends JsonMapper<JsonAppLocaleUpdateSubtask$JsonAppLocale>
{
    public static JsonAppLocaleUpdateSubtask$JsonAppLocale _parse(final tge tge) throws IOException {
        final JsonAppLocaleUpdateSubtask$JsonAppLocale jsonAppLocaleUpdateSubtask$JsonAppLocale = new JsonAppLocaleUpdateSubtask$JsonAppLocale();
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
            parseField(jsonAppLocaleUpdateSubtask$JsonAppLocale, d, tge);
            tge.l0();
        }
        return jsonAppLocaleUpdateSubtask$JsonAppLocale;
    }
    
    public static void _serialize(final JsonAppLocaleUpdateSubtask$JsonAppLocale jsonAppLocaleUpdateSubtask$JsonAppLocale, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("country_code", jsonAppLocaleUpdateSubtask$JsonAppLocale.b);
        afe.t0("language_code", jsonAppLocaleUpdateSubtask$JsonAppLocale.a);
        afe.t0("script_code", jsonAppLocaleUpdateSubtask$JsonAppLocale.c);
        afe.t0("variant_code", jsonAppLocaleUpdateSubtask$JsonAppLocale.d);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAppLocaleUpdateSubtask$JsonAppLocale jsonAppLocaleUpdateSubtask$JsonAppLocale, final String s, final tge tge) throws IOException {
        if ("country_code".equals(s)) {
            jsonAppLocaleUpdateSubtask$JsonAppLocale.b = tge.T((String)null);
        }
        else if ("language_code".equals(s)) {
            jsonAppLocaleUpdateSubtask$JsonAppLocale.a = tge.T((String)null);
        }
        else if ("script_code".equals(s)) {
            jsonAppLocaleUpdateSubtask$JsonAppLocale.c = tge.T((String)null);
        }
        else if ("variant_code".equals(s)) {
            jsonAppLocaleUpdateSubtask$JsonAppLocale.d = tge.T((String)null);
        }
    }
    
    public JsonAppLocaleUpdateSubtask$JsonAppLocale parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAppLocaleUpdateSubtask$JsonAppLocale jsonAppLocaleUpdateSubtask$JsonAppLocale, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAppLocaleUpdateSubtask$JsonAppLocale, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAppLocaleUpdateSubtask$JsonAppLocale)o, afe, b);
    }
}
