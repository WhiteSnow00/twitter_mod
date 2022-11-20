// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaImageVariant$$JsonObjectMapper extends JsonMapper<JsonFoundMediaImageVariant>
{
    public static JsonFoundMediaImageVariant _parse(final tge tge) throws IOException {
        final JsonFoundMediaImageVariant jsonFoundMediaImageVariant = new JsonFoundMediaImageVariant();
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
            parseField(jsonFoundMediaImageVariant, d, tge);
            tge.l0();
        }
        return jsonFoundMediaImageVariant;
    }
    
    public static void _serialize(final JsonFoundMediaImageVariant jsonFoundMediaImageVariant, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("byte_count", jsonFoundMediaImageVariant.e);
        afe.T("height", jsonFoundMediaImageVariant.d);
        afe.t0("still_image_url", jsonFoundMediaImageVariant.b);
        afe.t0("url", jsonFoundMediaImageVariant.a);
        afe.T("width", jsonFoundMediaImageVariant.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaImageVariant jsonFoundMediaImageVariant, final String s, final tge tge) throws IOException {
        if ("byte_count".equals(s)) {
            jsonFoundMediaImageVariant.e = tge.y();
        }
        else if ("height".equals(s)) {
            jsonFoundMediaImageVariant.d = tge.y();
        }
        else if ("still_image_url".equals(s)) {
            jsonFoundMediaImageVariant.b = tge.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonFoundMediaImageVariant.a = tge.T((String)null);
        }
        else if ("width".equals(s)) {
            jsonFoundMediaImageVariant.c = tge.y();
        }
    }
    
    public JsonFoundMediaImageVariant parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFoundMediaImageVariant jsonFoundMediaImageVariant, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaImageVariant, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFoundMediaImageVariant)o, afe, b);
    }
}
