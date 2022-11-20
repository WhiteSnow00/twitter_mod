// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveVideoStreamSource$$JsonObjectMapper extends JsonMapper<JsonLiveVideoStreamSource>
{
    public static JsonLiveVideoStreamSource _parse(final tge tge) throws IOException {
        final JsonLiveVideoStreamSource jsonLiveVideoStreamSource = new JsonLiveVideoStreamSource();
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
            parseField(jsonLiveVideoStreamSource, d, tge);
            tge.l0();
        }
        return jsonLiveVideoStreamSource;
    }
    
    public static void _serialize(final JsonLiveVideoStreamSource jsonLiveVideoStreamSource, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("cookieSetUrl", jsonLiveVideoStreamSource.a);
        afe.t0("noRedirectPlaybackUrl", jsonLiveVideoStreamSource.b);
        afe.t0("status", jsonLiveVideoStreamSource.c);
        afe.t0("streamType", jsonLiveVideoStreamSource.d);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveVideoStreamSource jsonLiveVideoStreamSource, final String s, final tge tge) throws IOException {
        if ("cookieSetUrl".equals(s)) {
            jsonLiveVideoStreamSource.a = tge.T((String)null);
        }
        else if ("noRedirectPlaybackUrl".equals(s)) {
            jsonLiveVideoStreamSource.b = tge.T((String)null);
        }
        else if ("status".equals(s)) {
            jsonLiveVideoStreamSource.c = tge.T((String)null);
        }
        else if ("streamType".equals(s)) {
            jsonLiveVideoStreamSource.d = tge.T((String)null);
        }
    }
    
    public JsonLiveVideoStreamSource parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveVideoStreamSource jsonLiveVideoStreamSource, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveVideoStreamSource, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveVideoStreamSource)o, afe, b);
    }
}
