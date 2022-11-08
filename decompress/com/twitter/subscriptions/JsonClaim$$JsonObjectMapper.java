// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClaim$$JsonObjectMapper extends JsonMapper<JsonClaim>
{
    public static JsonClaim _parse(final khe khe) throws IOException {
        final JsonClaim jsonClaim = new JsonClaim();
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
            parseField(jsonClaim, d, khe);
            khe.m0();
        }
        return jsonClaim;
    }
    
    public static void _serialize(final JsonClaim jsonClaim, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final List a = jsonClaim.a;
        if (a != null) {
            final Iterator f = x30.F(tfe, "resources", a);
            while (f.hasNext()) {
                final bqm bqm = f.next();
                if (bqm != null) {
                    LoganSquare.typeConverterFor((Class)bqm.class).serialize((Object)bqm, "lslocalresourcesElement", false, tfe);
                }
            }
            tfe.f();
        }
        tfe.u0("rest_id", jsonClaim.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonClaim jsonClaim, String t, final khe khe) throws IOException {
        if ("resources".equals(t)) {
            if (khe.e() != lje.M0) {
                Objects.requireNonNull(jsonClaim);
                zzd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (khe.i0() != lje.N0) {
                final bqm bqm = (bqm)LoganSquare.typeConverterFor((Class)bqm.class).parse(khe);
                if (bqm != null) {
                    a.add(bqm);
                }
            }
            Objects.requireNonNull(jsonClaim);
            jsonClaim.a = a;
        }
        else if ("rest_id".equals(t)) {
            t = khe.T((String)null);
            Objects.requireNonNull(jsonClaim);
            zzd.f((Object)t, "<set-?>");
            jsonClaim.b = t;
        }
    }
    
    public JsonClaim parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonClaim jsonClaim, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonClaim, tfe, b);
    }
}
