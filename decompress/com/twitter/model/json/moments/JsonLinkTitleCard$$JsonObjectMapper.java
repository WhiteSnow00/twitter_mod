// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLinkTitleCard$$JsonObjectMapper extends JsonMapper<JsonLinkTitleCard>
{
    public static JsonLinkTitleCard _parse(final khe khe) throws IOException {
        final JsonLinkTitleCard jsonLinkTitleCard = new JsonLinkTitleCard();
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
            parseField(jsonLinkTitleCard, d, khe);
            khe.m0();
        }
        return jsonLinkTitleCard;
    }
    
    public static void _serialize(final JsonLinkTitleCard jsonLinkTitleCard, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("display_url", jsonLinkTitleCard.b);
        tfe.u0("title", jsonLinkTitleCard.d);
        tfe.u0("url", jsonLinkTitleCard.a);
        tfe.u0("vanity_source", jsonLinkTitleCard.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLinkTitleCard jsonLinkTitleCard, final String s, final khe khe) throws IOException {
        if ("display_url".equals(s)) {
            jsonLinkTitleCard.b = khe.T((String)null);
        }
        else if ("title".equals(s)) {
            jsonLinkTitleCard.d = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonLinkTitleCard.a = khe.T((String)null);
        }
        else if ("vanity_source".equals(s)) {
            jsonLinkTitleCard.c = khe.T((String)null);
        }
    }
    
    public JsonLinkTitleCard parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLinkTitleCard jsonLinkTitleCard, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLinkTitleCard, tfe, b);
    }
}
