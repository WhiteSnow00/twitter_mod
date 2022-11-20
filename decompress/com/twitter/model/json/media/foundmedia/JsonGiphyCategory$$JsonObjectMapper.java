// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGiphyCategory$$JsonObjectMapper extends JsonMapper<JsonGiphyCategory>
{
    public static JsonGiphyCategory _parse(final tge tge) throws IOException {
        final JsonGiphyCategory jsonGiphyCategory = new JsonGiphyCategory();
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
            parseField(jsonGiphyCategory, d, tge);
            tge.l0();
        }
        return jsonGiphyCategory;
    }
    
    public static void _serialize(final JsonGiphyCategory jsonGiphyCategory, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("name_encoded", jsonGiphyCategory.b);
        if (jsonGiphyCategory.c != null) {
            LoganSquare.typeConverterFor((Class)x2c.class).serialize((Object)jsonGiphyCategory.c, "gif", true, afe);
        }
        afe.t0("name", jsonGiphyCategory.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonGiphyCategory jsonGiphyCategory, final String s, final tge tge) throws IOException {
        if ("name_encoded".equals(s)) {
            jsonGiphyCategory.b = tge.T((String)null);
        }
        else if ("gif".equals(s)) {
            jsonGiphyCategory.c = (x2c)LoganSquare.typeConverterFor((Class)x2c.class).parse(tge);
        }
        else if ("name".equals(s)) {
            jsonGiphyCategory.a = tge.T((String)null);
        }
    }
    
    public JsonGiphyCategory parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonGiphyCategory jsonGiphyCategory, final afe afe, final boolean b) throws IOException {
        _serialize(jsonGiphyCategory, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonGiphyCategory)o, afe, b);
    }
}
