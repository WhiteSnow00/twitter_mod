// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonIdWrapper$$JsonObjectMapper extends JsonMapper<JsonIdWrapper>
{
    public static JsonIdWrapper _parse(final qhe qhe) throws IOException {
        final JsonIdWrapper jsonIdWrapper = new JsonIdWrapper();
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
            parseField(jsonIdWrapper, d, qhe);
            qhe.m0();
        }
        return jsonIdWrapper;
    }
    
    public static void _serialize(final JsonIdWrapper jsonIdWrapper, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonIdWrapper.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonIdWrapper jsonIdWrapper, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonIdWrapper.a = qhe.T((String)null);
        }
    }
    
    public JsonIdWrapper parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonIdWrapper jsonIdWrapper, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonIdWrapper, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonIdWrapper)o, yfe, b);
    }
}
