// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.mobileapps;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.business.features.mobileappmodule.model.MobileAppUrlsByStore;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileAppModuleConfig$$JsonObjectMapper extends JsonMapper<JsonMobileAppModuleConfig>
{
    public static JsonMobileAppModuleConfig _parse(final tge tge) throws IOException {
        final JsonMobileAppModuleConfig jsonMobileAppModuleConfig = new JsonMobileAppModuleConfig();
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
            parseField(jsonMobileAppModuleConfig, d, tge);
            tge.l0();
        }
        return jsonMobileAppModuleConfig;
    }
    
    public static void _serialize(final JsonMobileAppModuleConfig jsonMobileAppModuleConfig, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonMobileAppModuleConfig.t();
        LoganSquare.typeConverterFor((Class)MobileAppUrlsByStore.class).serialize((Object)jsonMobileAppModuleConfig.t(), "app_urls_by_store", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMobileAppModuleConfig jsonMobileAppModuleConfig, final String s, final tge tge) throws IOException {
        if ("app_urls_by_store".equals(s)) {
            final MobileAppUrlsByStore a = (MobileAppUrlsByStore)LoganSquare.typeConverterFor((Class)MobileAppUrlsByStore.class).parse(tge);
            Objects.requireNonNull(jsonMobileAppModuleConfig);
            czd.f((Object)a, "<set-?>");
            jsonMobileAppModuleConfig.a = a;
        }
    }
    
    public JsonMobileAppModuleConfig parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMobileAppModuleConfig jsonMobileAppModuleConfig, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMobileAppModuleConfig, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMobileAppModuleConfig)o, afe, b);
    }
}
