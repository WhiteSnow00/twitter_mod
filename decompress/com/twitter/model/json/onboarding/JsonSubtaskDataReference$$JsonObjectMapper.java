// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSubtaskDataReference$$JsonObjectMapper extends JsonMapper<JsonSubtaskDataReference>
{
    public static JsonSubtaskDataReference _parse(final qhe qhe) throws IOException {
        final JsonSubtaskDataReference jsonSubtaskDataReference = new JsonSubtaskDataReference();
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
            parseField(jsonSubtaskDataReference, d, qhe);
            qhe.m0();
        }
        return jsonSubtaskDataReference;
    }
    
    public static void _serialize(final JsonSubtaskDataReference jsonSubtaskDataReference, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("key", jsonSubtaskDataReference.b);
        yfe.u0("subtask_id", jsonSubtaskDataReference.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonSubtaskDataReference jsonSubtaskDataReference, final String s, final qhe qhe) throws IOException {
        if ("key".equals(s)) {
            jsonSubtaskDataReference.b = qhe.T((String)null);
        }
        else if ("subtask_id".equals(s)) {
            jsonSubtaskDataReference.a = qhe.T((String)null);
        }
    }
    
    public JsonSubtaskDataReference parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonSubtaskDataReference jsonSubtaskDataReference, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonSubtaskDataReference, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonSubtaskDataReference)o, yfe, b);
    }
}
