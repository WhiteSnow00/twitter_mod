// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.common;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTwitterError$$JsonObjectMapper extends JsonMapper<JsonTwitterError>
{
    public static JsonTwitterError _parse(final khe khe) throws IOException {
        final JsonTwitterError jsonTwitterError = new JsonTwitterError();
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
            parseField(jsonTwitterError, d, khe);
            khe.m0();
        }
        return jsonTwitterError;
    }
    
    public static void _serialize(final JsonTwitterError jsonTwitterError, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("attribute", jsonTwitterError.e);
        tfe.u0("bounce_deeplink", jsonTwitterError.g);
        tfe.u0("bounce_location", jsonTwitterError.f);
        tfe.T("code", jsonTwitterError.a);
        tfe.u0("message", jsonTwitterError.c);
        if (jsonTwitterError.j != null) {
            LoganSquare.typeConverterFor((Class)szi.class).serialize((Object)jsonTwitterError.j, "nudge", true, tfe);
        }
        tfe.T("retry_after", jsonTwitterError.i);
        tfe.T("sub_error_code", jsonTwitterError.b);
        tfe.W("timestamp", jsonTwitterError.d);
        tfe.u0("title", jsonTwitterError.h);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTwitterError jsonTwitterError, final String s, final khe khe) throws IOException {
        if ("attribute".equals(s)) {
            jsonTwitterError.e = khe.T((String)null);
        }
        else if ("bounce_deeplink".equals(s)) {
            jsonTwitterError.g = khe.T((String)null);
        }
        else if ("bounce_location".equals(s)) {
            jsonTwitterError.f = khe.T((String)null);
        }
        else if ("code".equals(s)) {
            jsonTwitterError.a = khe.z();
        }
        else if ("message".equals(s)) {
            jsonTwitterError.c = khe.T((String)null);
        }
        else if ("nudge".equals(s)) {
            jsonTwitterError.j = (szi)LoganSquare.typeConverterFor((Class)szi.class).parse(khe);
        }
        else if ("retry_after".equals(s)) {
            jsonTwitterError.i = khe.z();
        }
        else if ("sub_error_code".equals(s)) {
            jsonTwitterError.b = khe.z();
        }
        else if ("timestamp".equals(s)) {
            jsonTwitterError.d = khe.L();
        }
        else if ("title".equals(s)) {
            jsonTwitterError.h = khe.T((String)null);
        }
    }
    
    public JsonTwitterError parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTwitterError jsonTwitterError, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTwitterError, tfe, b);
    }
}
