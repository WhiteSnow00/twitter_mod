// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCreateAccount$$JsonObjectMapper extends JsonMapper<JsonCreateAccount>
{
    public static final ey0 ATTRIBUTION_EVENT_CONVERTER;
    
    static {
        ATTRIBUTION_EVENT_CONVERTER = new ey0();
    }
    
    public static JsonCreateAccount _parse(final tge tge) throws IOException {
        final JsonCreateAccount jsonCreateAccount = new JsonCreateAccount();
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
            parseField(jsonCreateAccount, d, tge);
            tge.l0();
        }
        return jsonCreateAccount;
    }
    
    public static void _serialize(final JsonCreateAccount jsonCreateAccount, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonCreateAccount$$JsonObjectMapper.ATTRIBUTION_EVENT_CONVERTER).serialize((Object)jsonCreateAccount.f, "attribution_event", true, afe);
        afe.t0("known_device_token", jsonCreateAccount.d);
        if (jsonCreateAccount.e != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonCreateAccount.e, "next_link", true, afe);
        }
        afe.t0("oauth_token", jsonCreateAccount.b);
        afe.t0("oauth_token_secret", jsonCreateAccount.c);
        if (jsonCreateAccount.a != null) {
            LoganSquare.typeConverterFor((Class)cgv.class).serialize((Object)jsonCreateAccount.a, "user", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCreateAccount jsonCreateAccount, final String s, final tge tge) throws IOException {
        if ("attribution_event".equals(s)) {
            jsonCreateAccount.f = (int)((StringBasedTypeConverter)JsonCreateAccount$$JsonObjectMapper.ATTRIBUTION_EVENT_CONVERTER).parse(tge);
        }
        else if ("known_device_token".equals(s)) {
            jsonCreateAccount.d = tge.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonCreateAccount.e = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("oauth_token".equals(s)) {
            jsonCreateAccount.b = tge.T((String)null);
        }
        else if ("oauth_token_secret".equals(s)) {
            jsonCreateAccount.c = tge.T((String)null);
        }
        else if ("user".equals(s)) {
            jsonCreateAccount.a = (cgv)LoganSquare.typeConverterFor((Class)cgv.class).parse(tge);
        }
    }
    
    public JsonCreateAccount parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCreateAccount jsonCreateAccount, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCreateAccount, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCreateAccount)o, afe, b);
    }
}
