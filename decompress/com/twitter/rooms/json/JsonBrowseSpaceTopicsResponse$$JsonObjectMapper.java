// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Objects;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBrowseSpaceTopicsResponse$$JsonObjectMapper extends JsonMapper<JsonBrowseSpaceTopicsResponse>
{
    public static JsonBrowseSpaceTopicsResponse _parse(final tge tge) throws IOException {
        final JsonBrowseSpaceTopicsResponse jsonBrowseSpaceTopicsResponse = new JsonBrowseSpaceTopicsResponse();
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
            parseField(jsonBrowseSpaceTopicsResponse, d, tge);
            tge.l0();
        }
        return jsonBrowseSpaceTopicsResponse;
    }
    
    public static void _serialize(final JsonBrowseSpaceTopicsResponse jsonBrowseSpaceTopicsResponse, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        jsonBrowseSpaceTopicsResponse.t();
        LoganSquare.typeConverterFor((Class)xo2.class).serialize((Object)jsonBrowseSpaceTopicsResponse.t(), "browse_space_topics", true, afe);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBrowseSpaceTopicsResponse jsonBrowseSpaceTopicsResponse, final String s, final tge tge) throws IOException {
        if ("browse_space_topics".equals(s)) {
            final xo2 a = (xo2)LoganSquare.typeConverterFor((Class)xo2.class).parse(tge);
            Objects.requireNonNull(jsonBrowseSpaceTopicsResponse);
            czd.f((Object)a, "<set-?>");
            jsonBrowseSpaceTopicsResponse.a = a;
        }
    }
    
    public JsonBrowseSpaceTopicsResponse parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBrowseSpaceTopicsResponse jsonBrowseSpaceTopicsResponse, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBrowseSpaceTopicsResponse, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBrowseSpaceTopicsResponse)o, afe, b);
    }
}
