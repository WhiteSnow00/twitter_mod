// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.Objects;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceTweetResults$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceTweetResults>
{
    public static JsonAudioSpaceTweetResults _parse(final tge tge) throws IOException {
        final JsonAudioSpaceTweetResults jsonAudioSpaceTweetResults = new JsonAudioSpaceTweetResults();
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
            parseField(jsonAudioSpaceTweetResults, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceTweetResults;
    }
    
    public static void _serialize(final JsonAudioSpaceTweetResults jsonAudioSpaceTweetResults, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final String a = jsonAudioSpaceTweetResults.a;
        if (a != null) {
            afe.t0("rest_id", a);
            if (b) {
                afe.h();
            }
            return;
        }
        czd.m("tweetId");
        throw null;
    }
    
    public static void parseField(final JsonAudioSpaceTweetResults jsonAudioSpaceTweetResults, String t, final tge tge) throws IOException {
        if ("rest_id".equals(t)) {
            t = tge.T((String)null);
            Objects.requireNonNull(jsonAudioSpaceTweetResults);
            czd.f((Object)t, "<set-?>");
            jsonAudioSpaceTweetResults.a = t;
        }
    }
    
    public JsonAudioSpaceTweetResults parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceTweetResults jsonAudioSpaceTweetResults, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceTweetResults, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceTweetResults)o, afe, b);
    }
}
