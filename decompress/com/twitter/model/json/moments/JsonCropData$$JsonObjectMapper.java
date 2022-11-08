// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonCropData$$JsonObjectMapper extends JsonMapper<JsonCropData>
{
    public static JsonCropData _parse(final khe khe) throws IOException {
        final JsonCropData jsonCropData = new JsonCropData();
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
            parseField(jsonCropData, d, khe);
            khe.m0();
        }
        return jsonCropData;
    }
    
    public static void _serialize(final JsonCropData jsonCropData, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("h", jsonCropData.d);
        tfe.T("w", jsonCropData.c);
        tfe.T("x", jsonCropData.a);
        tfe.T("y", jsonCropData.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonCropData jsonCropData, final String s, final khe khe) throws IOException {
        if ("h".equals(s)) {
            jsonCropData.d = khe.z();
        }
        else if ("w".equals(s)) {
            jsonCropData.c = khe.z();
        }
        else if ("x".equals(s)) {
            jsonCropData.a = khe.z();
        }
        else if ("y".equals(s)) {
            jsonCropData.b = khe.z();
        }
    }
    
    public JsonCropData parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonCropData jsonCropData, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonCropData, tfe, b);
    }
}
