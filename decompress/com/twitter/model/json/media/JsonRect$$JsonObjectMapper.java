// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonRect$$JsonObjectMapper extends JsonMapper<JsonRect>
{
    public static JsonRect _parse(final tge tge) throws IOException {
        final JsonRect jsonRect = new JsonRect();
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
            parseField(jsonRect, d, tge);
            tge.l0();
        }
        return jsonRect;
    }
    
    public static void _serialize(final JsonRect jsonRect, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.T("h", jsonRect.d);
        afe.T("w", jsonRect.c);
        afe.T("x", jsonRect.a);
        afe.T("y", jsonRect.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonRect jsonRect, final String s, final tge tge) throws IOException {
        if ("h".equals(s)) {
            jsonRect.d = tge.y();
        }
        else if ("w".equals(s)) {
            jsonRect.c = tge.y();
        }
        else if ("x".equals(s)) {
            jsonRect.a = tge.y();
        }
        else if ("y".equals(s)) {
            jsonRect.b = tge.y();
        }
    }
    
    public JsonRect parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonRect jsonRect, final afe afe, final boolean b) throws IOException {
        _serialize(jsonRect, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonRect)o, afe, b);
    }
}
