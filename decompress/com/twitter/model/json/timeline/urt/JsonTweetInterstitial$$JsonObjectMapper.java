// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetInterstitial$$JsonObjectMapper extends JsonMapper<JsonTweetInterstitial>
{
    public static JsonTweetInterstitial _parse(final tge tge) throws IOException {
        final JsonTweetInterstitial jsonTweetInterstitial = new JsonTweetInterstitial();
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
            parseField(jsonTweetInterstitial, d, tge);
            tge.l0();
        }
        return jsonTweetInterstitial;
    }
    
    public static void _serialize(final JsonTweetInterstitial jsonTweetInterstitial, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("display_type", jsonTweetInterstitial.c);
        if (jsonTweetInterstitial.b != null) {
            LoganSquare.typeConverterFor((Class)oxm.class).serialize((Object)jsonTweetInterstitial.b, "reveal_text", true, afe);
        }
        if (jsonTweetInterstitial.a != null) {
            LoganSquare.typeConverterFor((Class)oxm.class).serialize((Object)jsonTweetInterstitial.a, "text", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTweetInterstitial jsonTweetInterstitial, final String s, final tge tge) throws IOException {
        if ("display_type".equals(s)) {
            jsonTweetInterstitial.c = tge.T((String)null);
        }
        else if ("reveal_text".equals(s)) {
            jsonTweetInterstitial.b = (oxm)LoganSquare.typeConverterFor((Class)oxm.class).parse(tge);
        }
        else if ("text".equals(s)) {
            jsonTweetInterstitial.a = (oxm)LoganSquare.typeConverterFor((Class)oxm.class).parse(tge);
        }
    }
    
    public JsonTweetInterstitial parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTweetInterstitial jsonTweetInterstitial, final afe afe, final boolean b) throws IOException {
        _serialize(jsonTweetInterstitial, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTweetInterstitial)o, afe, b);
    }
}
