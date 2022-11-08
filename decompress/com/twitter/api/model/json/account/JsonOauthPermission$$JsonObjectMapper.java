// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOauthPermission$$JsonObjectMapper extends JsonMapper<JsonOauthPermission>
{
    public static JsonOauthPermission _parse(final khe khe) throws IOException {
        final JsonOauthPermission jsonOauthPermission = new JsonOauthPermission();
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
            parseField(jsonOauthPermission, d, khe);
            khe.m0();
        }
        return jsonOauthPermission;
    }
    
    public static void _serialize(final JsonOauthPermission jsonOauthPermission, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("description", jsonOauthPermission.a);
        final ArrayList b2 = jsonOauthPermission.b;
        if (b2 != null) {
            final Iterator g = q1a.g(tfe, "items", b2);
            while (g.hasNext()) {
                tfe.s0((String)g.next());
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOauthPermission jsonOauthPermission, final String s, final khe khe) throws IOException {
        if ("description".equals(s)) {
            jsonOauthPermission.a = khe.T((String)null);
        }
        else if ("items".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final String t = khe.T((String)null);
                    if (t != null) {
                        b.add(t);
                    }
                }
                jsonOauthPermission.b = b;
            }
            else {
                jsonOauthPermission.b = null;
            }
        }
    }
    
    public JsonOauthPermission parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOauthPermission jsonOauthPermission, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOauthPermission, tfe, b);
    }
}
