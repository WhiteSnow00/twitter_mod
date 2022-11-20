// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonMediaResponse$$JsonObjectMapper extends JsonMapper<JsonMediaResponse>
{
    public static JsonMediaResponse _parse(final tge tge) throws IOException {
        final JsonMediaResponse jsonMediaResponse = new JsonMediaResponse();
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
            parseField(jsonMediaResponse, d, tge);
            tge.l0();
        }
        return jsonMediaResponse;
    }
    
    public static void _serialize(final JsonMediaResponse jsonMediaResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.V("media_id_string", jsonMediaResponse.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonMediaResponse jsonMediaResponse, final String s, final tge tge) throws IOException {
        if ("media_id_string".equals(s)) {
            jsonMediaResponse.a = tge.K();
        }
    }
    
    public JsonMediaResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonMediaResponse jsonMediaResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonMediaResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonMediaResponse)o, afe, b);
    }
}
