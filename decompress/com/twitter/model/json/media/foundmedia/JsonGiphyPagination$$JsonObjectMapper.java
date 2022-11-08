// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGiphyPagination$$JsonObjectMapper extends JsonMapper<JsonGiphyPagination>
{
    public static JsonGiphyPagination _parse(final khe khe) throws IOException {
        final JsonGiphyPagination jsonGiphyPagination = new JsonGiphyPagination();
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
            parseField(jsonGiphyPagination, d, khe);
            khe.m0();
        }
        return jsonGiphyPagination;
    }
    
    public static void _serialize(final JsonGiphyPagination jsonGiphyPagination, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("count", jsonGiphyPagination.b);
        tfe.T("offset", jsonGiphyPagination.c);
        tfe.T("total_count", jsonGiphyPagination.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGiphyPagination jsonGiphyPagination, final String s, final khe khe) throws IOException {
        if ("count".equals(s)) {
            jsonGiphyPagination.b = khe.z();
        }
        else if ("offset".equals(s)) {
            jsonGiphyPagination.c = khe.z();
        }
        else if ("total_count".equals(s)) {
            jsonGiphyPagination.a = khe.z();
        }
    }
    
    public JsonGiphyPagination parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGiphyPagination jsonGiphyPagination, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGiphyPagination, tfe, b);
    }
}
