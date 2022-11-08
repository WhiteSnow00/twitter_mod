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

public final class JsonClaims$$JsonObjectMapper extends JsonMapper<JsonClaims>
{
    public static JsonClaims _parse(final khe khe) throws IOException {
        final JsonClaims jsonClaims = new JsonClaims();
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
            parseField(jsonClaims, d, khe);
            khe.m0();
        }
        return jsonClaims;
    }
    
    public static void _serialize(final JsonClaims jsonClaims, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final List a = jsonClaims.a;
        if (a != null) {
            final Iterator f = x30.F(tfe, "claims", a);
            while (f.hasNext()) {
                final hb4 hb4 = f.next();
                if (hb4 != null) {
                    LoganSquare.typeConverterFor((Class)hb4.class).serialize((Object)hb4, "lslocalclaimsElement", false, tfe);
                }
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonClaims jsonClaims, final String s, final khe khe) throws IOException {
        if ("claims".equals(s)) {
            if (khe.e() != lje.M0) {
                Objects.requireNonNull(jsonClaims);
                zzd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (khe.i0() != lje.N0) {
                final hb4 hb4 = (hb4)LoganSquare.typeConverterFor((Class)hb4.class).parse(khe);
                if (hb4 != null) {
                    a.add(hb4);
                }
            }
            Objects.requireNonNull(jsonClaims);
            jsonClaims.a = a;
        }
    }
    
    public JsonClaims parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonClaims jsonClaims, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonClaims, tfe, b);
    }
}
