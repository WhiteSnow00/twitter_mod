// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueModule$$JsonObjectMapper extends JsonMapper<JsonRevueModule>
{
    public static JsonRevueModule _parse(final tge tge) throws IOException {
        final JsonRevueModule jsonRevueModule = new JsonRevueModule();
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
            parseField(jsonRevueModule, d, tge);
            tge.l0();
        }
        return jsonRevueModule;
    }
    
    public static void _serialize(final JsonRevueModule jsonRevueModule, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonRevueModule.c != null) {
            LoganSquare.typeConverterFor((Class)kwm.class).serialize((Object)jsonRevueModule.c, "config", true, afe);
        }
        if (jsonRevueModule.b != null) {
            LoganSquare.typeConverterFor((Class)lwm.class).serialize((Object)jsonRevueModule.b, "context", true, afe);
        }
        if (jsonRevueModule.a != null) {
            LoganSquare.typeConverterFor((Class)mwm.class).serialize((Object)jsonRevueModule.a, "data", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueModule jsonRevueModule, final String s, final tge tge) throws IOException {
        if ("config".equals(s)) {
            jsonRevueModule.c = (kwm)LoganSquare.typeConverterFor((Class)kwm.class).parse(tge);
        }
        else if ("context".equals(s)) {
            jsonRevueModule.b = (lwm)LoganSquare.typeConverterFor((Class)lwm.class).parse(tge);
        }
        else if ("data".equals(s)) {
            jsonRevueModule.a = (mwm)LoganSquare.typeConverterFor((Class)mwm.class).parse(tge);
        }
    }
    
    public JsonRevueModule parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueModule jsonRevueModule, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueModule, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueModule)o, afe, b);
    }
}
