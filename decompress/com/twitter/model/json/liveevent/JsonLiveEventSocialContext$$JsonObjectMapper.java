// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventSocialContext$$JsonObjectMapper extends JsonMapper<JsonLiveEventSocialContext>
{
    public static JsonLiveEventSocialContext _parse(final khe khe) throws IOException {
        final JsonLiveEventSocialContext jsonLiveEventSocialContext = new JsonLiveEventSocialContext();
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
            parseField(jsonLiveEventSocialContext, d, khe);
            khe.m0();
        }
        return jsonLiveEventSocialContext;
    }
    
    public static void _serialize(final JsonLiveEventSocialContext jsonLiveEventSocialContext, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("social_context_type", jsonLiveEventSocialContext.b);
        tfe.u0("text", jsonLiveEventSocialContext.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventSocialContext jsonLiveEventSocialContext, final String s, final khe khe) throws IOException {
        if ("social_context_type".equals(s)) {
            jsonLiveEventSocialContext.b = khe.T((String)null);
        }
        else if ("text".equals(s)) {
            jsonLiveEventSocialContext.a = khe.T((String)null);
        }
    }
    
    public JsonLiveEventSocialContext parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventSocialContext jsonLiveEventSocialContext, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventSocialContext, tfe, b);
    }
}
