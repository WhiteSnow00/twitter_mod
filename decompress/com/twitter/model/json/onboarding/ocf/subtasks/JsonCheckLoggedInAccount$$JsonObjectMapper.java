// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCheckLoggedInAccount$$JsonObjectMapper extends JsonMapper<JsonCheckLoggedInAccount>
{
    public static JsonCheckLoggedInAccount _parse(final tge tge) throws IOException {
        final JsonCheckLoggedInAccount jsonCheckLoggedInAccount = new JsonCheckLoggedInAccount();
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
            parseField(jsonCheckLoggedInAccount, d, tge);
            tge.l0();
        }
        return jsonCheckLoggedInAccount;
    }
    
    public static void _serialize(final JsonCheckLoggedInAccount jsonCheckLoggedInAccount, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonCheckLoggedInAccount.c != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonCheckLoggedInAccount.c, "false_link", true, afe);
        }
        if (jsonCheckLoggedInAccount.b != null) {
            LoganSquare.typeConverterFor((Class)ssv.class).serialize((Object)jsonCheckLoggedInAccount.b, "true_link", true, afe);
        }
        afe.t0("user_id", jsonCheckLoggedInAccount.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCheckLoggedInAccount jsonCheckLoggedInAccount, final String s, final tge tge) throws IOException {
        if ("false_link".equals(s)) {
            jsonCheckLoggedInAccount.c = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("true_link".equals(s)) {
            jsonCheckLoggedInAccount.b = (ssv)LoganSquare.typeConverterFor((Class)ssv.class).parse(tge);
        }
        else if ("user_id".equals(s)) {
            jsonCheckLoggedInAccount.a = tge.T((String)null);
        }
    }
    
    public JsonCheckLoggedInAccount parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCheckLoggedInAccount jsonCheckLoggedInAccount, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCheckLoggedInAccount, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCheckLoggedInAccount)o, afe, b);
    }
}
