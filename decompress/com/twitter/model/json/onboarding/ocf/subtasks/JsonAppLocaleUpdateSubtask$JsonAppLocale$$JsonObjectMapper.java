// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAppLocaleUpdateSubtask$JsonAppLocale$$JsonObjectMapper extends JsonMapper<JsonAppLocaleUpdateSubtask$JsonAppLocale>
{
    public static JsonAppLocaleUpdateSubtask$JsonAppLocale _parse(final khe khe) throws IOException {
        final JsonAppLocaleUpdateSubtask$JsonAppLocale jsonAppLocaleUpdateSubtask$JsonAppLocale = new JsonAppLocaleUpdateSubtask$JsonAppLocale();
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
            parseField(jsonAppLocaleUpdateSubtask$JsonAppLocale, d, khe);
            khe.m0();
        }
        return jsonAppLocaleUpdateSubtask$JsonAppLocale;
    }
    
    public static void _serialize(final JsonAppLocaleUpdateSubtask$JsonAppLocale jsonAppLocaleUpdateSubtask$JsonAppLocale, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("country_code", jsonAppLocaleUpdateSubtask$JsonAppLocale.b);
        tfe.u0("language_code", jsonAppLocaleUpdateSubtask$JsonAppLocale.a);
        tfe.u0("script_code", jsonAppLocaleUpdateSubtask$JsonAppLocale.c);
        tfe.u0("variant_code", jsonAppLocaleUpdateSubtask$JsonAppLocale.d);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonAppLocaleUpdateSubtask$JsonAppLocale jsonAppLocaleUpdateSubtask$JsonAppLocale, final String s, final khe khe) throws IOException {
        if ("country_code".equals(s)) {
            jsonAppLocaleUpdateSubtask$JsonAppLocale.b = khe.T((String)null);
        }
        else if ("language_code".equals(s)) {
            jsonAppLocaleUpdateSubtask$JsonAppLocale.a = khe.T((String)null);
        }
        else if ("script_code".equals(s)) {
            jsonAppLocaleUpdateSubtask$JsonAppLocale.c = khe.T((String)null);
        }
        else if ("variant_code".equals(s)) {
            jsonAppLocaleUpdateSubtask$JsonAppLocale.d = khe.T((String)null);
        }
    }
    
    public JsonAppLocaleUpdateSubtask$JsonAppLocale parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonAppLocaleUpdateSubtask$JsonAppLocale jsonAppLocaleUpdateSubtask$JsonAppLocale, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonAppLocaleUpdateSubtask$JsonAppLocale, tfe, b);
    }
}
