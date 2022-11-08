// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetInterstitial$$JsonObjectMapper extends JsonMapper<JsonTweetInterstitial>
{
    public static JsonTweetInterstitial _parse(final khe khe) throws IOException {
        final JsonTweetInterstitial jsonTweetInterstitial = new JsonTweetInterstitial();
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
            parseField(jsonTweetInterstitial, d, khe);
            khe.m0();
        }
        return jsonTweetInterstitial;
    }
    
    public static void _serialize(final JsonTweetInterstitial jsonTweetInterstitial, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("display_type", jsonTweetInterstitial.c);
        if (jsonTweetInterstitial.b != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonTweetInterstitial.b, "reveal_text", true, tfe);
        }
        if (jsonTweetInterstitial.a != null) {
            LoganSquare.typeConverterFor((Class)xwm.class).serialize((Object)jsonTweetInterstitial.a, "text", true, tfe);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTweetInterstitial jsonTweetInterstitial, final String s, final khe khe) throws IOException {
        if ("display_type".equals(s)) {
            jsonTweetInterstitial.c = khe.T((String)null);
        }
        else if ("reveal_text".equals(s)) {
            jsonTweetInterstitial.b = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
        else if ("text".equals(s)) {
            jsonTweetInterstitial.a = (xwm)LoganSquare.typeConverterFor((Class)xwm.class).parse(khe);
        }
    }
    
    public JsonTweetInterstitial parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTweetInterstitial jsonTweetInterstitial, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonTweetInterstitial, tfe, b);
    }
}
