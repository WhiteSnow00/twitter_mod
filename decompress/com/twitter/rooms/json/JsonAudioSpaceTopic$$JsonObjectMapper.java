// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceTopic$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceTopic>
{
    public static JsonAudioSpaceTopic _parse(final tge tge) throws IOException {
        final JsonAudioSpaceTopic jsonAudioSpaceTopic = new JsonAudioSpaceTopic();
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
            parseField(jsonAudioSpaceTopic, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceTopic;
    }
    
    public static void _serialize(final JsonAudioSpaceTopic jsonAudioSpaceTopic, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("name", jsonAudioSpaceTopic.a);
        final String b2 = jsonAudioSpaceTopic.b;
        if (b2 != null) {
            afe.t0("rest_id", b2);
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("restId");
        throw null;
    }
    
    public static void parseField(final JsonAudioSpaceTopic jsonAudioSpaceTopic, String t, final tge tge) throws IOException {
        if ("name".equals(t)) {
            jsonAudioSpaceTopic.a = tge.T((String)null);
        }
        else if ("rest_id".equals(t)) {
            t = tge.T((String)null);
            Objects.requireNonNull(jsonAudioSpaceTopic);
            czd.f((Object)t, "<set-?>");
            jsonAudioSpaceTopic.b = t;
        }
    }
    
    public JsonAudioSpaceTopic parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceTopic jsonAudioSpaceTopic, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceTopic, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceTopic)o, afe, b);
    }
}
