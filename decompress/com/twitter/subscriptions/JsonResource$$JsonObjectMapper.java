// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonResource$$JsonObjectMapper extends JsonMapper<JsonResource>
{
    public static JsonResource _parse(final khe khe) throws IOException {
        final JsonResource jsonResource = new JsonResource();
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
            parseField(jsonResource, d, khe);
            khe.m0();
        }
        return jsonResource;
    }
    
    public static void _serialize(final JsonResource jsonResource, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("id", jsonResource.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonResource jsonResource, final String s, final khe khe) throws IOException {
        if ("id".equals(s)) {
            jsonResource.a = khe.T((String)null);
        }
    }
    
    public JsonResource parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonResource jsonResource, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonResource, tfe, b);
    }
}
