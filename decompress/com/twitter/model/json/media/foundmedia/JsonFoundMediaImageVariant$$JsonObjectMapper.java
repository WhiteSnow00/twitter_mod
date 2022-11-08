// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaImageVariant$$JsonObjectMapper extends JsonMapper<JsonFoundMediaImageVariant>
{
    public static JsonFoundMediaImageVariant _parse(final khe khe) throws IOException {
        final JsonFoundMediaImageVariant jsonFoundMediaImageVariant = new JsonFoundMediaImageVariant();
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
            parseField(jsonFoundMediaImageVariant, d, khe);
            khe.m0();
        }
        return jsonFoundMediaImageVariant;
    }
    
    public static void _serialize(final JsonFoundMediaImageVariant jsonFoundMediaImageVariant, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("byte_count", jsonFoundMediaImageVariant.e);
        tfe.T("height", jsonFoundMediaImageVariant.d);
        tfe.u0("still_image_url", jsonFoundMediaImageVariant.b);
        tfe.u0("url", jsonFoundMediaImageVariant.a);
        tfe.T("width", jsonFoundMediaImageVariant.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaImageVariant jsonFoundMediaImageVariant, final String s, final khe khe) throws IOException {
        if ("byte_count".equals(s)) {
            jsonFoundMediaImageVariant.e = khe.z();
        }
        else if ("height".equals(s)) {
            jsonFoundMediaImageVariant.d = khe.z();
        }
        else if ("still_image_url".equals(s)) {
            jsonFoundMediaImageVariant.b = khe.T((String)null);
        }
        else if ("url".equals(s)) {
            jsonFoundMediaImageVariant.a = khe.T((String)null);
        }
        else if ("width".equals(s)) {
            jsonFoundMediaImageVariant.c = khe.z();
        }
    }
    
    public JsonFoundMediaImageVariant parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFoundMediaImageVariant jsonFoundMediaImageVariant, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaImageVariant, tfe, b);
    }
}
