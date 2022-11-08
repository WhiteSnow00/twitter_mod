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
    
    public static JsonURTEndpointOptions _parse(final khe khe) throws IOException {
        final JsonURTEndpointOptions jsonURTEndpointOptions = new JsonURTEndpointOptions();
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
            parseField(jsonURTEndpointOptions, d, khe);
            khe.m0();
        }
        return jsonURTEndpointOptions;
    }
    
    public static void _serialize(final JsonURTEndpointOptions jsonURTEndpointOptions, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("cacheId", jsonURTEndpointOptions.e);
        if (jsonURTEndpointOptions.a != null) {
            LoganSquare.typeConverterFor((Class)z7c.class).serialize((Object)jsonURTEndpointOptions.a, "timeline", true, tfe);
        }
        final Map b2 = jsonURTEndpointOptions.b;
        if (b2 == null) {
            tfe.u0("subtitle", jsonURTEndpointOptions.d);
            tfe.u0("title", jsonURTEndpointOptions.c);
            if (b) {
                tfe.h();
            }
            return;
        }
        ((twj<Map>)JsonURTEndpointOptions$$JsonObjectMapper.REQUEST_PARAMS_MAP_CONVERTER).serialize(b2, "requestParams", true, tfe);
        throw null;
    }
    
    public static void parseField(final JsonURTEndpointOptions jsonURTEndpointOptions, final String s, final khe khe) throws IOException {
        if ("cacheId".equals(s)) {
            jsonURTEndpointOptions.e = khe.T((String)null);
        }
        else if ("timeline".equals(s)) {
            jsonURTEndpointOptions.a = (z7c)LoganSquare.typeConverterFor((Class)z7c.class).parse(khe);
        }
        else if ("requestParams".equals(s)) {
            jsonURTEndpointOptions.b = ((mkg<Object>)JsonURTEndpointOptions$$JsonObjectMapper.REQUEST_PARAMS_MAP_CONVERTER).a(khe);
        }
        else if ("subtitle".equals(s)) {
            jsonURTEndpointOptions.d = khe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonURTEndpointOptions.c = khe.T((String)null);
        }
    }
    
    public JsonURTEndpointOptions parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonURTEndpointOptions jsonURTEndpointOptions, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonURTEndpointOptions, tfe, b);
    }
}
