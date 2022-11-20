// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTEndpointOptions$JsonGraphQlNavigationKey$$JsonObjectMapper extends JsonMapper<JsonURTEndpointOptions$JsonGraphQlNavigationKey>
{
    public static JsonURTEndpointOptions$JsonGraphQlNavigationKey _parse(final tge tge) throws IOException {
        final JsonURTEndpointOptions$JsonGraphQlNavigationKey jsonURTEndpointOptions$JsonGraphQlNavigationKey = new JsonURTEndpointOptions$JsonGraphQlNavigationKey();
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
            parseField(jsonURTEndpointOptions$JsonGraphQlNavigationKey, d, tge);
            tge.l0();
        }
        return jsonURTEndpointOptions$JsonGraphQlNavigationKey;
    }
    
    public static void _serialize(final JsonURTEndpointOptions$JsonGraphQlNavigationKey jsonURTEndpointOptions$JsonGraphQlNavigationKey, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("id", jsonURTEndpointOptions$JsonGraphQlNavigationKey.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonURTEndpointOptions$JsonGraphQlNavigationKey jsonURTEndpointOptions$JsonGraphQlNavigationKey, final String s, final tge tge) throws IOException {
        if ("id".equals(s)) {
            jsonURTEndpointOptions$JsonGraphQlNavigationKey.a = tge.T((String)null);
        }
    }
    
    public JsonURTEndpointOptions$JsonGraphQlNavigationKey parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTEndpointOptions$JsonGraphQlNavigationKey jsonURTEndpointOptions$JsonGraphQlNavigationKey, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTEndpointOptions$JsonGraphQlNavigationKey, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTEndpointOptions$JsonGraphQlNavigationKey)o, afe, b);
    }
}
