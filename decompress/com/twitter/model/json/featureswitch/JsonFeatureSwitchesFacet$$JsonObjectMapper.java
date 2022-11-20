// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.featureswitch;

import java.util.Iterator;
import java.util.ArrayList;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeatureSwitchesFacet$$JsonObjectMapper extends JsonMapper<JsonFeatureSwitchesFacet>
{
    public static JsonFeatureSwitchesFacet _parse(final tge tge) throws IOException {
        final JsonFeatureSwitchesFacet jsonFeatureSwitchesFacet = new JsonFeatureSwitchesFacet();
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
            parseField(jsonFeatureSwitchesFacet, d, tge);
            tge.l0();
        }
        return jsonFeatureSwitchesFacet;
    }
    
    public static void _serialize(final JsonFeatureSwitchesFacet jsonFeatureSwitchesFacet, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("description", jsonFeatureSwitchesFacet.b);
        afe.t0("name", jsonFeatureSwitchesFacet.a);
        afe.t0("owner", jsonFeatureSwitchesFacet.c);
        final ArrayList e = jsonFeatureSwitchesFacet.e;
        if (e != null) {
            final Iterator a = br.A(afe, "parameters", e);
            while (a.hasNext()) {
                final tta tta = a.next();
                if (tta != null) {
                    LoganSquare.typeConverterFor((Class)tta.class).serialize((Object)tta, "lslocalparametersElement", false, afe);
                }
            }
            afe.f();
        }
        afe.e("requires_restart", jsonFeatureSwitchesFacet.d);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFeatureSwitchesFacet jsonFeatureSwitchesFacet, final String s, final tge tge) throws IOException {
        if ("description".equals(s)) {
            jsonFeatureSwitchesFacet.b = tge.T((String)null);
        }
        else if ("name".equals(s)) {
            jsonFeatureSwitchesFacet.a = tge.T((String)null);
        }
        else if ("owner".equals(s)) {
            jsonFeatureSwitchesFacet.c = tge.T((String)null);
        }
        else if ("parameters".equals(s)) {
            if (tge.e() == vie.N0) {
                final ArrayList e = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final tta tta = (tta)LoganSquare.typeConverterFor((Class)tta.class).parse(tge);
                    if (tta != null) {
                        e.add(tta);
                    }
                }
                jsonFeatureSwitchesFacet.e = e;
            }
            else {
                jsonFeatureSwitchesFacet.e = null;
            }
        }
        else if ("requires_restart".equals(s)) {
            jsonFeatureSwitchesFacet.d = tge.k();
        }
    }
    
    public JsonFeatureSwitchesFacet parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFeatureSwitchesFacet jsonFeatureSwitchesFacet, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFeatureSwitchesFacet, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFeatureSwitchesFacet)o, afe, b);
    }
}
