// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonImageCrop$$JsonObjectMapper extends JsonMapper<JsonImageCrop>
{
    public static JsonImageCrop _parse(final tge tge) throws IOException {
        final JsonImageCrop jsonImageCrop = new JsonImageCrop();
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
            parseField(jsonImageCrop, d, tge);
            tge.l0();
        }
        return jsonImageCrop;
    }
    
    public static void _serialize(final JsonImageCrop jsonImageCrop, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("height", jsonImageCrop.d);
        afe.T("left", jsonImageCrop.a);
        afe.T("top", jsonImageCrop.b);
        afe.T("width", jsonImageCrop.c);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonImageCrop jsonImageCrop, final String s, final tge tge) throws IOException {
        if ("height".equals(s)) {
            jsonImageCrop.d = tge.y();
        }
        else if ("left".equals(s)) {
            jsonImageCrop.a = tge.y();
        }
        else if ("top".equals(s)) {
            jsonImageCrop.b = tge.y();
        }
        else if ("width".equals(s)) {
            jsonImageCrop.c = tge.y();
        }
    }
    
    public JsonImageCrop parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonImageCrop jsonImageCrop, final afe afe, final boolean b) throws IOException {
        _serialize(jsonImageCrop, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonImageCrop)o, afe, b);
    }
}
