// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaResponse$$JsonObjectMapper extends JsonMapper<JsonMediaResponse>
{
    public static JsonMediaResponse _parse(final khe khe) throws IOException {
        final JsonMediaResponse jsonMediaResponse = new JsonMediaResponse();
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
            parseField(jsonMediaResponse, d, khe);
            khe.m0();
        }
        return jsonMediaResponse;
    }
    
    public static void _serialize(final JsonMediaResponse jsonMediaResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.W("media_id_string", jsonMediaResponse.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonMediaResponse jsonMediaResponse, final String s, final khe khe) throws IOException {
        if ("media_id_string".equals(s)) {
            jsonMediaResponse.a = khe.L();
        }
    }
    
    public JsonMediaResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonMediaResponse jsonMediaResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonMediaResponse, tfe, b);
    }
}
