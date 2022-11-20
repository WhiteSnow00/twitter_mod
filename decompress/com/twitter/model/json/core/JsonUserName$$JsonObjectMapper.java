// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserName$$JsonObjectMapper extends JsonMapper<JsonUserName>
{
    public static JsonUserName _parse(final tge tge) throws IOException {
        final JsonUserName jsonUserName = new JsonUserName();
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
            parseField(jsonUserName, d, tge);
            tge.l0();
        }
        return jsonUserName;
    }
    
    public static void _serialize(final JsonUserName jsonUserName, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("name", jsonUserName.a);
        afe.t0("screen_name", jsonUserName.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUserName jsonUserName, final String s, final tge tge) throws IOException {
        if ("name".equals(s)) {
            jsonUserName.a = tge.T((String)null);
        }
        else if ("screen_name".equals(s)) {
            jsonUserName.b = tge.T((String)null);
        }
    }
    
    public JsonUserName parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUserName jsonUserName, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUserName, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUserName)o, afe, b);
    }
}
