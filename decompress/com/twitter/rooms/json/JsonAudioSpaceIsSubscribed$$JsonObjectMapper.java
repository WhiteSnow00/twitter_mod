// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceIsSubscribed$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceIsSubscribed>
{
    public static JsonAudioSpaceIsSubscribed _parse(final tge tge) throws IOException {
        final JsonAudioSpaceIsSubscribed jsonAudioSpaceIsSubscribed = new JsonAudioSpaceIsSubscribed();
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
            parseField(jsonAudioSpaceIsSubscribed, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceIsSubscribed;
    }
    
    public static void _serialize(final JsonAudioSpaceIsSubscribed jsonAudioSpaceIsSubscribed, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.e("is_subscribed", jsonAudioSpaceIsSubscribed.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpaceIsSubscribed jsonAudioSpaceIsSubscribed, final String s, final tge tge) throws IOException {
        if ("is_subscribed".equals(s)) {
            jsonAudioSpaceIsSubscribed.a = tge.k();
        }
    }
    
    public JsonAudioSpaceIsSubscribed parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceIsSubscribed jsonAudioSpaceIsSubscribed, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceIsSubscribed, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceIsSubscribed)o, afe, b);
    }
}
