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
    public static JsonBooleanAllTrueData _parse(final khe khe) throws IOException {
        final JsonBooleanAllTrueData jsonBooleanAllTrueData = new JsonBooleanAllTrueData();
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
            parseField(jsonBooleanAllTrueData, d, khe);
            khe.m0();
        }
        return jsonBooleanAllTrueData;
    }
    
    public static void _serialize(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        final List<String> a = jsonBooleanAllTrueData.a;
        if (a != null) {
            final Iterator f = x30.F(tfe, "component_identifiers", (List)a);
            while (f.hasNext()) {
                tfe.s0((String)f.next());
            }
            tfe.f();
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final String s, final khe khe) throws IOException {
        if ("component_identifiers".equals(s)) {
            if (khe.e() != lje.M0) {
                Objects.requireNonNull(jsonBooleanAllTrueData);
                zzd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (khe.i0() != lje.N0) {
                final String t = khe.T((String)null);
                if (t != null) {
                    a.add(t);
                }
            }
            Objects.requireNonNull(jsonBooleanAllTrueData);
            jsonBooleanAllTrueData.a = a;
        }
    }
    
    public JsonBooleanAllTrueData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonBooleanAllTrueData, tfe, b);
    }
}
