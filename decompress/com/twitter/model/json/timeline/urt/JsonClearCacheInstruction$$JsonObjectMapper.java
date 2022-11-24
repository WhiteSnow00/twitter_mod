// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClearCacheInstruction$$JsonObjectMapper extends JsonMapper<JsonClearCacheInstruction>
{
    public static JsonClearCacheInstruction _parse(final qhe qhe) throws IOException {
        final JsonClearCacheInstruction jsonClearCacheInstruction = new JsonClearCacheInstruction();
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
            parseField(jsonClearCacheInstruction, d, qhe);
            qhe.m0();
        }
        return jsonClearCacheInstruction;
    }
    
    public static void _serialize(final JsonClearCacheInstruction jsonClearCacheInstruction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClearCacheInstruction jsonClearCacheInstruction, final String s, final qhe qhe) throws IOException {
    }
    
    public JsonClearCacheInstruction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClearCacheInstruction jsonClearCacheInstruction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonClearCacheInstruction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClearCacheInstruction)o, yfe, b);
    }
}
