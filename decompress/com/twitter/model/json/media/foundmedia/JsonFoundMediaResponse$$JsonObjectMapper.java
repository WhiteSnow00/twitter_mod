// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaResponse$$JsonObjectMapper extends JsonMapper<JsonFoundMediaResponse>
{
    public static JsonFoundMediaResponse _parse(final tge tge) throws IOException {
        final JsonFoundMediaResponse jsonFoundMediaResponse = new JsonFoundMediaResponse();
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
            parseField(jsonFoundMediaResponse, d, tge);
            tge.l0();
        }
        return jsonFoundMediaResponse;
    }
    
    public static void _serialize(final JsonFoundMediaResponse jsonFoundMediaResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        if (jsonFoundMediaResponse.b != null) {
            LoganSquare.typeConverterFor((Class)gmb.class).serialize((Object)jsonFoundMediaResponse.b, "cursor", true, afe);
        }
        if (jsonFoundMediaResponse.a != null) {
            LoganSquare.typeConverterFor((Class)hmb.class).serialize((Object)jsonFoundMediaResponse.a, "data", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaResponse jsonFoundMediaResponse, final String s, final tge tge) throws IOException {
        if ("cursor".equals(s)) {
            jsonFoundMediaResponse.b = (gmb)LoganSquare.typeConverterFor((Class)gmb.class).parse(tge);
        }
        else if ("data".equals(s)) {
            jsonFoundMediaResponse.a = (hmb)LoganSquare.typeConverterFor((Class)hmb.class).parse(tge);
        }
    }
    
    public JsonFoundMediaResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFoundMediaResponse jsonFoundMediaResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFoundMediaResponse)o, afe, b);
    }
}
