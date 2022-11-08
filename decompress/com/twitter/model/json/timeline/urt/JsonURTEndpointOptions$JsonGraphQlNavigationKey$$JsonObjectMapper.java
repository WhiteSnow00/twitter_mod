// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTEndpointOptions$JsonGraphQlNavigationKey$$JsonObjectMapper extends JsonMapper<JsonURTEndpointOptions$JsonGraphQlNavigationKey>
{
    public static JsonURTEndpointOptions$JsonGraphQlNavigationKey _parse(final khe khe) throws IOException {
        final JsonURTEndpointOptions$JsonGraphQlNavigationKey jsonURTEndpointOptions$JsonGraphQlNavigationKey = new JsonURTEndpointOptions$JsonGraphQlNavigationKey();
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
            parseField(jsonURTEndpointOptions$JsonGraphQlNavigationKey, d, khe);
            khe.m0();
        }
        return jsonURTEndpointOptions$JsonGraphQlNavigationKey;
    }
    
    public static void _serialize(final JsonURTEndpointOptions$JsonGraphQlNavigationKey jsonURTEndpointOptions$JsonGraphQlNavigationKey, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("id", jsonURTEndpointOptions$JsonGraphQlNavigationKey.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonURTEndpointOptions$JsonGraphQlNavigationKey jsonURTEndpointOptions$JsonGraphQlNavigationKey, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonURTEndpointOptions$JsonGraphQlNavigationKey.a = khe.T((String)null);
        }
    }
    
    public JsonURTEndpointOptions$JsonGraphQlNavigationKey parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTEndpointOptions$JsonGraphQlNavigationKey jsonURTEndpointOptions$JsonGraphQlNavigationKey, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTEndpointOptions$JsonGraphQlNavigationKey, tfe, b);
    }
}
