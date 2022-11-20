// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventAttribution$$JsonObjectMapper extends JsonMapper<JsonLiveEventAttribution>
{
    public static JsonLiveEventAttribution _parse(final tge tge) throws IOException {
        final JsonLiveEventAttribution jsonLiveEventAttribution = new JsonLiveEventAttribution();
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
            parseField(jsonLiveEventAttribution, d, tge);
            tge.l0();
        }
        return jsonLiveEventAttribution;
    }
    
    public static void _serialize(final JsonLiveEventAttribution jsonLiveEventAttribution, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("text", jsonLiveEventAttribution.a);
        afe.t0("url", jsonLiveEventAttribution.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventAttribution jsonLiveEventAttribution, final String s, final tge tge) throws IOException {
        if ("text".equals(s)) {
            jsonLiveEventAttribution.a = tge.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonLiveEventAttribution.b = tge.T((String)null);
        }
    }
    
    public JsonLiveEventAttribution parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventAttribution jsonLiveEventAttribution, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEventAttribution, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventAttribution)o, afe, b);
    }
}
