// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonListSettingsInputData$$JsonObjectMapper extends JsonMapper<JsonListSettingsInputData>
{
    public static JsonListSettingsInputData _parse(final qhe qhe) throws IOException {
        final JsonListSettingsInputData jsonListSettingsInputData = new JsonListSettingsInputData();
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
            parseField(jsonListSettingsInputData, d, qhe);
            qhe.m0();
        }
        return jsonListSettingsInputData;
    }
    
    public static void _serialize(final JsonListSettingsInputData jsonListSettingsInputData, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final List<String> a = jsonListSettingsInputData.a;
        if (a != null) {
            final Iterator o = ffe.o(yfe, "selected_values", a);
            while (o.hasNext()) {
                yfe.s0((String)o.next());
            }
            yfe.f();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonListSettingsInputData jsonListSettingsInputData, String t, final qhe qhe) throws IOException {
        if ("selected_values".equals(t)) {
            if (qhe.e() == rje.P0) {
                final ArrayList a = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    t = qhe.T((String)null);
                    if (t != null) {
                        a.add(t);
                    }
                }
                jsonListSettingsInputData.a = a;
            }
            else {
                jsonListSettingsInputData.a = null;
            }
        }
    }
    
    public JsonListSettingsInputData parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonListSettingsInputData jsonListSettingsInputData, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonListSettingsInputData, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonListSettingsInputData)o, yfe, b);
    }
}
