// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveVideoStream$$JsonObjectMapper extends JsonMapper<JsonLiveVideoStream>
{
    public static final ege JSON_LIVE_VIDEO_RESTRICTION;
    
    static {
        JSON_LIVE_VIDEO_RESTRICTION = new ege();
    }
    
    public static JsonLiveVideoStream _parse(final khe khe) throws IOException {
        final JsonLiveVideoStream jsonLiveVideoStream = new JsonLiveVideoStream();
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
            parseField(jsonLiveVideoStream, d, khe);
            khe.m0();
        }
        return jsonLiveVideoStream;
    }
    
    public static void _serialize(final JsonLiveVideoStream jsonLiveVideoStream, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        tfe.u0("chatToken", jsonLiveVideoStream.c);
        tfe.u0("lifecycleToken", jsonLiveVideoStream.b);
        final List e = jsonLiveVideoStream.e;
        if (e != null) {
            ((pmf)JsonLiveVideoStream$$JsonObjectMapper.JSON_LIVE_VIDEO_RESTRICTION).b(e, "restrictions", tfe);
        }
        tfe.u0("shareUrl", jsonLiveVideoStream.d);
        if (jsonLiveVideoStream.a != null) {
            tfe.i("source");
            JsonLiveVideoStreamSource$$JsonObjectMapper._serialize(jsonLiveVideoStream.a, tfe, true);
        }
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonLiveVideoStream jsonLiveVideoStream, final String s, final khe khe) throws IOException {
        if ("chatToken".equals(s)) {
            jsonLiveVideoStream.c = khe.T((String)null);
        }
        else if ("lifecycleToken".equals(s)) {
            jsonLiveVideoStream.b = khe.T((String)null);
        }
        else if ("restrictions".equals(s)) {
            jsonLiveVideoStream.e = ((pmf)JsonLiveVideoStream$$JsonObjectMapper.JSON_LIVE_VIDEO_RESTRICTION).a(khe);
        }
        else if ("shareUrl".equals(s)) {
            jsonLiveVideoStream.d = khe.T((String)null);
        }
        else if ("source".equals(s)) {
            jsonLiveVideoStream.a = JsonLiveVideoStreamSource$$JsonObjectMapper._parse(khe);
        }
    }
    
    public JsonLiveVideoStream parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonLiveVideoStream jsonLiveVideoStream, final tfe tfe, final boolean b) throws IOException {
        _serialize(jsonLiveVideoStream, tfe, b);
    }
}
