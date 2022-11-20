// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.link;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLinkModule$$JsonObjectMapper extends JsonMapper<JsonLinkModule>
{
    public static JsonLinkModule _parse(final tge tge) throws IOException {
        final JsonLinkModule jsonLinkModule = new JsonLinkModule();
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
            parseField(jsonLinkModule, d, tge);
            tge.l0();
        }
        return jsonLinkModule;
    }
    
    public static void _serialize(final JsonLinkModule jsonLinkModule, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonLinkModule.t();
        LoganSquare.typeConverterFor((Class)xdf.class).serialize((Object)jsonLinkModule.t(), "config", true, afe);
        jsonLinkModule.u();
        LoganSquare.typeConverterFor((Class)wff.class).serialize((Object)jsonLinkModule.u(), "data", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLinkModule jsonLinkModule, final String s, final tge tge) throws IOException {
        if ("config".equals(s)) {
            final xdf b = (xdf)LoganSquare.typeConverterFor((Class)xdf.class).parse(tge);
            Objects.requireNonNull(jsonLinkModule);
            czd.f((Object)b, "<set-?>");
            jsonLinkModule.b = b;
        }
        else if ("data".equals(s)) {
            final wff a = (wff)LoganSquare.typeConverterFor((Class)wff.class).parse(tge);
            Objects.requireNonNull(jsonLinkModule);
            czd.f((Object)a, "<set-?>");
            jsonLinkModule.a = a;
        }
    }
    
    public JsonLinkModule parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLinkModule jsonLinkModule, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLinkModule, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLinkModule)o, afe, b);
    }
}
