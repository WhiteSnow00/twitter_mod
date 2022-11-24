// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfDataReference$$JsonObjectMapper extends JsonMapper<JsonOcfDataReference>
{
    public static JsonOcfDataReference _parse(final qhe qhe) throws IOException {
        final JsonOcfDataReference jsonOcfDataReference = new JsonOcfDataReference();
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
            parseField(jsonOcfDataReference, d, qhe);
            qhe.m0();
        }
        return jsonOcfDataReference;
    }
    
    public static void _serialize(final JsonOcfDataReference jsonOcfDataReference, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("string", jsonOcfDataReference.b);
        if (jsonOcfDataReference.a != null) {
            LoganSquare.typeConverterFor((Class)ttr.class).serialize((Object)jsonOcfDataReference.a, "subtask_data_reference", true, yfe);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonOcfDataReference jsonOcfDataReference, final String s, final qhe qhe) throws IOException {
        if ("string".equals(s)) {
            jsonOcfDataReference.b = qhe.T((String)null);
        }
        else if ("subtask_data_reference".equals(s)) {
            jsonOcfDataReference.a = (ttr)LoganSquare.typeConverterFor((Class)ttr.class).parse(qhe);
        }
    }
    
    public JsonOcfDataReference parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonOcfDataReference jsonOcfDataReference, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonOcfDataReference, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonOcfDataReference)o, yfe, b);
    }
}
