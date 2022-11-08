// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaResponse$$JsonObjectMapper extends JsonMapper<JsonFoundMediaResponse>
{
    public static JsonFoundMediaResponse _parse(final khe khe) throws IOException {
        final JsonFoundMediaResponse jsonFoundMediaResponse = new JsonFoundMediaResponse();
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
            parseField(jsonFoundMediaResponse, d, khe);
            khe.m0();
        }
        return jsonFoundMediaResponse;
    }
    
    public static void _serialize(final JsonFoundMediaResponse jsonFoundMediaResponse, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        if (jsonFoundMediaResponse.b != null) {
            LoganSquare.typeConverterFor((Class)jnb.class).serialize((Object)jsonFoundMediaResponse.b, "cursor", true, tfe);
        }
        if (jsonFoundMediaResponse.a != null) {
            LoganSquare.typeConverterFor((Class)knb.class).serialize((Object)jsonFoundMediaResponse.a, "data", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaResponse jsonFoundMediaResponse, final String s, final khe khe) throws IOException {
        if ("cursor".equals(s)) {
            jsonFoundMediaResponse.b = (jnb)LoganSquare.typeConverterFor((Class)jnb.class).parse(khe);
        }
        else if ("data".equals(s)) {
            jsonFoundMediaResponse.a = (knb)LoganSquare.typeConverterFor((Class)knb.class).parse(khe);
        }
    }
    
    public JsonFoundMediaResponse parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFoundMediaResponse jsonFoundMediaResponse, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaResponse, tfe, b);
    }
}
