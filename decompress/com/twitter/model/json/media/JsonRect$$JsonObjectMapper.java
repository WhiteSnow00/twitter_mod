// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRect$$JsonObjectMapper extends JsonMapper<JsonRect>
{
    public static JsonRect _parse(final khe khe) throws IOException {
        final JsonRect jsonRect = new JsonRect();
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
            parseField(jsonRect, d, khe);
            khe.m0();
        }
        return jsonRect;
    }
    
    public static void _serialize(final JsonRect jsonRect, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("h", jsonRect.d);
        tfe.T("w", jsonRect.c);
        tfe.T("x", jsonRect.a);
        tfe.T("y", jsonRect.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonRect jsonRect, final String s, final khe khe) throws IOException {
        if ("h".equals(s)) {
            jsonRect.d = khe.z();
        }
        else if ("w".equals(s)) {
            jsonRect.c = khe.z();
        }
        else if ("x".equals(s)) {
            jsonRect.a = khe.z();
        }
        else if ("y".equals(s)) {
            jsonRect.b = khe.z();
        }
    }
    
    public JsonRect parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonRect jsonRect, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonRect, tfe, b);
    }
}
