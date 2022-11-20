// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubtaskDataReference$$JsonObjectMapper extends JsonMapper<JsonSubtaskDataReference>
{
    public static JsonSubtaskDataReference _parse(final tge tge) throws IOException {
        final JsonSubtaskDataReference jsonSubtaskDataReference = new JsonSubtaskDataReference();
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
            parseField(jsonSubtaskDataReference, d, tge);
            tge.l0();
        }
        return jsonSubtaskDataReference;
    }
    
    public static void _serialize(final JsonSubtaskDataReference jsonSubtaskDataReference, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("key", jsonSubtaskDataReference.b);
        afe.t0("subtask_id", jsonSubtaskDataReference.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonSubtaskDataReference jsonSubtaskDataReference, final String s, final tge tge) throws IOException {
        if ("key".equals(s)) {
            jsonSubtaskDataReference.b = tge.T((String)null);
        }
        else if ("subtask_id".equals(s)) {
            jsonSubtaskDataReference.a = tge.T((String)null);
        }
    }
    
    public JsonSubtaskDataReference parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonSubtaskDataReference jsonSubtaskDataReference, final afe afe, final boolean b) throws IOException {
        _serialize(jsonSubtaskDataReference, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonSubtaskDataReference)o, afe, b);
    }
}
