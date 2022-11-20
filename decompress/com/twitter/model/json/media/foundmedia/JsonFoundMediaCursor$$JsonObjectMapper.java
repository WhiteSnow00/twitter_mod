// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFoundMediaCursor$$JsonObjectMapper extends JsonMapper<JsonFoundMediaCursor>
{
    public static JsonFoundMediaCursor _parse(final tge tge) throws IOException {
        final JsonFoundMediaCursor jsonFoundMediaCursor = new JsonFoundMediaCursor();
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
            parseField(jsonFoundMediaCursor, d, tge);
            tge.l0();
        }
        return jsonFoundMediaCursor;
    }
    
    public static void _serialize(final JsonFoundMediaCursor jsonFoundMediaCursor, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("next", jsonFoundMediaCursor.a);
        afe.t0("prev", jsonFoundMediaCursor.b);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonFoundMediaCursor jsonFoundMediaCursor, final String s, final tge tge) throws IOException {
        if ("next".equals(s)) {
            jsonFoundMediaCursor.a = tge.T((String)null);
        }
        else if ("prev".equals(s)) {
            jsonFoundMediaCursor.b = tge.T((String)null);
        }
    }
    
    public JsonFoundMediaCursor parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonFoundMediaCursor jsonFoundMediaCursor, final afe afe, final boolean b) throws IOException {
        _serialize(jsonFoundMediaCursor, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonFoundMediaCursor)o, afe, b);
    }
}
