// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.condition;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBooleanAllTrueData$$JsonObjectMapper extends JsonMapper<JsonBooleanAllTrueData>
{
    public static JsonBooleanAllTrueData _parse(final tge tge) throws IOException {
        final JsonBooleanAllTrueData jsonBooleanAllTrueData = new JsonBooleanAllTrueData();
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
            parseField(jsonBooleanAllTrueData, d, tge);
            tge.l0();
        }
        return jsonBooleanAllTrueData;
    }
    
    public static void _serialize(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final List<String> a = jsonBooleanAllTrueData.a;
        if (a != null) {
            final Iterator g = hee.g(afe, "component_identifiers", (List)a);
            while (g.hasNext()) {
                afe.r0((String)g.next());
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final String s, final tge tge) throws IOException {
        if ("component_identifiers".equals(s)) {
            if (tge.e() != vie.N0) {
                Objects.requireNonNull(jsonBooleanAllTrueData);
                czd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (tge.h0() != vie.O0) {
                final String t = tge.T((String)null);
                if (t != null) {
                    a.add(t);
                }
            }
            Objects.requireNonNull(jsonBooleanAllTrueData);
            jsonBooleanAllTrueData.a = a;
        }
    }
    
    public JsonBooleanAllTrueData parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBooleanAllTrueData, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBooleanAllTrueData)o, afe, b);
    }
}
