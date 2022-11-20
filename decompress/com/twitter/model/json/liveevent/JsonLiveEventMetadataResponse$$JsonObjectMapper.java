// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventMetadataResponse$$JsonObjectMapper extends JsonMapper<JsonLiveEventMetadataResponse>
{
    public static JsonLiveEventMetadataResponse _parse(final tge tge) throws IOException {
        final JsonLiveEventMetadataResponse jsonLiveEventMetadataResponse = new JsonLiveEventMetadataResponse();
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
            parseField(jsonLiveEventMetadataResponse, d, tge);
            tge.l0();
        }
        return jsonLiveEventMetadataResponse;
    }
    
    public static void _serialize(final JsonLiveEventMetadataResponse jsonLiveEventMetadataResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonLiveEventMetadataResponse.a != null) {
            LoganSquare.typeConverterFor((Class)gwf$a.class).serialize((Object)jsonLiveEventMetadataResponse.a, "response", true, afe);
        }
        if (jsonLiveEventMetadataResponse.b != null) {
            LoganSquare.typeConverterFor((Class)gwf$b.class).serialize((Object)jsonLiveEventMetadataResponse.b, "twitter_objects", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventMetadataResponse jsonLiveEventMetadataResponse, final String s, final tge tge) throws IOException {
        if ("response".equals(s)) {
            jsonLiveEventMetadataResponse.a = (gwf$a)LoganSquare.typeConverterFor((Class)gwf$a.class).parse(tge);
        }
        else if ("twitter_objects".equals(s)) {
            jsonLiveEventMetadataResponse.b = (gwf$b)LoganSquare.typeConverterFor((Class)gwf$b.class).parse(tge);
        }
    }
    
    public JsonLiveEventMetadataResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveEventMetadataResponse jsonLiveEventMetadataResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveEventMetadataResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveEventMetadataResponse)o, afe, b);
    }
}
