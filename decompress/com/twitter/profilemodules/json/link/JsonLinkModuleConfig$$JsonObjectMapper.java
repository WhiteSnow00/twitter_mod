// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.link;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLinkModuleConfig$$JsonObjectMapper extends JsonMapper<JsonLinkModuleConfig>
{
    public static final pce JSON_CALL_TO_ACTION_TYPE_CONVERTER;
    
    static {
        JSON_CALL_TO_ACTION_TYPE_CONVERTER = new pce();
    }
    
    public static JsonLinkModuleConfig _parse(final tge tge) throws IOException {
        final JsonLinkModuleConfig jsonLinkModuleConfig = new JsonLinkModuleConfig();
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
            parseField(jsonLinkModuleConfig, d, tge);
            tge.l0();
        }
        return jsonLinkModuleConfig;
    }
    
    public static void _serialize(final JsonLinkModuleConfig jsonLinkModuleConfig, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final d93 a = jsonLinkModuleConfig.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonLinkModuleConfig$$JsonObjectMapper.JSON_CALL_TO_ACTION_TYPE_CONVERTER).serialize((Object)a, "cta", true, afe);
        }
        afe.t0("raw_url", jsonLinkModuleConfig.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLinkModuleConfig jsonLinkModuleConfig, final String s, final tge tge) throws IOException {
        if ("cta".equals(s)) {
            jsonLinkModuleConfig.a = (d93)((StringBasedTypeConverter)JsonLinkModuleConfig$$JsonObjectMapper.JSON_CALL_TO_ACTION_TYPE_CONVERTER).parse(tge);
        }
        else if ("raw_url".equals(s)) {
            jsonLinkModuleConfig.b = tge.T((String)null);
        }
    }
    
    public JsonLinkModuleConfig parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLinkModuleConfig jsonLinkModuleConfig, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLinkModuleConfig, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLinkModuleConfig)o, afe, b);
    }
}
