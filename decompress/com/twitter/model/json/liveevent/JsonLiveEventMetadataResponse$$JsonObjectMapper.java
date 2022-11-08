// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveEventMetadataResponse$$JsonObjectMapper extends JsonMapper<JsonLiveEventMetadataResponse>
{
    public static JsonLiveEventMetadataResponse _parse(final khe khe) throws IOException {
        final JsonLiveEventMetadataResponse jsonLiveEventMetadataResponse = new JsonLiveEventMetadataResponse();
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
            parseField(jsonLiveEventMetadataResponse, d, khe);
            khe.m0();
        }
        return jsonLiveEventMetadataResponse;
    }
    
    public static void _serialize(final JsonLiveEventMetadataResponse jsonLiveEventMetadataResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonLiveEventMetadataResponse.a != null) {
            LoganSquare.typeConverterFor((Class)vwf.a.class).serialize((Object)jsonLiveEventMetadataResponse.a, "response", true, tfe);
        }
        if (jsonLiveEventMetadataResponse.b != null) {
            LoganSquare.typeConverterFor((Class)vwf.b.class).serialize((Object)jsonLiveEventMetadataResponse.b, "twitter_objects", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveEventMetadataResponse jsonLiveEventMetadataResponse, final String s, final khe khe) throws IOException {
        if ("response".equals(s)) {
            jsonLiveEventMetadataResponse.a = (vwf.a)LoganSquare.typeConverterFor((Class)vwf.a.class).parse(khe);
        }
        else if ("twitter_objects".equals(s)) {
            jsonLiveEventMetadataResponse.b = (vwf.b)LoganSquare.typeConverterFor((Class)vwf.b.class).parse(khe);
        }
    }
    
    public JsonLiveEventMetadataResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveEventMetadataResponse jsonLiveEventMetadataResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveEventMetadataResponse, tfe, b);
    }
}
