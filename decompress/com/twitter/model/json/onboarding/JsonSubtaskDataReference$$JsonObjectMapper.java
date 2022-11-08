// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubtaskDataReference$$JsonObjectMapper extends JsonMapper<JsonSubtaskDataReference>
{
    public static JsonSubtaskDataReference _parse(final khe khe) throws IOException {
        final JsonSubtaskDataReference jsonSubtaskDataReference = new JsonSubtaskDataReference();
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
            parseField(jsonSubtaskDataReference, d, khe);
            khe.m0();
        }
        return jsonSubtaskDataReference;
    }
    
    public static void _serialize(final JsonSubtaskDataReference jsonSubtaskDataReference, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("key", jsonSubtaskDataReference.b);
        tfe.u0("subtask_id", jsonSubtaskDataReference.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSubtaskDataReference jsonSubtaskDataReference, final String s, final khe khe) throws IOException {
        if ("key".equals(s)) {
            jsonSubtaskDataReference.b = khe.T((String)null);
        }
        else if ("subtask_id".equals(s)) {
            jsonSubtaskDataReference.a = khe.T((String)null);
        }
    }
    
    public JsonSubtaskDataReference parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSubtaskDataReference jsonSubtaskDataReference, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSubtaskDataReference, tfe, b);
    }
}
