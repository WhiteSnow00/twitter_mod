// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCheckLoggedInAccount$$JsonObjectMapper extends JsonMapper<JsonCheckLoggedInAccount>
{
    public static JsonCheckLoggedInAccount _parse(final khe khe) throws IOException {
        final JsonCheckLoggedInAccount jsonCheckLoggedInAccount = new JsonCheckLoggedInAccount();
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
            parseField(jsonCheckLoggedInAccount, d, khe);
            khe.m0();
        }
        return jsonCheckLoggedInAccount;
    }
    
    public static void _serialize(final JsonCheckLoggedInAccount jsonCheckLoggedInAccount, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonCheckLoggedInAccount.c != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonCheckLoggedInAccount.c, "false_link", true, tfe);
        }
        if (jsonCheckLoggedInAccount.b != null) {
            LoganSquare.typeConverterFor((Class)xrv.class).serialize((Object)jsonCheckLoggedInAccount.b, "true_link", true, tfe);
        }
        tfe.u0("user_id", jsonCheckLoggedInAccount.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCheckLoggedInAccount jsonCheckLoggedInAccount, final String s, final khe khe) throws IOException {
        if ("false_link".equals(s)) {
            jsonCheckLoggedInAccount.c = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("true_link".equals(s)) {
            jsonCheckLoggedInAccount.b = (xrv)LoganSquare.typeConverterFor((Class)xrv.class).parse(khe);
        }
        else if ("user_id".equals(s)) {
            jsonCheckLoggedInAccount.a = khe.T((String)null);
        }
    }
    
    public JsonCheckLoggedInAccount parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCheckLoggedInAccount jsonCheckLoggedInAccount, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCheckLoggedInAccount, tfe, b);
    }
}
