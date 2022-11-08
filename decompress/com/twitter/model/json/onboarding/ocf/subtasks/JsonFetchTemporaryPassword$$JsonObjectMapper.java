// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFetchTemporaryPassword$$JsonObjectMapper extends JsonMapper<JsonFetchTemporaryPassword>
{
    public static JsonFetchTemporaryPassword _parse(final khe khe) throws IOException {
        final JsonFetchTemporaryPassword jsonFetchTemporaryPassword = new JsonFetchTemporaryPassword();
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
            parseField(jsonFetchTemporaryPassword, d, khe);
            khe.m0();
        }
        return jsonFetchTemporaryPassword;
    }
    
    public static void _serialize(final JsonFetchTemporaryPassword jsonFetchTemporaryPassword, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonFetchTemporaryPassword.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonFetchTemporaryPassword.b, "next_link", true, tfe);
        }
        tfe.e("should_generate", jsonFetchTemporaryPassword.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFetchTemporaryPassword jsonFetchTemporaryPassword, final String s, final khe khe) throws IOException {
        if ("next_link".equals(s)) {
            jsonFetchTemporaryPassword.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("should_generate".equals(s)) {
            jsonFetchTemporaryPassword.a = khe.k();
        }
    }
    
    public JsonFetchTemporaryPassword parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFetchTemporaryPassword jsonFetchTemporaryPassword, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFetchTemporaryPassword, tfe, b);
    }
}
