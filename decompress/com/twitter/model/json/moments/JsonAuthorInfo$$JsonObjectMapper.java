// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAuthorInfo$$JsonObjectMapper extends JsonMapper<JsonAuthorInfo>
{
    public static JsonAuthorInfo _parse(final khe khe) throws IOException {
        final JsonAuthorInfo jsonAuthorInfo = new JsonAuthorInfo();
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
            parseField(jsonAuthorInfo, d, khe);
            khe.m0();
        }
        return jsonAuthorInfo;
    }
    
    public static void _serialize(final JsonAuthorInfo jsonAuthorInfo, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("favicon_url", jsonAuthorInfo.e);
        tfe.W("id", jsonAuthorInfo.a);
        tfe.e("verified", jsonAuthorInfo.b);
        tfe.u0("name", jsonAuthorInfo.c);
        tfe.u0("screen_name", jsonAuthorInfo.d);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonAuthorInfo jsonAuthorInfo, final String s, final khe khe) throws IOException {
        if ("favicon_url".equals(s)) {
            jsonAuthorInfo.e = khe.T((String)null);
        }
        else if ("id".equals(s)) {
            jsonAuthorInfo.a = khe.L();
        }
        else if ("verified".equals(s)) {
            jsonAuthorInfo.b = khe.k();
        }
        else if ("name".equals(s)) {
            jsonAuthorInfo.c = khe.T((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonAuthorInfo.d = khe.T((String)null);
        }
    }
    
    public JsonAuthorInfo parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonAuthorInfo jsonAuthorInfo, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonAuthorInfo, tfe, b);
    }
}
