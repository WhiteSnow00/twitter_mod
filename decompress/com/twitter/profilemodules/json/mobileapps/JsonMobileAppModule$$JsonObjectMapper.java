// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.mobileapps;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMobileAppModule$$JsonObjectMapper extends JsonMapper<JsonMobileAppModule>
{
    public static JsonMobileAppModule _parse(final tge tge) throws IOException {
        final JsonMobileAppModule jsonMobileAppModule = new JsonMobileAppModule();
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
            parseField(jsonMobileAppModule, d, tge);
            tge.l0();
        }
        return jsonMobileAppModule;
    }
    
    public static void _serialize(final JsonMobileAppModule jsonMobileAppModule, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonMobileAppModule.t();
        LoganSquare.typeConverterFor((Class)xch.class).serialize((Object)jsonMobileAppModule.t(), "config", true, afe);
        jsonMobileAppModule.u();
        LoganSquare.typeConverterFor((Class)neh.class).serialize((Object)jsonMobileAppModule.u(), "data", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMobileAppModule jsonMobileAppModule, final String s, final tge tge) throws IOException {
        if ("config".equals(s)) {
            final xch a = (xch)LoganSquare.typeConverterFor((Class)xch.class).parse(tge);
            Objects.requireNonNull(jsonMobileAppModule);
            czd.f((Object)a, "<set-?>");
            jsonMobileAppModule.a = a;
        }
        else if ("data".equals(s)) {
            final neh b = (neh)LoganSquare.typeConverterFor((Class)neh.class).parse(tge);
            Objects.requireNonNull(jsonMobileAppModule);
            czd.f((Object)b, "<set-?>");
            jsonMobileAppModule.b = b;
        }
    }
    
    public JsonMobileAppModule parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMobileAppModule jsonMobileAppModule, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMobileAppModule, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMobileAppModule)o, afe, b);
    }
}
