// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGraphQlVerifyCredentialsResponse$$JsonObjectMapper extends JsonMapper<JsonGraphQlVerifyCredentialsResponse>
{
    public static JsonGraphQlVerifyCredentialsResponse _parse(final khe khe) throws IOException {
        final JsonGraphQlVerifyCredentialsResponse jsonGraphQlVerifyCredentialsResponse = new JsonGraphQlVerifyCredentialsResponse();
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
            parseField(jsonGraphQlVerifyCredentialsResponse, d, khe);
            khe.m0();
        }
        return jsonGraphQlVerifyCredentialsResponse;
    }
    
    public static void _serialize(final JsonGraphQlVerifyCredentialsResponse jsonGraphQlVerifyCredentialsResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonGraphQlVerifyCredentialsResponse.b != null) {
            LoganSquare.typeConverterFor((Class)ffw.class).serialize((Object)jsonGraphQlVerifyCredentialsResponse.b, "phone", true, tfe);
        }
        if (jsonGraphQlVerifyCredentialsResponse.a != null) {
            LoganSquare.typeConverterFor((Class)rhw.class).serialize((Object)jsonGraphQlVerifyCredentialsResponse.a, "userResult", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGraphQlVerifyCredentialsResponse jsonGraphQlVerifyCredentialsResponse, final String s, final khe khe) throws IOException {
        if ("phone".equals(s)) {
            jsonGraphQlVerifyCredentialsResponse.b = (ffw)LoganSquare.typeConverterFor((Class)ffw.class).parse(khe);
        }
        else if ("userResult".equals(s)) {
            jsonGraphQlVerifyCredentialsResponse.a = (rhw)LoganSquare.typeConverterFor((Class)rhw.class).parse(khe);
        }
    }
    
    public JsonGraphQlVerifyCredentialsResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGraphQlVerifyCredentialsResponse jsonGraphQlVerifyCredentialsResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGraphQlVerifyCredentialsResponse, tfe, b);
    }
}
