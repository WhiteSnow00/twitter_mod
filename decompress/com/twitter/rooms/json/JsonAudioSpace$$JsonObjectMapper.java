// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpace$$JsonObjectMapper extends JsonMapper<JsonAudioSpace>
{
    public static JsonAudioSpace _parse(final tge tge) throws IOException {
        final JsonAudioSpace jsonAudioSpace = new JsonAudioSpace();
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
            parseField(jsonAudioSpace, d, tge);
            tge.l0();
        }
        return jsonAudioSpace;
    }
    
    public static void _serialize(final JsonAudioSpace jsonAudioSpace, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("has_ticket", jsonAudioSpace.d);
        afe.e("is_subscribed", jsonAudioSpace.e);
        if (jsonAudioSpace.c != null) {
            LoganSquare.typeConverterFor((Class)r21.class).serialize((Object)jsonAudioSpace.c, "metadata", true, afe);
        }
        if (jsonAudioSpace.b != null) {
            LoganSquare.typeConverterFor((Class)t21.class).serialize((Object)jsonAudioSpace.b, "participants", true, afe);
        }
        afe.t0("rest_id", jsonAudioSpace.a);
        afe.T("subscriber_count", jsonAudioSpace.f);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpace jsonAudioSpace, final String s, final tge tge) throws IOException {
        if ("has_ticket".equals(s)) {
            jsonAudioSpace.d = tge.k();
        }
        else if ("is_subscribed".equals(s)) {
            jsonAudioSpace.e = tge.k();
        }
        else if ("metadata".equals(s)) {
            jsonAudioSpace.c = (r21)LoganSquare.typeConverterFor((Class)r21.class).parse(tge);
        }
        else if ("participants".equals(s)) {
            jsonAudioSpace.b = (t21)LoganSquare.typeConverterFor((Class)t21.class).parse(tge);
        }
        else if ("rest_id".equals(s)) {
            jsonAudioSpace.a = tge.T((String)null);
        }
        else if ("subscriber_count".equals(s)) {
            jsonAudioSpace.f = tge.y();
        }
    }
    
    public JsonAudioSpace parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpace jsonAudioSpace, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpace, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpace)o, afe, b);
    }
}
