// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOauthPermissionPolicy$$JsonObjectMapper extends JsonMapper<JsonOauthPermissionPolicy>
{
    public static JsonOauthPermissionPolicy _parse(final khe khe) throws IOException {
        final JsonOauthPermissionPolicy jsonOauthPermissionPolicy = new JsonOauthPermissionPolicy();
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
            parseField(jsonOauthPermissionPolicy, d, khe);
            khe.m0();
        }
        return jsonOauthPermissionPolicy;
    }
    
    public static void _serialize(final JsonOauthPermissionPolicy jsonOauthPermissionPolicy, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final ArrayList a = jsonOauthPermissionPolicy.a;
        if (a != null) {
            final Iterator g = q1a.g(tfe, "can", a);
            while (g.hasNext()) {
                final d3j d3j = g.next();
                if (d3j != null) {
                    LoganSquare.typeConverterFor((Class)d3j.class).serialize((Object)d3j, "lslocalcanElement", false, tfe);
                }
            }
            tfe.f();
        }
        final ArrayList b2 = jsonOauthPermissionPolicy.b;
        if (b2 != null) {
            final Iterator g2 = q1a.g(tfe, "cannot", b2);
            while (g2.hasNext()) {
                final d3j d3j2 = g2.next();
                if (d3j2 != null) {
                    LoganSquare.typeConverterFor((Class)d3j.class).serialize((Object)d3j2, "lslocalcannotElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonOauthPermissionPolicy jsonOauthPermissionPolicy, final String s, final khe khe) throws IOException {
        if ("can".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList a = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final d3j d3j = (d3j)LoganSquare.typeConverterFor((Class)d3j.class).parse(khe);
                    if (d3j != null) {
                        a.add(d3j);
                    }
                }
                jsonOauthPermissionPolicy.a = a;
            }
            else {
                jsonOauthPermissionPolicy.a = null;
            }
        }
        else if ("cannot".equals(s)) {
            if (khe.e() == lje.M0) {
                final ArrayList b = new ArrayList();
                while (khe.i0() != lje.N0) {
                    final d3j d3j2 = (d3j)LoganSquare.typeConverterFor((Class)d3j.class).parse(khe);
                    if (d3j2 != null) {
                        b.add(d3j2);
                    }
                }
                jsonOauthPermissionPolicy.b = b;
            }
            else {
                jsonOauthPermissionPolicy.b = null;
            }
        }
    }
    
    public JsonOauthPermissionPolicy parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonOauthPermissionPolicy jsonOauthPermissionPolicy, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonOauthPermissionPolicy, tfe, b);
    }
}
