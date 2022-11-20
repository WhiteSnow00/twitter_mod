// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFetchTemporaryPassword$$JsonObjectMapper extends JsonMapper<JsonFetchTemporaryPassword>
{
    public static JsonFetchTemporaryPassword _parse(final tge tge) throws IOException {
        final JsonFetchTemporaryPassword jsonFetchTemporaryPassword = new JsonFetchTemporaryPassword();
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
            parseField(jsonFetchTemporaryPassword, d, tge);
            tge.l0();
        }
        return jsonFetchTemporaryPassword;
    }
    
    public static void _serialize(final JsonFetchTemporaryPassword jsonFetchTemporaryPassword, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonFetchTemporaryPassword.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonFetchTemporaryPassword.b, "next_link", true, afe);
        }
        afe.e("should_generate", jsonFetchTemporaryPassword.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFetchTemporaryPassword jsonFetchTemporaryPassword, final String s, final tge tge) throws IOException {
        if ("next_link".equals(s)) {
            jsonFetchTemporaryPassword.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("should_generate".equals(s)) {
            jsonFetchTemporaryPassword.a = tge.k();
        }
    }
    
    public JsonFetchTemporaryPassword parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFetchTemporaryPassword jsonFetchTemporaryPassword, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFetchTemporaryPassword, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFetchTemporaryPassword)o, afe, b);
    }
}
