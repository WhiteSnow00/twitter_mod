// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonWebsiteDestination$$JsonObjectMapper extends JsonMapper<JsonWebsiteDestination>
{
    public static final mnx WEBSITE_URL_DESTINATION_TYPE_CONVERTER;
    
    static {
        WEBSITE_URL_DESTINATION_TYPE_CONVERTER = new mnx();
    }
    
    public static JsonWebsiteDestination _parse(final tge tge) throws IOException {
        final JsonWebsiteDestination jsonWebsiteDestination = new JsonWebsiteDestination();
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
            parseField(jsonWebsiteDestination, d, tge);
            tge.l0();
        }
        return jsonWebsiteDestination;
    }
    
    public static void _serialize(final JsonWebsiteDestination jsonWebsiteDestination, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final String a = jsonWebsiteDestination.a;
        if (a == null) {
            if (b) {
                afe.h();
            }
            return;
        }
        ((ywj<String>)JsonWebsiteDestination$$JsonObjectMapper.WEBSITE_URL_DESTINATION_TYPE_CONVERTER).serialize(a, "url", true, afe);
        throw null;
    }
    
    public static void parseField(final JsonWebsiteDestination jsonWebsiteDestination, final String s, final tge tge) throws IOException {
        if ("url".equals(s)) {
            jsonWebsiteDestination.a = (String)JsonWebsiteDestination$$JsonObjectMapper.WEBSITE_URL_DESTINATION_TYPE_CONVERTER.parse(tge);
        }
    }
    
    public JsonWebsiteDestination parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonWebsiteDestination jsonWebsiteDestination, final afe afe, final boolean b) throws IOException {
        _serialize(jsonWebsiteDestination, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonWebsiteDestination)o, afe, b);
    }
}
