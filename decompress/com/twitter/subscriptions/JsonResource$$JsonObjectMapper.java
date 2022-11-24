// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonResource$$JsonObjectMapper extends JsonMapper<JsonResource>
{
    public static JsonResource _parse(final qhe qhe) throws IOException {
        final JsonResource jsonResource = new JsonResource();
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
            parseField(jsonResource, d, qhe);
            qhe.m0();
        }
        return jsonResource;
    }
    
    public static void _serialize(final JsonResource jsonResource, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonResource.a);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonResource jsonResource, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonResource.a = qhe.T((String)null);
        }
    }
    
    public JsonResource parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonResource jsonResource, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonResource, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonResource)o, yfe, b);
    }
}
