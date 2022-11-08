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
    public static final jy0 ATTRIBUTION_EVENT_CONVERTER;
    
    static {
        ATTRIBUTION_EVENT_CONVERTER = new jy0();
    }
    
    public static JsonCreateAccount _parse(final khe khe) throws IOException {
        final JsonCreateAccount jsonCreateAccount = new JsonCreateAccount();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(jsonCreateAccount, d, khe);
            khe.m0();
        }
        return jsonCreateAccount;
    }
    
    public static void _serialize(final JsonCreateAccount jsonCreateAccount, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonCreateAccount$$JsonObjectMapper.ATTRIBUTION_EVENT_CONVERTER).serialize((Object)jsonCreateAccount.f, "attribution_event", true, tfe);
        tfe.u0("known_device_token", jsonCreateAccount.d);
        if (jsonCreateAccount.e != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonCreateAccount.e, "next_link", true, tfe);
        }
        tfe.u0("oauth_token", jsonCreateAccount.b);
        tfe.u0("oauth_token_secret", jsonCreateAccount.c);
        if (jsonCreateAccount.a != null) {
            LoganSquare.typeConverterFor((Class)hfv.class).serialize((Object)jsonCreateAccount.a, "user", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCreateAccount jsonCreateAccount, final String s, final khe khe) throws IOException {
        if ("attribution_event".equals(s)) {
            jsonCreateAccount.f = (int)((StringBasedTypeConverter)JsonCreateAccount$$JsonObjectMapper.ATTRIBUTION_EVENT_CONVERTER).parse(khe);
        }
        else if ("known_device_token".equals(s)) {
            jsonCreateAccount.d = khe.T((String)null);
        }
        else if ("next_link".equals(s)) {
            jsonCreateAccount.e = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("oauth_token".equals(s)) {
            jsonCreateAccount.b = khe.T((String)null);
        }
        else if ("oauth_token_secret".equals(s)) {
            jsonCreateAccount.c = khe.T((String)null);
        }
        else if ("user".equals(s)) {
            jsonCreateAccount.a = (hfv)LoganSquare.typeConverterFor((Class)hfv.class).parse(khe);
        }
    }
    
    public JsonCreateAccount parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCreateAccount jsonCreateAccount, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCreateAccount, tfe, b);
    }
}
