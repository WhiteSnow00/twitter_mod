// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRevueAccount$$JsonObjectMapper extends JsonMapper<JsonRevueAccount>
{
    public static JsonRevueAccount _parse(final tge tge) throws IOException {
        final JsonRevueAccount jsonRevueAccount = new JsonRevueAccount();
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
            parseField(jsonRevueAccount, d, tge);
            tge.l0();
        }
        return jsonRevueAccount;
    }
    
    public static void _serialize(final JsonRevueAccount jsonRevueAccount, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonRevueAccount.b != null) {
            afe.i("account_settings");
            JsonAccountSettings$$JsonObjectMapper._serialize(jsonRevueAccount.b, afe, true);
        }
        if (jsonRevueAccount.a != null) {
            LoganSquare.typeConverterFor((Class)gwm.class).serialize((Object)jsonRevueAccount.a, "newsletter_info", true, afe);
        }
        if (jsonRevueAccount.c != null) {
            LoganSquare.typeConverterFor((Class)iwm.class).serialize((Object)jsonRevueAccount.c, "profile_info", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRevueAccount jsonRevueAccount, final String s, final tge tge) throws IOException {
        if ("account_settings".equals(s)) {
            jsonRevueAccount.b = JsonAccountSettings$$JsonObjectMapper._parse(tge);
        }
        else if ("newsletter_info".equals(s)) {
            jsonRevueAccount.a = (gwm)LoganSquare.typeConverterFor((Class)gwm.class).parse(tge);
        }
        else if ("profile_info".equals(s)) {
            jsonRevueAccount.c = (iwm)LoganSquare.typeConverterFor((Class)iwm.class).parse(tge);
        }
    }
    
    public JsonRevueAccount parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRevueAccount jsonRevueAccount, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRevueAccount, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRevueAccount)o, afe, b);
    }
}
