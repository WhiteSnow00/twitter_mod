// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.sru;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSruError$$JsonObjectMapper extends JsonMapper<JsonSruError>
{
    public static JsonSruError _parse(final khe khe) throws IOException {
        final JsonSruError jsonSruError = new JsonSruError();
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
            parseField(jsonSruError, d, khe);
            khe.m0();
        }
        return jsonSruError;
    }
    
    public static void _serialize(final JsonSruError jsonSruError, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("code", jsonSruError.a);
        tfe.u0("message", jsonSruError.c);
        tfe.u0("name", jsonSruError.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSruError jsonSruError, final String s, final khe khe) throws IOException {
        if ("code".equals(s)) {
            jsonSruError.a = khe.z();
        }
        else if ("message".equals(s)) {
            jsonSruError.c = khe.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonSruError.b = khe.T((String)null);
        }
    }
    
    public JsonSruError parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSruError jsonSruError, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSruError, tfe, b);
    }
}
