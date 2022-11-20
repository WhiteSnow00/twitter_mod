// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.LoganSquare;
import com.twitter.model.json.timeline.urt.richtext.JsonUrtRichText$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonUserUnavailable$$JsonObjectMapper extends JsonMapper<JsonUserUnavailable>
{
    public static JsonUserUnavailable _parse(final tge tge) throws IOException {
        final JsonUserUnavailable jsonUserUnavailable = new JsonUserUnavailable();
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
            parseField(jsonUserUnavailable, d, tge);
            tge.l0();
        }
        return jsonUserUnavailable;
    }
    
    public static void _serialize(final JsonUserUnavailable jsonUserUnavailable, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("message", jsonUserUnavailable.b);
        if (jsonUserUnavailable.c != null) {
            afe.i("unavailable_message");
            JsonUrtRichText$$JsonObjectMapper._serialize(jsonUserUnavailable.c, afe, true);
        }
        if (jsonUserUnavailable.a != null) {
            LoganSquare.typeConverterFor((Class)ekw$b.class).serialize((Object)jsonUserUnavailable.a, "unavailable_reason", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonUserUnavailable jsonUserUnavailable, final String s, final tge tge) throws IOException {
        if ("message".equals(s)) {
            jsonUserUnavailable.b = tge.T((String)null);
        }
        else if ("unavailable_message".equals(s)) {
            jsonUserUnavailable.c = JsonUrtRichText$$JsonObjectMapper._parse(tge);
        }
        else if ("unavailable_reason".equals(s)) {
            jsonUserUnavailable.a = (ekw$b)LoganSquare.typeConverterFor((Class)ekw$b.class).parse(tge);
        }
    }
    
    public JsonUserUnavailable parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonUserUnavailable jsonUserUnavailable, final afe afe, final boolean b) throws IOException {
        _serialize(jsonUserUnavailable, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonUserUnavailable)o, afe, b);
    }
}
