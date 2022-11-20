// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueProfileModuleConfig$$JsonObjectMapper extends JsonMapper<JsonRevueProfileModuleConfig>
{
    public static JsonRevueProfileModuleConfig _parse(final tge tge) throws IOException {
        final JsonRevueProfileModuleConfig jsonRevueProfileModuleConfig = new JsonRevueProfileModuleConfig();
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
            parseField(jsonRevueProfileModuleConfig, d, tge);
            tge.l0();
        }
        return jsonRevueProfileModuleConfig;
    }
    
    public static void _serialize(final JsonRevueProfileModuleConfig jsonRevueProfileModuleConfig, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("revue_account_id", jsonRevueProfileModuleConfig.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueProfileModuleConfig jsonRevueProfileModuleConfig, final String s, final tge tge) throws IOException {
        if ("revue_account_id".equals(s)) {
            jsonRevueProfileModuleConfig.a = tge.T((String)null);
        }
    }
    
    public JsonRevueProfileModuleConfig parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueProfileModuleConfig jsonRevueProfileModuleConfig, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueProfileModuleConfig, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueProfileModuleConfig)o, afe, b);
    }
}
