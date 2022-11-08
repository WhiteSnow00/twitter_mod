// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.card;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonPollCompose$$JsonObjectMapper extends JsonMapper<JsonPollCompose>
{
    public static JsonPollCompose _parse(final khe khe) throws IOException {
        final JsonPollCompose jsonPollCompose = new JsonPollCompose();
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
            parseField(jsonPollCompose, d, khe);
            khe.m0();
        }
        return jsonPollCompose;
    }
    
    public static void _serialize(final JsonPollCompose jsonPollCompose, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("card_uri", jsonPollCompose.a);
        tfe.u0("error_type", jsonPollCompose.c);
        tfe.u0("message", jsonPollCompose.d);
        tfe.u0("status", jsonPollCompose.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonPollCompose jsonPollCompose, final String s, final khe khe) throws IOException {
        if ("card_uri".equals(s)) {
            jsonPollCompose.a = khe.T((String)null);
        }
        else if ("error_type".equals(s)) {
            jsonPollCompose.c = khe.T((String)null);
        }
        else if ("message".equals(s)) {
            jsonPollCompose.d = khe.T((String)null);
        }
        else if ("status".equals(s)) {
            jsonPollCompose.b = khe.T((String)null);
        }
    }
    
    public JsonPollCompose parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonPollCompose jsonPollCompose, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonPollCompose, tfe, b);
    }
}
