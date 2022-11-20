// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventSocialContext$$JsonObjectMapper extends JsonMapper<JsonLiveEventSocialContext>
{
    public static JsonLiveEventSocialContext _parse(final tge tge) throws IOException {
        final JsonLiveEventSocialContext jsonLiveEventSocialContext = new JsonLiveEventSocialContext();
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
            parseField(jsonLiveEventSocialContext, d, tge);
            tge.l0();
        }
        return jsonLiveEventSocialContext;
    }
    
    public static void _serialize(final JsonLiveEventSocialContext jsonLiveEventSocialContext, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("social_context_type", jsonLiveEventSocialContext.b);
        afe.t0("text", jsonLiveEventSocialContext.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventSocialContext jsonLiveEventSocialContext, final String s, final tge tge) throws IOException {
        if ("social_context_type".equals(s)) {
            jsonLiveEventSocialContext.b = tge.T((String)null);
        }
        else if ("text".equals(s)) {
            jsonLiveEventSocialContext.a = tge.T((String)null);
        }
    }
    
    public JsonLiveEventSocialContext parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventSocialContext jsonLiveEventSocialContext, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEventSocialContext, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventSocialContext)o, afe, b);
    }
}
