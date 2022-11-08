// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGiphyCategory$$JsonObjectMapper extends JsonMapper<JsonGiphyCategory>
{
    public static JsonGiphyCategory _parse(final khe khe) throws IOException {
        final JsonGiphyCategory jsonGiphyCategory = new JsonGiphyCategory();
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
            parseField(jsonGiphyCategory, d, khe);
            khe.m0();
        }
        return jsonGiphyCategory;
    }
    
    public static void _serialize(final JsonGiphyCategory jsonGiphyCategory, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("name_encoded", jsonGiphyCategory.b);
        if (jsonGiphyCategory.c != null) {
            LoganSquare.typeConverterFor((Class)v3c.class).serialize((Object)jsonGiphyCategory.c, "gif", true, tfe);
        }
        tfe.u0("name", jsonGiphyCategory.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonGiphyCategory jsonGiphyCategory, final String s, final khe khe) throws IOException {
        if ("name_encoded".equals(s)) {
            jsonGiphyCategory.b = khe.T((String)null);
        }
        else if ("gif".equals(s)) {
            jsonGiphyCategory.c = (v3c)LoganSquare.typeConverterFor((Class)v3c.class).parse(khe);
        }
        else if ("name".equals(s)) {
            jsonGiphyCategory.a = khe.T((String)null);
        }
    }
    
    public JsonGiphyCategory parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonGiphyCategory jsonGiphyCategory, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonGiphyCategory, tfe, b);
    }
}
