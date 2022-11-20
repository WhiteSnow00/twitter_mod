// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonOcfDataReference$$JsonObjectMapper extends JsonMapper<JsonOcfDataReference>
{
    public static JsonOcfDataReference _parse(final tge tge) throws IOException {
        final JsonOcfDataReference jsonOcfDataReference = new JsonOcfDataReference();
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
            parseField(jsonOcfDataReference, d, tge);
            tge.l0();
        }
        return jsonOcfDataReference;
    }
    
    public static void _serialize(final JsonOcfDataReference jsonOcfDataReference, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("string", jsonOcfDataReference.b);
        if (jsonOcfDataReference.a != null) {
            LoganSquare.typeConverterFor((Class)vsr.class).serialize((Object)jsonOcfDataReference.a, "subtask_data_reference", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonOcfDataReference jsonOcfDataReference, final String s, final tge tge) throws IOException {
        if ("string".equals(s)) {
            jsonOcfDataReference.b = tge.T((String)null);
        }
        else if ("subtask_data_reference".equals(s)) {
            jsonOcfDataReference.a = (vsr)LoganSquare.typeConverterFor((Class)vsr.class).parse(tge);
        }
    }
    
    public JsonOcfDataReference parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonOcfDataReference jsonOcfDataReference, final afe afe, final boolean b) throws IOException {
        _serialize(jsonOcfDataReference, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonOcfDataReference)o, afe, b);
    }
}
