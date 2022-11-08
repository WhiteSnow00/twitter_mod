// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCheckPhoneRequestResponse$$JsonObjectMapper extends JsonMapper<JsonCheckPhoneRequestResponse>
{
    public static JsonCheckPhoneRequestResponse _parse(final khe khe) throws IOException {
        final JsonCheckPhoneRequestResponse jsonCheckPhoneRequestResponse = new JsonCheckPhoneRequestResponse();
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
            parseField(jsonCheckPhoneRequestResponse, d, khe);
            khe.m0();
        }
        return jsonCheckPhoneRequestResponse;
    }
    
    public static void _serialize(final JsonCheckPhoneRequestResponse jsonCheckPhoneRequestResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonCheckPhoneRequestResponse.a != null) {
            LoganSquare.typeConverterFor((Class)ffw.class).serialize((Object)jsonCheckPhoneRequestResponse.a, "phone_v2", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCheckPhoneRequestResponse jsonCheckPhoneRequestResponse, final String s, final khe khe) throws IOException {
        if ("phone_v2".equals(s)) {
            jsonCheckPhoneRequestResponse.a = (ffw)LoganSquare.typeConverterFor((Class)ffw.class).parse(khe);
        }
    }
    
    public JsonCheckPhoneRequestResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCheckPhoneRequestResponse jsonCheckPhoneRequestResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCheckPhoneRequestResponse, tfe, b);
    }
}
