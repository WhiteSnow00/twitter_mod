// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Map;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonURTEndpointOptions$$JsonObjectMapper extends JsonMapper<JsonURTEndpointOptions>
{
    public static final JsonURTEndpointOptions$a REQUEST_PARAMS_MAP_CONVERTER;
    
    static {
        REQUEST_PARAMS_MAP_CONVERTER = new JsonURTEndpointOptions$a();
    }
    
    public static JsonURTEndpointOptions _parse(final tge tge) throws IOException {
        final JsonURTEndpointOptions jsonURTEndpointOptions = new JsonURTEndpointOptions();
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
            parseField(jsonURTEndpointOptions, d, tge);
            tge.l0();
        }
        return jsonURTEndpointOptions;
    }
    
    public static void _serialize(final JsonURTEndpointOptions jsonURTEndpointOptions, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("cacheId", jsonURTEndpointOptions.e);
        if (jsonURTEndpointOptions.a != null) {
            LoganSquare.typeConverterFor((Class)a7c.class).serialize((Object)jsonURTEndpointOptions.a, "timeline", true, afe);
        }
        final Map b2 = jsonURTEndpointOptions.b;
        if (b2 == null) {
            afe.t0("subtitle", jsonURTEndpointOptions.d);
            afe.t0("title", jsonURTEndpointOptions.c);
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<Map>)JsonURTEndpointOptions$$JsonObjectMapper.REQUEST_PARAMS_MAP_CONVERTER).serialize(b2, "requestParams", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonURTEndpointOptions jsonURTEndpointOptions, final String s, final tge tge) throws IOException {
        if ("cacheId".equals(s)) {
            jsonURTEndpointOptions.e = tge.T((String)null);
        }
        else if ("timeline".equals(s)) {
            jsonURTEndpointOptions.a = (a7c)LoganSquare.typeConverterFor((Class)a7c.class).parse(tge);
        }
        else if ("requestParams".equals(s)) {
            jsonURTEndpointOptions.b = ((kkg)JsonURTEndpointOptions$$JsonObjectMapper.REQUEST_PARAMS_MAP_CONVERTER).a(tge);
        }
        else if ("subtitle".equals(s)) {
            jsonURTEndpointOptions.d = tge.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonURTEndpointOptions.c = tge.T((String)null);
        }
    }
    
    public JsonURTEndpointOptions parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonURTEndpointOptions jsonURTEndpointOptions, final afe afe, final boolean b) throws IOException {
        _serialize(jsonURTEndpointOptions, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonURTEndpointOptions)o, afe, b);
    }
}
