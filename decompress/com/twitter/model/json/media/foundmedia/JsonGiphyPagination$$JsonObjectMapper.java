// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGiphyPagination$$JsonObjectMapper extends JsonMapper<JsonGiphyPagination>
{
    public static JsonGiphyPagination _parse(final tge tge) throws IOException {
        final JsonGiphyPagination jsonGiphyPagination = new JsonGiphyPagination();
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
            parseField(jsonGiphyPagination, d, tge);
            tge.l0();
        }
        return jsonGiphyPagination;
    }
    
    public static void _serialize(final JsonGiphyPagination jsonGiphyPagination, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("count", jsonGiphyPagination.b);
        afe.T("offset", jsonGiphyPagination.c);
        afe.T("total_count", jsonGiphyPagination.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGiphyPagination jsonGiphyPagination, final String s, final tge tge) throws IOException {
        if ("count".equals(s)) {
            jsonGiphyPagination.b = tge.y();
        }
        else if ("offset".equals(s)) {
            jsonGiphyPagination.c = tge.y();
        }
        else if ("total_count".equals(s)) {
            jsonGiphyPagination.a = tge.y();
        }
    }
    
    public JsonGiphyPagination parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGiphyPagination jsonGiphyPagination, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGiphyPagination, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGiphyPagination)o, afe, b);
    }
}
