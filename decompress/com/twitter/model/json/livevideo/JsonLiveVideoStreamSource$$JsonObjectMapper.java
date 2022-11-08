// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveVideoStreamSource$$JsonObjectMapper extends JsonMapper<JsonLiveVideoStreamSource>
{
    public static JsonLiveVideoStreamSource _parse(final khe khe) throws IOException {
        final JsonLiveVideoStreamSource jsonLiveVideoStreamSource = new JsonLiveVideoStreamSource();
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
            parseField(jsonLiveVideoStreamSource, d, khe);
            khe.m0();
        }
        return jsonLiveVideoStreamSource;
    }
    
    public static void _serialize(final JsonLiveVideoStreamSource jsonLiveVideoStreamSource, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("cookieSetUrl", jsonLiveVideoStreamSource.a);
        tfe.u0("noRedirectPlaybackUrl", jsonLiveVideoStreamSource.b);
        tfe.u0("status", jsonLiveVideoStreamSource.c);
        tfe.u0("streamType", jsonLiveVideoStreamSource.d);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveVideoStreamSource jsonLiveVideoStreamSource, final String s, final khe khe) throws IOException {
        if ("cookieSetUrl".equals(s)) {
            jsonLiveVideoStreamSource.a = khe.T((String)null);
        }
        else if ("noRedirectPlaybackUrl".equals(s)) {
            jsonLiveVideoStreamSource.b = khe.T((String)null);
        }
        else if ("status".equals(s)) {
            jsonLiveVideoStreamSource.c = khe.T((String)null);
        }
        else if ("streamType".equals(s)) {
            jsonLiveVideoStreamSource.d = khe.T((String)null);
        }
    }
    
    public JsonLiveVideoStreamSource parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveVideoStreamSource jsonLiveVideoStreamSource, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveVideoStreamSource, tfe, b);
    }
}
