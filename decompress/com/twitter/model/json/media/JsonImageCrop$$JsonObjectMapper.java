// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonImageCrop$$JsonObjectMapper extends JsonMapper<JsonImageCrop>
{
    public static JsonImageCrop _parse(final khe khe) throws IOException {
        final JsonImageCrop jsonImageCrop = new JsonImageCrop();
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
            parseField(jsonImageCrop, d, khe);
            khe.m0();
        }
        return jsonImageCrop;
    }
    
    public static void _serialize(final JsonImageCrop jsonImageCrop, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("height", jsonImageCrop.d);
        tfe.T("left", jsonImageCrop.a);
        tfe.T("top", jsonImageCrop.b);
        tfe.T("width", jsonImageCrop.c);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonImageCrop jsonImageCrop, final String s, final khe khe) throws IOException {
        if ("height".equals(s)) {
            jsonImageCrop.d = khe.z();
        }
        else if ("left".equals(s)) {
            jsonImageCrop.a = khe.z();
        }
        else if ("top".equals(s)) {
            jsonImageCrop.b = khe.z();
        }
        else if ("width".equals(s)) {
            jsonImageCrop.c = khe.z();
        }
    }
    
    public JsonImageCrop parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonImageCrop jsonImageCrop, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonImageCrop, tfe, b);
    }
}
