// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaCursor$$JsonObjectMapper extends JsonMapper<JsonFoundMediaCursor>
{
    public static JsonFoundMediaCursor _parse(final khe khe) throws IOException {
        final JsonFoundMediaCursor jsonFoundMediaCursor = new JsonFoundMediaCursor();
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
            parseField(jsonFoundMediaCursor, d, khe);
            khe.m0();
        }
        return jsonFoundMediaCursor;
    }
    
    public static void _serialize(final JsonFoundMediaCursor jsonFoundMediaCursor, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("next", jsonFoundMediaCursor.a);
        tfe.u0("prev", jsonFoundMediaCursor.b);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaCursor jsonFoundMediaCursor, final String s, final khe khe) throws IOException {
        if ("next".equals(s)) {
            jsonFoundMediaCursor.a = khe.T((String)null);
        }
        else if ("prev".equals(s)) {
            jsonFoundMediaCursor.b = khe.T((String)null);
        }
    }
    
    public JsonFoundMediaCursor parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonFoundMediaCursor jsonFoundMediaCursor, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaCursor, tfe, b);
    }
}
