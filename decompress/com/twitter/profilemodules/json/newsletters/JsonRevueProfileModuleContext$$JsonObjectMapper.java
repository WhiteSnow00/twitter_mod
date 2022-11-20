// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueProfileModuleContext$$JsonObjectMapper extends JsonMapper<JsonRevueProfileModuleContext>
{
    public static final oie JSON_SUBSCRIPTION_STATE_TYPE_CONVERTER;
    
    static {
        JSON_SUBSCRIPTION_STATE_TYPE_CONVERTER = new oie();
    }
    
    public static JsonRevueProfileModuleContext _parse(final tge tge) throws IOException {
        final JsonRevueProfileModuleContext jsonRevueProfileModuleContext = new JsonRevueProfileModuleContext();
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
            parseField(jsonRevueProfileModuleContext, d, tge);
            tge.l0();
        }
        return jsonRevueProfileModuleContext;
    }
    
    public static void _serialize(final JsonRevueProfileModuleContext jsonRevueProfileModuleContext, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("user_masked_email", jsonRevueProfileModuleContext.b);
        final aor a = jsonRevueProfileModuleContext.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonRevueProfileModuleContext$$JsonObjectMapper.JSON_SUBSCRIPTION_STATE_TYPE_CONVERTER).serialize((Object)a, "user_subscription_status", true, afe);
        }
        if (jsonRevueProfileModuleContext.c != null) {
            afe.i("terms_of_service");
            JsonTermsOfService$$JsonObjectMapper._serialize(jsonRevueProfileModuleContext.c, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueProfileModuleContext jsonRevueProfileModuleContext, final String s, final tge tge) throws IOException {
        if ("user_masked_email".equals(s)) {
            jsonRevueProfileModuleContext.b = tge.T((String)null);
        }
        else if ("user_subscription_status".equals(s)) {
            jsonRevueProfileModuleContext.a = (aor)((StringBasedTypeConverter)JsonRevueProfileModuleContext$$JsonObjectMapper.JSON_SUBSCRIPTION_STATE_TYPE_CONVERTER).parse(tge);
        }
        else if ("terms_of_service".equals(s)) {
            jsonRevueProfileModuleContext.c = JsonTermsOfService$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonRevueProfileModuleContext parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueProfileModuleContext jsonRevueProfileModuleContext, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueProfileModuleContext, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueProfileModuleContext)o, afe, b);
    }
}
