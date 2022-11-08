// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventAttribution$$JsonObjectMapper extends JsonMapper<JsonLiveEventAttribution>
{
    public static JsonLiveEventAttribution _parse(final khe khe) throws IOException {
        final JsonLiveEventAttribution jsonLiveEventAttribution = new JsonLiveEventAttribution();
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
            parseField(jsonLiveEventAttribution, d, khe);
            khe.m0();
        }
        return jsonLiveEventAttribution;
    }
    
    public static void _serialize(final JsonLiveEventAttribution jsonLiveEventAttribution, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("text", jsonLiveEventAttribution.a);
        tfe.u0("url", jsonLiveEventAttribution.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventAttribution jsonLiveEventAttribution, final String s, final khe khe) throws IOException {
        if ("text".equals(s)) {
            jsonLiveEventAttribution.a = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonLiveEventAttribution.b = khe.T((String)null);
        }
    }
    
    public JsonLiveEventAttribution parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventAttribution jsonLiveEventAttribution, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventAttribution, tfe, b);
    }
}
