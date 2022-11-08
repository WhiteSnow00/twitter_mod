// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.sru;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSruResponse$$JsonObjectMapper extends JsonMapper<JsonSruResponse>
{
    public static JsonSruResponse _parse(final khe khe) throws IOException {
        final JsonSruResponse jsonSruResponse = new JsonSruResponse();
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
            parseField(jsonSruResponse, d, khe);
            khe.m0();
        }
        return jsonSruResponse;
    }
    
    public static void _serialize(final JsonSruResponse jsonSruResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("expires_after_secs", jsonSruResponse.c);
        tfe.W("media_id", jsonSruResponse.a);
        if (jsonSruResponse.d != null) {
            tfe.i("processing_info");
            JsonProcessingInfo$$JsonObjectMapper._serialize(jsonSruResponse.d, tfe, true);
        }
        tfe.T("size", jsonSruResponse.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonSruResponse jsonSruResponse, final String s, final khe khe) throws IOException {
        if ("expires_after_secs".equals(s)) {
            jsonSruResponse.c = khe.z();
        }
        else if ("media_id".equals(s)) {
            jsonSruResponse.a = khe.L();
        }
        else if ("processing_info".equals(s)) {
            jsonSruResponse.d = JsonProcessingInfo$$JsonObjectMapper._parse(khe);
        }
        else if ("size".equals(s)) {
            jsonSruResponse.b = khe.z();
        }
    }
    
    public JsonSruResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonSruResponse jsonSruResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonSruResponse, tfe, b);
    }
}
