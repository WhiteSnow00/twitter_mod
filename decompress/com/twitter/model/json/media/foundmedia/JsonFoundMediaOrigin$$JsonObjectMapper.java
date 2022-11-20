// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaOrigin$$JsonObjectMapper extends JsonMapper<JsonFoundMediaOrigin>
{
    public static JsonFoundMediaOrigin _parse(final tge tge) throws IOException {
        final JsonFoundMediaOrigin jsonFoundMediaOrigin = new JsonFoundMediaOrigin();
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
            parseField(jsonFoundMediaOrigin, d, tge);
            tge.l0();
        }
        return jsonFoundMediaOrigin;
    }
    
    public static void _serialize(final JsonFoundMediaOrigin jsonFoundMediaOrigin, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("id", jsonFoundMediaOrigin.a);
        afe.t0("provider", jsonFoundMediaOrigin.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaOrigin jsonFoundMediaOrigin, final String s, final tge tge) throws IOException {
        if ("id".equals(s)) {
            jsonFoundMediaOrigin.a = tge.T((String)null);
        }
        else if ("provider".equals(s)) {
            jsonFoundMediaOrigin.b = tge.T((String)null);
        }
    }
    
    public JsonFoundMediaOrigin parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFoundMediaOrigin jsonFoundMediaOrigin, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaOrigin, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFoundMediaOrigin)o, afe, b);
    }
}
