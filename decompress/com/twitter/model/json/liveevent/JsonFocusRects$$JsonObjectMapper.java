// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFocusRects$$JsonObjectMapper extends JsonMapper<JsonFocusRects>
{
    public static JsonFocusRects _parse(final tge tge) throws IOException {
        final JsonFocusRects jsonFocusRects = new JsonFocusRects();
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
            parseField(jsonFocusRects, d, tge);
            tge.l0();
        }
        return jsonFocusRects;
    }
    
    public static void _serialize(final JsonFocusRects jsonFocusRects, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("h", jsonFocusRects.d);
        afe.T("w", jsonFocusRects.c);
        afe.T("x", jsonFocusRects.a);
        afe.T("y", jsonFocusRects.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFocusRects jsonFocusRects, final String s, final tge tge) throws IOException {
        if ("h".equals(s)) {
            jsonFocusRects.d = tge.y();
        }
        else if ("w".equals(s)) {
            jsonFocusRects.c = tge.y();
        }
        else if ("x".equals(s)) {
            jsonFocusRects.a = tge.y();
        }
        else if ("y".equals(s)) {
            jsonFocusRects.b = tge.y();
        }
    }
    
    public JsonFocusRects parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFocusRects jsonFocusRects, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFocusRects, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFocusRects)o, afe, b);
    }
}
