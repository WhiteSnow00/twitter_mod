// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCarouselSocialProof$$JsonObjectMapper extends JsonMapper<JsonCarouselSocialProof>
{
    public static JsonCarouselSocialProof _parse(final tge tge) throws IOException {
        final JsonCarouselSocialProof jsonCarouselSocialProof = new JsonCarouselSocialProof();
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
            parseField(jsonCarouselSocialProof, d, tge);
            tge.l0();
        }
        return jsonCarouselSocialProof;
    }
    
    public static void _serialize(final JsonCarouselSocialProof jsonCarouselSocialProof, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.V("count", jsonCarouselSocialProof.b);
        afe.t0("type", jsonCarouselSocialProof.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonCarouselSocialProof jsonCarouselSocialProof, final String s, final tge tge) throws IOException {
        if ("count".equals(s)) {
            jsonCarouselSocialProof.b = tge.K();
        }
        else if ("type".equals(s)) {
            jsonCarouselSocialProof.a = tge.T((String)null);
        }
    }
    
    public JsonCarouselSocialProof parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonCarouselSocialProof jsonCarouselSocialProof, final afe afe, final boolean b) throws IOException {
        _serialize(jsonCarouselSocialProof, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonCarouselSocialProof)o, afe, b);
    }
}
