// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaOrigin$$JsonObjectMapper extends JsonMapper<JsonFoundMediaOrigin>
{
    public static JsonFoundMediaOrigin _parse(final khe khe) throws IOException {
        final JsonFoundMediaOrigin jsonFoundMediaOrigin = new JsonFoundMediaOrigin();
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
            parseField(jsonFoundMediaOrigin, d, khe);
            khe.m0();
        }
        return jsonFoundMediaOrigin;
    }
    
    public static void _serialize(final JsonFoundMediaOrigin jsonFoundMediaOrigin, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("id", jsonFoundMediaOrigin.a);
        tfe.u0("provider", jsonFoundMediaOrigin.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaOrigin jsonFoundMediaOrigin, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonFoundMediaOrigin.a = khe.T((String)null);
        }
        else if ("provider".equals(s)) {
            jsonFoundMediaOrigin.b = khe.T((String)null);
        }
    }
    
    public JsonFoundMediaOrigin parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFoundMediaOrigin jsonFoundMediaOrigin, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaOrigin, tfe, b);
    }
}
