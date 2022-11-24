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
    public static JsonBooleanAllTrueData _parse(final qhe qhe) throws IOException {
        final JsonBooleanAllTrueData jsonBooleanAllTrueData = new JsonBooleanAllTrueData();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonBooleanAllTrueData, d, qhe);
            qhe.m0();
        }
        return jsonBooleanAllTrueData;
    }
    
    public static void _serialize(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final List<String> a = jsonBooleanAllTrueData.a;
        if (a != null) {
            final Iterator o = ffe.o(yfe, "component_identifiers", a);
            while (o.hasNext()) {
                yfe.s0((String)o.next());
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final String s, final qhe qhe) throws IOException {
        if ("component_identifiers".equals(s)) {
            if (qhe.e() != rje.P0) {
                Objects.requireNonNull(jsonBooleanAllTrueData);
                e0e.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (qhe.i0() != rje.Q0) {
                final String t = qhe.T((String)null);
                if (t != null) {
                    a.add(t);
                }
            }
            Objects.requireNonNull(jsonBooleanAllTrueData);
            jsonBooleanAllTrueData.a = a;
        }
    }
    
    public JsonBooleanAllTrueData parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonBooleanAllTrueData jsonBooleanAllTrueData, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonBooleanAllTrueData, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonBooleanAllTrueData)o, yfe, b);
    }
}
