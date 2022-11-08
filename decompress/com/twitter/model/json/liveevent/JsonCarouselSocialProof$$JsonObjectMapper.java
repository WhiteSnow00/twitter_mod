// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCarouselSocialProof$$JsonObjectMapper extends JsonMapper<JsonCarouselSocialProof>
{
    public static JsonCarouselSocialProof _parse(final khe khe) throws IOException {
        final JsonCarouselSocialProof jsonCarouselSocialProof = new JsonCarouselSocialProof();
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
            parseField(jsonCarouselSocialProof, d, khe);
            khe.m0();
        }
        return jsonCarouselSocialProof;
    }
    
    public static void _serialize(final JsonCarouselSocialProof jsonCarouselSocialProof, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("count", jsonCarouselSocialProof.b);
        tfe.u0("type", jsonCarouselSocialProof.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCarouselSocialProof jsonCarouselSocialProof, final String s, final khe khe) throws IOException {
        if ("count".equals(s)) {
            jsonCarouselSocialProof.b = khe.L();
        }
        else if ("type".equals(s)) {
            jsonCarouselSocialProof.a = khe.T((String)null);
        }
    }
    
    public JsonCarouselSocialProof parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCarouselSocialProof jsonCarouselSocialProof, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCarouselSocialProof, tfe, b);
    }
}
