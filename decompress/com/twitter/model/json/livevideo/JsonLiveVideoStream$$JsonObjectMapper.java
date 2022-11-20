// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonLiveVideoStream$$JsonObjectMapper extends JsonMapper<JsonLiveVideoStream>
{
    public static final lfe JSON_LIVE_VIDEO_RESTRICTION;
    
    static {
        JSON_LIVE_VIDEO_RESTRICTION = new lfe();
    }
    
    public static JsonLiveVideoStream _parse(final tge tge) throws IOException {
        final JsonLiveVideoStream jsonLiveVideoStream = new JsonLiveVideoStream();
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
            parseField(jsonLiveVideoStream, d, tge);
            tge.l0();
        }
        return jsonLiveVideoStream;
    }
    
    public static void _serialize(final JsonLiveVideoStream jsonLiveVideoStream, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        afe.t0("chatToken", jsonLiveVideoStream.c);
        afe.t0("lifecycleToken", jsonLiveVideoStream.b);
        final List<p1g> e = jsonLiveVideoStream.e;
        if (e != null) {
            ((amf)JsonLiveVideoStream$$JsonObjectMapper.JSON_LIVE_VIDEO_RESTRICTION).b((List)e, "restrictions", afe);
        }
        afe.t0("shareUrl", jsonLiveVideoStream.d);
        if (jsonLiveVideoStream.a != null) {
            afe.i("source");
            JsonLiveVideoStreamSource$$JsonObjectMapper._serialize(jsonLiveVideoStream.a, afe, true);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonLiveVideoStream jsonLiveVideoStream, final String s, final tge tge) throws IOException {
        if ("chatToken".equals(s)) {
            jsonLiveVideoStream.c = tge.T((String)null);
        }
        else if ("lifecycleToken".equals(s)) {
            jsonLiveVideoStream.b = tge.T((String)null);
        }
        else if ("restrictions".equals(s)) {
            jsonLiveVideoStream.e = ((amf)JsonLiveVideoStream$$JsonObjectMapper.JSON_LIVE_VIDEO_RESTRICTION).a(tge);
        }
        else if ("shareUrl".equals(s)) {
            jsonLiveVideoStream.d = tge.T((String)null);
        }
        else if ("source".equals(s)) {
            jsonLiveVideoStream.a = JsonLiveVideoStreamSource$$JsonObjectMapper._parse(tge);
        }
    }
    
    public JsonLiveVideoStream parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonLiveVideoStream jsonLiveVideoStream, final afe afe, final boolean b) throws IOException {
        _serialize(jsonLiveVideoStream, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonLiveVideoStream)o, afe, b);
    }
}
