// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFocusRects$$JsonObjectMapper extends JsonMapper<JsonFocusRects>
{
    public static JsonFocusRects _parse(final khe khe) throws IOException {
        final JsonFocusRects jsonFocusRects = new JsonFocusRects();
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
            parseField(jsonFocusRects, d, khe);
            khe.m0();
        }
        return jsonFocusRects;
    }
    
    public static void _serialize(final JsonFocusRects jsonFocusRects, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.T("h", jsonFocusRects.d);
        tfe.T("w", jsonFocusRects.c);
        tfe.T("x", jsonFocusRects.a);
        tfe.T("y", jsonFocusRects.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFocusRects jsonFocusRects, final String s, final khe khe) throws IOException {
        if ("h".equals(s)) {
            jsonFocusRects.d = khe.z();
        }
        else if ("w".equals(s)) {
            jsonFocusRects.c = khe.z();
        }
        else if ("x".equals(s)) {
            jsonFocusRects.a = khe.z();
        }
        else if ("y".equals(s)) {
            jsonFocusRects.b = khe.z();
        }
    }
    
    public JsonFocusRects parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFocusRects jsonFocusRects, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFocusRects, tfe, b);
    }
}
